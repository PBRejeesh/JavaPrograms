import java.util.Scanner;

class Fibonacci{

    public static void main(String[] args){

    Fibonacci fib=new Fibonacci();
    System.out.println("Fibonacci series ,Author:Rejeesh");
    
    int limit=0;

    if(args.length==0)
    {
    Scanner in=new Scanner(System.in);
     
    System.out.println("Enter Fibonacci series length:");
    limit = in.nextInt();
    }
     else
     limit=Integer.parseInt(args[0]);     
        
    System.out.println("Fibonacci series........");
    
    for(int i=1;i<=limit;i++){
            
     System.out.println(fib.fibonacci(i));   
     }
     
    System.out.println("****End series****");   
  }

  public int fibonacci(int num){

    int f1=1;
    int f2=1;
    int temp=0;

    if(num==1 || num ==2)
     return 1;
     
     for(int j=3;j<=num;j++){
       temp=f2;
       f2=f1+f2;
       f1=temp;
     }
      return f2;  
  }
}
