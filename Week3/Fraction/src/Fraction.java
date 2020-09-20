public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator == 0) {
            this.denominator = 1;
        }
        this.denominator = denominator;
    }

    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        }
    }

    public static int gcd(int numerator, int denominator) {
        if (numerator == 0 || denominator == 0) {
            return numerator + denominator;
        }

        while (numerator != denominator) {
            if (numerator > denominator) {
                numerator = denominator - numerator;
            } else {
                denominator = denominator - numerator;
            }
        }
        return numerator;
    }

    public Fraction reduce() {
        int gcd = gcd(this.numerator, this.denominator);
        this.numerator = this.numerator / gcd;
        this.denominator = this.denominator / gcd;
        return this;
    }

    public Fraction add(Fraction fraction) {
        this.numerator = this.numerator * fraction.denominator + this.denominator * fraction.numerator;
        this.denominator = this.denominator * fraction.denominator;
        return this;
    }

    public Fraction subtract(Fraction fraction) {
        this.numerator = this.numerator * fraction.denominator - this.denominator * fraction.numerator;
        this.denominator = this.denominator * fraction.denominator;
        return this;
    }

    public Fraction multiply(Fraction fraction) {
        this.numerator = this.numerator * fraction.numerator;
        this.denominator = this.denominator * fraction.denominator;
        return this;
    }

    public Fraction divide(Fraction fraction) {
        if (fraction.numerator != 0) {
            this.numerator = this.numerator * fraction.denominator;
            this.denominator = this.denominator * fraction.numerator;
        }
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Fraction) {
            Fraction other = (Fraction) obj;
            if (this.reduce().subtract(other.reduce()).numerator == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void display() {
        System.out.println(this.numerator + "/" + this.denominator);
    }

    public static void main(String[] args) {
//        Fraction fraction = new Fraction(3, 8);
  //      Fraction result = fraction.divide(new Fraction(2, 0));

    //    result.display();

        int result = gcd(2, 0);
        System.out.println(result);
    }

}

