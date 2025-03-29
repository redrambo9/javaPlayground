package com.fundamentals.java.lesserknownfeatures;

public class SwitchCaseStatements {
    public static void main(String[] args) {

    }

    //Java 12 enhanced the switch statement,
    // allowing it to be used as both an expression and a statement.
    //The yield statement in switch explicitly indicates the value to be returned for the matched case.
    private void SwitchCaseSinceJava12() {
        int day = 2;
        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            // ...
            default -> "Unknown";
        };
    }

    //use of yield
    private void useofYield() {
        int day = 2;
        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> {
                yield someMethodToCalculateSpecialDay(day);
            }
            // ...
            default -> "Unknown";
        };

    }

    private String someMethodToCalculateSpecialDay(int day) {
        if (day == 2) {
            return "Fun Day";
        }
        return "Dull Day";
    }

    private void traditionalSwitchCase() {
        int day = 2;
        String dayName;
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            // ...
            default:
                dayName = "Unknown";
        }
    }
}
