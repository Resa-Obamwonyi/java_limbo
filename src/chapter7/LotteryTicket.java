package chapter7;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {
    // Constants should be in all caps and use the keyword "Final"
    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;
    public static void main(String[] args){

        int[] ticket = generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);
    }

    public static int[] generateNumbers(){
        int[] ticket = new int[LENGTH];

        Random random = new Random();

        for(int i=0; i<LENGTH; i++){
            int randomNumber;
            do{
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            }while(search(ticket, randomNumber));
            ticket[i] = randomNumber;
        }

        return ticket;
    }

    /**
     * does a sequential search to find a value
     * @param array Array to generate random unique lottery numbers
     * @param numberToSearch This is the randdom integer to search for
     * @return true if number is found, false if not
     */
    public static boolean search(int[] array, int numberToSearch){
        // Enhanced loop
        for(int value: array){
            if(value == numberToSearch){
                return true;
            }
        }
        return false;
    }

    public static void printTicket(int ticket[]){
        for(int i=0; i<LENGTH; i++){
            System.out.print(ticket[i] + " | ");
        }
    }

}
