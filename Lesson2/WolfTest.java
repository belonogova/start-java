public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();

        wolfOne.setSex("Women");
        wolfOne.setName("Jim");
        wolfOne.setAge(7);
        wolfOne.setColor("Black");

        System.out.println("Пол = " + wolfOne.getSex());
        System.out.println("Имя = " + wolfOne.getName());
        System.out.println("Возраст = " + wolfOne.getAge());
        System.out.println("Окрас = " + wolfOne.getColor());

        wolfOne.go();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}