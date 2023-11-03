// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=0;
        int b=1;
        int c;
        System.out.println();
        System.out.println(a);
        System.out.println(b);
        for(int i=0;i<n;i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            
        }
    }
        
}