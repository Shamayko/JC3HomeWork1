public class MainApp {

    public static void main(String[] args) {

        Box<Apple> box1 = new Box<>();
        Box<Apple> box2 = new Box<>();
        Box<Orange> box3 = new Box<>();
        Box<Orange> box4 = new Box<>();

        box1.addFruit(15, new Apple());
        box2.addFruit(20, new Apple());
        box3.addFruit(30, new Orange());
        box4.addFruit(10, new Orange());

        System.out.println(box1.getBoxWeight());
        System.out.println(box2.getBoxWeight());
        System.out.println(box3.getBoxWeight());
        System.out.println(box4.getBoxWeight());

        System.out.println(box1.compare(box4));
        box1.moveFruits(box2);
        System.out.println(box1.getBoxWeight());
        System.out.println(box2.getBoxWeight());

    }


}
