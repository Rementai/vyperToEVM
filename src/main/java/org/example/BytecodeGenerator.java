package org.example;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.example.VyperEVMLexer;
import org.example.VyperEVMParser;


import java.util.ArrayList;
import java.util.List;

public class BytecodeGenerator {
    private List<Byte> generatedBytecode;

    public BytecodeGenerator() {
        this.generatedBytecode = new ArrayList<>();
    }

    public List<Byte> generateBytecode(String code) {
        CharStream stream = CharStreams.fromString(code);
        VyperEVMLexer vyperLexer = new VyperEVMLexer(stream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(vyperLexer);
        VyperEVMParser vyperParser = new VyperEVMParser(commonTokenStream);
        VyperEVMParser.ProgramContext compilationUnitContext = vyperParser.program();

        CustomVyperEVMVisitor customVisitor = new CustomVyperEVMVisitor();
        customVisitor.setGeneratedBytecode(this.generatedBytecode);
        customVisitor.visit(compilationUnitContext);

        return this.generatedBytecode;
    }
}