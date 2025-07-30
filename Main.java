
import java.util.Scanner;




public class Main {
    public static void main(String[] args) {
//first programme hello world
     /*{
    System.out.println("Hello World"); 
    }  */
//Learn to comment
    /* 
     {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Prints a
        System.out.println(a);   
        // Prints b
        System.out.println(b);
        // Prints c
        System.out.println(c);
    }
    */
    //primitive Data Types
 /*  { boolean valid = true;
     byte  marks   = 90;
     float pi      = (float) 3.14;
     float div     =  (float) ((float)15.0/4.0);
     long  views   = 1000000000;
     char  gender  = (char) 'm';
     System.out.println("Valid: " + valid);
     System.out.println("Marks: " + marks);
     System.out.println("Pi: " + pi);
     System.out.println("Div:" + div);
     System.out.println("Views: " + views);
     System.out.println("Gender " + gender);
       } */
        //Swaping of two no
     /* int a = 10;
        int b = 20;
        int temp =0;
        temp = a; 
        a=b;
        b= temp;
        System.out.println(a);
        System.out.println(b); */
        //Autoboxing and unboxing 
         /* 
        int x1 = 10;
        Integer x2 = x1; // autoboxing
        int x3 = x2;     // unboxing
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);*/
        //2programme of autoboxing and unboxing  
        /* 
        Integer x1 = 40, x2 =40;
        if (x1==x2)
        System.out.println("Same");
        else
        System.out.println("Different");*/
        //concatentate the two integer a and b
    /*  Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String result = Integer.toString(a) + Integer.toString(b);
        System.out.println(result);*/
        //swap of two no
 /*     Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp =a ;
        a=b;
        b=temp;
        
        System.out.println(a + " " + b);
       System.out.print("Path:C:\\xyz\\abc.txt"); */
       //Buffered reader program input /output
       /* 
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter a  Integer");
    int x = Integer.parseInt(br.readLine());
        System.out.println("You entered: " + x);*/
    //Java output println or print
   /* 
    int x=10,y=20;
    char z='G';
    String str ="GFG";
    System.out.println(x);
    System.out.println(x+y);
    System.out.println(x+" "+y);
    System.out.print(str+"  ");
    System.out.print("courses");*/
//java output System.out.format
    /*
    int x=100 ;
    System.out.format("The value of x is %d \n ",x);
    
    double y = Math.PI;
    System.out.println(y);

    System.out.format("Value of PI =%2f \n",y);
    System.out.format("Value of PI =%5.2f \n",y);
    System.out.format("Value of PI =%05.2f \n",y);
    System.out.println("Welcome to the\"GeeksforGeeks\"");
    System.out.printf("x=%d",x);
    System.out.print("Path:C:\\xyz\\abc.txt");*/
   // java output problem 1
   /*
    Scanner sc =new Scanner(System.in);
    int   a= sc.nextInt();    //Read integer
        float b= sc.nextFloat();  //read float
        long  c= sc.nextLong();   //read long
        byte  d= sc.nextByte();   //read byte
        sc.nextLine();            //Consume the Leftover newline
        String s= sc.nextLine();  //Read full line(String)
        //Outputeach on a new line
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(s);
     */   
    //OPERATOR
        //Arthimetic operator
        /*
        int x=10 ,y=20;
        System.out.println(x+y);
        System.out.println(x*y);
        System.out.println(y/x);
        int z=(x+y*10);
        System.out.println(z);
        z=x++;
        System.out.println(z+ " " +x);
        z=+x;
        System.out.println(z+ " " +x);
        */
        //Assignment Operator
        /* 
        int x =10, y=5 ,z;
        x+=y;
        System.out.println(x);
        x %=y;
        System.out.println(x);
        z=x=y;
        System.out.println(z);
        */
        //logical operator
        /* 
        String user = "geek" ,pwd = "Geek";
        Scanner sc = new Scanner(System.in);
        String iu = sc.next();
        String ip = sc.next();
        if
        (user.equals(iu)&& pwd.equals(ip))
        System.out.println("Welcome");
        else  
        System.out.println("Tryagain");
        */
        //2 logical operator program
        /*
        boolean x = true, y = false;
        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(!x);
*/
        //Relational operator
        /* 
        int x=100, y=200;
        System.out.println(x==y);
        System.out.println(x!=y);
        System.out.println(x>y);
        System.out.println(x<y);
        System.out.println(x>=y);
        System.out.println(x<=y);
        */
        //Bitwise operator(bitwise not)
        /* 
        int x=-2;
        System.out.println(x>>>1);
        */
        //sum of n natural numbers
        Scanner  sc = new Scanner(System.in);
         System.out.println("Enter the Sum of n natural number");
        int n = sc.nextInt();
        int sum = n*(n+1);
        System.out.println("Sum"+ sum);
        
    }
}
        