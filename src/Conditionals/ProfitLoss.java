package Conditionals;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the selling price:");
        double sell = sc.nextDouble();
        System.out.print("Enter the Cost Price:");
        double cost = sc.nextDouble();
        double profit = sell - cost;
        double loss = cost - sell;
        if (sell > cost)
        {
            System.out.println("Profit");
            System.out.println("Profit is :"+profit);
        }
        else if (sell < cost)
        {
            System.out.println("incurred a loss");
            System.out.println("Loss is:"+loss);
        }
        else if (sell == cost) System.out.println("No Profit and No loss");

    }
}
