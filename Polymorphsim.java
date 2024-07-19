//Basically there are 2 things in polymorphism

/*i) MethodOverloading
ii) MethodOverriding */

//MethodOverloading

class Num{
    void sum(int num1 , int num2){
        System.out.println("Sum is " + (num1+num2));

    }

    void sum(int num1, int num2, int num3){
        System.out.println(num1+num2+num3);
    }

    void sum(String i, String j){
        System.out.println("Addition is "+ i+j);
    }
}



//*******************************METHODOVERIDING**************************
class Bank{
    void ROI(){
        System.out.println("5%");
    }
}

class PNB extends Bank{

    void ROI(){
        System.out.println("7%");
    }
}

class SBI extends Bank{
    @Override
    void ROI(){
        System.out.println("10%");
    }
}
public class Polymorphsim {
    public static void main(String[] args) {

      /*  METHODOVERLOADING
        Num KK = new Num();
        KK.sum(3,4);
        KK.sum(1,3,4);
        KK.sum("kaiba","lya"); */



/* METHODOVERIDING
        PNB pn = new PNB();
        pn.ROI();

        SBI sb = new SBI();
        sb.ROI();

 */
    }


}
