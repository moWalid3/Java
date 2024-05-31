package Stack.Chapter;

public class ReverseWord {
    public static    class StackWord{
        private char[]arr;
        private int top;

        public StackWord(int max) {
            this.arr=new char[max];
            this.top=-1;
        }
        public  void push(char ch) {
            arr[++top]=ch;
        }
        public char pop(){
            return arr[top--];
        }
    }
    public static class wordRev{
        private String inWord;
        private String ouWord;

        private  wordRev(String inWord) {
            this.inWord = inWord;
        }
        public void reverseWord(){
            int size=inWord.length();
            StackWord stackWord=new StackWord(size);
            for (int i = 0; i < size; i++) {
                stackWord.push(inWord.charAt(i));
            }
            ouWord="";
            for (int i = 0; i < size; i++) {
                ouWord = ouWord + stackWord.pop();
            }
        }
        public void show(){
            System.out.println(ouWord);
        }
    }
    public static class appReverseWord{
        public static void main(String[] args) {
            wordRev word=new wordRev("mohamed walid");
            word.reverseWord();
            word.show();
        }
    }
}
