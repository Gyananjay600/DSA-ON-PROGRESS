package Methods;

public class TypesOfFunctions {
    public static void main(String[] args) {

        greet();

        sayhello("Gyana"); // Arguments

        System.out.println(getNumber());

        System.out.println(multiply(12,13));


    }
    // no input , no output
    static void greet(){
        System.out.println("Hello World");
        return; // optional
    }

    // take input , no output
    static void sayhello(String name){ // number of parameters can be anything
        System.out.println("Hello "+name);
//        return;  // optional
    }

//    no input give output
    static int getNumber(){
        return 117;
    }

    // take input, give output

    static int multiply(int a,int b){
        return a*b;
    }
}
