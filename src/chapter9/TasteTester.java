package chapter9;

public class TasteTester {
    public static void main(String[] args) {
        BirthdayCake myBirthday = new BirthdayCake();
        myBirthday.candles = 12;
        myBirthday.flavour = "Vanilla";
        myBirthday.price = 10500.0;

        myBirthday.enquiry();
    }
}
