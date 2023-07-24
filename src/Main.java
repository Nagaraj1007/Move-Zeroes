import java.util.Arrays;

public class Main {

    public static int[] moveZeroesIterator(int[] array){
        for (int iterator = 0 ; iterator < array.length ; iterator++){
            if (array[iterator] == 0){
                array = moveZeroes(array , iterator);
            }
        }
        return array;
    }
    public static int[] moveZeroes(int[] array, int index){
        int last = array[array.length - 1];
        for (int iterator = index ; iterator < array.length - 1 ;iterator++){
            array[iterator] = array[iterator + 1];
        }
        array[array.length - 1] = 0;
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveZeroesIterator(new int[]{0})));
    }
}