/**
 * 
 */
/**
 * @author alycia stoll
 *
 */
import java.util.*;
import java.io.*;


public class Binary2Decimal{
	static int binary;


		public static int toDecmial(){
                int decimal = 0;
                int n = 0;
                while(true){
                        if(binary==0){
                                break;}
                        else{
                                int temp = binary%10;
                                decimal += temp*Math.pow(2,n);
                                binary = binary/10;
                                n++;
                        }
                }
                return decimal;
        }


        public static void main(String[] args){


                Scanner userInput = new Scanner(System.in);

                System.out.println("Put in your binary value: ");
                binary = userInput.nextInt();
                System.out.println("The decimal value is: " + toDecmial());
        }
}
