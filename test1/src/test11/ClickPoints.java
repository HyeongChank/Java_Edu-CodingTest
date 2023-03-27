package test11;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ClickPoints {
	private static int x =0;
	private static int y =0;
	private static Scanner kb = new Scanner(System.in);
	public static int [] mousepoint() {
		int [] array = new int[2];
        Point p;
        p = MouseInfo.getPointerInfo().getLocation();
        x = (int) p.getX();
        y = (int) p.getY();
        System.out.println("Clicked mouse position: (" + x + ", " + y + ")");
		array[0] = x;
		array[1] = y;
		return array;
	}
	public static void main(String[] args) throws AWTException {
        Robot robot = new Robot();
        LinkedList<Integer> list = new LinkedList<>();
        int [] array2 ;
        System.out.println("포인터 개수 : ");
        int num = kb.nextInt();
        int i=0;
        while(i<num) {
        	System.out.println("마우스 위치시키고 q외의 키 누르시오");
        	String s = kb.next();
        	if(s.equals("q")) {
        		break;
        	}
        	else {
        		
        		array2 = mousepoint();
            	System.out.println(array2[0] + "       " + array2[1]);
            	list.add(array2[0]);
            	list.add(array2[1]);
            	i++;
        	}
        }
        System.out.println(list);
        int x1=list.pollFirst();
        int y1=list.pollFirst();
        int x2=list.pollFirst();
        int y2=list.pollFirst();
        int delay = 1000; // 클릭 사이의 딜레이 (1초)
        int delay2 = 3000;
        while(true) {
	        robot.mouseMove(x1, y1); // 첫번째 위치로 이동
	        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 마우스 왼쪽 버튼 누름
	        robot.delay(delay); // 딜레이
	        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 마우스 왼쪽 버튼 뗌
	
	        robot.delay(delay2); // 딜레이
	
	        robot.mouseMove(x2, y2); // 두번째 위치로 이동
	        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // 마우스 왼쪽 버튼 누름
	        robot.delay(delay); // 딜레이
	        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // 마우스 왼쪽 버튼 뗌

        }
   }
}