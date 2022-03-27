package view;


import java.util.concurrent.Semaphore;
import Controller.idIngresso;

public class MainIngresso {

	public static void main(String[] args, idIngresso ThreadIngresso, semaforo) {
		int totalIngressos = 300;
		int maxIngressos = 4;
		int permissoes = 1; 
		semaforo = new Semaphore(maxIngressos);
		for (int i = 0; i <totalIngressos; i++) {
		ThreadIngresso = new idIngresso(i, semaforo);
		filaIngresso.start();
		}
	}
	

