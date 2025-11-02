package peso_to_asian_currency_converter;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
	       Scanner in = new Scanner(System.in);
	       
	       System.out.println("Welcome! This program converts peso (PHP) to 8 different Asian countries' currency.");
	       System.out.println(" ");
	       System.out.print("Enter peso amount: ");
	       Double peso = in.nextDouble();
	       
	       System.out.println(" ");
	       System.out.println("Amount entered: " + peso + "PHP");
	       System.out.println("");
	       
	       System.out.println("COUNTRY CURRENCY LIST:");
	       System.out.println("________________________________________");
	       System.out.println(" ");
	       System.out.println("Press 1 for JAPANESE YEN (JPY).");
	       System.out.println("Press 2 for CHINESE YUAN (CNY).");
	       System.out.println("Press 3 for  KOREAN WON (KRW).");
	       System.out.println("Press 4 for THAI BAHT (THB).");
	       System.out.println("Press 5 for SINGAPORE DOLLAR (SGD).");
	       System.out.println("Press 6 for INDIAN RUPEE (INR).");
	       System.out.println("Press 7 for MALAYSIAN RINGGIT (MYR).");
	       System.out.println("Press 8 for INDONESIAN RUPIAH (IDR).");
	       System.out.println("________________________________________");
	       
	       System.out.println(" ");
	       System.out.print("Please select the currency you want to convert to: ");
	       int choice = in.nextInt();
	       System.out.println(" ");
	       
	       
	       switch (choice) {
	            
	            case 1: 
	            	Double yen = peso * 2.6;
	            	System.out.println("PHP to JPY conversion success!");
	            	System.out.println("----------------------------------");
	            	System.out.println(peso + " PHP = " + yen + " JPY");
	            	System.out.println("----------------------------------");
	            break; 
	 
	            case 2: 
	            	Double yuan = peso * 0.12;
	            	System.out.println("PHP to CNY conversion success!");
	            	System.out.println("----------------------------------");
	            	System.out.println(peso + " PHP = " + yuan + " CNY");
	            	System.out.println("----------------------------------");
	            break; 

	            case 3:
	            	Double won = peso * 24.5;
	            	System.out.println("PHP to KRW conversion success!");
	            	System.out.println("----------------------------------");
	            	System.out.println(peso + " PHP = " + won + " KRW");
	            	System.out.println("----------------------------------");
	            break;
	            
	            case 4:
	            	Double thb = peso * 0.56;
	            	System.out.println("PHP to THB conversion success!");
	            	System.out.println("----------------------------------");
	            	System.out.println(peso + " PHP = " + thb + " THB");
	            	System.out.println("----------------------------------");
	            break;
	            
	            case 5:
	            	Double sgd = peso * 0.022;
	            	System.out.println("PHP to SGD conversion success!");
	            	System.out.println("----------------------------------");
	            	System.out.println(peso + " PHP = " + sgd + " SGD");
	            	System.out.println("----------------------------------");
	            break;
	            
	            case 6:
	            	Double inr = peso * 1.49;
	            	System.out.println("PHP to INR conversion success!");
	            	System.out.println("----------------------------------");
	            	System.out.println(peso + " PHP = " + inr + " INR");
	            	System.out.println("----------------------------------");
	            break;
	            
	            case 7:
	            	Double myr = peso * 0.073;
	            	System.out.println("PHP to MYR conversion success!");
	            	System.out.println("----------------------------------");
	            	System.out.println(peso + " PHP = " + myr + " MYR");
	            	System.out.println("----------------------------------");
	            break;
	            
	            case 8:
	            	Double idr = peso * 282.87;
	            	System.out.println("PHP to IDR conversion success!");
	            	System.out.println("----------------------------------");
	            	System.out.println(peso + " PHP = " + idr + " IDR");
	            	System.out.println("----------------------------------");
	            break;
	            
	            default:
	            	System.out.println("Choice is invalid. Please select ONLY the numbers correlating to the listed currencies. Please try again.");
	                        }
	       
	       System.out.println(" ");
	       System.out.println("Thank you for using this program :)");
	       
	       in.close();

	}

}
