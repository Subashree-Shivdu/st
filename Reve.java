import java.util.Scanner;
class Reve
{
public static void main(String args[])
{
String a,b="";
int c;
Scanner sc=new Scanner(System.in);
a=sc.nextLine();
c=a.length();
for(int i=c-1;i>=0;i--)
b=b+a.charAt(i);
System.out.println("reversed string"+b);
}
}
