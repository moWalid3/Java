package service;

import model.Numbers;

public class NumbersService {
    public static int print(Numbers numbers){
        return numbers.getNum3()+numbers.getNum2()+numbers.getNum1();
    }

}
