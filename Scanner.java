import java.util.*;

class Scanner {
        public static void main(String args[]) {

                // Instatiate dictionary and table
                Dictionary<String, Integer> symDictionary = new Hashtable<String, Integer>();
                Dictionary<String, String> finalStates = new Hashtable<String, String>();

                symDictionary.put(" ", 0);
                symDictionary.put("a", 1);
                symDictionary.put("b", 2);
                symDictionary.put("c", 3);
                symDictionary.put("d", 4);
                symDictionary.put("e", 5);
                symDictionary.put("f", 6);
                symDictionary.put("g", 7);
                symDictionary.put("h", 8);
                symDictionary.put("i", 9);
                symDictionary.put("j", 10);
                symDictionary.put("k", 11);
                symDictionary.put("l", 12);
                symDictionary.put("m", 13);
                symDictionary.put("n", 14);
                symDictionary.put("o", 15);
                symDictionary.put("p", 16);
                symDictionary.put("q", 17);
                symDictionary.put("r", 18);
                symDictionary.put("s", 19);
                symDictionary.put("t", 20);
                symDictionary.put("u", 21);
                symDictionary.put("v", 22);
                symDictionary.put("w", 23);
                symDictionary.put("x", 24);
                symDictionary.put("y", 25);
                symDictionary.put("z", 26);
                symDictionary.put("<", 27);
                symDictionary.put(">", 28);
                symDictionary.put("=", 29);
                symDictionary.put("!", 30);
                symDictionary.put("}", 31);
                symDictionary.put("{", 32);
                symDictionary.put("(", 33);
                symDictionary.put(")", 34);
                symDictionary.put("\"", 35);
                symDictionary.put("'", 36);
                symDictionary.put(";", 37);
                symDictionary.put(":", 38);
                symDictionary.put("/", 39);
                symDictionary.put("*", 40);
                symDictionary.put("-", 41);
                symDictionary.put("+", 42);
                symDictionary.put("1", 43);
                symDictionary.put("2", 44);
                symDictionary.put("3", 45);
                symDictionary.put("4", 46);
                symDictionary.put("5", 47);
                symDictionary.put("6", 48);
                symDictionary.put("7", 49);
                symDictionary.put("8", 50);
                symDictionary.put("9", 51);
                symDictionary.put("0", 52);
                symDictionary.put(" ", 53);

                // symDictionary.put("19", 54);
                // symDictionary.put("f32", 55);
                // symDictionary.put("i64", 56);
                // symDictionary.put("f64", 57);

                finalStates.put("}", "RIGHT_CURLY_BRACKET");
                finalStates.put("{", "LEFT_CURLY_BRACKET");
                finalStates.put(")", "RIGHT_PARANTHESIS");
                finalStates.put("(", "LEFT_PARANTHESIS");
                finalStates.put("\"", "QUOTATION_MARK");
                finalStates.put("'", "ASPOSTROPHE");
                finalStates.put(";", "SEMICOLON");
                finalStates.put(":", "COLON");
                // MATH SYMBOLS
                finalStates.put("/", "DIVISION_OPERATOR");
                finalStates.put("*", "MULTIPLICATION_OPERATOR");
                finalStates.put("-", "SUBTRACTION_OPERATOR");
                finalStates.put("+", "ADDITON_OPERATOR");
                // COMPARISON OPERATORS
                finalStates.put("<", "LESS_THAN_OPERATOR");
                finalStates.put("<=", "LESS_THAN_OR_EQUAL_OPERATOR");
                finalStates.put(">", "GREATHER_THAN_OPERATOR");
                finalStates.put(">=", "GREATHER_THAN_OR_EQUAL_OPERATOR");
                finalStates.put("!=", "NOT_EQUAL_OPERATOR");
                finalStates.put("=", "ASSIGNMENT_OPERATOR");
                finalStates.put("==", "IS_EQUAL_OPERATOR");
                // KEYWORDS
                finalStates.put("if", "IF_KEYWORD");
                finalStates.put("else", "ELSE_KEYWORD");
                finalStates.put("while", "WHILE_KEYWORD");
                finalStates.put("for", "FOR_KEYWORD");
                finalStates.put("let", "LET_KEYWORD");
                finalStates.put("in", "IN_KEYWORD");
                finalStates.put("mut", "MUT_KEYWORD");
                finalStates.put("i32", "i32_KEYWORD");
                finalStates.put("f32", "f32_KEYWORD");

                int[][] transitionTable = {

                                // From state 0
                                { 45, 45, 45, 45, 6, 12, 45, 45, 4, 45, 45, 20, 23, 45, 45, 45, 45, 45, 45, 45, 45, 45,
                                                15, 45, 45, 45,
                                                43, 41, 37, 39, 26, 27, 28, 29, 30, 31, 32, 99, 33, 34, 35, 36, 99, 99,
                                                99, 99, 99, 99, 99, 99,
                                                99, 99, 99 },
                                // From state 1
                                { 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45,
                                                45, 45, 45, 45,
                                                45, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
                                                2, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99 },
                                // From state 2
                                { 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45,
                                                45, 45, 45, 45,
                                                45, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 45,
                                                45, 45, 45, 45, 45, 45,
                                                45, 45, 45, 99 },
                                // From state 3
                                { 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45,
                                                45, 45, 45, 45,
                                                45, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 45,
                                                45, 45, 45, 45, 45, 45,
                                                45, 45, 45, 99 },
                                // From state 4
                                { 45, 45, 45, 45, 45, 5, 45, 45, 45, 45, 45, 45, 45, 3, 45, 45, 45, 45, 45, 45, 45, 45,
                                                45, 45, 45, 45,
                                                99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
                                                1, 99, 99, 46, 99, 990,
                                                99, 99, 99
                                },
                                // From state 5
                                { 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45,
                                                45, 45, 45, 45,
                                                45, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 45,
                                                45, 45, 45, 45, 45, 45,
                                                45, 45, 45, 99 },
                                // From state 6
                                { 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 7, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45,
                                                45, 45, 45, 45,
                                                99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99, 99, 99,
                                                99, 99, 99 },
                                // From state 7
                                { 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 8, 45, 45, 45,
                                                45, 45, 45, 45,
                                                99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99, 99, 99,
                                                99, 99, 99 },
                                // From state 8
                                { 45, 45, 45, 45, 9, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45,
                                                45, 45, 45, 45,
                                                99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99, 99, 99,
                                                99, 99, 99 },
                                // From state 9
                                { 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45,
                                                45, 45, 45, 45,
                                                45, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 45,
                                                45, 45, 45, 45, 45, 45,
                                                45, 45, 45, 99 },
                                // From state 10
                                { 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45,
                                                45, 45, 45, 45,
                                                45, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
                                                11, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99 },
                                // From state 11
                                { 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45,
                                                45, 45, 45, 45,
                                                45, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 45,
                                                45, 45, 45, 45, 45, 45,
                                                45, 45, 45, 99 },
                                // From state 12
                                { 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 13, 45, 45, 45, 45, 45, 45,
                                                45, 45, 45, 45,
                                                45, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
                                                99, 10, 99, 99, 48, 99,
                                                99, 99, 99, 99
                                },
                                // From state 13
                                { 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 14, 45, 45, 45,
                                                45, 45, 45, 45,
                                                45, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99 },
                                // From state 14
                                { 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45,
                                                45, 45, 45, 45,
                                                45, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 45,
                                                45, 45, 45, 45, 45, 45,
                                                45, 45, 45, 99 },
                                // From state 15
                                { 45, 45, 45, 45, 45, 45, 45, 16, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45,
                                                45, 45, 45, 45,
                                                45, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99 },
                                // From state 16
                                { 45, 45, 45, 45, 45, 45, 45, 45, 17, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45,
                                                45, 45, 45, 45,
                                                45, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99 },
                                // From state 17
                                { 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 18, 45, 45, 45, 45, 45, 45, 45, 45, 45,
                                                45, 45, 45, 45,
                                                45, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99 },
                                // From state 18
                                { 45, 45, 45, 45, 19, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45,
                                                45, 45, 45, 45,
                                                45, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99 },
                                // From state 19
                                { 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45,
                                                45, 45, 45, 45,
                                                45, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 45,
                                                45, 45, 45, 45, 45, 45,
                                                45, 45, 45, 99 },
                                // From state 20
                                { 45, 45, 45, 45, 21, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45,
                                                45, 45, 45, 45,
                                                45, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99 },
                                // From state 21
                                { 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 22, 45,
                                                45, 45, 45, 45,
                                                45, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99 },
                                // From state 22
                                { 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45,
                                                45, 45, 45, 45,
                                                45, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 45,
                                                45, 45, 45, 45, 45, 45,
                                                45, 45, 45, 99 },
                                // From state 23
                                { 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 24,
                                                45, 45, 45, 45,
                                                45, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99 },
                                // From state 24
                                { 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 25, 45,
                                                45, 45, 45, 45,
                                                45, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99 },
                                // From state 25
                                { 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45,
                                                45, 45, 45, 45,
                                                45, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 45,
                                                45, 45, 45, 45, 45, 45,
                                                45, 45, 45, 99 },
                                // From state 26
                                { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99,
                                                99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99 },
                                // From state 27
                                { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99,
                                                99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99 },
                                // From state 28
                                { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99,
                                                99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99 },
                                // From state 29
                                { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99,
                                                99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99 },
                                // From state 30
                                { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99,
                                                99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99 },
                                // From state 31
                                { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99,
                                                99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99 },
                                // From state 32
                                { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99,
                                                99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99 },
                                // From state 33
                                { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99,
                                                99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99 },
                                // From state 34
                                { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99,
                                                99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99 },
                                // From state 35
                                { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99,
                                                99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99 },
                                // From state 36
                                { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99,
                                                99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99 },
                                // From state 37
                                { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99,
                                                99, 99, 99, 38, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99 },
                                // From state 38
                                { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99,
                                                99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99 },
                                // From state 39
                                { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99,
                                                99, 99, 99, 40, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99 },
                                // From state 40
                                { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99,
                                                99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99 },
                                // From state 41
                                { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99,
                                                99, 99, 99, 42, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99 },
                                // From state 42
                                { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99,
                                                99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99 },
                                // From state 43
                                { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99,
                                                99, 99, 99, 44, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99 },
                                // From state 44
                                { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99,
                                                99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 99 },
                                // From state 45
                                { 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45,
                                                45, 45, 45, 45, 45, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99,
                                                99, 99, 99, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45 },
                                // From state 46
                                { 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45,
                                                45, 45, 45, 45,
                                                45, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 45,
                                                45, 45, 47, 45, 45, 45,
                                                45, 45, 45, 99 },
                                // From state 47
                                { 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45,
                                                45, 45, 45, 45,
                                                45, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 45,
                                                45, 45, 45, 45, 45, 45,
                                                45, 45, 45, 99 },
                                // From state 48
                                { 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45,
                                                45, 45, 45, 45,
                                                45, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 45,
                                                45, 45, 49, 45, 45, 45,
                                                45, 45, 45, 99 },
                                // From state 49
                                { 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45, 45,
                                                45, 45, 45, 45,
                                                45, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 45,
                                                45, 45, 45, 45, 45, 45,
                                                45, 45, 45, 99 }

                };

                // Printing read in statement
                System.out.println("Enter a statement: ");

                // Read in statement
                String input = System.console().readLine();

                // Instantiate index for the transition table
                int currentState = 0;
                int previousState = 0;
                String tempString = "";

                for (int i = 0; i < input.length(); i++) {

                        String currentChar = String.valueOf(input.charAt(i));

                        tempString += currentChar;

                        int inputValIndex = symDictionary.get(currentChar) - 1;

                        // Reference transition table
                        currentState = transitionTable[currentState][inputValIndex];

                        System.out.println("Current character: " + currentChar);
                        System.out.println("Current string: " + tempString);
                        System.out.println("Input index value: " + inputValIndex);
                        System.out.println("Current state: " + currentState);

                        previousState = currentState;

                        if (currentState == 45) {

                                while (symDictionary.get(String.valueOf(input.charAt(i + 1))) - 1 >= 1 && symDictionary
                                                .get(String.valueOf(input.charAt(i + 1))) - 1 <= 26) {
                                        i++;
                                        currentChar = String.valueOf(input.charAt(i));
                                        tempString += currentChar;
                                }

                                System.out.println("IDENTIFIER: " + tempString);
                                System.out.println();
                                currentState = 0;
                                tempString = "";
                        }

                        if (finalStates.get(tempString) != null) {

                                // // Special Case for ==
                                // if ((tempString.equals("="))
                                // && (String.valueOf(input.charAt(i + 1)).equals("="))) {
                                // i++;
                                // tempString += "=";
                                // }

                                // // Special Case for !=
                                // if ((tempString.equals("!"))
                                // && (String.valueOf(input.charAt(i + 1)).equals("="))) {
                                // i++;
                                // tempString += "=";
                                // }

                                // // Special Case for <=
                                // if ((tempString.equals("<"))
                                // && (String.valueOf(input.charAt(i + 1)).equals("="))) {
                                // i++;
                                // tempString += "=";
                                // }

                                // // Special Case for >=
                                // if ((tempString.equals(">"))
                                // && (String.valueOf(input.charAt(i + 1)).equals("="))) {
                                // i++;
                                // tempString += "=";
                                // }

                                System.out.println(finalStates.get(tempString));
                                System.out.println();

                                currentState = 0;
                                tempString = "";
                        }

                        if (currentState == 99) {

                                // if (tempString.length() == 0) {
                                // System.out.println("Whitespace");
                                // System.out.println();
                                // tempString = "";
                                // }

                                if ((tempString.length() > 0)) {

                                        if (tempString.equals(" ")) {

                                        } else {
                                                System.out.println("IDENTIFIER: " + tempString);
                                                System.out.println();
                                        }
                                }

                                currentState = 0;
                                tempString = "";
                        }

                }

        }
}