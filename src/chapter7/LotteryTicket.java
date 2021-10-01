package chapter7;

import java.util.Random;

public class LotteryTicket {
    // Constants should be in all caps and use the keyword "Final"
    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;
    public static void main(String[] args){

        int[] ticket = generateNumbers();
        printTicket(ticket);
    }

    public static int[] generateNumbers(){
        int[] ticket = new int[LENGTH];

        Random random = new Random();

        for(int i=0; i<LENGTH; i++){
            ticket[i] = random.nextInt(MAX_TICKET_NUMBER) + 1;
        }

        return ticket;
    }

    public static void printTicket(int ticket[]){
        for(int i=0; i<LENGTH; i++){
            System.out.print(ticket[i] + " | ");
        }
    }

}
