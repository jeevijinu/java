package jeevi;
import java.util.Scanner;
public class autobiographic_number {
public static void main(String[]args) {
	int num;
    String str;
    boolean flag;
    Scanner sc=new Scanner(System.in);
    System.out.print("value : ");
    int s=sc.nextInt();   
    s= Math.abs(s);
    num=s;
    str=String.valueOf(s);
    int digitarray[]=new int[str.length()];
    for(int i=digitarray.length-1;i>=0;i--) {
       digitarray[i]=num%10;
       num=num/10;
    }
    flag=true;
    for(int i=0;i<digitarray.length;i++){
       int count=0;
       for(int j=0;j<digitarray.length;j++)  {
          if (i==digitarray[j])
             count++;
       }
       if(count!=digitarray[i]){
          flag=false;
          break;
       }
    }
    if(flag)
       System.out.println("Autobiographical number");
    else
       System.out.println("Not an Autobiographical number");
 }
}
