package model.data_structures;

public interface ILista<T> 
{
	//intrucciones de la lista
	
	void add(T element);
	
	void add(T element, int index);
	
	T get(int index);
	
	T get(T element);
	
	int getSize();
	
	void remove(int index);
	
	void remove(T element);
}
