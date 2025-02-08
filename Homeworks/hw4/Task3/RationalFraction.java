public class RationalFraction {
    private int num;
    private int den;

    public RationalFraction() {
        this.num = 0;
        this.den = 1;
    }

    public RationalFraction(int num, int den) {
        if (den == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю.");
        }
        this.num = num;
        this.den = den;
        reduce();
    }

    private void reduce() {
        int gcd = gcd(Math.abs(num), Math.abs(den));
        num /= gcd;
        den /= gcd;
        if (den < 0) {
            num = -num;
            den = -den;
        }
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public RationalFraction add(RationalFraction other) {
        int newNum = this.num * other.den + other.num * this.den;
        int newDen = this.den * other.den;
        return new RationalFraction(newNum, newDen);
    }

    public void add2(RationalFraction other) {
        this.num = this.num * other.den + other.num * this.den;
        this.den *= other.den;
        reduce();
    }

    public RationalFraction sub(RationalFraction other) {
        int newNum = this.num * other.den - other.num * this.den;
        int newDen = this.den * other.den;
        return new RationalFraction(newNum, newDen);
    }

    public void sub2(RationalFraction other) {
        this.num = this.num * other.den - other.num * this.den;
        this.den *= other.den;
        reduce();
    }

    public RationalFraction mult(RationalFraction other) {
        int newNum = this.num * other.num;
        int newDen = this.den * other.den;
        return new RationalFraction(newNum, newDen);
    }

    public void mult2(RationalFraction other) {
        this.num *= other.num;
        this.den *= other.den;
        reduce();
    }

    public RationalFraction div(RationalFraction other) {
        if (other.num == 0) {
            throw new IllegalArgumentException("Деление на ноль.");
        }
        int newNum = this.num * other.den;
        int newDen = this.den * other.num;
        return new RationalFraction(newNum, newDen);
    }

    public void div2(RationalFraction other) {
        if (other.num == 0) {
            throw new IllegalArgumentException("Деление на ноль.");
        }
        this.num *= other.den;
        this.den *= other.num;
        reduce();
    }

    @Override
    public String toString() {
        return num + "/" + den;
    }

    public double value() {
        return (double) num / den;
    }

    public boolean equals(RationalFraction other) {
        return this.num == other.num && this.den == other.den;
    }

    public int numberPart() {
        return num / den;
    }
}
