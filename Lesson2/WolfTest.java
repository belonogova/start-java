public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();

        wolfOne.sex = "Men";
        wolfOne.name = "Friend";
        wolfOne.age = 3;
        wolfOne.color = "grey";

        System.out.println("Пол = " + wolfOne.sex);
        System.out.println("Имя = " + wolfOne.name);
        System.out.println("Возраст = " + wolfOne.age);
        System.out.println("Окрас = " + wolfOne.color);

        wolfOne.go();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}