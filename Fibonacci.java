
class Fibonacci{
    
 public static void main (String[]args){
    
    
   int i=0;
   int f=1;
   int s=2;
   int n=0;
   int sum =0;
   while ( f <= 4000000 || s<=4000000){
    
    
    
    n=f+s;
    
    
    
    if(f%2==0){
    
    sum=sum+f;
    }
   
    
    f=s;
    s=n;
    
    
    
    
    
    
}
System.out.println(sum);
}





}









