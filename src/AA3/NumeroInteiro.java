package AA3;

class NumeroInteiro {
    private int n;

    public NumeroInteiro() {
        this.setN(n);
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public int getFormula() {
        int formula = 1;

        //for (int i = n; i > 1; i--)
          //  formula  *= i;
        int fator = 1;
        for (int i = 1; i <= n; i++) {
            fator *= i;
            if (i > 2)
                formula *= (-1);
            formula += (1.0 / fator);
            // System.out.printf("f(%d) = %f\n", i, formula);
        }

        return formula;
    }

}
