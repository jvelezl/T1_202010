package model.data_structures;

public class ListaEncadenada <T> implements ILista<T>
{
	private Nodo<T> first;

	private int size;

	public ListaEncadenada() 
	{
		// TODO Auto-generated constructor stub
		size = 0;
		first = null;
	}


	public void add(T element) 

	{

		if (size == 0) 
		{
			first = new Nodo<T>(element);

		} 

		else 
		{
			Nodo<T> nodoActual = first;

			while(nodoActual.hasNext()) 
			{
				nodoActual = nodoActual.darSiguiente();
			}
			Nodo<T> nuevoNodo = new Nodo<T>(element);

			nodoActual.cambiarSiguiente(nuevoNodo);

			nuevoNodo.cambiarAnterior(nodoActual);
		}

		size ++;
	}


	public void add(T element, int index) 
	{
		int i = -1;

		if (size == 0)
		{
			first = new Nodo<T> (element);
			index = i;

		}

		else
		{
			Nodo<T> nodoActual = first;

			while(nodoActual.hasNext()) 
			{
				nodoActual = nodoActual.darSiguiente();
				index ++;	
			}

			Nodo<T> nuevoNodo = new Nodo<T>(element);

			nodoActual.cambiarSiguiente(nuevoNodo);

			nuevoNodo.cambiarAnterior(nodoActual);
		}
		
		size ++;



	}

	
	public T get(int index) 
	{
		Nodo <T> actual =  first;
		
		while (actual != null && actual.getIndex() != index )
			
		{
			actual = actual.darSiguiente();
		}
		
		return (T) actual;
			
		
	}
	

	public T get(T element) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public int getSize() 
	{
		return size;
	}

	
	public void remove(int index) 
	{
		if(size > 0)
		{
			if(index == first.getIndex())
			{
				first = first.darSiguiente();
			}
			
			else
			{
				Nodo <T> actual = (Nodo<T>) get(index);
				Nodo <T> sig = actual.darSiguiente();
				Nodo <T> ant = actual.darAnterior();
				
				sig.cambiarAnterior(ant);
				ant.cambiarSiguiente(sig);
				
				
			}
		}
	}

	@Override
	public boolean remove(T element) {
		// TODO Auto-generated method stub
		return false;
	}


}
