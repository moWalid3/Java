package recursion;

public class Main {
    public static int fact(int num){
        if (num==1)
            return 1;
        return num*fact(--num);
    }
    public static int fab(int num){
        if (num<=2)
            return 1;
        return fab(num-1) + fab(num - 2);
    }
    public static int sum(int num){
        if (num==0)
            return 0;
        return num+sum(num-1);
    }
    public static int power(int base,int os){
        if (os==1)
            return base;
        return base*power(base,os-1);
    }
    public static int fastPower(int base,int os){
        if (os==1)
            return base;
        if (os%2==0)
            return fastPower(base*base,os/2);
        else
            return base*fastPower(base,os-1);
    }
    public static void inverseString(String word ){
        if (word != null && word.length() != 0) {
            inverseString(word.substring(1));
            System.out.println(word.charAt(0));
        }
    }
    public static int binSearch(int []arr,int left,int right,int value){
        int mid;
        if (right>=left){
            mid=(right+left)/2;
            if (value > arr[mid])
                return binSearch(arr,mid+1,right,value);
            else if(value < arr[mid])
                return binSearch(arr,left,mid-1,value);
            else
                return 1;
        }
        return 0;
    }
    public  static void towerOfHanoi(int n,char fromRod,char toRod,char tempRod){
        if (n==1) {
            System.out.println("you must move desk 1 from " + fromRod + " to " + toRod);
        } else {
            towerOfHanoi((n-1),fromRod,tempRod,toRod);
            System.out.println("move dest "+n+" from "+fromRod+" to "+toRod);
            towerOfHanoi((n-1),tempRod,toRod,fromRod);
        }
    }
    public static void main(String[] args) {
        towerOfHanoi(3,'a','b','c');
        System.out.println(fab(9));
        System.out.println(fact(5));
        System.out.println(sum(3));
        System.out.println(power(2,3));
        System.out.println(fastPower(2,5));
         inverseString("mohamed") ;
         int [ ]arr={2,3,5,11,22,33};
        System.out.println(myb(arr, 0, 5, 0));
        System.out.println(parenBit("abc(ans)def"));
        System.out.println(stringClean("yyyzzaam"));
        System.out.println(countHi("iam mo hi pro hiandxhitow"));
        System.out.println(stringDist("catcowcat","cow"));
    }
    public static int myb(int []arr,int low,int high,int value){
        int mid;
        if (high >= low) {
            mid=(low+high)/2;
            if (arr[mid]<value)
                return myb(arr,(mid+1),high,value);
            else if (arr[mid]>value)
                return myb(arr,low,(mid-1),value);
            else
                return 1;
        }
        return 0;
    }
    // Examples ...
    public static String parenBit(String word){ //  "abc(ans)def"  -> "(ans)"
        if (word.charAt(0) != '(')
            return parenBit(word.substring(1));
        if (word.charAt(word.length()-1)!=')')
            return parenBit(word.substring(0,word.length()-1));
        return word;

       // return word.substring(word.indexOf('('),(word.lastIndexOf(')')+1));
    }
    public static int bunnyEar(int num){
        if (num==0)
            return 0;
        else
            return 2+bunnyEar(num-1 );
    }
    public static int bunnyEar2(int num){
        if (num==0)
            return 0;
        else if (num%2==0)
            return 3+bunnyEar2(num-1 );
        else
            return 2+bunnyEar2(num-1);
    }

    public static String nox(String word) {
        if (word.length()==0)
            return "";
        if (word.charAt(0)=='x')
            return nox(word.substring(1));
        return word.charAt(0)+nox(word.substring(1));
    }
    public static String stringClean(String word){
        if (word.length()==1)
            return word;
        if (word.charAt(0)==word.charAt(1))
            return stringClean(word.substring(1));
        return word.charAt(0)+stringClean(word.substring(1));
    }
    public static int countHi(String word){
        if (word.length()==1)
            return 0 ;
        if ((word.charAt(0) == 'h'&& word.charAt(1)=='i')){
            return 1+countHi(word.substring(2));
        }
        if (word.charAt(0)=='x')
            return countHi(word.substring(2));
        return countHi(word.substring(1));
    }
    public static int stringDist(String word,String test){// "catcowcat" , "cat" -> 9
        if (word.length()==0)
            return 0;
        if (word.charAt(0)!= test.charAt(0))
            return stringDist(word.substring(1),test);
        if (word.endsWith(test)){
            return word.length();
        }else
            return stringDist(word.substring(0,(word.length()-1)),test);
        // complete video at min 29:00 .
    }

}










