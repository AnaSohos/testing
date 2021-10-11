
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int[] arr = {4, 4, 4, 7, 8, 2, 9, 1};
        int[] arr2 = {2, 4, 6};
        int[][] sfs = {
            {1, 2}, {3, 4}
        };

        MatrixIt nn = new MatrixIt(sfs);

        EvenNumbersIterator interNum = new EvenNumbersIterator(arr);

        for (; interNum.hasNext();) {
            System.out.println(interNum.next());
        }
 List <Integer> list = new ArrayList<>();
    }

}
