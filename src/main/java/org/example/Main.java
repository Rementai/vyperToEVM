package org.example;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
    public static void main(String[] args) {
        String code = "void main() {}";

        CharStream stream = CharStreams.fromString(code);

        VyperEVMLexer vyperLexer = new VyperEVMLexer(stream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(vyperLexer);

        VyperEVMParser vyperParser = new VyperEVMParser(commonTokenStream);

        VyperEVMParser.ProgramContext compilationUnitContext = vyperParser.program();
        VyperEVMBaseVisitor<String> cVisitor = new VyperEVMBaseVisitor<String>();

        cVisitor.visit(compilationUnitContext);
    }
}