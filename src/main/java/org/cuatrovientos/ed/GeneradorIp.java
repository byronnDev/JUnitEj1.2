package org.cuatrovientos.ed;

import java.util.Random;

import javax.xml.stream.events.EndDocument;

public class GeneradorIp {
	public int generarNumero(int min, int max) {
		Random rnd = new Random();
		int num;
		do {
			num = rnd.nextInt(max+1);
		} while (num < min);
		return num;
	}
	
	public String generarIp() {
		String ip = "";
		for (int i = 0; i < 4; i++) {
			if (i == 0 || i == 3) {
				if (i == 3) {
					ip += generarNumero(1, 254);
					
				} else {
					ip += generarNumero(1, 254) + ".";					
				}
			}else {
				if (i == 3) {
					ip += generarNumero(1, 254);
					
				} else {
					ip += generarNumero(1, 254) + ".";					
				}
			}
		}
		return ip;
	}
}
