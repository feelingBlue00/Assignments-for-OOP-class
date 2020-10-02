public class Fraction {
    private int numerator;
    private int denominator = 1;

    /**
     * Constructor.
     */
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        setDenominator(denominator);
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

    /**
     * Set denominator.
     * @param denominator throw
     */
    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        }
    }

    /**
     * Calculate gcd of two integer.
     * @param a throw
     * @param b throw
     */
    public static int gcd(int a, int b) {
        if (a == 0 || b == 0) {
            return a + b;
        }

        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    /**
     * Calculate reduced fraction of two fraction.
     */
    public Fraction reduce() {
        int gcd = gcd(this.numerator, this.denominator);
        this.numerator = this.numerator / gcd;
        this.denominator = this.denominator / gcd;
        return this;
    }

    /**
     * Calculate sum of two fraction.
     * @param f throw
     * @return sum
     */
    public Fraction add(Fraction f) {
        this.numerator = this.numerator * f.denominator + this.denominator * f.numerator;
        this.denominator = this.denominator * f.denominator;
        return this.reduce();
    }

    /**
     * Calculate subtraction of two fraction.
     * @param f throw
     * @return subtraction
     */
    public Fraction subtract(Fraction f) {
        this.numerator = this.numerator * f.denominator - this.denominator * f.numerator;
        this.denominator = this.denominator * f.denominator;
        return this.reduce();
    }

    /**
     * Calculate multiplication of two fraction.
     * @param f throw
     * @return multiply
     */
    public Fraction multiply(Fraction f) {
        this.numerator = this.numerator * f.numerator;
        this.denominator = this.denominator * f.denominator;
        return this.reduce();
    }

    /**
     * Calculate division of two fraction.
     * @param f throw
     * @return division
     */
    public Fraction divide(Fraction f) {
        if (f.numerator != 0) {
            this.numerator = this.numerator * f.denominator;
            this.denominator = this.denominator * f.numerator;
        }
        return this.reduce();
    }

    /**
     * Check if two fraction were equal.
     * @param obj throw
     * @return true or false
     */
    public boolean equals(Object obj) {
        if (obj instanceof Fraction) {
            Fraction other = (Fraction) obj;
            if (this.numerator * other.denominator == other.numerator * this.denominator) {
                return true;
            }
            return false;
        }
        return false;
    }

    /**
     * For testing.
     * @param args throw
     */
    public static void main(String[] args) {
       
    }

}

