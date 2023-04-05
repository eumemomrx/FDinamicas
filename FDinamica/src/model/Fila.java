package model;

public class Fila {
	No inicio;
	No fim;

	public Fila() {
		inicio = null;
		fim = null;
	}

	public boolean filaVazia() {
		if (inicio == null && fim == null) {
			return true;
		} else {
			return false;
		}
	}

	public void inserir(int valor) {
		No elemento = new No();
		elemento.dado = valor;
		elemento.proximo = null;
		if (filaVazia()) {
			inicio = elemento;
			fim = inicio;
		} else {
			if (inicio == fim && inicio != null) {
				fim = elemento;
				inicio.proximo = fim;
			} else {
				fim.proximo = elemento;
				fim = elemento;
			}
		}

	}

	public int remover() throws Exception {
		if (filaVazia()) {
			throw new Exception("Não há elementos na fila");
		}
		int valor = inicio.dado;
		if (inicio == fim && inicio != null) {
			inicio = null;
			fim = inicio;
		} else {
			inicio = inicio.proximo;
		}
		return valor;
	}

	public int tamanho() {
		int i = 0;
		if (!filaVazia()) {
			No aux = inicio;
			while (aux != null) {
				i++;
				aux = aux.proximo;
			}
		}
		return i;
	}
}
