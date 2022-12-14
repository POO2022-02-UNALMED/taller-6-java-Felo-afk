package vehiculos;
import java.util.ArrayList;
public class Automovil extends Vehiculo {
	int puestos;
	public static ArrayList<Automovil> automoviles=new ArrayList<Automovil>();
	private static int cantidadAutomoviles=0;

	public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
		super(placa, 4, 100, nombre, precio, peso,"FWD", fabricante);
		this.puestos = puestos;
		this.cantidadAutomoviles++;
		automoviles.add(this);
	}
	public ArrayList getAutomoviles() {
		return this.automoviles;
	}
 	public int getPuestros() {
 		return this.puestos;
 	}
 	public void setPuestos(int p) {
 		this.puestos=p;
 	}
 	public static int getCantidadAutomoviles() {
 		return cantidadAutomoviles;
 	}
 	public void setCantidadAutomoviles(int c) {
 		cantidadAutomoviles=c;
 	}
}
