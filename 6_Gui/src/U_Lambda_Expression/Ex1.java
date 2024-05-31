package U_Lambda_Expression;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex1 {
    public static void main(String[] args) {

        /* Lambda expression =	Lambda Expressions were added in Java 8.

         *						Is a short block of code which takes in parameters and returns a value.
         *						Lambda expressions are similar to methods, but they do not need a name,
         *						and they can be implemented right in the body of a method.
         * 						Also known as an anonymous method
         * 						a shorter way to write anonymous classes with only one method
         *
         *				  ==>	Need to use a functional interface or use a pre-defined functional interface
         *						they contain only one abstract method
         *						ex. ActionListener
         *
         *				  ==>	Can be used in any place where a functional interface is required
         *						How to use a lambda expression:
         *						(arguments) -> {statement/s}
         */

        JButton btnButton = new JButton();

        // lambda expression
        btnButton.addActionListener(e -> System.out.println("I am from Button"));

        // old way, before lambda expression
        btnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("I am from Button");
            }
        });

    }
}

