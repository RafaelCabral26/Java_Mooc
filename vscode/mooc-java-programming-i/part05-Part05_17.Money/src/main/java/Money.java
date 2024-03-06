
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents); // create a new Money
                                                                                              // object that has the
                                                                                              // correct worth

        // return the new Money object
        return newMoney;
    }

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros() || this.euros == compared.euros() && this.cents < compared.cents()) {
            return true;
        }
        return false;

    }

    public Money minus(Money decreaser) {
        int decCents;
        int decEuro = this.euros - decreaser.euros;
        if (this.cents < decreaser.cents()) {
            decCents = 100 - (decreaser.cents() - this.cents);
            decEuro--;
        } else {
            decCents = this.cents - decreaser.cents();
        }
        if (decEuro < 0) {
            decEuro = 0;
            decCents = 0;
        }
        Money newMoney = new Money(decEuro, decCents);
        return newMoney;
    }

}
