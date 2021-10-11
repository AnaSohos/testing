
import java.util.Iterator;
import java.util.NoSuchElementException;

public class EvenNumbersIterator implements Iterator {

    private int[] data;
    private int index;

    @Override
    public boolean hasNext() {
      
        while (index < data.length && data[index] % 2 != 0  ) {
            index++;
       
        }
           return index < data.length;
        }

        @Override
        public Integer next
        
            () {
                     if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return data[index++];

        }

    

    public EvenNumbersIterator(int[] data) {
        this.data = data;
    }

}
