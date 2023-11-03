// Online Java Compiler
// Use this editor to write, compile and run your Java code online

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int temp=n,res=n;
        int sum=0;
        int count=0;
        while(temp!=0){
            count++;
            temp/=10;
        }
       
        while(n!=0){
            int rem=n%10;
            int fact=1;
            for(int i=count;i>0;i--){
                fact*=rem;
                
            }
            sum+=fact;
            n/=10;
        }
        System.out.println(sum);
        if(res==sum){
            System.out.println("ArmStrong number");
        }
        else{
            System.out.println("Not strong number");
        }
    }
}