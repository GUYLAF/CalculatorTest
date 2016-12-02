package com.guylaf.calculator;

/**
 * Created by guyla on 18/11/2016.
 */

public class Calculator {
    private double result = 0;
    private String operator = " ";

    public double div(double value, String operator) {
        if (operator != " ") {
            if (operator != " ") {
                double value1 = value;
                execPrepareOperation("/", value1, result);
                prepareOperation("/",value1);
            }
        }
        return result;
    }

    public double mult(double value, String operator) {
        if (operator != " ") {
            double value1 = value;
            execPrepareOperation("*", value1, result);
            prepareOperation("*",value1);
        }
        return result;
    }


    public double add(double value, String operator) {
        if (operator != " ") {
            double value1 = value;
            execPrepareOperation("+", value1, result);
            prepareOperation("+",value1);
        }
        return result;
    }

    public double sub(double value, String operator) {
        if (operator != " ") {
            double value1 = value;
            execPrepareOperation("-", value1, result);
            prepareOperation("-",value1);
        }
        return result;
    }

    public double execPrepareOperation(String operator, double value1, double newValue) {
        switch (operator) {
            case "/":
                result = value1 / newValue;
                break;
            case "X":
                result = value1 * newValue;
                break;
            case "+":
                result = value1 + newValue;
                break;
            case "-":
                result = value1 - newValue;
                break;
            default:
                return 0;
        }
        return result;
    }

    public double prepareOperation(String operator, double value1) {
        switch (operator) {
            case "/":
                result = value1;
                operator = "/";
                break;
            case "X":
                result = value1;
                operator = "X";
                break;
            case "+":
                result = value1;
                operator = "+";
                break;
            case "-":
                result = value1;
                operator = "-";
                break;
            default:
                return 0;
        }

        return result;
    }
}
