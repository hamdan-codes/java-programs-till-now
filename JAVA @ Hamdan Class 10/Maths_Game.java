import java.io.*;
class Maths_Game
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n1=0,n2=0,s=0;
        int a=0,b=0,k=0,ans=0;
        System.out.println("1. Easy ");
        System.out.println("2. Medium ");
        System.out.println("3. Hard ");
        System.out.print("Enter Choice :  ");
        int sc= Integer.parseInt(br.readLine());
        System.out.print("Please Enter the Number of Questions you want to play for _____");
        int n=Integer.parseInt(br.readLine());
        System.out.print("Please Wait Loading  ");
        for(int zz=1;zz<=1000000000;zz++)
        {}
        System.out.print(". ");
        for(int zz=1;zz<=1000000000;zz++)
        {}
        System.out.print(". ");
        for(int zz=1;zz<=1000000000;zz++)
        {}
        System.out.print(". ");
        System.out.println();
     switch(sc)
      {
       case 1:
       {
        for(a=1;a<=n;a++)
        {
            n1=(int)(Math.random()*10);
            n2=(int)(Math.random()*10);
            s =(int)(Math.random()*10);
            if((s>=0)&&(s<=2))
            {
                System.out.println(n1+" + "+n2+" = '?'");
                System.out.print("Type Your Answer : ");
                ans = Integer.parseInt(br.readLine());
                if(ans==(n1+n2))
                {
                    System.out.println("Correct Answer ");
                    k++;
                }
                else 
                    System.out.println("Correct Answer was "+(n1+n2));
            }
            
            else if((s>=2)&&(s<=5))
            {
                System.out.println(n1+" - "+n2+" = '?'");
                System.out.print("Type Your Answer : ");
                ans = Integer.parseInt(br.readLine());
                if(ans==(n1-n2))
                {
                    System.out.println("Correct Answer ");
                    k++;
                }
                else 
                    System.out.println("Correct Answer was "+(n1-n2));
            }
            
            else if((s>=6)&&(s<=7))
            {
                System.out.println(n1+" * "+n2+" = '?'");
                System.out.print("Type Your Answer : ");
                ans = Integer.parseInt(br.readLine());
                if(ans==(n1*n2))
                {
                    System.out.println("Correct Answer ");
                    k++;
                }
                else 
                    System.out.println("Correct Answer was "+(n1*n2));
            }
            
            else if((s>=8)&&(s<=9))
            {
                if(n2==0)
                    n2=n2+1;
                System.out.println(n1+" / "+n2+" = '?'");
                System.out.print("Type Your Answer : ");
                ans = Integer.parseInt(br.readLine());
                if(ans==(n1/n2))
                {
                    System.out.println("Correct Answer ");
                    k++;
                }
                else 
                    System.out.println("Correct Answer was "+(n1/n2));
            }
            System.out.println("Please Wait Loading Next Question  ");
            System.out.print(". ");
            for(int zz=1;zz<=1000000000;zz++)
            {}
            System.out.print(". ");
            for(int zz=1;zz<=1000000000;zz++)
            {}
            System.out.print(". ");
            for(int zz=1;zz<=1000000000;zz++)
            {}
            System.out.print(". ");
            for(int zz=1;zz<=1000000000;zz++)
            {}
            System.out.print(". ");
            for(int zz=1;zz<=1000000000;zz++)
            {}
            System.out.println();
        }
        break;
       }
       
       case 2:
       {
        for(a=1;a<=n;a++)
        {
            n1=((int)(Math.random()*10))+20;
            n2=((int)(Math.random()*10))+20;
            s =(int)(Math.random()*10);
            if((s>=0)&&(s<=2))
            {
                System.out.println(n1+" + "+n2+" = '?'");
                System.out.print("Type Your Answer : ");
                ans = Integer.parseInt(br.readLine());
                if(ans==(n1+n2))
                {
                    System.out.println("Correct Answer ");
                    k++;
                }
                else 
                    System.out.println("Correct Answer was "+(n1+n2));
            }
            
            else if((s>=3)&&(s<=5))
            {
                System.out.println(n1+" - "+n2+" = '?'");
                System.out.print("Type Your Answer : ");
                ans = Integer.parseInt(br.readLine());
                if(ans==(n1-n2))
                {
                    System.out.println("Correct Answer ");
                    k++;
                }
                else 
                    System.out.println("Correct Answer was "+(n1-n2));
            }
            
            else if((s>=6)&&(s<=7))
            {
                System.out.println(n1+" * "+n2+" = '?'");
                System.out.print("Type Your Answer : ");
                ans = Integer.parseInt(br.readLine());
                if(ans==(n1*n2))
                {
                    System.out.println("Correct Answer ");
                    k++;
                }
                else 
                    System.out.println("Correct Answer was "+(n1*n2));
            }
            
            else if((s>=8)&&(s<=9))
            {
                if(n2==0)
                    n2=n2+1;
                System.out.println(n1+" / "+n2+" = '?'");
                System.out.print("Type Your Answer : ");
                ans = Integer.parseInt(br.readLine());
                if(ans==(n1/n2))
                {
                    System.out.println("Correct Answer ");
                    k++;
                }
                else 
                    System.out.println("Correct Answer was "+(n1/n2));
            }
            System.out.println("Please Wait Loading Next Question  ");
            System.out.print(". ");
            for(int zz=1;zz<=1000000000;zz++)
            {}
            System.out.print(". ");
            for(int zz=1;zz<=1000000000;zz++)
            {}
            System.out.print(". ");
            for(int zz=1;zz<=1000000000;zz++)
            {}
            System.out.print(". ");
            for(int zz=1;zz<=1000000000;zz++)
            {}
            System.out.print(". ");
            for(int zz=1;zz<=1000000000;zz++)
            {}
            System.out.println();
        }
        break;
       }
       
       case 3:
       {
        for(a=1;a<=n;a++)
        {
            n1=((int)(Math.random()*10))+50;
            n2=((int)(Math.random()*10))+50;
            s =(int)(Math.random()*10);
            if((s>=0)&&(s<=1))
            {
                System.out.println(n1+" + "+n2+" = '?'");
                System.out.print("Type Your Answer : ");
                ans = Integer.parseInt(br.readLine());
                if(ans==(n1+n2))
                {
                    System.out.println("Correct Answer ");
                    k++;
                }
                else 
                    System.out.println("Correct Answer was "+(n1+n2));
            }
            
            else if((s>=2)&&(s<=3))
            {
                System.out.println(n1+" - "+n2+" = '?'");
                System.out.print("Type Your Answer : ");
                ans = Integer.parseInt(br.readLine());
                if(ans==(n1-n2))
                {
                    System.out.println("Correct Answer ");
                    k++;
                }
                else 
                    System.out.println("Correct Answer was "+(n1-n2));
            }
            
            else if((s>=4)&&(s<=6))
            {
                System.out.println(n1+" * "+n2+" = '?'");
                System.out.print("Type Your Answer : ");
                ans = Integer.parseInt(br.readLine());
                if(ans==(n1*n2))
                {
                    System.out.println("Correct Answer ");
                    k++;
                }
                else 
                    System.out.println("Correct Answer was "+(n1*n2));
            }
            
            else if((s>=7)&&(s<=9))
            {
                if(n2==0)
                    n2=n2+1;
                System.out.println(n1+" / "+n2+" = '?'");
                System.out.print("Type Your Answer : ");
                ans = Integer.parseInt(br.readLine());
                if(ans==(n1/n2))
                {
                    System.out.println("Correct Answer ");
                    k++;
                }
                else 
                    System.out.println("Correct Answer was "+(n1/n2));
            }
            System.out.println("Please Wait Loading Next Question  ");
            System.out.print(". ");
            for(int zz=1;zz<=1000000000;zz++)
            {}
            System.out.print(". ");
            for(int zz=1;zz<=1000000000;zz++)
            {}
            System.out.print(". ");
            for(int zz=1;zz<=1000000000;zz++)
            {}
            System.out.print(". ");
            for(int zz=1;zz<=1000000000;zz++)
            {}
            System.out.print(". ");
            for(int zz=1;zz<=1000000000;zz++)
            {}
            System.out.println();
        }
       }
       break;
       
       default:
           System.out.println("Wrong Choice");
     }
        System.out.println("Nice Play You Gave "+k+" Correct Answers and "+(n-k)+" Wrong Ones");
      if(k>=(n/2))
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
