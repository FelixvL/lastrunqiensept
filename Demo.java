public class Demo {   // HB
    public static void main(String[] args) {
        System.out.println("even een leuke dier vinden");
        Dier nina = new Hond();
        Beer yogi = new Beer();
        Dier felix = new Mens();
        felix.spelen(nina, yogi);
    }
}

interface Huisdier {
    default void chillen() {
        System.out.println("de huisdier is relaxed");
    }
}
abstract class Dier {
    abstract void aaien() throws Exception;
    public void spelen(Dier een, Dier twee) {
        try {
            twee.aaien();
        } catch (Exception e) {
            System.out.println( "DE BEER IS BOOS! WEG LOPEN!");
        }
    }
}
class Mens extends Dier {
    void aaien() {
        System.out.println("dit is heel raar");
    }
}
class Hond extends Dier implements Huisdier {
    public void aaien() {
        System.out.println("wat een geweldig beest");
    }
    public void chillen() {
        System.out.println("de hond is chill");
    }
}
class Beer extends Dier {
    public void aaien() throws Exception {
        throw new Exception();
    }
}