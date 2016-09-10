import java.util.Scanner;
public class StringToInt{
pubic static void main(String args[]){
System.out.printn("Enter a string:");
Scanner input=new Scanner(System.in);
String s=input.nextLine();
int a=Integer.parseInt(s);
System.out.println("The string is"+s+"which is converted as integer"+a);
}
}
