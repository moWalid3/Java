package stackLList;

public class Main {
    public static void main(String[] args) {
        StackLList stackNode=new StackLList();
        stackNode.push(33);
        stackNode.push(22);
        stackNode.push(11);
        System.out.println(stackNode.printTop());
        stackNode.pop();
        System.out.println(stackNode.printTop());
        stackNode.push(55);
        stackNode.push(66);
        System.out.println(stackNode.printTop());
        stackNode.pop();
        System.out.println(stackNode.printTop());




    }
}
