abstract class Car{

    //we can't create any object using abstract class


    //initilizing abstract method

    abstract public void fuelType();

    //we can initiate normal method too

    public void color(){
        System.out.println("White");
    }

}

class Mahindra extends Car{
    @Override
    public void fuelType() {
        System.out.println("Diesel");
    }


}

public class Abstraction {

    public static void main(String[] args) {
        Mahindra xux3xo = new Mahindra();
        xux3xo.fuelType();
        xux3xo.color();
    }
}
