package AssignmentLectures.java.Assignment2;


public class ArrayOfPerson {
    private Person []arr;
    private int nElms;
    public ArrayOfPerson(int max){
        arr=new Person[max];
        nElms=0;
    }
    public void insert(Person person){
        arr[nElms++]=person;
    }
    public void bubbleSort(){
        for (int i = nElms-1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j].getAge() > arr[j + 1].getAge()) {
                    Person temp=arr[j+1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public boolean binarySearch(Person person){
        int value=person.getAge();
        int right = nElms-1;
        int left = 0;
        int mid;
        while (right >= left) {
            mid=(right+left)/2;
            if (value == arr[mid].getAge()) {
                return true;
            } else if (value > arr[mid].getAge()) {
                left=mid+1;
            }else {
                right=mid-1;
            }
        }
        return false;
    }
}
