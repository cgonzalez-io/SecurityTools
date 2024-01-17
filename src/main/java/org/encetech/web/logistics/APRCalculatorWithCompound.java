package org.encetech.web.logistics;

public class APRCalculatorWithCompound {

  public static double calculateApr(
    double loanAmount,
    double annualInterestRate,
    int termInYears,
    double fees,
    int compoundingFrequency
  ) {
    // Convert interest rate to a decimal
    annualInterestRate = annualInterestRate / 100.0;

    // Calculate the Effective Annual Rate (EAR)
    double ear =
      Math.pow(
        1 + annualInterestRate / compoundingFrequency,
        compoundingFrequency
      ) -
      1;

    // Incorporate fees into the loan amount for APR calculation
    double totalLoanAmount = loanAmount + fees;

    // Calculate the APR (assuming APR is close to EAR initially)
    double apr = ear;
    double monthlyPayment =
      totalLoanAmount *
      (ear / 12) /
      (1 - Math.pow(1 + ear / 12, -termInYears * 12));
    double calculatedLoanAmount;

    // Iteratively adjust APR to find the correct rate
    // This loop refines the APR estimate until the present value of the payments equals the loan amount
    for (int i = 0; i < 1000; i++) {
      calculatedLoanAmount = 0;
      for (int j = 1; j <= termInYears * 12; j++) {
        calculatedLoanAmount += monthlyPayment / Math.pow(1 + apr / 12, j);
      }

      if (Math.abs(calculatedLoanAmount - loanAmount) < 0.01) {
        break;
      }

      if (calculatedLoanAmount > loanAmount) {
        apr -= 0.0001; // Decrease APR
      } else {
        apr += 0.0001; // Increase APR
      }
    }

    return apr * 100; // Return APR as a percentage
  }

  public static void main(String[] args) {
    double loanAmount = 10000; // Example loan amount
    double annualInterestRate = 5.0; // 5% interest rate
    int termInYears = 5; // 5-year loan term
    double fees = 500; // Additional fees
    int compoundingFrequency = 12; // Monthly compounding

    double apr = calculateApr(
      loanAmount,
      annualInterestRate,
      termInYears,
      fees,
      compoundingFrequency
    );
    System.out.println("The APR is: " + apr + "%");
  }
}
