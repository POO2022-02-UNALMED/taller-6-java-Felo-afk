package vehiculos;
import java.util.ArrayList;
public class Vehiculo {
p	public static ArrayList<Vehiculo> vehiculos=new ArrayList<Vehiculo>();
	protected String placa;
	protected int puertas;
	protected int velocidadMaxima;
	protected String nombre;
	protected int precio;
	protected String traccion;
	protected Fabricante fabricante;
 	private static int  cantidadVehiculos = 0;
 	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, String traccion, Fabricante fabricante) {
 		this.placa=placa;
 		this.puertas=puertas;
 		this.velocidadMaxima=velocidadMaxima;
 		this.nombre=nombre;
 		this.precio=precio;
 		this.traccion=traccion;
 		this.fabricante=fabricante;
 		this.cantidadVehiculos++;
 		vehiculos.add(this);
 	}
 	public ArrayList getVehiculos() {
 		return this.vehiculos;
 	}
 	public String getPlaca() {
 		return this.placa;
 	}
 	public void setPlaca(String p) {
 		this.placa=p;
 	}
 	public int getPuertas() {
 		return this.puertas;
 	}
 	public void setPlaca(int p) {
 		this.puertas=p;
 	}
 	public int getVelocidadMaxima() {
 		return this.velocidadMaxima;
 	}
 	public void setVelocidadMaxima(int v) {
 		this.velocidadMaxima=v;
 	}
 	public String getNombre() {
 		return this.nombre;
 	}
 	public void setNombre(String n) {
 		this.nombre=n;
 	}
 	public int getPrecio() {
 		return this.precio;
 	}
 	public void setPrecio(String p) {
 		this.precio=p;
 	}
 	public String getTraccion() {
 		return this.traccion;
 	}
 	public void setTraccion(String t) {
 		this.traccion=t;
 	}
 	public Fabricante getFabricante() {
 		return this.fabricante;
 	}
 	public void setFabricante(Fabricante f) {
 		this.fabricante=f;
 	}
 	public int getCantidadVehiculos() {
 		return this.cantidadVehiculos;
 	}
 	public void vehiculosPorTipo() {
 		System.out.println("Automoviles: "+Automovil.getCantidadAutomoviles+"\nCamionetas: "+Camioneta.getCantidadCamionetas+"\nCamiones: "+ Camion.getCantidadCamiones);
 	}
}
