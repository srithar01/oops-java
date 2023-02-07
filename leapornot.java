import java.io.*;
import java.util.*;
class leapornot
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
if(n%4==0)
{
System.out.print(n + " is a leap year");
}
else
{
System.out.print(n + "is a not leap year");
}
}
}