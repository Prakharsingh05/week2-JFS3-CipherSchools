


public class Test1{

    //this keyword
    int arg = 5;
    Test1(){
        System.out.println("Hi! i am default constructor");

    }

    Test1(int arg){
        this();
       this.arg=arg;
        
    }

    public static void main(String[] args){
        int arg = 10;
        Test1 obj = new Test1(10);
        System.out.println(obj.arg);
    }
}

Class App{
    App(){
        System.out.println("Constructor of app");

    }

    App(int num){
        System.out.print(num);
    }

}

public class Test2 extends App{

    Test2(){

        super();//used to call constructor of base class
        System.out.println("Constructor of Test2");

    }

    public static void main(String[] args){

        new Test2();
    }  
    
    
}
