public class Fraction {

    private int numerator;
    private int denominator;


    Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }


    @Override
    public boolean equals(Object obj){

        if(obj instanceof Fraction) {
            return numerator * ((Fraction) obj).denominator == denominator * ((Fraction) obj).numerator;
        }

        return false;
    }

    static String simplify(int numerator, int denominator){

        int n = numerator;
        int d = denominator;

        while (n!=0 && d!=0){
            if(n>d) n %= d;
            else d &=n;

        }
        int gcd = n+d;

        return numerator/gcd + "/" + denominator/gcd;


    }


    public String div(Object obj) {
        int dNun = numerator * ((Fraction) obj).denominator;
        int dDen = denominator * ((Fraction) obj).numerator;

        return simplify(dNun, dDen);
    }

    public String sum(Object obj){
        int sNum = numerator * ((Fraction) obj).denominator + ((Fraction) obj).numerator * denominator;
        int sDen = denominator * ((Fraction) obj).denominator;

        return simplify(sNum, sDen);

    }

    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }

}



