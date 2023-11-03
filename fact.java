//Factorial 

class HelloWorld {
    public static void main(String[] args) {
        int a=121;
        int b=0;
        int c=0;
        for(int i=0;i<5;i++){
            c=a+b;
            a=b;
            b=c;
             System.out.println(c);
        }
        System.out.println("Hello, World!");
       
    }
}