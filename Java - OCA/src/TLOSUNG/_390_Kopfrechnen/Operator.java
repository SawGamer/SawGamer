package TLOSUNG._390_Kopfrechnen;

enum Operator {
    ADD {
        @Override
        int calculate(final int num1, final int num2) {
            setSymbol("+");
            return num1 + num2;
        }
    },
    SUBTRACT {
        @Override
        int calculate(final int num1, final int num2) {
            setSymbol("-");
            return num1 - num2;
        }
    },
    MULTIPLY {
        @Override
        int calculate(final int num1, final int num2) {
            setSymbol("*");
            return num1 * num2;
        }
    },
    DIVIDE {
        @Override
        int calculate(final int num1, final int num2) {
            setSymbol("/");
            return num1 / num2;
        }
    },
    MODULO {
        @Override
        int calculate(final int num1, final int num2) {
            setSymbol("%");
            return num1 % num2;
        }
    };


    private String symbol;

    abstract int calculate(int num1, int num2);

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
