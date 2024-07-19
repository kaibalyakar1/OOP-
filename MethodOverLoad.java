public class MethodOverLoad {

    static int sum(int a, int b){
        return a+b;
    }

    static int sum(int a, int b, int c){
        return a+b+c;
    }

    static String sum(String a, String b){
        return a+b;
    }


    public static void main(String[] args) {
        System.out.println( sum(5,6));
    }
}
