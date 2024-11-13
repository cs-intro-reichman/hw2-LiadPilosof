// Prints a crowd cheering output.

import java.util.Arrays;

public class Cheers {
        public static void main(String[] args) {
	    // Replace this comment with your code

        String anChars = "AEFHILMNORSX";
        String cheer = args[0];
        int repeat  = Integer.parseInt(args[1]);

        for (int i = 0; i < cheer.length(); i++) {
                if (anChars.indexOf(cheer.charAt(i))==-1) {
                        System.out.println("Give me a "+cheer.charAt(i)+": "+cheer.charAt(i)+"!");
                }
                else{
                        System.out.println("Give me an "+cheer.charAt(i)+": "+cheer.charAt(i)+"!");
                }
        }


        System.out.println("What does that spell?");

        for (int i = 0; i < repeat; i++) {
                System.out.println(cheer+"!!!");
        }



        }
}
