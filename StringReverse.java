import java.util.Scanner;
class StringReverse
{
public static void main(String args[])
{
Scanner obj = new Scanner(System.in);
System.out.println("Enter string");
String str=obj.nextLine();

//1st way to reverse string

StringBuffer sb = new StringBuffer(str);
System.out.println("Reverse string is "+sb.reverse());

//2nd way to reverse string

String str1="";
char []ch=str.toCharArray();
for(int i=str.length()-1;i>=0;i--)
{
str1=str1+ch[i];
}
System.out.println("Reverse string is "+str1);
}
}

