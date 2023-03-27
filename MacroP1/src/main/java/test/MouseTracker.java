package test;

import java.awt.*;
import java.awt.event.*;

public class MouseTracker implements MouseListener {

  public static void main(String[] args) {
    // MouseTracker 클래스의 인스턴스 생성
    MouseTracker mouseTracker = new MouseTracker();
    
    // MouseListener를 현재 클래스의 인스턴스로 등록
    Frame frame = new Frame("Mouse Tracker");
    frame.addMouseListener(mouseTracker);
    frame.setSize(400, 400);
    frame.setVisible(true);
  }

  // 마우스 클릭 시 호출되는 메소드
  public void mouseClicked(MouseEvent event) {
    System.out.println("Mouse clicked at x: " + event.getX() + ", y: " + event.getY());
  }

  // 마우스 눌림 시 호출되는 메소드
  public void mousePressed(MouseEvent event) {}

  // 마우스 떼어짐 시 호출되는 메소드
  public void mouseReleased(MouseEvent event) {}

  // 마우스 들어옴 시 호출되는 메소드
  public void mouseEntered(MouseEvent event) {}

  // 마우스 나감 시 호출되는 메소드
  public void mouseExited(MouseEvent event) {}
}