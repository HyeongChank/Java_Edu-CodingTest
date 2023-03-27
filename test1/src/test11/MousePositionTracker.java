package test11;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class MousePositionTracker {

    public static int [] main(String[] args) throws AWTException {
        Robot robot = new Robot();
        Scanner scanner = new Scanner(System.in);
//enter key 누르면 마우스 위치 출력됨
        int x=0;
        int y=0;
        System.out.println("Press Enter key to get current mouse position, or q to quit...");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("q")) {
                break;
            } else {
                x = MouseInfo.getPointerInfo().getLocation().x;
                y = MouseInfo.getPointerInfo().getLocation().y;
                System.out.println("Mouse position: x=" + x + ", y=" + y);
            }
        }
        scanner.close();
        System.out.println("Exiting...");
        int [] array = {x,y};
        return array;
    }
}

