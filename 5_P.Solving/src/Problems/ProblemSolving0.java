package Problems;
import java.util.*;
import java.util.stream.Collectors;

public class ProblemSolving0 {
    public static void ex1() {
        Scanner s = new Scanner(System.in);
        System.out.println("enter 2 numbers :");
        int firstNum, secondNum;
        firstNum = s.nextInt();
        secondNum = s.nextInt();
        if (firstNum > secondNum) {
            System.out.println("Max is : " + firstNum + "    Min is : " + secondNum);
            if (firstNum > 100) System.out.println(firstNum + " > " + 100);
            else System.out.println(firstNum + " < " + 100);
        } else {
            System.out.println("Max is : " + secondNum + "    Min is : " + firstNum);
            if (secondNum > 100) System.out.println(secondNum + " > " + 100);
            else System.out.println(secondNum + " < " + 100);
        }


    }
    public static void ex2() {
        System.out.println("enter the text :");
        Scanner s = new Scanner(System.in);
        String text = s.next();
        char[] tex = text.toCharArray();
        System.out.println("the inverse is :");
        for (int i = tex.length - 1; i >= 0; i--) {
            System.out.print(tex[i]);
        }
    }
    public static void fact() {
        Scanner s = new Scanner(System.in);
        System.out.println("enter num for fact : ");
        int num = s.nextInt();
        int x = 1;
        for (int i = num; num > 0; num--) {
            x *= num;
        }
        System.out.println("fact = " + x);
    }
    public static void pow(double x, double y) {
        double a = 1;
        for (int i = 0; i < y; i++) {
            a *= x;
        }
        System.out.println("the power is : " + a);
    }
    public static int power(int x, int y) {
        if (y >= 1) {
            return x * power(x, y - 1);
        } else return 1;
    }
    public static int fact2(int x) {
        if (x > 0) {
            return x * fact2(x - 1);
        } else {
            return 1;
        }
    }
    public static void average_for_array() {
        Scanner s = new Scanner(System.in);
        int[] x = new int[20];
        for (int i = 0; i < x.length; i++) {
            x[i] = s.nextInt();
        }
        int average = 0;
        for (int j : x) {
            average += j;
        }
        System.out.println("average = " + (average / x.length));
    }
    public static String evenOrOddOrEqual(int x) {
        String st = String.valueOf(x);
        char[] ch = st.toCharArray();
        int even = 0;
        int odd = 0;
        for (char c : ch) {
            if ((c - '0') % 2 == 0) even += (c - '0');
            else odd += (c - '0');
        }
        if (even > odd) return "even";
        else if (even < odd) return "odd";
        else return "equal";
    }
    public static String addStrNums(String num1, String num2) {
        try {
            int n1 = Integer.parseInt(num1) + Integer.parseInt(num2);
            return String.valueOf(n1);

        } catch (Exception e) {
            return "-1";
        }
    }
    public static int bin_to_oct(String b) {
        long bi = Long.parseLong(b);
        int octalNumber = 0;
        int decimalNumber = 0, i = 0;
        while (bi != 0) {
            decimalNumber += (bi % 10) * Math.pow(2, i);
            ++i;
            bi /= 10;
        }
        i = 1;
        while (decimalNumber != 0) {
            octalNumber += (decimalNumber % 8) * i;
            decimalNumber /= 8;
            i *= 10;
        }
        return octalNumber;
    }
    public static boolean math_expr(String expr) {
        char ch = expr.toCharArray()[1];
        try {
            int ope1 = Integer.parseInt(String.valueOf(expr.toCharArray()[0]));
            int ope2 = Integer.parseInt(String.valueOf(expr.toCharArray()[2]));
        } catch (Exception e) {
            return false;
        }
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%';
    }
    public static String cap_space(String txt) {
        char[] ch = txt.toCharArray();
        String value = txt;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 65 && ch[i] <= 90) {
                String test = String.valueOf(ch[i]);
                String space = " ";
                String ne = space.concat(test.toLowerCase());
                value = value.replaceFirst(test, ne);
            }
        }
        return value;
    }
    public static String convert_time(String time) {
        if (time.endsWith("am")) {//'10:30 am'
            if (time.startsWith("12")) {
                time = time.replace("12", "00").substring(0, time.toCharArray().length - 3);
            } else {
                time = time.substring(0, time.toCharArray().length - 3);
            }
        } else if (time.endsWith("pm")) { // 7:13 pm
            int end = time.toCharArray().length - 3;
            time = time.substring(0, end);
            char[] ch = time.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] == ':') {
                    String nTime = time.substring(0, i);
                    if (Integer.parseInt(nTime) == 12) {
                        char[] nn = {ch[i + 1], ch[i + 2]};
                        time = "12:".concat(String.valueOf(nn));
                        break;
                    }
                    int ti = Integer.parseInt(nTime) + 12;
                    nTime = time.substring(0, i);
                    time = time.replace(nTime, String.valueOf(ti));
                    break;
                }
            }
        } else {
            String part1 = time.substring(0, 2);
            int hour = Integer.parseInt(part1);
            String part2 = time.substring(2);
            if (hour == 0) {
                time = "12".concat(part2).concat(" am");
            } else if (hour < 12) {
                time = String.valueOf(hour).concat(part2).concat(" am");
            } else {
                time = String.valueOf(hour - 12).concat(part2.concat(" pm"));
            }

        }
        return time;
    }
    public static String first_n_vowels(String phrase, int n) {
      /*  phrase = 'Queen'
        n = 3
        المخرجات (Outputs)
        'uee'
        */
        String[] st = {"a", "o", "u", "i", "e"};
        String val, end = "";
        for (int i = 0; i < phrase.toCharArray().length; i++) {
            for (int j = 0; j < st.length; j++) {
                if (phrase.substring(i, i + 1).equalsIgnoreCase(st[j])) {
                    val = phrase.substring(i, i + 1);
                    end = end.concat(val);
                }
            }
        }
        if (n > end.toCharArray().length) {
            return "invalid";
        } else {
            return end.substring(0, n);
        }
    }
    public static String arrowDuplicates(String word) {
        char[] ch = word.toCharArray();         //  S A F C S P
        char[] ch2 = word.toCharArray();         //  S A F C S P
        for (int i = 0; i < ch.length; i++) {
            if (i == ch.length - 1) {
                break;
            }
            for (int j = i + 1; j < ch.length; j++) { // i = 4     j=5    5
                if (String.valueOf(ch[i]).equalsIgnoreCase(String.valueOf(ch[j]))) {
                    ch2[i] = '<';
                    ch2[j] = '<';
                }
            }
        }
        for (int i = 0; i < ch2.length; i++) {
            if (ch2[i] != '<')
                ch2[i] = '>';
        }
        word = String.valueOf(ch2);
        return word;
    }
    public static boolean str_len_comparison(String[] words) {
        boolean check = true;
        if (words.length == 0 || words.length == 1) {
            return false;
        }
        int len = words[0].toCharArray().length;
        for (int i = 0; i < words.length; i++) {
            if (len != words[i].toCharArray().length)
                check = false;
        }
        return check;
    }
    public static int[] primes_nums(int[] numbers) {
        int counter=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 2; j <= numbers[i] / 2; ++j) {
                // condition for non_prime number
                if (numbers[i] % j == 0) {
                    numbers[i] = 4;
                    counter++;
                    break;
                }
            }
        }
        int cou=0;
        int [] copy=new int[numbers.length-counter];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]!=4){
                copy[cou]=numbers[i];
                cou++;
            }
        }
        return copy;
    }
    public static String oct_to_bin(int octal) {

        String octnum=String.valueOf(octal);
        long i = 0;

        String binary = "";

        while (i<octnum.length()) {

            char c=octnum.charAt((int)i);
            switch (c) {
                case '0':
                    binary += "000";
                    break;
                case '1':
                    binary += "001";
                    break;
                case '2':
                    binary += "010";
                    break;
                case '3':
                    binary += "011";
                    break;
                case '4':
                    binary += "100";
                    break;
                case '5':
                    binary += "101";
                    break;
                case '6':
                    binary += "110";
                    break;
                case '7':
                    binary += "111";
                    break;
                default:
                    System.out.println( "\nInvalid Octal Digit "+ octnum.charAt((int)i));
                    break;
            }
            i++;
        }

        return binary;
    }
    public static int[] twoSum(int[] nums, int target) {
        int [] result=new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (i==nums.length-1)break;
            for (int j = i+1; j <nums.length ; j++) {
                if (nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                    break;
                }
                if (result[1]==j)break;
            }
        }
        return result;
    }
    public static String date_format(String date) {
        /*
                        date = '2020/1/1'
                المخرجات (Outputs)
                '2020/1/1 | 2020-1-1 | 1/1/2020'
         */
        String year= date.substring(0,4);
        String month=null;
        String day=null;
        char []ch=date.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i]=='/'){
                if (ch[i+2]=='/'){
                    month=String.valueOf(ch[i+1]);
                    day=date.substring(i+3);
                }else {
                    month=String.valueOf(ch[i+1]).concat(String.valueOf(ch[i+2]));
                    day=date.substring(i+4);
                }
                break;
            }
        }
        String x=" | ";
        String part2=year.concat("-").concat(month).concat("-").concat(day);
        String part3=month.concat("/").concat(day).concat("/").concat(year);
        String end=date.concat(x).concat(part2).concat(x).concat(part3);
        return end;
    }
    public static int countWords(String txt) {
        /*
                        txt = 'Plant hope in the hearts of others'
                المخرجات (Outputs)
                7
         */
        int counter=0;
        char []ch=txt.toCharArray();
        for (int i = 0; i <ch.length ; i++) {
            if (ch[i]==' '){
                counter++;
            }
        }
        return counter+1;
    }
    public static String missingLetter(String txt) {
        /*
                        txt = 'rsuv'
                المخرجات (Outputs)
                't'
         */
        String end=null;
        char []ch=txt.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (i==ch.length-1)break;
            if (ch[i]!=ch[i+1]-1){
                end=String.valueOf((char)(ch[i]+1));
                break;
            }
        }
        if (end==null) end="No Missing Letter";
        return end;
    }
    public static String date_formating(String date) {
        /*
                        date = '2020-01-01'
                المخرجات (Outputs)
                '01-01-2020'
         */
        String year=date.substring(0,4);
        String month=date.substring(5,7);
        String day=date.substring(8);
        String end=day.concat("-").concat(month).concat("-").concat(year);
        return end;
    }
    public static String longestZero(String strParam) {
        /*
                        strParam = '100010'
                المخرجات (Outputs)
                '000'
         */
        char[]ch=strParam.toCharArray();
        String end="";
        boolean test=false;
        int j;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i]=='0'){
                test=true;
            }
        }
        if (test) {
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] == '0') {
                    j = i;
                    while (ch[j] == '0') {
                        end = end.concat("0");
                        j++;
                    }
                    break;
                }
            }
        }else{
            end=" ";
        }
        return end;
    }
    public static int[] word_length(String[] arr) {
        /*
                        arr = ['Code','hub']
                المخرجات (Outputs)
                [4,3]
         */
        int [] end=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            end[i]=arr[i].toCharArray().length;
        }
        return end;
    }
    public static int max_element(int[] arr) {
        /*
                    arr = [1,2,3,4,5,1000]
            المخرجات (Outputs)
            1000
         */
        int counter=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>counter)
                counter=arr[i];
        }
        return counter;
    }
    public static boolean find_element(int[] elements_array, int element) {
        boolean test=false;
        for (int i = 0; i < elements_array.length; i++) {
            if (elements_array[i]==element){
                test=true;
                break;
            }
        }
        return test;
    }
    public static double[] array_root(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]=Math.sqrt(arr[i]);
        }
        return arr;
    }
    public static int[] cumulative_sum(int[] arr) {
        /*
                 ==>       [...,a,a+b,a+b+c] <= [...,a,b,c]
         */
        for (int i = 1; i < arr.length; i++) {
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }
    public static int smallest_number(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp=arr[i];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr[0];
    }
    public static int[] sort_array(int[] elements_array) {
        for (int i = 0; i < elements_array.length-1; i++) {
            for (int j = 0; j < elements_array.length - 1; j++) {
                if (elements_array[j]>elements_array[j+1]){
                    int temp=elements_array[j];
                    elements_array[j]=elements_array[j+1];
                    elements_array[j+1]=temp;
                }
            }
        }
        return elements_array;
    }
    public static String middle_char(String word) {
        int mid=(word.toCharArray().length/2)-1;
        char []ch=word.toCharArray();                           // 9 /2 =4  8/2
        if (word.toCharArray().length%2==0){
            word=String.valueOf(ch[mid]).concat(String.valueOf(ch[(mid+1)]));
        }else {
            ++mid;
            word=String.valueOf(ch[mid]);
        }
        return word;
    }
    public static int[] sub_arrays(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=arr2[i]-arr1[i];
        }
        return arr1;
    }
    public static String[] add_five(String[] arr) {
        if (arr.length==0) return arr;
        else {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i].concat("5");
            }
            return arr;
        }
    }
    public static boolean compare_two_words(String s1, String s2) {
        if ((s1.substring(s1.toCharArray().length-2).equalsIgnoreCase(s2.substring(s1.toCharArray().length-2)))){
            return true;
        }else return false;
    }
    public static String[] find_prefix(String[] words, String text) {
        ArrayList<String>arrayList=new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (text.equalsIgnoreCase(words[i].substring(0,text.toCharArray().length))){
                arrayList.add(words[i]);
            }
        }
        if (arrayList.isEmpty()){
            return new String[]{"No matches found"};
        }else return arrayList.toArray(new String[0]);
    }
    public static int[] largest_smallest(int[] array_values) {
        for (int i = 0; i < array_values.length-1; i++) {
            for (int j = 0; j < array_values.length-1; j++) {
                if (array_values[j]>array_values[j+1]){
                    int temp=array_values[j];
                    array_values[j]=array_values[j+1];
                    array_values[j+1]=temp;
                }
            }
        }
        return new int[]{array_values[array_values.length-1],array_values[0]};
    }
    public static int[] filp_even_odd(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]%2==0) numbers[i]++;
            else numbers[i]--;
        }
        return numbers;
    }
    public static String hasSpace(String  strParam) {
        char []ch=strParam.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i]==' '){
                ch[i]='#';
            }
        }
        return String.valueOf(ch);
    }
    public static String sortByLength(String txt) {
        /*
                        txt = 'I see you'
                المخرجات (Outputs)
                'I see you'
         */
        char [] ch=txt.toCharArray();
        int counter=0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i]==' '){
                counter++;
            }
        }// cou = 2
        String [] st=new String[counter+1];
        int x=0;
        int index=0;
        for (int i = 0; i <ch.length; i++) {
            if (x==st.length-1){
                st[x]=txt.substring(index);
            } else if (ch[i]==' ') {
                st[x]=txt.substring(index,i);
                index=(i+1);
                x++;
            }
        }
        int [] length=new int[st.length];
        for (int i = 0; i < st.length; i++) {
            length[i]=st[i].length();
        }
        for (int i = 0; i < st.length-1; i++) {
            for (int j = 0; j < st.length-1; j++) {
                if (st[j].length()>st[j+1].length()){
                    String temp=st[j];
                    st[j]=st[j+1];
                    st[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < st.length-1; i++) {
            for (int j = 0; j < st.length-1; j++) {
                if (st[j].length()==st[j+1].length()){
                    if ((int)(st[j].toCharArray()[0])>(int)(st[j+1].toCharArray()[0])){
                        String temp=st[j];
                        st[j]=st[j+1];
                        st[j+1]=temp;
                    }
                }
            }
        }
        String end="";
        for (int i = 0; i < st.length; i++) {
            if (i==st.length-1){
                end=end.concat(st[i]);
            }else {
                st[i] = st[i].concat(" ");
                end = end.concat(st[i]);
            }
        }
        return end;
    }
    public static int[] sort_array(int[] my_array, String typeParam) {
        if (typeParam.equals("S")) {
            for (int i = 0; i < my_array.length - 1; i++) {
                for (int j = 0; j < my_array.length - 1; j++) {
                    if (my_array[j] > my_array[j + 1]) {
                        int temp = my_array[j];
                        my_array[j] = my_array[j + 1];
                        my_array[j + 1] = temp;
                    }
                }
            }
        }else {
            for (int i = 0; i < my_array.length - 1; i++) {
                for (int j = 0; j < my_array.length - 1; j++) {
                    if (my_array[j] < my_array[j + 1]) {
                        int temp = my_array[j];
                        my_array[j] = my_array[j + 1];
                        my_array[j + 1] = temp;
                    }
                }
            }
        }
        return my_array;
    }

    public static String similarOrdered2(String word1, String word2) {
        char[] ch1 = word1.toCharArray();
        char[] ch2 = word2.toCharArray();
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        for (int i = 0; i < ch1.length; i++) {
            set1.add(ch1[i]);
        }
        for (int i = 0; i < ch2.length; i++) {
            set2.add(ch2[i]);
        }
        String s1 = set1.toString();
        String s2 = set2.toString();
        char[] end_ch1 = new char[set1.size()];
        char[] end_ch2 = new char[set2.size()];
        int x = 0;
        for (int i = 0; i < s1.toCharArray().length; i++) {
            if (s1.toCharArray()[i] == ']') {
                end_ch1[set1.size() - 1] = s1.toCharArray()[i - 1];
            } else if (s1.toCharArray()[i] == ',') {
                end_ch1[x] = s1.toCharArray()[i - 1];
                x++;
            }
        }
        int y = 0;
        for (int i = 0; i < s2.toCharArray().length; i++) {
            if (s2.toCharArray()[i] == ']') {
                end_ch2[set2.size() - 1] = s2.toCharArray()[i - 1];
            } else if (s2.toCharArray()[i] == ',') {
                end_ch2[y] = s2.toCharArray()[i - 1];
                y++;
            }
        }
        for (int i = 0; i < end_ch1.length - 1; i++) {
            for (int j = 0; j < end_ch1.length - 1; j++) {
                if (end_ch1[j] > end_ch1[j + 1]) {
                    char temp = end_ch1[j];
                    end_ch1[j] = end_ch1[j + 1];
                    end_ch1[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < end_ch2.length - 1; i++) {
            for (int j = 0; j < end_ch2.length - 1; j++) {
                if (end_ch2[j] > end_ch2[j + 1]) {
                    char temp = end_ch2[j];
                    end_ch2[j] = end_ch2[j + 1];
                    end_ch2[j + 1] = temp;
                }
            }
        }
        int cou = 0;
        for (int i = 0; i < end_ch1.length; i++) {
            for (int j = 0; j < end_ch2.length; j++) {
                if (end_ch1[i] == end_ch2[j]) {
                    cou++;
                }
            }
        }
        String one = String.valueOf(end_ch1);
        String two = String.valueOf(end_ch2);
        int size = longestCommonSubstrings(one, two).size();
        String ss = longestCommonSubstrings(one, two).toString();
        Object[] myArr = longestCommonSubstrings(one, two).toArray();
        String[] str_fin = new String[size];
        for (int i = 0; i < str_fin.length; i++) {
            str_fin[i] = myArr[i].toString();
        }
        String val=myArr[0].toString();
        return val;
    }
    public static Set<String> longestCommonSubstrings(String s, String t) {
        int[][] table = new int[s.length()][t.length()];
        int longest = 0;
        Set<String> result = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(i) != t.charAt(j)) {
                    continue;
                }

                table[i][j] = (i == 0 || j == 0) ? 1 : 1 + table[i - 1][j - 1];
                if (table[i][j] > longest) {
                    longest = table[i][j];
                    result.clear();
                }
                if (table[i][j] == longest) {
                    result.add(s.substring(i - longest + 1, i + 1));
                }
            }
        }
return Collections.singleton(t);
    }
    public static boolean isInterleave(String A, String B, String C) {
        /*
                        A = 'wysn'
                B = 'showus'
                C = 'shwysowuns'
                المخرجات (Outputs)
                true
         */
        ArrayList<String> charsA=new ArrayList<>();
        ArrayList<String> charsB=new ArrayList<>();
        ArrayList<String> charsC=new ArrayList<>();
        for (int i = 0; i < A.toCharArray().length; i++) {
            charsA.add(String.valueOf(A.toCharArray()[i]));
        }
        for (int i = 0; i < B.toCharArray().length; i++) {
            charsB.add(String.valueOf(B.toCharArray()[i]));
        }
        for (int i = 0; i < C.toCharArray().length; i++) {
            charsC.add(String.valueOf(C.toCharArray()[i]));
        }
        if (charsC.size()!=(charsA.size()+charsB.size())){
            return false;
        }else {
            for (int i = 0; i < charsC.size(); i++) {
                if (charsA.size()==0&&charsB.size()==0)
                    break;
                if (charsA.size() == 0) {
                    if (charsC.get(i).equals(charsB.get(0)))
                        charsB.remove(0);
                    else
                        break;
                } else if (charsB.size() == 0) {
                    if (charsC.get(i).equals(charsA.get(0)))
                        charsA.remove(0);
                    else
                        break;
                } else {
                    if (charsC.get(i).equals(charsA.get(0))) {
                        charsA.remove(0);
                    } else if (charsC.get(i).equals(charsB.get(0))) {
                        charsB.remove(0);
                    } else
                        break;
                }
            }
        }
        return charsA.isEmpty() && charsB.isEmpty();
    }

    public static int postFix(String expr) {
        /*
                expr = '6 2 / 33 +'
            المخرجات (Outputs)
                6
         */
        int counter=0;
        int num1=0;
        int num2=0;
        int check=0;
        String cut = "";
        ArrayList<String>cal=new ArrayList<>();
        for (int i = 0; i < expr.toCharArray().length; i++) {
            cal.add(String.valueOf(expr.toCharArray()[i]));
        }
        for (int i = 0; i < cal.size(); i++) {
            if (cal.get(i).equals("/")||cal.get(i).equals("*")||cal.get(i).equals("-")||cal.get(i).equals("+")||cal.get(i).equals("%")){
                if (check==0) {
                    int z=0;
                    while(!(cal.get(z).equals(" "))){
                        cut=cut.concat(cal.get(z));
                        z++;
                    }
                    num1=Integer.parseInt(cut);
                    cut="";
                    z++;
                    while (!(cal.get(z).equals(" "))) {
                        cut=cut.concat(cal.get(z));
                        z++;
                    }
                    num2=Integer.parseInt(cut);
                    num1 = operations(num1, num2, cal.get(i));
                    check++;
                }else {
                    cut="";
                    int z=0;
                    while (!(cal.subList(counter, i + 1).get(z).equals(" "))){
                        cut=cut.concat(cal.subList(counter, i + 1).get(z));
                        z++;
                    }
                    num2=Integer.parseInt(cut);
                    num1 = operations(num1, num2, cal.get(i));
                }
                counter=i+2;
            }
        }
        return num1;
    }
    public static int operations(int num1,int num2,String ope){
        switch (ope){
            case "/" -> {
                return num1/num2;
            }
            case "-" -> {
                return num1-num2;
            }
            case "+" -> {
                return num1+num2;
            }
            case "*" -> {
                return num1*num2;
            }
            case "%" -> {
                return num1%num2;
            }
        }
        return 0;
    }
    public static boolean stringContains(String firstName, String contains) {
        ArrayList<String> first=new ArrayList<>();
        ArrayList<String> cont=new ArrayList<>();
        for (int i = 0; i < firstName.toCharArray().length; i++) {
            first.add(String.valueOf(firstName.toCharArray()[i]));
        }
        for (int i = 0; i < contains.toCharArray().length; i++) {
            cont.add(String.valueOf(contains.toCharArray()[i]));
        }
        first.indexOf(cont.get(0));
        int cou=0;
        for (int i = 0; i < first.size(); i++) {
            if (first.get(i).equals(cont.get(0))){
                int j=i;
                while (first.get(j).equals(cont.get(cou))){
                    j++;
                    cou++;
                    if (cou==cont.size()||j==first.size())
                        break;
                }
                break;
            }
        }
        return cou == cont.size();

    }
    public static String[] namesSort(String[] namesArray, String order) {
        /*
                namesArray = ['Ahmed Omar','Yousef Abdullah']
                order = 'ASC'
                                        المخرجات (Outputs)
                ['Ahmed Omar','Yousef Abdullah']
         */
        if (order.equals("ASC")) {
            for (int i = 0; i < namesArray.length - 1; i++) {
                for (int j = 0; j < namesArray.length - 1; j++) {
                    if (namesArray[j].toCharArray()[0] > namesArray[j + 1].toCharArray()[0]) {
                        String temp = namesArray[j];
                        namesArray[j] = namesArray[j + 1];
                        namesArray[j + 1] = temp;
                    }
                }
            }
        }else {
            for (int i = 0; i < namesArray.length - 1; i++) {
                for (int j = 0; j < namesArray.length - 1; j++) {
                    if (namesArray[j].toCharArray()[0] < namesArray[j + 1].toCharArray()[0]) {
                        String temp = namesArray[j];
                        namesArray[j] = namesArray[j + 1];
                        namesArray[j + 1] = temp;
                    }
                }
            }
        }
        return namesArray;
    }
    public static String removeSpecialCharacters(String strParam) {
        /*
                 strParam = 'Hi How are you!'
                المخرجات (Outputs)
                'Hi How are you'
         */
        String out="";
        for (int i = 0; i < strParam.toCharArray().length; i++) {
            if ((strParam.toCharArray()[i]>='a'&&strParam.toCharArray()[i]<='z')
                    ||(strParam.toCharArray()[i]>='A'&&strParam.toCharArray()[i]<='Z')
                    ||(strParam.toCharArray()[i]=='-')
                    ||(strParam.toCharArray()[i]=='_')
                    ||(strParam.toCharArray()[i]==' ')
                ){
                out=out.concat(String.valueOf(strParam.toCharArray()[i]));
            }
        }

        return out;
    }
    public static int[] unique(int[] arr) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int e:arr){
            list.add(e);
        }
        list = (ArrayList<Integer>) list.stream().distinct().collect(Collectors.toList());
        int counter=0;
        ArrayList<Integer>outlist=new ArrayList<>(list);
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < arr.length; j++) {
                if (list.get(i)==arr[j]){
                    counter++;
                }
                if (counter>=2) {
                    outlist.remove(list.get(i));
                    break;
                }
            }
            counter=0;
        }
        int[]out=new int[outlist.size()];
        for (int i = 0; i < out.length; i++) {
            out[i]=outlist.get(i);
        }
        return out;
    }
    public static int most_frequent_element(int[] arr) {
        /*
                     arr = [13,2,1,2,10,2,1,1,2,2]
                    المخرجات (Outputs)
                    2
         */
        int cou=0;
        int test=0;
        int out=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    cou++;
                }
            }
            if (cou>test){
                out=arr[i];
            }
            test=cou;
            cou=0;
        }
        return out;
    }
    public static int[] mergeAndOrder(int[] array1, int[] array2) {
        int []out=new int[array1.length+array2.length];
        System.arraycopy(array1,0 , out, 0, array1.length);
        System.arraycopy(array2,0 , out, array1.length, array2.length);
        Arrays.sort(out);
        return out;
    }

}


