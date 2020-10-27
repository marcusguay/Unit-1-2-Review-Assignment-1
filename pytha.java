class pytha{
    
 public static void main ( String[] args){
     int a=0;
     int b=0;
     int c=0;
     int sum=0;
     
    
     
    
    
     while(sum  < 999 	
||  sum > 1001){
     
      a=(int)(Math.random()*1000 );
      b=(int)(Math.random()*1000 );
      c=(int)(Math.random()*1000);
           
      if(c>b && a<b){
       
        a=(int)Math.pow(a,2);
        b=(int)Math.pow(b,2);
        c=(int)Math.pow(c,2);
         if(a+b==c){
             a=(int)Math.sqrt(a);
               b=(int)Math.sqrt(b);
                c=(int)Math.sqrt(c);
              
          sum=a+b+c;
             
         
     
     
     
          
               }
       
       
    }
     
    
    
    }
    System.out.println(a*b*c);
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println("sum" + sum);
}
    
    
    
    
    
    
    
    
    
    
}