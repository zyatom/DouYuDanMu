package com.zhuyan.simulation;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class SimKey {
	public static void main(String[] args) throws Exception {
		Robot robot = new Robot();
		while (true) {
			//robot.delay(1);// 延迟10毫秒
			keyPressWithCtrl(robot, KeyEvent.VK_V);// 同时按ctrl+V
			keyPress(robot, KeyEvent.VK_ENTER);// 按enter
			//robot.delay(1);
			keyPressWithCtrl(robot, KeyEvent.VK_V);// 同时按ctrl+V
			keyPress(robot, KeyEvent.VK_PERIOD);// 
			keyPress(robot, KeyEvent.VK_ENTER);// 按enter
		}
	}

	// ctrl+ 按键
	public static void keyPressWithCtrl(Robot r, int key) {
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(key);
		r.keyRelease(key);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.delay(100);
	}

	// 单键
	public static void keyPress(Robot r, int key) {
		r.keyPress(key);
		r.keyRelease(key);
		r.delay(100);
	}
}
