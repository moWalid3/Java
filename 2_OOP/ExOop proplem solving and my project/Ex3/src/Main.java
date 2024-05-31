import model.Numbers;
import service.NumbersService;
import service.ValidationService;



public class Main {
    public static void main(String[] args) {
        Numbers n1=new Numbers();
        n1.setNum1(14);
        n1.setNum2(22);
        n1.setNum3(34);
        if (ValidationService.check(n1))
            System.out.println(NumbersService.print(n1));
    }
}