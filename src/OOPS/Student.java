package OOPS;

public class Student { // access all packages
    String name;
    private int rno; // private -> access only same class
    double percentage;

//    accessing and setting value of private using getter and setter function

    public int getRno(){ //getter
        return rno;
    }
    public void setRno(int rno){
        this.rno = rno;
    }
}
