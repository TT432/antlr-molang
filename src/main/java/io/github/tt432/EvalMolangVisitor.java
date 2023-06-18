package io.github.tt432;

import io.github.tt432.molang.MolangBaseVisitor;
import io.github.tt432.molang.MolangParser;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * 0.0 is false
 *
 * @author TT432
 */
public class EvalMolangVisitor extends MolangBaseVisitor<Float> {
    @Override
    public Float visitExprSet(MolangParser.ExprSetContext ctx) {
        List<MolangParser.ExprContext> expr = ctx.expr();

        float value = 0;

        for (MolangParser.ExprContext exprContext : expr) {
            value = visit(exprContext);
        }

        return value;
    }

    @Override
    public Float visitNeExpr(MolangParser.NeExprContext ctx) {
        return visit(ctx.expr()) == 0 ? 1F : 0F;
    }

    @Override
    public Float visitMulOrDiv(MolangParser.MulOrDivContext ctx) {
        if (ctx.MUL() != null) {
            return visit(ctx.expr(0)) * visit(ctx.expr(1));
        }

        if (ctx.DIV() != null) {
            return visit(ctx.expr(0)) / visit(ctx.expr(1));
        }

        return 0F;
    }

    @Override
    public Float visitAddOrSub(MolangParser.AddOrSubContext ctx) {
        if (ctx.ADD() != null) {
            return visit(ctx.expr(0)) + visit(ctx.expr(1));
        }

        if (ctx.SUB() != null) {
            return visit(ctx.expr(0)) - visit(ctx.expr(1));
        }

        return 0F;
    }

    @Override
    public Float visitComparisonOperator(MolangParser.ComparisonOperatorContext ctx) {
        var operator = ctx.COMPARISON_OPERATOR().getSymbol().getText();

        return switch (operator) {
            case "<" -> visit(ctx.expr().get(0)) < visit(ctx.expr(1)) ? 1 : 0F;
            case "<=" -> visit(ctx.expr().get(0)) <= visit(ctx.expr(1)) ? 1 : 0F;
            case ">=" -> visit(ctx.expr().get(0)) >= visit(ctx.expr(1)) ? 1 : 0F;
            case ">" -> visit(ctx.expr().get(0)) > visit(ctx.expr(1)) ? 1 : 0F;
            default -> throw new IllegalStateException("Unexpected value: " + operator);
        };
    }

    @Override
    public Float visitEqualsOperator(MolangParser.EqualsOperatorContext ctx) {
        var operator = ctx.EQUALS_OPERATOR().getSymbol().getText();

        return switch (operator) {
            case "==" -> Objects.equals(visit(ctx.expr(0)), visit(ctx.expr(1))) ? 1 : 0F;
            case "!=" -> !Objects.equals(visit(ctx.expr(0)), visit(ctx.expr(1))) ? 1 : 0F;
            default -> throw new IllegalStateException("Unexpected value: " + operator);
        };
    }

    @Override
    public Float visitAndOperator(MolangParser.AndOperatorContext ctx) {
        return visit(ctx.expr(0)) != 0 && visit(ctx.expr(1)) != 0 ? 1 : 0F;
    }

    @Override
    public Float visitOrOperator(MolangParser.OrOperatorContext ctx) {
        return visit(ctx.expr(0)) != 0 || visit(ctx.expr(1)) != 0 ? 1 : 0F;
    }

    @Override
    public Float visitBinaryConditionalOperator(MolangParser.BinaryConditionalOperatorContext ctx) {
        return visit(ctx.expr(0)) != 0 ? visit(ctx.expr(1)) : 0;
    }

    @Override
    public Float visitTernaryConditionalOperator(MolangParser.TernaryConditionalOperatorContext ctx) {
        return visit(ctx.expr(0)) != 0 ? visit(ctx.expr(1)) : visit(ctx.expr(2));
    }

    @Override
    public Float visitReturnOperator(MolangParser.ReturnOperatorContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Float visitSignedAtom(MolangParser.SignedAtomContext ctx) {
        return ctx.SUB() != null ? -visit(ctx.atom()) : visit(ctx.atom());
    }

    @Override
    public Float visitScientific(MolangParser.ScientificContext ctx) {
        return Float.parseFloat(ctx.getText());
    }

    @Override
    public Float visitFunction(MolangParser.FunctionContext ctx) {
        var functionName = ctx.funcname().getText();

        List<Object> params = new ArrayList<>();

        ctx.funcParam().forEach(fp -> {
            if (fp.expr() != null)
                params.add(visit(fp.expr()));
            else
                params.add(fp.string().toString());
        });

        // TODO find function

        return 0F;
    }

    @Override
    public Float visitVariable(MolangParser.VariableContext ctx) {
        String variableName = ctx.getText();

        // TODO find variable

        return 0F;
    }
}
