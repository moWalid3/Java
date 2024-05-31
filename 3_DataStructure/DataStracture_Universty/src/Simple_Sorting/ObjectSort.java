package Simple_Sorting;


    // objectSort.java
// demonstrates sorting objects (uses insertion sort)
// to run this program: C>java ObjectSortApp
////////////////////////////////////////////////////////////////
    class Person
    {
        private String lastName;
        private String firstName;
        private int age;
        //-----------------------------------------------------------
        public Person(String last, String first, int a)
        { // constructor
            lastName = last;
            firstName = first;
            age = a;
        }
        //-----------------------------------------------------------
        public void displayPerson()
        {
            System.out.print(" Last name: " + lastName);
            System.out.print(", First name: " + firstName);
            System.out.println(", Age: " + age);
        }
        //-----------------------------------------------------------
        public String getLast() // get last name
        { return lastName; }
    } // end class Person
    ////////////////////////////////////////////////////////////////
    class ArrayInOb
    {
        private Person[] a; // ref to array a
        private int nElems; // number of data items
        //--------------------------------------------------------------
        public ArrayInOb(int max) // constructor
        {
            a = new Person[max]; // create the array
            nElems = 0; // no items yet
        }
        //--------------------------------------------------------------
// put person into array
        public void insert(String last, String first, int age)
        {
            a[nElems] = new Person(last, first, age);
            nElems++; // increment size
        }
        //--------------------------------------------------------------
        public void display() // displays array contents
        {
            for(int j=0; j<nElems; j++) // for each element,
                a[j].displayPerson(); // display it
            System.out.println();
        }
        //--------------------------------------------------------------
        public void insertionSort()
        {
            int in, out;
            for(out=1; out<nElems; out++) // out is dividing line
            {
                Person temp = a[out]; // remove marked person
                in = out; // start shifting at out
                while(in>0 && // until smaller one found,
                        a[in-1].getLast().compareTo(temp.getLast())>0)
                {
                    a[in] = a[in-1]; // shift item to the right
                    --in; // go left one position
                }
                a[in] = temp; // insert marked item
            } // end for
        } // end insertionSort()
//--------------------------------------------------------------
    } // end class ArrayInOb
    ////////////////////////////////////////////////////////////////
    class ObjectSortApp
    {

        public static void main(String[] args)
        {
            int maxSize = 100; // array size
            ArrayInOb arr; // reference to array
            arr = new ArrayInOb(maxSize); // create the array
            arr.insert("Evans", "Patty", 24);
            arr.insert("Smith", "Doc", 59);
            arr.insert("Abdo", "Paul", 37);
            arr.insert("Yee", "Tom", 43);
            arr.insert("Ali", "Patty", 56);
            arr.insert("Mohamed", "Patty", 22);
            arr.insert("Ahmed", "Patty", 77);
            arr.insert("Hamza", "Patty", 65);

            System.out.println("“Before sorting:”");
            arr.display(); // display items
            arr.insertionSort(); // insertion-sort them
            System.out.println("“After sorting:”");
            arr.display(); // display them again
        } // end main()
    } // end class ObjectSortApp
////////////////////////////////////////////////////////////////

