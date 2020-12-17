
import java.io.*;
class BINARYSEARCH
{
    void pqr(int n)throws IOException
    {
        BufferedReader br=new  BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER SIZE");
        int q=Integer.parseInt(br.readLine());
        int ar[]=new int[q];
        int x=ar.length;
    for(int i=0; i<x; i++)
    {
        for(int j=0; j<x-i-1; j++)
        {
            if(ar[j]>ar[j+1])
            {
                int t=ar[j];
                ar[j]=ar[j+1];
                ar[j+1]=t;
            }}}
    int start=0,end=x-1;
    int mid,c=9,pos=0;
    while(start<=end)
    {
        mid=(start+end)/2;
        if(ar[mid]==n)
        {
            pos=mid;
            c=10;
            break;
        }
        else if(ar[mid]>n)
        {
            end=mid-1;
        }
        else if(ar[mid]<n)
        {
            start=mid+1;
        }
    }
    if(c==10)
    {
        System.out.println(n+"is present at"+pos);
    }
    else
    { System.out.println("element not in the list");
    }
}}

        
            