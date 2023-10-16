package application;

import java.util.Scanner;
import entities.UserData;

public class Program {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        UserData allUser;
        System.out.println("Enter account number:");
        int accountID = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name:");
        String accountUserName = sc.nextLine();
        System.out.println("First deposit available? (y/n):");
        char answer = sc.next().charAt(0);
        if (Character.toLowerCase(answer) == 'y') {
            System.out.print("Enter first deposit: R$");
            double firstDepo = sc.nextDouble();
            allUser = new UserData(accountID, accountUserName, firstDepo);
        }
        else {
            allUser = new UserData(accountID, accountUserName);
        }
        System.out.println(allUser);

        System.out.print("Enter deposit: R$");
        double accountBalance = sc.nextDouble();
        allUser.accountDepo(accountBalance);
        System.out.println(allUser);


        System.out.print("Enter withdrawal: R$");
        accountBalance = sc.nextDouble();
        allUser.accountDraw(accountBalance);
        System.out.println(allUser);

        System.out.println("Wanna change your name? (y/n):");
        answer = sc.next().charAt(0);
        if (Character.toLowerCase(answer) == 'y') {
            System.out.println("Enter name:");
            sc.nextLine();
            accountUserName = sc.nextLine();
            allUser.setAccountUserNameBase(accountUserName);
            System.out.println(allUser);
        }


        sc.close();







    }
}
