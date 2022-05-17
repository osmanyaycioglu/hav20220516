package com.java.design.patterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class CalculatorCommandFactory {

    public static List<ICalculatorCommand> getCalculatorCommands(final ECalculatorType calculatorTypeParam) {

        List<ICalculatorCommand> commandsLoc = new ArrayList<>();
        switch (calculatorTypeParam) {
            case MATH:
                commandsLoc.add(new LogCommand());
            case EXTENDED:
                commandsLoc.add(new TripleAddCommand());
            case STANDART:
                commandsLoc.add(new AddCommand());
                commandsLoc.add(new SubsCommand());
                commandsLoc.add(new MultiplyCommand());
                commandsLoc.add(new DivCommand());
            default:
                break;
        }

        return commandsLoc;
    }
}
