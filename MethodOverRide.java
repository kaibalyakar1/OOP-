class Bank {
    public void RateOfIntrest(){
        System.out.println("5%");
    }
}

class SBI extends Bank{
    @Override
    public void RateOfIntrest(){
        System.out.println("SBI 5%");
    }
}

class PNB extends Bank{
    @Override
    public void RateOfIntrest(){
        System.out.println("PNB 5%");
    }

}
public class MethodOverRide {

    public static void main(String[] args) {
        PNB pn = new PNB();
        SBI sb = new SBI();

        pn.RateOfIntrest();
        sb.RateOfIntrest();
    }



}
