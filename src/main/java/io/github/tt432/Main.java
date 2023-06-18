package io.github.tt432;

import io.github.tt432.molang.MolangLexer;
import io.github.tt432.molang.MolangParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * @author TT432
 */
public class Main {
    public static void main(String[] args) throws Exception {
        MolangLexer lexer = new MolangLexer(CharStreams.fromString("12 + func('111231');"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MolangParser parser = new MolangParser(tokens);
        ParseTree tree = parser.exprSet();
        System.out.println(tree.accept(new EvalMolangVisitor()));
    }
}