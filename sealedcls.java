sealed class Human permits KK,BK{
    public void play(){
        System.out.println("Human Plays");
    }
}
non-sealed class KK extends Human{
    public void play(){
        System.out.println("KK plays");
    }
}

non-sealed class BK extends Human{
    public void play(){
        System.out.println("BK plays");
    }
}

public class sealedcls {

    public static void main(String[] args) {
        KK kk = new KK();
        kk.play();
    }
}
