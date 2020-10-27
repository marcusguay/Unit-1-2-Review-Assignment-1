class sum{
    
 public static void main(String[]args){   
    int i=0;
    int sum1=0;
    int z=0;
    
    int sum2=0;
    while(i <= 100){
    
    sum1=(int)Math.pow(i,2);
    z=z+sum1;
    i++;
    
    } 
    
    i=0;
    while(i <= 100){
    
    
    sum2=sum2+i;
    i++;
    
    } 
     sum2=(int)Math.pow(sum2,2);
    System.out.println(z);
    System.out.println(sum2);
   
    
    
    
    System.out.println(z-sum2);
    
}
}