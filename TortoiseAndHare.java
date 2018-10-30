package tortoiseandhare;

import java.util.*;
import java.util.Scanner; 
// Creating an object of Scanner class
/**
 *
 * @author Mohammed Hossain
 * @EmpleID 23239756
 */
public class TortoiseAndHare {

    public static void main(String[] args) {
        int clock = 70, tortoise = 1, hare = 1;
        System.out.println("BANG !!!!!\nAND THEY'RE OFF !!!!!\n");
        while(clock>0)
        {
        do {
            hare = moveHare(hare);
            tortoise = moveTortoise(tortoise);
            print(tortoise, hare);
            
        } while (tortoise < clock && hare < clock);
        if (tortoise > hare) {
            System.out.println("TORTOISE WINS!!! YAY!!!\n");
        } else if (tortoise < hare) {
            System.out.println("Hare wins. Yuch. \n");
        } else {
            System.out.println("Tortoise Wins!!! Yay!!! \n");//Favoring the underdog
        }
        if (clock<=0)
        {
            break;
        }
        
        System.out.println("Do you want to play Again? If yes, then input the total number of moves you want");
        Scanner userInput = new Scanner(System.in);
        clock=userInput.nextInt();
        continue;
        }
      
        
    }

    public static void print(int t, int h) {
        int i;
        if (h == t) {   //If both lands on the same square
            for (i = 0; i < h; i++) {
                System.out.print(" ");
            }
            System.out.println("OUCH!!!");
        } else if (h < t) {
            for (i = 0; i < h; i++) {
                System.out.print(" ");
            }
            System.out.print("H");
            for (i = 0; i < (t - h); i++) {
                System.out.print(" ");
            }
            System.out.print("T");
        } else {
            for (i = 0; i < t; i++) {
                System.out.print(" ");
            }
            System.out.print("T");
            for (i = 0; i < (h - t); i++) {
                System.out.print(" ");
            }
            System.out.print("H");
        }
        System.out.println();
    }
     public static int moveTortoise(int t) {
        int i;
        i = (int) (Math.random() * 10);
        if (i <= 5) {
            t += 3;
        } else if (i >= 6 && i <= 7) {
            t -= 6;
        } else {
            t++;
        }
        if (t < 1) {
            t = 1;  //If an animal slips left before square 1, move it back to square 1.
        }
        return t;
    }

    public static int moveHare(int r) {
        int i;
        i = (int) (Math.random() * 10);
        if (i <= 2) {
            r -= 2;
        } else if (i >= 3 && i <= 5) {
            r++;
        } else if (i == 6) {
            r -= 12;
        } else if (i >= 7 && i <= 8) {
            r += 9;
        } else {
            r = r;
        }
        if (r < 1) {
            r = 1;  //If an animal slips left before square 1, move it back to square 1.
        }
        return r;
    }

   
}

