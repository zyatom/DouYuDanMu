package com.zhuyan.simulation;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class SimKey {
	public static void main(String[] args) throws Exception {
		Robot robot = new Robot();
		while (true) {
			//robot.delay(1);// �ӳ�10����
			keyPressWithCtrl(robot, KeyEvent.VK_V);// ͬʱ��ctrl+V
			keyPress(robot, KeyEvent.VK_ENTER);// ��enter
			//robot.delay(1);
			keyPressWithCtrl(robot, KeyEvent.VK_V);// ͬʱ��ctrl+V
			keyPress(robot, KeyEvent.VK_PERIOD);// 
			keyPress(robot, KeyEvent.VK_ENTER);// ��enter
		}
	}

	// ctrl+ ����
	public static void keyPressWithCtrl(Robot r, int key) {
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(key);
		r.keyRelease(key);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.delay(100);
	}

	// ����
	public static void keyPress(Robot r, int key) {
		r.keyPress(key);
		r.keyRelease(key);
		r.delay(100);
	}
}
