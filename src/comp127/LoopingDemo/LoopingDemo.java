package comp127.LoopingDemo;

import java.util.List;

public class LoopingDemo {
    public static void main(String[] args) {
        List<String> listStringNumbers = List.of("zero", "one", "two", "three");


        // for each loop
        int acc = 0;
        System.out.println("Start of for each loop");
        for (String number : listStringNumbers) {
            System.out.println("For each number: " + acc + ". " + number);
            acc++;
        }

        System.out.println("Start of C-style loop");
        for (int i = 0; i < listStringNumbers.size(); i++) {
            System.out.println("C-style loop number: " + i + ". " + listStringNumbers.get(i));
        }

        System.out.println("Start of while loop");
        int whileAcc = 0;
        while (whileAcc < listStringNumbers.size()) {
            System.out.println("While loop number: " + whileAcc + ". " + listStringNumbers.get(whileAcc));
            whileAcc++;
        }
    }
}
