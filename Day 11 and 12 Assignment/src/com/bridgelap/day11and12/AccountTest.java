package com.bridgelap.day11and12;
    import java.util.Scanner;
    public class AccountTest {
        public static void main(String args[]) {
            Account account1 = new Account(50.00);
            System.out.printf("Account Balance: ," + account1.getBalance());
            System.out.println("Enter Credit for Adding Amount Or Debit for Withdrawl");
            Scanner scanner = new Scanner(System.in);
            while (true) {

                String choice = scanner.next();

                switch (choice) {

                    case "Credit":
                        System.out.printf("Enter Credit Amount for Account 1:");
                        double depositAmount;
                        depositAmount = scanner.nextDouble();
                        account1.credit(depositAmount);
                        System.out.printf("Account1 Balance: Rs%.2f\n ",account1.getBalance());
                        break;

                    case "Debit":
                        System.out.printf("Enter Debit Amount for Account 1:");
                        double debitAmount;
                        debitAmount = scanner.nextDouble();
                        if(debitAmount <= account1.getBalance()) {
                            account1.debit(debitAmount);
                            System.out.printf("Account1 Balance: Rs%.2f\n ",account1.getBalance());
                            break;
                        }
                        if(account1.getBalance() < debitAmount) {
                            System.out.print("You do not have much balance");
                            break;
                            
                        }


                }
            }
        }
    }