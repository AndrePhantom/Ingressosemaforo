package Controller;

import java.util.concurrent.Semaphore;

public class idIngresso extends Thread {

public void idIngresso(int numIngressos, int maxIngressos, semaforo) {
private int numIngressos;
private int maxIngressos;
private Semaphore semaforo;
public void Threadingresso() {
this.idmaxIngressos = maxIngressos;
this.idnumIngressos = numIngressos;
this.compraIngresso = compraIngresso;
this.semaforo = semaforo;
}

@Override
public void run() {
}
try {
semaforo.acquire();
compraIngresso();
} catch (InterruptedException e) {
e.printStackTrace();
}
finally {
semaforo.release();
}

private void filaIngresso() {
		int tempo = 1000;
		int filaIngresso = 0;

		while (filaIngresso < 200) {
			filaIngresso += (int) ((Math.random() * 3) + 4);
			try {
				Thread.sleep(tempo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("A FilaIngresso " + idIngresso + "  " + filaIngresso + " andou ");
		}
	}

	private void Ingresso Validação() {
		System.out.println("A validação " + idIngresso + " foi concluida");
		double tempoInicial = System.nanoTime();
		int tempoParado = (r.nextInt(3 - 1) + 1) * 1000;
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		double tempoFinal = System.nanoTime();
		double tempototal = tempoFinal - tempoInicial;
		tempototal = tempototal / Math.pow(10, 9);
		System.out.println("o compra não foi concluida" + idIngresso + " Timeout: " + tempo);
	}

	private void compraIngresso() {
		posCompra++;
		System.out.println("A compra do " + idIngresso + " foi  " + Validação + "concluida com sucesso");
	}
}






