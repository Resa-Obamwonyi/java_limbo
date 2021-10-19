package chapter9;

public class BirthdayCake extends Cake{
    public int candles;

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }

    public void enquiry(){
        System.out.println("My birthday cake has "+candles+ " candles and the flavour is "+ flavour+ "" +
                " and it costs " +price+ " Naira.");
    }
}
