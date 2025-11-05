import java.text.NumberFormat;
import java.util.*;

public class MortgageCalculator {
    public static void main(String[] args) {
        System.out.println("===Bangladesh Mortgage Calculator(BDT)===");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter loan amount(Principal in BDT) :");
         int loanAmount = sc.nextInt();
        System.out.print("Enter annual interest rate(e.g., 8.5 for 8.5%) :");
         float annualInterestRate = sc.nextFloat();
        System.out.print("Enter loan period(in years) :");
         int loanPeriod = sc.nextInt();
         double monthlyInterestRate=annualInterestRate/100/12;
         int numberOfPayments=loanPeriod*12;
         double mortgagePayment=loanAmount*(monthlyInterestRate *Math.pow(1+monthlyInterestRate,numberOfPayments))/(Math.pow(1+monthlyInterestRate,numberOfPayments)-1);
         double totalPayment=mortgagePayment*numberOfPayments;
         double totalInterest=totalPayment-loanAmount;
         Locale bdLocale = Locale.of("en","BD");
         NumberFormat currencyFormatter=NumberFormat.getCurrencyInstance(bdLocale);



        System.out.println("===Mortgage Summary==");
        System.out.println("Loan Amonut :"+currencyFormatter.format(loanAmount));
        System.out.println("Monthly Payment :"+currencyFormatter.format(mortgagePayment));
        System.out.println("Total Payment :"+currencyFormatter.format(totalPayment));
        System.out.println("Total Interest :"+currencyFormatter.format(totalInterest));


     


    }
}