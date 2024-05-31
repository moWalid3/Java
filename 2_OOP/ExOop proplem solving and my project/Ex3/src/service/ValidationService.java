package service;

import model.Numbers;

public class ValidationService {
    public static boolean check(Numbers numbers){
        if (numbers.getNum1()%2!=0 || numbers.getNum2()%2!=0 || numbers.getNum3()%2!=0) {
            System.out.println("invalid number");
            return false;
        }
        return true ;
    }
}
