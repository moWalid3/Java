package Array.Projects_Ch_2;

/**
 * @version  question  1 , 2 , 3 , 6
 */
public class HighArray {
    private long[]arr;
    private int nElement;

    //---------------------------------
    public HighArray(int max) {
        this.arr=new long[max];
        this.nElement=0;
    }
    //---------------------------------
    public long getMax(){
        if (nElement == 0)
            return -1;
        long value=arr[0];
        for (int i = 1; i < nElement; i++) {
            if (arr[i]>value)
                value=arr[i];
        }
        return value;
    }
    public long removeMax(){
        if (nElement==0)
            return-1;
        int index=0;
        long max=arr[0];
        for (int i = 1; i <nElement ; i++) {
            if (arr[i] > max)
                max=arr[i];
        }
        delete(max);
        return max;
    }
    public void noDups() {
        int i, j;
        for (i=0; i<nElement; i++) {
            j=i+1;
            while (j<nElement) {
                if (arr[j] == arr[i]) {
                    for(int k=j; k<nElement; k++) // copy over duplicate and move higher ones down
                        if (k == arr.length -1)
                            arr[k]=0; //avoids looking for a[k+1] when nElems == a.length
                        else
                            arr[k] = arr[k+1];
                    nElement--;
                }
                else j++;
            }
        }
    }
    public boolean delete(long value){
        int index;
        for (index=0;index<nElement;index++)
            if (arr[index]==value)
                break;
        if (index==nElement)
            return false;
        for (int i = index; i < nElement; i++) {
            if (i==arr.length-1)
                arr[i]=0;
            else
                arr[i]=arr[i+1];
        }
        nElement--;
        return true;
    }
    public boolean find(long searchKey){
        int i;
        for ( i = 0; i < nElement; i++) {
            if (arr[i]==searchKey)
                break;
        }
        return i != nElement;
    }
    public void insert(long value) {
        arr[nElement] = value;
        nElement++;
    }
    public void display() {
        for(int j=0; j<nElement; j++)
            System.out.print(arr[j] + " ");
        System.out.println();
    }

    static class HighArrayApp {
        public static void main(String[] args) {
            int maxSize = 100;
            HighArray arr;                // reference to array
            arr = new HighArray(maxSize); // create the array

            arr.insert(77);               // insert 10 items
            arr.insert(99);
            arr.insert(44);
            arr.insert(55);
            arr.insert(22);
            arr.insert(88);
            arr.insert(11);
            arr.insert(0);
            arr.insert(66);
            arr.insert(33);

            arr.display();                // display items

            int searchKey = 35;           // search for item
            if( arr.find(searchKey) )
                System.out.println("Found " + searchKey);
            else
                System.out.println("Can't find " + searchKey);

            arr.delete(0);               // delete 3 items
            arr.delete(55);
            arr.delete(99);

            arr.display();                // display items again

// solutions
            //2.1, 2.2
            System.out.println("Max: " + arr.getMax());
            System.out.println("Max to delete: " + arr.removeMax());
            arr.display();

            // 2.3
            HighArray arr2 = new HighArray(maxSize);
            while (arr.getMax() != -1)
                arr2.insert(arr.removeMax());
            arr2.display();

            //2.6
            HighArray arr3 = new HighArray(maxSize);
            arr3.insert(1); arr3.insert(1); arr3.insert(2); arr3.insert(3); arr3.insert(2);
            arr3.display();
            arr3.noDups();
            arr3.display();


        }  // end main()
    }







}
