public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setName("Cherno Alpha");
        jaeger1.setLounched(2015);
        jaeger1.setMark("Mark-1");
        jaeger1.setOrigin("Russia");
        jaeger1.setHeight(280);
        jaeger1.setWeight(2.412);
        jaeger1.setSpeed(3);
        jaeger1.setArmor(10);

        System.out.println("Имя: " + jaeger1.getName());
        System.out.println("Год выпуска: " + jaeger1.getLounched());
        System.out.println("Страна: " + jaeger1.getOrigin());
        System.out.println("Скорость: " + jaeger1.getSpeed());
        System.out.println("Броня: " + jaeger1.getArmor());

        jaeger1.move();
        jaeger1.poverMove();
        jaeger1.drift();
        jaeger1.selfDestruction();
        jaeger1.scanKaiju();

        Jaeger jaeger2 = new Jaeger("Coyote Tango", "Marc-1", "Japan", 280, 2.312, 5, 4);
        System.out.println("Имя: " + jaeger2.getArmor());
        System.out.println("Страна: " + jaeger2.getArmor());
        System.out.println("Скорость: " + jaeger2.getArmor());
        System.out.println("Броня: " + jaeger2.getArmor());

        jaeger2.move();
        jaeger2.drift();
        jaeger2.selfDestruction();

        Jaeger jaeger3 = new Jaeger();
        System.out.println("Имя: " + jaeger3.getName());


    }
}