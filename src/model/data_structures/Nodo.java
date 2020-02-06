package model.data_structures;

public class Nodo<T> {

	private int index;
	
	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	private Nodo<T> siguiente;
	private Nodo<T> anterior;


	public void cambiarSiguiente(Nodo<T> siguiente) {
		this.siguiente = siguiente;
	}
	
	public void cambiarAnterior(Nodo<T> anterior) {
		this.anterior = anterior;
	}
	
	public Nodo<T> darSiguiente() {
		return siguiente;
	}
	
	public Nodo<T> darAnterior() {
		return anterior;
	}
	
	public boolean hasNext() {
		return siguiente != null;
	}
	
}
