public class SumOfSubsets
{
    public static int count = 0;
    public static void main(String args[]) {
  int arr[] = {12,3,4,1,8,5};
  int w = 8 ;
  recursion(arr,w, 0, 0, "");
 }


 public static void recursion(int[] arr, int w, int i, int sum, String str) {
  if(sum == w) {
   System.out.println("It got! : "+str);
  }
  if(i < arr.length){
      if(sum < w) {
       recursion(arr,w,i+1, sum + arr[i], str+" "+arr[i]);   
      }
      if(sum != w) {
        recursion(arr,w,i+1, sum, str);  
      }
     count++;
  }
 }
}