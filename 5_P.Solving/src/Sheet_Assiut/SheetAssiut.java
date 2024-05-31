package Sheet_Assiut;

import java.util.*;

public class SheetAssiut {
    public static boolean random(){
        int num = (int) (Math.random() * 10);
        return num % 2 == 0;
        // print -->  random() || random() ;     true = 75% , false = 25% ;   wish that Or Gate ;
    }
    public static void F_Debts(){
        /*
                3 3

                1 1 1

                0 1 2
               0    1 2 1
               1    2 3 2
               2    3 1 4
         */
        Scanner s = new Scanner(System.in);
        int nCoin = s.nextInt();
        int nRep = s.nextInt();
        int[] coins = new int[nCoin];
        int[][] arr = new int[nCoin][nRep];
        for (int i = 0; i < nCoin; i++) {
            coins[i] = s.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        int cou = 0;
        for (int i = 0; i < arr.length; i++) {
                coins[arr[i][0]-1] -= arr[i][arr[0].length-1];
                coins[arr[i][0]] += arr[i][arr[0].length-1];
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

//        coins[0] -= arr[0][2];
//        coins[1] += arr[0][2];
//        coins[1] -= arr[1][2];
//        coins[2] += arr[1][2];
//        coins[2] -= arr[2][2];
//        coins[0] += arr[2][2];



    }
    public static void SummerCamp(){
        Scanner s=new Scanner(System.in);
        int row =s.nextInt();
        for(int i=0;i<row;i++){
            int[] arr = {s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt()};
            Map<Integer, String> map = new HashMap<>();
            map.put(arr[0],"Hussien");
            map.put(arr[1],"Atef");
            map.put(arr[2],"Karemo");
            map.put(arr[3],"Ezzat");
            Arrays.sort(arr);
            System.out.print(map.get(arr[3])+" ");
            System.out.println(map.get(arr[2]));
        }
    }
    public static void D_Letter(){
                                                    /*
                                                        Instead of dogging Your footsteps it disappears but you dont notice anything
                                                            Your dog is upstears
                                                    */
        Scanner s=new Scanner(System.in);
        String s1,s2;
        s1=s.nextLine();
        s2=s.nextLine();
        char [] chars = s1.toCharArray();
        String s3="";  // s3 = s2 without ' ' ;
        for (int i = 0; i < s2.length(); i++) {
            if (s2.toCharArray()[i]!=' ')
                s3=s3.concat(String.valueOf(s2.toCharArray()[i]));
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.toCharArray()[i]!=' ') {
                if (map.containsKey(s1.toCharArray()[i]))
                    map.replace(s1.toCharArray()[i], map.get(s1.toCharArray()[i]) + 1);
                else
                    map.put(s1.toCharArray()[i], 1);
            }
        }
        for (int i = 0; i < s3.length(); i++) {
            if (!map.containsKey(s3.toCharArray()[i])){
                System.out.println("No");
                System.exit(0);
            }else {
                map.replace(s3.toCharArray()[i], map.get(s3.toCharArray()[i]) - 1);
                if (map.get(s3.toCharArray()[i]) == -1) {
                    System.out.println("NO");
                    System.exit(0);
                }
            }
        }
        System.out.println("Yes");
    }
    public static void A_Pangram(){
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        String word = s.next().toLowerCase();

        ArrayList<Character> arrayList = new ArrayList<>();
        for (int i = 'a'; i <= 'z'; i++) {
            arrayList.add((char) i);
        }
        for (int i = 0; i < word.length(); i++) {
            if (arrayList.contains(word.toCharArray()[i]))
                arrayList.remove(arrayList.indexOf(word.toCharArray()[i]));
        }
        if (arrayList.isEmpty())
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    public static void F_update_range(){
        Scanner s=new Scanner(System.in);
        int[] arr = new int[s.nextInt()];
        int [][] operators = new int[s.nextInt()][3];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=s.nextInt();
        }
        for (int i = 0; i < operators.length; i++) {
            for (int j = 0; j < operators[i].length; j++) {
                operators[i][j]=s.nextInt();
            }
        }
        for (int i = 0; i < operators.length; i++) {
            int first = operators[i][0];
            int last = operators[i][1];
            for (int j = first-1; j < last; j++) {
                arr[j]+=operators[i][2];
            }
        }
        System.out.println(Arrays.toString(arr));

    }
    public static void D_The_first_missing_number(){
        Scanner s=new Scanner(System.in);
        int[] arr = new int[s.nextInt()];
        int value = s.nextInt();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        int cou=0;
        for (int i = arr[0]; i <= arr[arr.length-1]; i++) {
            if (i != arr[cou] && (i <= value && i >= value * -1)) {
                System.out.println(i);
                return;
            }
        }
    }
    public static void B_Count_characters(){
        Scanner s=new Scanner(System.in);
        int [] arr =new int [125];
        String value=s.next();
        for (int i = 0; i < value.length(); i++) {
            arr[value.toCharArray()[i]]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0)
                System.out.println((char) i + " " + arr[i]);
        }
    }
    public static void A_Count_numbers(){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[100000];
        int[][] ope = new int[s.nextInt()][2];
        for (int i = 0; i < ope.length; i++) {
            for (int j = 0; j < ope[i].length; j++) {
                ope[i][j] = s.nextInt();
            }
        }
        for (int i = 0; i < ope.length; i++) {
            if (ope[i][0] == 1) {
                arr[ope[i][1]]++;
            }else{
                System.out.println(arr[ope[i][1]]);
            }
        }
    }
}


























