import java.util.Scanner;
class FactorialDemo{
public static void main(String args[]){
int fact=1,i,num;
System.out.println("Enter the number to be factorialed:");
Scanner in=new Scanner(System.in);
num=in.nextInt();
for(i=1;i<=num;i++)
{
fact=fact*i;
}
System.out.println("Factorial of"+num+"is:"+fact);
}
}
