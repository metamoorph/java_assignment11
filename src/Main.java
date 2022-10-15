public class Main {

    public static void main(String[] args) {


        Fraction f1 = new Fraction(5, 10);
        Fraction f2 = new Fraction(4, 2);

        System.out.println("წილადების შეკვეცა = " + Fraction.simplify(f1.getNumerator(), f1.getDenominator()));
        System.out.println("წილადების შეკვეცა = " + Fraction.simplify(f2.getNumerator(), f2.getDenominator()));
        System.out.println("წილადების ჯამი = " + f1.sum(f2));
        System.out.println("წილადების გაყოფა = " + f1.div(f2));



    }

}