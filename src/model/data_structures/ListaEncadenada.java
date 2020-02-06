package model.data_structures;

public class ListaEncadenada <T> implements ILista<T>
{
	private Nodo<T> primero;

	private int tamano;

	public ListaEncadenada() 
	{
		// TODO Auto-generated constructor stub
		tamano = 0;
		primero = null;
	}


	public void add(T element) 

	{

		if (tamano == 0) 
		{
			primero = new Nodo<T>();

		} 

		else 
		{
			Nodo<T> nodoActual = primero;

			while(nodoActual.hasNext()) 
			{
				nodoActual = nodoActual.darSiguiente();
			}
			Nodo<T> nuevoNodo = new Nodo<T>();

			nodoActual.cambiarSiguiente(nuevoNodo);

			nuevoNodo.cambiarAnterior(nodoActual);
		}

		tamano ++;
	}


	public void add(T element, int index) 
	{
		int i = -1;

		if (tamano == 0)
		{
			primero = new Nodo<T> ();
			index = i;

		}

		else
		{
			Nodo<T> nodoActual = primero;

			while(nodoActual.hasNext()) 
			{
				nodoActual = nodoActual.darSiguiente();
				index ++;	
			}

			Nodo<T> nuevoNodo = new Nodo<T>();

			nodoActual.cambiarSiguiente(nuevoNodo);

			nuevoNodo.cambiarAnterior(nodoActual);
		}
		
		tamano ++;



	}

	
	public T get(int index) 
	{
		Nodo <T> actual =  primero;
		
		while (actual != null && actual.getIndex() != index )
			
		{
			actual = actual.darSiguiente();
		}
		
		return (T) actual;
			
		
	}
	

	public T get(T element) 
	{
		
		return null;
	}

	
	public int getSize() 
	{
		return tamano;
	}

	
	public void remove(int index) 
	{
		if(tamano > 0)
		{
			if(index == primero.getIndex())
			{
				primero = primero.darSiguiente();
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

	
	public void remove(T element) {
		

	}


}
