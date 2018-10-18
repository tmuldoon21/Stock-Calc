import java.util.Scanner;

/**
 * Stock Calculator
 * @author Tyler Muldoon
 *
 */


public class StockCalc 
{

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		
		System.out.println("Welcome to the stock calculator");
		System.out.println("Please press enter to continue... ");
		user.nextLine();
		
		System.out.println("Please enter the following information: ");
		System.out.println("Number of shares purchased: ");
		String numStr = user.nextLine();
		double numAmt = Double.parseDouble(numStr);
		
		System.out.println("Price per share: ");
		String priceStr = user.nextLine();
		double price = Double.parseDouble(priceStr);
		
		System.out.println("Comission rate to be paid for purchase to stock broker (as decimal): ");
		String comStr = user.nextLine();
		double comAmt = Double.parseDouble(comStr);
		
		System.out.println("Price per share at time of selling: ");
		String soldStr = user.nextLine();
		double soldAmt = Double.parseDouble(soldStr);
		
		System.out.println("Commision rate to be paid to the stockbroker for saler (as decimal): ");
		String comSoldStr = user.nextLine();
		double comSoldAmt = Double.parseDouble(comSoldStr);
		
		System.out.println("Here are your results: ");
		
		double moneyPaid = price * numAmt;
		double comPurchasePaid = moneyPaid * comAmt;
		double stockSoldAmt = numAmt * soldAmt;
		double comSoldPaid = stockSoldAmt * comSoldAmt;
		double net = (stockSoldAmt - comSoldPaid) - (moneyPaid + comPurchasePaid);
		
		System.out.println("The amount you paid for the stocks is: $" + moneyPaid);
		System.out.println("The amount you paid in commision on purchase is: $" + comPurchasePaid);
		System.out.println("The amount at which the stocks were sold is: $" + stockSoldAmt);
		System.out.println("The amount you paid in commision on sale is: $" + comSoldPaid);
		System.out.println("The total net profit/loss for the transaction: " + net);
	}

}
