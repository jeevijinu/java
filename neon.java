package jeevi;
import java.util.Scanner;
public class neon {
public static void main(String[]args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("number : ");
    int s=sc.nextInt();
    int sum=0,sqr=s*s;
    while(sqr>0){
        sum+=sqr%10;   
        sqr=sqr/10;   
    }
    if(sum==s)
        System.out.println("true");
    else
        System.out.println("false");
    }
}

