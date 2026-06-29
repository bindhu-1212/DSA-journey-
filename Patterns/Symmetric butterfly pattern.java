class Solution {
public void pattern20(int n) {
//upper triangle 
for(int i=1;i<=n;i++)
{   int space=2*(n-i);
    for(int j=1;j<=i;j++)
    {
    System.out.print("*");
}
for(int j=1;j<=space;j++)
{
    System.out.print(" ");
}
 for(int j=1;j<=i;j++)
    {
    System.out.print("*");
}
System.out.println();
}
// lower triangle 
for(int i=1;i<n;i++)
{  int space=2*i;
for(int j=1;j<=n-i;j++)
{
    System.out.print("*");
}
for(int j=1;j<=space;j++)
{
    System.out.print(" ");
}
for(int j=1;j<=n-i;j++)
{
    System.out.print("*");
}
System.out.println();
}
    
}
    
}
