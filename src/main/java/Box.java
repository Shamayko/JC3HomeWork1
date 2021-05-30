import java.util.ArrayList;

public class Box<T extends Fruit> {


    private ArrayList<T> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }


    public ArrayList<T> getFruits() {
        return this.fruits;
    }

    public int getFruitsNumber() {
        return this.fruits.size();
    }

    public float getBoxWeight() {
        return getFruitsNumber() * fruits.get(0).getWeight();
    }

    public void addFruit(int number, T fruit) {
        for (int i = 0; i < number; i++) {
            fruits.add(fruit);
        }
    }


    public boolean compare(Box<?> anotherBox) {
        return this.getBoxWeight() == anotherBox.getBoxWeight();
    }


    public void moveFruits(Box<T> anotherBox) {
        for(int i = 0; i < this.getFruitsNumber(); i++) {
            anotherBox.getFruits().add(fruits.get(i));
        }
        this.fruits.clear();
    }



}

