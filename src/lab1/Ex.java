package lab1;

class MyClass {
    private int a;
    private int b;
    public MyClass(int a, int b) { this.a = a; this.b = b; }
    public int getA() { return a; }
    public int getB() { return b; }
    public void set(int a, int b) { this. a= a; this.b = b; }
}

public class Ex {
    public static void doSomething(MyClass z, MyClass t) {
        z = t;
        t = new MyClass(5,6);
        z.set(7, z.getA() + t.getB());
        System.out.println("Finish");
    }
    public static void main(String[] args) {
        MyClass x = new MyClass(1,2);
        MyClass y = new MyClass(3,4);
        doSomething(x,y);
        System.out.println("Finish");
    }
}

// 685 : 7,9
// 686 : 5,6
// 684 : 1,2