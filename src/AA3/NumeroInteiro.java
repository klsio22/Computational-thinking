package AA3;

public class NumeroInteiro {
    private int n;

    public NumeroInteiro(int n) {
        this.n = n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public int formula() {
        int formula = 1;

        for (int i = n; i > 1; i--)
            formula = formula * i;

        return formula;
    }

}
