package org.example;
import java.util.Scanner;
import java.util.Arrays;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coefficients  a, b and c of the quadratic equation ax^2 + bx + c = 0:");
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        System.out.print("c = ");
        int c = scanner.nextInt();
        int discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            System.out.println("The equation has no roots");
        } else {
            int x1 = (int) (-b + Math.sqrt(discriminant)) / (2 * a);
            int x2 = (int) (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }


        System.out.println("Task 2");
        Scanner minmax = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        System.out.print("First number: ");
        if (minmax.hasNextInt()) {
            int num = minmax.nextInt();
            min = num;
            max = num;


            while (true) {
                System.out.print("Next number (or 'end', to break): ");
                if (minmax.hasNextInt()) {
                    int number = minmax.nextInt();
                    if (number < min) {
                        min = number;
                    }
                    if (number > max) {
                        max = number;
                    }
                } else {
                    String input = minmax.next();
                    if (input.equals("end")) {
                        break;
                    }
                }
            }

            System.out.println("Мінімальне число: " + min);
            System.out.println("Максимальне число: " + max);

            System.out.println("Task 3");
            String text = "Роняє ліс багряний свій убір,\nСрібне мороз, що в'януло поле,\nПрогляне день ніби мимоволі\nІ сховається за край окружних гір.";
            System.out.println(text);
            String letters = "Про";
            int count = 0;
            int i = 0;
            while ((i = text.indexOf(letters, i)) != -1) {
                count++;
                i += letters.length();
            }
            System.out.println("Number of letters \"" + letters + "\": " + count);
        }
    }
}


