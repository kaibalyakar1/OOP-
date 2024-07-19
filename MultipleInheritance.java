interface A{
    public void run();
}

interface B{
    public void run();
}

class C implements A ,B{
    public void run(){
        System.out.println("c Is running");
    }
}


public class MultipleInheritance {

    public static void main(String[] args) {
        C ram = new C();
        ram.run();
    }
}
