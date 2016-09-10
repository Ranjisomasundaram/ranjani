import jaa.util.Scanner;
class ReverseString{
public static void main(String args[]){
Scanner input=new Scanner(System.in);
Ststem.out.println("Enter a string:");
String s=input.nextLine();
String rer;
int len=s.length();
for(int i=len-1;i>=0;i--){
rer=rer+s.charAt(i);
}
System.out.println("The given string is"+s+"and the reversed string is:"+rer);
}
}
