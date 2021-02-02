/**
 * 
 */
/**
 * @author Alycia Stoll
 * @date 2-2-21
 * @description A calculator that takes binary values and turns them to decimal.
 */
import java.util.*;
import java.io.*;



public class Binary2Decimal{
	static int binary; /*Static value for the binary number entered.*/
	   
/******************
 * 
 * This function's purpose is to do the math of turning 
 * any decimal number into a binary number.
 * 	
 * @return integer value for variable Decimal
 *******************/
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
/****************
 * 
 * This the main class that executes the binary number entered,
 * tests the binary number to make sure it is valid,
 * then executes the above function.
 * 
 * @param args
 ****************/

        public static void main(String[] args){

             Scanner userInput = new Scanner(System.in);
             int count=0;
		        boolean check=true;

		        System.out.print("Enter a number: ");
		        int num=userInput.nextInt();

		        for(int i=0; i<=num; i++){
		            count=num%10;
		            if(count>1) {
		                check=false;
		            break;
		            }
		            else {
		                check=true;
		            }

		            num=num/10;
		        }
		        if(check) {
		            System.out.println("Binary");
		        }else {
		            System.out.println("Not Binary, try again!");
		            System.exit(0);
		        }
             System.out.println("Put in your binary value: ");
             binary = userInput.nextInt();
             
             System.out.println("The decimal value is: " + toDecmial());
        }
}
