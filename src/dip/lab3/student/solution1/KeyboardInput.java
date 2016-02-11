package dip.lab3.student.solution1;

import java.util.Scanner;

public class KeyboardInput implements Input {

    @Override
    public String inputLine() {
            System.out.println("Entered text will be copied to output:");

            Scanner input = new Scanner(System.in);
            return input.nextLine();
	}
}
