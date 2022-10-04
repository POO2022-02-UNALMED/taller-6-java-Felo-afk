package vehiculos;
import java.util.ArrayList;
public class Vehiculo {
	public static ArrayList<Vehiculo> vehiculos=new ArrayList<Vehiculo>();
	protected String placa;
	protected int puertas;
	protected int velocidadMaxima;
	protected String nombre;
	protected int precio;
	protected int peso;
	protected String traccion;
	protected Fabricante fabricante;
 	private static int  cantidadVehiculos = 0;
 	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
 		this.placa=placa;
 		this.puertas=puertas;
 		this.velocidadMaxima=velocidadMaxima;
 		this.nombre=nombre;
 		this.precio=precio;
 		this.peso=peso;
 		this.traccion=traccion;
 		this.fabricante=fabricante;
 		cantidadVehiculos++;
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
 	public void setPrecio(int p) {
 		this.precio=p;
 	}
	public int getPeso() {
 		return this.peso;
 	}
 	public void setPeso(int p) {
 		this.peso=p;
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
 	public static void setCantidadVehiculos(int can) {
 		Vehiculo.cantidadVehiculos=can;
 	}
 	public void vehiculosPorTipo() {
 		System.out.println("Automoviles: "+Automovil.getCantidadAutomoviles()+"\nCamionetas: "+Camioneta.getCantidadCamionetas()+"\nCamiones: "+ Camion.getCantidadCamiones());
 	}
}
