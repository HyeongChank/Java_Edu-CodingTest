package test;

import java.awt.MouseInfo;
import java.awt.Point;
import java.util.Scanner;

//마우스포인터를 main.jsp 파일로 넘겨줘야함
//main.jsp파일에서 모든 좌표값을 받도록 버튼 여러개 만들어서 각각 좌표 받도록 해야함
public class mouselocation {
	private static int x =0;
	private static int y =0;
	private static Scanner kb = new Scanner(System.in);
	public static int [] mouselocation() {
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
}
