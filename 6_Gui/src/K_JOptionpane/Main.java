package K_JOptionpane;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
//        JOptionPane.showMessageDialog(null, "Hello in this sentence.", "Title", JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Hello in this sentence.", "Title", JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Hello in this sentence.", "Title", JOptionPane.WARNING_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Hello in this sentence.", "Title", JOptionPane.ERROR_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Hello in this sentence.", "Title", JOptionPane.QUESTION_MESSAGE);

        // yes = 0, no = 1, cancel = 2, exit = -1
//        int res = JOptionPane.showConfirmDialog(null, "Are you need to play again?", "title", JOptionPane.YES_NO_CANCEL_OPTION);

//       String st = JOptionPane.showInputDialog("Enter your name:");
//        System.out.println(st);

        JOptionPane.showOptionDialog(null, "message.", "title",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, new String[]{"Click1", "Click2"}, 0);

    }
}
