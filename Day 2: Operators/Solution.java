import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble();
        int tipPercent = scan.nextInt();
        int taxPercent = scan.nextInt(); 
        double tip = mealCost * tipPercent / 100;
        double tax = mealCost * taxPercent / 100;
        int totalCost = (int) Math.round(mealCost + tip + tax);
        System.out.println(totalCost);
    }
}
