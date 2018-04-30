package br.com.robotcarbon;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Main {

	private static Scanner s;

	public static void main(String[] args) {
		try {
			Robot robot = new Robot();
			Server servidor = new Server(12345);
			Socket cliente = servidor.getServidor().accept();
			
			s = new Scanner(cliente.getInputStream());
			while(s.hasNext()) {
				if(s.nextLine().equals("space")) {
					robot.keyPress(KeyEvent.VK_SPACE);
					robot.keyRelease(KeyEvent.VK_SPACE);
				}
			}
		} catch (IOException | AWTException e) {
			e.printStackTrace();
		}
	}
}
