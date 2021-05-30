
import java.util.Arrays;

public class PlaceChanger<T> {
    private T[] array;

    public PlaceChanger(T[] array) {
        this.array = array;
    }


    public static void main(String[] args) {
        PlaceChanger<String> array = new PlaceChanger<>(new String[]{"Love", "Death", "Robots"});
        array.changePlace(0, 2);
    }

    private void changePlace(int place1, int place2) {
        try {
            if (place1 >= 0 || place1 < array.length || place2 >= 0 || place2 < array.length) {
                T tmp = array[place1];
                array[place1] = array[place2];
                array[place2] = tmp;
            }

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Ошибка длины массива. В массиве нет " +
                    ((place1 < 0 || place1 >= array.length) ? place1 : place2));
        }

        System.out.println(Arrays.toString(array));
    }


}
