import java.util.Scanner;
import java.io.File;

public class test0{

public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();

    System.out.println("woha! you have really grown up ! you are "+age+" years old ");


}
}

public static void main(String[] args){

    File f = new File("d:\\abc.txt");
    
    f.createNewFile(); 

}

public class test2{

    int n1,n2,results;

    Scanner sc = new Scanner(System.in);

    void calculate() {
        try{
        System.out.println("Enter First Number");
        n1 = sc.nextInt();

        System.out.println("Enter second Number");

        n2=sc.nextInt();

        result = n1/n2;
        }
        catch(Exception e){
            System.out.println("ouch! Exception Detected!");
        }

        System.out.println("The Division is "+result);

    }

    public static void main(String[] args){
        Test2 obj = new Test2();
        obj.calculate();
    }

}
