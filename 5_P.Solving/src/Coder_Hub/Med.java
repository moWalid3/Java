package Coder_Hub;

import java.util.*;

public class Med {
    public static String longestAlternatingSubstring(String digits) {
        char[] ch = digits.toCharArray();                                               /*
                                                                        digits = '2105787220351146'
                                                                المخرجات (Outputs)
                                                                                            '2105'
                                                                                        */
        boolean test = true;
        boolean check = true;
        ArrayList<String> list = new ArrayList<>();
        String val = "";
        for (int i = 0; i < ch.length; i++) {

            test = (ch[i] % 2 == 0);

            if (test == check && i != 0) {
                list.add(val);
                val = String.valueOf(ch[i]);
                continue;
            }




            val = val.concat(String.valueOf(ch[i]));
            check = test;



        }
        val=list.get(list.size()-1);
        for (int i = list.size() - 2; i >= 0; i--) {
            if (list.get(i).length() >= val.length())
                val = list.get(i);
        }


        return val;
    }
    public static int[] countdown(int num) {
        ArrayList<Integer>arrayList=new ArrayList<>();
        int []arr;
        for (int i = num-3; i > 0; i -= 3) {
            if (i % 2 == 0) {
                arrayList.add(i);
            }
        }
        if (arrayList.isEmpty())
            return new int[]{0};
        else{
            arr=new int[arrayList.size()];
            for (int i = arr.length-1; i >= 0; i--) {
                arr[i]=arrayList.get(i);
            }
            Arrays.sort(arr);
            return arr;
        }

    }
    public static String replaceThe(String txt) {
        char the = txt.toCharArray()[txt.indexOf("the") + 4];
        if (the =='a' || the =='o' || the =='i' || the =='e' || the =='u')
            txt = txt.replace("the", "an");
        else
            txt=txt.replace("the","a");
        return txt;
    }
    public static int search(String word, String character) {
        return word.indexOf(character);
    }
    public static String input_type(String value) {
        char[] ch = value.toCharArray();
        if (ch[0]>='0'&&ch[0]<='9') {
            if (!value.contains("."))
                return "integer";
            else
                return "double";
        }else {

            return "string";
        }
    }
    public static int[] get_duplicate_elements(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]==arr[j]){
                    set.add(arr[i]);
                    break;
                }
            }
        }
        List<Integer> list=new ArrayList<>(set);
        int [] val=new int[list.size()];
        int cou=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (arr[i] == list.get(j)) {
                    val[cou] = arr[i];
                    list.remove(j);
                    cou++;
                    break;
                }
            }
        }
        return val;
    }
    public static int[] unique(int[] arr) {
        Set<Integer>set=new HashSet<>();
        for(int e:arr){
            set.add(e);
        }
        int cou=0;
        ArrayList<Integer>list=new ArrayList<>(set);
        ArrayList<Integer>outList=new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j]==list.get(i)){
                    cou++;
                }
                if (cou==2){
                    list.remove(i);
                    i--;
                    cou=0;
                    break;
                }
            }
            if (cou==1){
                outList.add(list.get(i));
                cou=0;
            }
        }
        cou=0;
        int[]out=new int[outList.size()];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < outList.size(); j++) {
                if (arr[i]==outList.get(j)){
                    out[cou]=arr[i];
                    cou++;
                    outList.remove(j);
                    break;
                }
            }
        }
        return out;
    }
    public static String oct_to_hex(int octal_number) {
        int decimal = Integer.parseInt(String.valueOf(octal_number),8);
        String hex = Integer.toHexString(decimal);
        return hex.toUpperCase();
    }
    public static String oct_to_bin(int octal) {
        int dic=Integer.parseInt(String.valueOf(octal),8);
        String bin = Integer.toBinaryString(dic);
        return bin;
    }
}
