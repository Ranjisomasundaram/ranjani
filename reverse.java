import java.util.Scanner;
class ReverseDigit{
public static void main(String args[]){
int num=0,rer=0;
System.out.println("Enter the integer to be reversed:");
Scanner input=new Scanner(System.in);
num=input.nextInt();
while(num!=0){
rer=rer*10;
rer=rer+(num%10);
num=num/10;
}
System.out.println("The Factorial of "+num+"is:"+rer);
}
}
