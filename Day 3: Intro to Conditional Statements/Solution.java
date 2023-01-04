import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        int n,res;
        Scanner inp = new Scanner(System.in);
        n=inp.nextInt();
        res=n%2;
        if(n>=2 && n<=5)
            if (res==0)
            System.out.println("Not Weird");
            else 
            System.out.println("Weird");
        else if(n>=6 && n<=20)
            if (res==0)
            System.out.println("Weird");
            else 
            System.out.println("Not Weird");
        else if (n>20)
            if (res==0)
             System.out.println("Not Weird");
        else System.out.println("Weird");
    }
}
