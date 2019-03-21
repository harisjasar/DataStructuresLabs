/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jashar;

import java.util.Stack;

/**
 *
 * @author Jashar
 */
public class DjikstraEvalAlgo {

    public static void main(String[] args) {
        double num = new DjikstraEvalAlgo().evalExprs("( 1 + 1 ( ( 2 + 3 ) * ( 4 * 5 ) ) )");

        System.out.println(num);
    }

    public double evalExprs(String b) {
        Stack<String> ops;
        Stack<String> vals;

        ops = new Stack<>();
        vals = new Stack<>();
        String[] expVals = b.split(" ");

        for (String i : expVals) {
            switch (i) {
                case "(":
                    ;
                    break;
                case "+":
                    ops.push(i);
                    break;
                case "-":
                    ops.push(i);
                    break;
                case "*":
                    ops.push(i);
                    break;
                case "/":
                    ops.push(i);
                    break;
                case "sqrt":
                    ops.push(i);
                    break;
                case ")":
                    String op = ops.pop();
                    double v = Double.parseDouble(vals.pop());
                    switch (op) {
                        case "+":
                            v += Double.parseDouble(vals.pop());
                            break;
                        case "-":
                            v -= Double.parseDouble(vals.pop());
                            break;
                        case "*":
                            v *= Double.parseDouble(vals.pop());
                            break;
                        case "/":
                            v /= Double.parseDouble(vals.pop());
                            break;
                        case "sqrt":
                            v = Math.sqrt(v);
                            break;
                        default:
                            break;
                    }
                    vals.push(String.valueOf(v));
                    break;
                default:
                    vals.push(i);
                    break;
            }

        }

        return Double.parseDouble(vals.pop());

    }
}
