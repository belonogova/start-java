public class Wolf {

    private String sex;
    private String name;
    private int age;
    private String color;

    public String getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    void setColor(String color) {
        this.color = color;
    }

    public void go() {
        System.out.println("Идет");
    }
    
    public void sit() {
        System.out.println("Сидит");
    }

    public void run() {
        System.out.println("Бежит");
    }

    public void howl() {
        System.out.println("Воет");
    }

    public void hunt() {
        System.out.println("Охотиться");
    }
}