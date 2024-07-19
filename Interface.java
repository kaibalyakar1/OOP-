interface Animal{
    public void run();
    public void sleeps();
}

class Lion implements Animal{
    @Override
    public void run() {
        System.out.println("Lion is running");
    }

    @Override
    public void sleeps() {
        System.out.println("Lion sleeps 8hour");
    }
}

class Tiger implements Animal{

    @Override
    public void run() {
        System.out.println("Tiger is running");
    }

    @Override
    public void sleeps() {
        System.out.println("Tiger sleeps 8 hour");
    }
}

public class Interface {

    public static void main(String[] args) {
        Animal Lion = new Lion();
        Lion.run();
    }
}
