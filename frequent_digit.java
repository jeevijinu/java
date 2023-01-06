package jeevi;
import java.util.Scanner;
public class frequent_digit {
public static void main(String[]args) {
	int count=0;
    Scanner s=new Scanner(System.in);
    System.out.print("element 1 : ");
    int a1=s.nextInt();
    String s1=String.valueOf(a1);
    System.out.print("element 2 : ");
    int a2=s.nextInt();
    String s2=String.valueOf(a2);
    System.out.print("element 3 : ");
    int a3=s.nextInt();
    String s3=String.valueOf(a3);
    System.out.print("element 4 : ");
    int a4=s.nextInt();
    String s4=String.valueOf(a4);
        String st=s1+s2+s3+s4;
        System.out.println(st);
        int b=0;
        char m=' ';
        char c[]=st.toCharArray();
    for(int i=0;i<c.length;i++)
    {
    count=0;
    for(int j=0;j<c.length;j++)
    {
    if(c[i]==c[j])
    {
    count++;
    }
    }
    if(b<count)
    {
    b=count;
    m=c[i];
    }
    }
    System.out.println("number of times occured : "+b);
    System.out.println("repeated element : "+m);
    }}
