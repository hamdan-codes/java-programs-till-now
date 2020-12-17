import java.io.*;
class Marks
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));           
        System.out.println("Please Enter the number of Students");
        int n= Integer.parseInt(br.readLine());
        int a,b,avg;
         int m1[]= new int[n];
         int m2[]= new int[n];
         int m3[]= new int[n];
         int r[]= new int[n];
         String name[]= new String[n];
        for(a=0;a<n;a++)
        {
            System.out.println("Please Enter Name");
            name[a]= br.readLine();
            System.out.println("Roll number ");
            r[a]=Integer.parseInt(br.readLine());
            System.out.println("First Marks");
            m1[a]=Integer.parseInt(br.readLine());
            System.out.println("Second Marks ");
            m2[a]=Integer.parseInt(br.readLine());
            System.out.println("Third Marks");
            m3[a]=Integer.parseInt(br.readLine());
        }
        for(b=0;b<n;b++)
        {
            avg=(m1[b]+m2[b]+m3[b])/3;
            if((avg>=85)&&(avg<=100))
                System.out.println("Name "+name[b]+" Roll Number "+r[b]+" Gets Average "+avg+" and Remarks :    EXCELLENT");         
               else if((avg>=75)&&(avg<=84))
                System.out.println("Name "+name[b]+" Roll Number "+r[b]+" Gets Average "+avg+" and Remarks :    DISTINCTION");         
               else if((avg>=60)&&(avg<=74))
                System.out.println("Name "+name[b]+" Roll Number "+r[b]+" Gets Average "+avg+" and Remarks :    FIRST CLASS");         
               else if((avg>=40)&&(avg<=59))
                System.out.println("Name "+name[b]+" Roll Number "+r[b]+" Gets Average "+avg+" and Remarks :    PASS");       
                else
                System.out.println("Name "+name[b]+" Roll Number "+r[b]+" Gets Average "+avg+" and Remarks :    POOR");         
        }
    }
}
