package model.in;

public class Infraccion 
{
	
	// Atributos
	private int objectId;
	
	private String FechaYHora;
	
	private String MedioDete;
	
	private String clase;
	
	private String tipo;
	
	private String infraccion;
	
	private String desInfraccion;
	
	private String localidad;
	
	private double latitud;
	
	private double longitud;
	
	//Métodos
	
	public int getObjectid() {
		return objectId;
	}
	public void setObjectid(int objectid) {
		this.objectId = objectid;
	}
	public String getFechaYHora() {
		return FechaYHora;
	}
	public void setFechaYHora(String fechaYHora) {
		FechaYHora = fechaYHora;
	}
	public String getMedioDete() {
		return MedioDete;
	}
	public void setMedioDete(String medioDete) {
		MedioDete = medioDete;
	}
	public String getClase() {
		return clase;
	}
	public void setClase(String clase) {
		this.clase = clase;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getInfraccion() {
		return infraccion;
	}
	public void setInfraccion(String infraccion) {
		this.infraccion = infraccion;
	}
	public String getDesInfraccion() {
		return desInfraccion;
	}
	public void setDesInfraccion(String desInfraccion) {
		this.desInfraccion = desInfraccion;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public double getLatitud() {
		return latitud;
	}
	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	
	//Constructor
	
	public Infraccion(int objectid, String fechaYHora, String medioDete, String clase, String tipo, String infraccion,
			String desInfraccion, String localidad, double latitud, double longitud)
	
	{
		this.objectId = objectid;
		
		FechaYHora = fechaYHora;
		
		MedioDete = medioDete;
		
		this.clase = clase;
		
		this.tipo = tipo;
		
		this.infraccion = infraccion;
		
		this.desInfraccion = desInfraccion;
		
		this.localidad = localidad;
		
		this.latitud = latitud;
		
		this.longitud = longitud;
	}
	

}
