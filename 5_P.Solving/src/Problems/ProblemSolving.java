package Problems;

import java.util.*;

public class ProblemSolving {
    public static String word_repeat(String word, int n) {
        // write your code here
        String []out=new String[n];
        Arrays.fill(out, word);
        for (int i = 1; i < n; i++) {
            word=word.concat(" "+out[i]);
        }
        return word;
    }
    public static String reverse_case(String strParam) {
        char[] ch=strParam.toCharArray();
        String []st=new String[ch.length];
        for (int i = 0; i <ch.length ; i++) {
            st[i]=String.valueOf(ch[i]);
        }

        for (int i = 0; i < ch.length; i++) {
            if (ch[i]>='a'&&ch[i]<='z')
                st[i]=st[i].toUpperCase();
            else
                st[i]=st[i].toLowerCase();
        }
        String out="";
        for (int i = 0; i < st.length; i++) {
            out=out.concat(st[i]);
        }
        return out;
    }
    public static boolean stringCheck(String[] value) {
        // write your code here
        Set<String> st = new HashSet<>(Arrays.asList(value));
        return st.size()==1;
    }
    public static String operation(int num1, int num2) {
        if ((num1+num2)==24)
            return "added";
        else if ((num1-num2)==24)
            return "subtracted";
        else if ((num1 / num2)==24)
            return "divided";
        else if ((num1 * num2) == 24)
            return "multiplied";
        else
            return "None";
    }
    public static int left_digit(String strParam) {
        int out=0;
        for(int i=0;i < strParam.toCharArray().length;i++){
            if(strParam.toCharArray()[i]>='1'&&strParam.toCharArray()[i]<='9'){
                out=strParam.toCharArray()[i]-'0';
                break;
            }
        }
        return out;
    }
    public static int count_char(String sentence, String ch) {
        int out=0;
        for (int i = 0; i < sentence.toCharArray().length; i++) {
            if (ch.toCharArray()[0]==sentence.toCharArray()[i])
                out++;
        }
        return out;
    }
    public static String concat_names(String name1, String name2) {
        // write your code here
        return name1.concat(" "+name2);
    }
    public static double get_mean(int[] arr) {
        // write your code here
        double sum=0.0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return (sum/(double)arr.length);

    }
    public static int getBiggestShared(int[] a, int[] b) {
        int big=0;
        for (int j : a)
            for (int k : b)
                if (j == k)
                    if (big < j)
                        big = j;
        return big;
    }
    public static String countDown(int number) {
        String out=String.valueOf(number);
        int x=number;
        for (int i = number; i >0 ; i--) {
            x--;
            out=out.concat(" "+String.valueOf(x));
        }
        return out;
    }
    public static String hashtag_it(String[] my_array) {
        String out="#".concat(my_array[0]);
        for (int i = 1; i < my_array.length; i++)
            out=out.concat(" #"+my_array[i]);
        return out;
    }
    public static int[] remove_duplicate(int[] arr) {
        Set<Integer>set=new HashSet<>();
        for (int j : arr)
            set.add(j);
        ArrayList<Integer>ele=new ArrayList<>(set);
        ArrayList<Integer>out=new ArrayList<>();
        for (int j : arr)
            for (Integer integer : ele)
                if (j == integer) {
                    if (!out.contains(j)) {
                        out.add(j);
                    }
                    break;
                }
        int[]x=new int[out.size()];
        for (int i = 0; i < x.length; i++) {
            x[i]=out.get(i);
        }
        return x;
    }
    public static int[] getPrimesBetween(int a, int b) {
        ArrayList<Integer>out=new ArrayList<>();
        if (a<2)
            a=2;
        boolean test=true;
        for (int i = a; i <= b; i++) {
            test=true;
            for (int j = 2; j <= i/2; j++) {
                if (i%j==0){
                    test=false;
                    break;
                }
            }
            if (test)
                out.add(i);
        }
        int []arr=new int[out.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=out.get(i);
        }
        return arr;
    }
    public static void Digits() {
        Scanner s = new Scanner(System.in);
        System.out.println("enter # : ");
        int size = s.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println("enter numbers " + size + ": ");
            int x = s.nextInt();
            if (x == 0) {
                System.out.println(x);
                continue;
            }
            while (x != 0) {
                int value = x % 10;
                System.out.print(value + "  ");
                x /= 10;
            }
            System.out.println();
        }
    }
    public static void pum() {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        for (int i = 1; i <= (num * 4); i++) {
            if (i % 4 != 0) {
                System.out.print(i + " ");

            } else {
                System.out.print("PUM");
                System.out.println();
            }

        }
    }
    public static void search_in_matrix() {
        Scanner s = new Scanner(System.in);
        System.out.println("enter number of row and column : ");
        int row = s.nextInt();
        int col = s.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("enter the element : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        System.out.println("enter the Key searching : ");
        int key = s.nextInt();
        boolean test = false;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
                if (key == anInt)
                    test = true;
            }
            System.out.println();
        }
        if (test) System.out.println("Yes is found in matrix.");
        else System.out.println("No found it in matrix.");
    }
    public static void sum_from_1_to_N() {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the num :");
        int num = s.nextInt();
        int sum = (num * (num + 1) / 2);
        System.out.println("sum = " + sum);
    }
    public static void four_num() {
        Scanner s = new Scanner(System.in);
        int num;
        int mal = 1;
        for (int i = 0; i < 4; i++) {
            num = s.nextInt();
            mal *= num;
        }
        System.out.println("mal = " + mal);
    }
    public static void color_ful_stone() {
        // RGB
        // RRR
        // out 2
        Scanner s = new Scanner(System.in);
        String value = s.next();
        String check = s.next();
        int counter = 1;
        int x = 0;
        for (int i = 0; i < value.length(); i++) {
            if (value.toCharArray()[x] == check.toCharArray()[i]) {
                counter++;
                x++;
            }
        }
        System.out.println("index stop in : " + counter);
    }
    public static void night_at_the_museum() {
        Scanner s = new Scanner(System.in);
        int start = 97;
        int move = 0;
        String value = s.next();
        for (int i = 0; i < value.length(); i++) {
            int result = Math.abs(value.toCharArray()[i] - start);
            if (result <= 13) {
                move += result;
            } else {
                move += (26 - result);
            }
            start = value.toCharArray()[i];
        }
        System.out.println(move);
    }
    public static void left_right_hands() {
        Scanner s = new Scanner(System.in);
        System.out.println("enter number of player left :");
        int left = s.nextInt();
        System.out.println("enter number of player right :");
        int right = s.nextInt();
        System.out.println("enter number of player to hands :");
        int bothHand = s.nextInt();
        int result;
        int deference = Math.abs(left - right);
        if (left > right) {
            if (deference <= bothHand) {
                right += deference;
                bothHand -= deference;
                result = right + (bothHand / 2);
            } else {
                result = right + bothHand;
            }
        } else if (right > left) {
            if (deference <= bothHand) {
                left += deference;
                bothHand -= deference;
                result = left + (bothHand / 2);
            } else {
                result = left + bothHand;
            }
        } else {
            result = right + (bothHand / 2);
        }
        System.out.println("number of player on 2 team = " + (result * 2));

    }
    public static void BearBigBrother() {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int counter = 0;
        while (n2 >= n1) {
            n2 *= 2;
            n1 *= 3;
            counter++;
        }
        System.out.println(counter);
    }
    public static void GoodNumber() {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();

        int cou = 0;
        int result = 0;
        for (int i = 0; i < n1; i++) {
            String nums = s.next();
            for (int j = 0; j < nums.length(); j++) {
                cou = 0;
                for (int k = 0; k <= n2; k++) {
                    if (nums.contains(String.valueOf(k))) {
                        cou++;
                    }
                }
            }
            if (cou == n2) {
                result++;
            }
        }
        System.out.println(result);
    }
    public static void GorgeAndAccommodation() {
        Scanner s = new Scanner(System.in);
        int numOfRoom = s.nextInt();
        int numOfPerson, size;
        int counter = 0;
        for (int i = 0; i < numOfRoom; i++) {
            numOfPerson = s.nextInt();
            size = s.nextInt();
            if (size - numOfPerson >= 2) counter++;
        }
        System.out.println(counter);
    }
    public static void Horseshoe() {
        Scanner s = new Scanner(System.in);
        Set<Integer> nums = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            nums.add(s.nextInt());
        }
        System.out.println(4 - nums.size());
    }
    public static void Coins(){
        Scanner s=new Scanner(System.in);
        int a=0;
        int b=0;
        int c=0;
        char []ch={'A','B','C'};
        char []value;
        for (int i = 0; i < 3; i++) {
            String st=s.next();
            value=st.toCharArray();
            if (value[1]== '>'){
                if (value[0]== 'A') a++;
                else if (value[0]=='B')b++;
                else c++;
            }else {
                if (value[2]== 'A') a++;
                else if (value[2]=='B')b++;
                else c++;
            }
        }
        if (a>b && a>c){
            if (b>c) System.out.println("CBA");
            else System.out.println("BCA");
        } else if (b>a && b>c) {
            if (a>c) System.out.println("CAB");
            else System.out.println("ACB");
        } else {
            if (a>b) System.out.println("BAC");
            else System.out.println("ABC");
        }
    }
    public static void WayToLongWords(){
        Scanner s=new Scanner(System.in);
        int loop=s.nextInt();
        char[]word;
        for (int i = 0; i < loop; i++) {
             word=s.next().toCharArray();
             if (word.length>10){
                 System.out.println(word[0]+""+(word.length-2)+word[word.length-1]);
                 continue;
             }
            System.out.println(word);
        }
    }
    public static void InSearchOfAnEasyProblem(){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        boolean test=true;
        for (int i = 0; i < num; i++) {
            int value=s.nextInt();
            if (value==1) test=false;
        }
        if (test) System.out.println("EASY");
        else System.out.println("HARD");
    }
    public static void SuffixThree(){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        for (int i = 0; i < num; i++) {
            String value=s.next();
            if (value.endsWith("po")) System.out.println("FILIPINO");
            else if (value.endsWith("desu")||value.endsWith("masu")) System.out.println("JAPANESE");
            else if (value.endsWith("mnida")) System.out.println("KOREAN");
        }
    }
    public static void Hulk(){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        for (int i = 1; i <= num; i++) {
            if (i%2!=0){
                if (num==1) System.out.print("I hate it");
                else if(i==num) System.out.print("I hate it");
                else System.out.print("I hate that  ");
            }else {
                if (i==num) System.out.print("I love it");
                else System.out.print("I love that  ");
            }


        }
    }
    public static void RegularBracketSequence(){
        Scanner s=new Scanner(System.in);
        char [] ch=s.next().toCharArray();
        int size=ch.length;
        int counter=0;
        for (char ele : ch) {
            if (ele == '(') counter++;
            else {
                counter--;
                if (counter < 0) {
                    size--;
                    counter = 0;
                }
            }
        }
        System.out.println(size-counter);

    }
    public static void AnotherOneBitesTheDust(){
        Scanner s=new Scanner(System.in);
        long a=s.nextInt();
        long b=s.nextInt();
        long ab=s.nextInt();
        long allA=a+ab;
        long allB=b+ab;
        long cou;
        if (allA>allB) cou=(allB*2)+1;
        else if (allB>allA)cou=(allA*2)+1;
        else cou=allA*2;
        System.out.println(cou);
    }
    public static void DominoPiling(){
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        System.out.println((n1*n2)/2);
    }
    public static void PoliceRecruits(){
        Scanner s= new Scanner(System.in);
        int events=s.nextInt();
        int police=0;
        int acc=0;
        for (int i = 0; i < events; i++) {
            int event=s.nextInt();
            if (event== -1){
                if (police==0)
                    acc++;
                else
                    police--;
            }else
                police+=event;
        }
        System.out.println(acc);
    }
    public static void WrongSubtraction(){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int loop=s.nextInt();
        for (int i = 0; i < loop; i++) {
            if (num%10==0)
                num/=10;
            else
                num--;
        }
        System.out.println(num);
    }
    public static void Decoding(){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        String word=s.next();
        int xo=word.toCharArray().length;
        String out="";
        for (int i = 0; i < word.toCharArray().length; i++) {
            if (xo%2==0){
                out=String.valueOf(word.toCharArray()[i]).concat(out);
                xo--;
                continue;
            }
            out=out.concat(String.valueOf(word.toCharArray()[i]));
            xo--;
        }
        System.out.println(out);
    }
    public static void Lovely_palindromes(){
        Scanner s=new Scanner(System.in);
        String  num=s.next();
        String inverse="";
        char []ch=num.toCharArray();
        for (int i = ch.length-1; i >=0 ; i--) {
            inverse=inverse.concat(String.valueOf(ch[i]));
        }
        inverse=String.valueOf(num).concat(inverse);
        System.out.println(inverse);
    }
    public static void SumOfDigits(){
        Scanner s=new Scanner(System.in);
        String num=s.next();
        int value=0;
        int counter=0;
        for (int i = 0; i <= num.toCharArray().length; i++) {
            if(String.valueOf(num).toCharArray().length==1){
                break;
            } else if (i==0) {
                for (int j = 0; j < num.toCharArray().length; j++) {
                    value += Integer.parseInt(String.valueOf(num.toCharArray()[j]));
                }
                counter++;
            } else{
                for (int j = 0; j < num.toCharArray().length; j++) {
                    if (j==0) value=0;
                    value+=Integer.parseInt(String.valueOf(num.toCharArray()[j]));
                }
                counter++;
            }
            num=String.valueOf(value);
        }

        System.out.println(counter);
    }
    public static void NextTest(){
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int []arr=new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        int x=0;
        while (arr[x]==x+1) {
            x++;
        }
        System.out.println(x+1);
    }
    public static void BurglarAndMatches(){
        Scanner s = new Scanner(System.in);     /*     7   3
                                                   5   10
                                                   2   5
                                                   3   6
                                                   _________
                                                   60 + 2 = 62
                                                                        */
        int given=s.nextInt();
        int numOfBig=s.nextInt();
        int []big =new int[numOfBig];
        int []numOf3ood =new int[numOfBig];
        int result=0;
        for (int i = 0; i < numOfBig; i++) {
            big[i]=s.nextInt();
            numOf3ood[i]=s.nextInt();
        }
        for (int i = 0; i < big.length-1; i++) {
            for (int j = 0; j < big.length-1; j++) {
                if (numOf3ood[j+1]>numOf3ood[j]){
                    int temp=numOf3ood[j];
                    numOf3ood[j]=numOf3ood[j+1];
                    numOf3ood[j+1]=temp;
                    int temp2=big[j];
                    big[j]=big[j+1];
                    big[j+1]=temp2;
                }
            }
        }
        int pointer=0;
        while (given!=0){
            if (pointer==big.length)
                break;
            if (big[pointer]>=given) {
                result += (given * numOf3ood[pointer]);
                break;
            }
            else {
                result+=(big[pointer]*numOf3ood[pointer]);
                given-=big[pointer];
                pointer++;
            }
        }
        System.out.println(result);
    }
    public static void Char(){
        Scanner s=new Scanner(System.in);
        char ch=s.next().charAt(0);
        if (ch>=97)
            System.out.println((char)(ch-32));
        else
            System.out.println((char)(ch+32));
    }
    public static void Neighbors(){
        Scanner s=new Scanner(System.in);
        int a = s.nextInt();
        int b=s.nextInt();                     // 8 6 2   =>> 25
        int lengthBalata=s.nextInt();
        int areaBalata=lengthBalata*lengthBalata;
        int c= (int) Math.sqrt((a*a)+(b*b));
        int areaC=c*c;
        int numOfBalata=areaC/areaBalata;
        System.out.println(numOfBalata);
    }
    public static void superMarket(){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        double kilo=s.nextInt();
        double []marketPrice=new double[num];
        double []marketKilo=new double[num];
        double minPrice=0;                            //     1  2  1 = 0.5
        for (int i = 0; i < num; i++) {
            marketPrice[i]=s.nextInt();
            marketKilo[i]=s.nextInt();
            if (i==0){
                minPrice=(marketPrice[i]/marketKilo[i]);
                continue;
            }
            if (minPrice > (marketPrice[i]/marketKilo[i]))
                minPrice=(marketPrice[i]/marketKilo[i]);
        }
        System.out.printf("%.8f",(minPrice*kilo));
    }
    public static void Stones(){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        String color=s.next();
        char[]arr=color.toCharArray();
        int counter=0;
        for (int i = 1; i < num; i++) {
            if (arr[i-1]==arr[i])
                counter++;
            else
                break;
        }
        System.out.println(counter);
    }
    public static void restoringPassword(){
        Scanner s=new Scanner(System.in);
        String value=s.next();
        String []arr=new String[10];
        String pass="";
        for (int i = 0; i < arr.length; i++) {
            arr[i]=s.next();
        }
        int pointer=0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 10; j++) {
                if (value.substring(pointer,pointer+10).equals(arr[j])) {
                    pass = pass.concat(String.valueOf(j));
                    pointer+=10;
                    break;
                }
            }
        }
        // 01001100100101100000010110001001011001000101100110010110100001011010100101101100
        // 0100110010  0101100000  0101100010 0101100100 0101100110 0101101000 0101101010 0101101100
        System.out.println(pass);
    }
    public static void vanyaAndFence(){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int len=s.nextInt();
        int test;
        int value=num;
        for (int i = 0; i < num; i++) {
            test=s.nextInt();
            if (test>len)
                value++;
        }
        System.out.println(value);
    }
}
