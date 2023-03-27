package test11;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class MouseClick {
    public static void main(String[] args) throws AWTException {
        Robot robot = new Robot();
        Point p;
        int X, Y;
        p = MouseInfo.getPointerInfo().getLocation();
        X = (int) p.getX();
        Y = (int) p.getY();
        System.out.println("Clicked mouse position: (" + X + ", " + Y + ")");
    
        
    }
}






