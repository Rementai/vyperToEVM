package org.example;

import java.util.List;
import org.example.VyperEVMBaseVisitor;
import org.example.VyperEVMParser;

public class CustomVyperEVMVisitor extends VyperEVMBaseVisitor<Void> {
    private List<Byte> generatedBytecode;

    public void setGeneratedBytecode(List<Byte> generatedBytecode) {
        this.generatedBytecode = generatedBytecode;
    }

    @Override
    public Void visitProgram(VyperEVMParser.ProgramContext ctx) {
        System.out.println("Visiting program node");
        return super.visitProgram(ctx);
    }

    @Override
    public Void visitStatement(VyperEVMParser.StatementContext ctx) {
        System.out.println("Visiting statement node");
        return super.visitStatement(ctx);
    }

    @Override
    public Void visitSimpleStatement(VyperEVMParser.SimpleStatementContext ctx) {
        System.out.println("Visiting simple statement node");
        return super.visitSimpleStatement(ctx);
    }

    @Override
    public Void visitCompoundStatement(VyperEVMParser.CompoundStatementContext ctx) {
        System.out.println("Visiting compound statement node");
        return super.visitCompoundStatement(ctx);
    }

    @Override
    public Void visitIfStatement(VyperEVMParser.IfStatementContext ctx) {
        System.out.println("Visiting if statement node");
        return super.visitIfStatement(ctx);
    }

    @Override
    public Void visitWhileStatement(VyperEVMParser.WhileStatementContext ctx) {
        System.out.println("Visiting while statement node");
        return super.visitWhileStatement(ctx);
    }

    @Override
    public Void visitExpression(VyperEVMParser.ExpressionContext ctx) {
        System.out.println("Visiting expression node");
        return super.visitExpression(ctx);
    }

    @Override
    public Void visitAtomicExpression(VyperEVMParser.AtomicExpressionContext ctx) {
        System.out.println("Visiting atomic expression node");
        return super.visitAtomicExpression(ctx);
    }
}
