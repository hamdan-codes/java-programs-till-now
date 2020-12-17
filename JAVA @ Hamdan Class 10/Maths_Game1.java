import java.io.*;
class Maths_Game1
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n1=0,n2=0,s=0;
        int a=0,b=0,c=0,w=0,ans=0;
        System.out.println("1. Addition ");
        System.out.println("2. Subtraction ");
        System.out.println("3. Multiplication ");
        System.out.println("4. Division ");
        System.out.print("Enter Choice : ");
        int sc=Integer.parseInt(br.readLine());
        System.out.println("Enter Number Range");
        System.out.println("eg. 20-30         Enter 20  ,  0-10  Enter 0 for 1st Number");
        int r1=Integer.parseInt(br.readLine());
        System.out.println("eg. 20-30         Enter 20  ,  0-10  Enter 0 for 2nd Number");
        int r2=Integer.parseInt(br.readLine());
        System.out.print("Number of Questions : ");
        int n=Integer.parseInt(br.readLine());
        switch(sc)
        {
            case 1:
            {
                for(a=1;a<=n;a++)
                {
                    n1=((int)(Math.random()*10))+r1;
                    n2=((int)(Math.random()*10))+r2;
                    System.out.print(n1+" + "+n2+" = ");
                    ans=Integer.parseInt(br.readLine());
                    if(ans==(n1+n2))
                    {
                        System.out.println("Correct Answer ");
                        c++;
                    }
                    else
                    {
                        System.out.println("Wrong Answer Correct was : "+(n1+n2));
                        w++;
                    }
                    for(int zz=1;zz<=1000000000;zz++)
                    {}
                    System.out.println(" *");
                    for(int zz=1;zz<=1000000000;zz++)
                    {}
                    System.out.println(" *");
                    for(int zz=1;zz<=1000000000;zz++)
                    {}
                    System.out.println(" *");
                }
                break;
            }
            
            case 2:
            {
                for(a=1;a<=n;a++)
                {
                    n1=((int)(Math.random()*10))+r1;
                    n2=((int)(Math.random()*10))+r2;
                    System.out.print(n1+" - "+n2+" = ");
                    ans=Integer.parseInt(br.readLine());
                    if(ans==(n1-n2))
                    {
                        System.out.println("Correct Answer ");
                        c++;
                    }
                    else
                    {
                        System.out.println("Wrong Answer Correct was : "+(n1-n2));
                        w++;
                    }
                    for(int zz=1;zz<=1000000000;zz++)
                    {}
                    System.out.println(" *");
                    for(int zz=1;zz<=1000000000;zz++)
                    {}
                    System.out.println(" *");
                    for(int zz=1;zz<=1000000000;zz++)
                    {}
                    System.out.println(" *");
                }
                break;
            }
            
            case 3:
            {
                for(a=1;a<=n;a++)
                {
                    n1=((int)(Math.random()*10))+r1;
                    n2=((int)(Math.random()*10))+r2;
                    System.out.print(n1+" * "+n2+" = ");
                    ans=Integer.parseInt(br.readLine());
                    if(ans==(n1*n2))
                    {
                        System.out.println("Correct Answer ");
                        c++;
                    }
                    else
                    {
                        System.out.println("Wrong Answer Correct was : "+(n1*n2));
                        w++;
                    }
                    for(int zz=1;zz<=1000000000;zz++)
                    {}
                    System.out.println(" *");
                    for(int zz=1;zz<=1000000000;zz++)
                    {}
                    System.out.println(" *");
                    for(int zz=1;zz<=1000000000;zz++)
                    {}
                    System.out.println(" *");
                }
                break;
            }
            
            case 4:
            {
                for(a=1;a<=n;a++)
                {
                    n1=((int)(Math.random()*10))+r1;
                    n2=((int)(Math.random()*10))+r2;
                    System.out.print(n1+" / "+n2+" = ");
                    ans=Integer.parseInt(br.readLine());
                    if(n2==0)
                        n2=n2+1;
                    if(ans==(n1/n2))
                    {
                        System.out.println("Correct Answer ");
                        c++;
                    }
                    else
                    {
                        System.out.println("Wrong Answer Correct was : "+(n1/n2));
                        w++;
                    }
                    for(int zz=1;zz<=1000000000;zz++)
                    {}
                    System.out.println(" *");
                    for(int zz=1;zz<=1000000000;zz++)
                    {}
                    System.out.println(" *");
                    for(int zz=1;zz<=1000000000;zz++)
                    {}
                    System.out.println(" *");
                }
                break;
            }
            default:
            {
                System.out.println("Wrong Choice !!! \nPlease Try Again. . .");
            }
        }
        System.out.println("You gave "+c+" Correct Answers and "+w+" Wrong ");
      if(c>=(n/2))
      {
        System.out.println("    * * * * * * * *    ");
        System.out.println("  * * * * * * * * * *  ");
        System.out.println("* * * * * * * * * * * *");
        System.out.println("                       ");
        System.out.println("   ***           ***   ");
        System.out.println("    **           **    ");
        System.out.println("            *          ");
        System.out.println("           *           ");
        System.out.println("          *            ");
        System.out.println("          * *          ");
        System.out.println("      *         *      ");
        System.out.println("        * * * *        ");
      }
      else
      {
        System.out.println("    * * * * * * * *    ");
        System.out.println("  * * * * * * * * * *  ");
        System.out.println("* * * * * * * * * * * *");
        System.out.println("                       ");
        System.out.println("   ***           ***   ");
        System.out.println("    **           **    ");
        System.out.println("            *          ");
        System.out.println("           *           ");
        System.out.println("          *            ");
        System.out.println("          * *          ");
        System.out.println("                       ");
        System.out.println("        * * * *        ");
        System.out.println("      *         *      ");
      }
    }
}
