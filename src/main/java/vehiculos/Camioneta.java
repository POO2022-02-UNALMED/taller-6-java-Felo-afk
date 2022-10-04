package vehiculos;
import java.util.ArrayList;
public class Camioneta extends Vehiculo{
	boolean volco;
	public static ArrayList<Camioneta> camionetas=new ArrayList<Camioneta>();
	private static int cantidadCamionetas;
	public Camioneta(String placa, int puertas,String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
		super(placa, puertas, 90, nombre, precio, peso,"4X4", fabricante);
		this.volco = volco;
		this.cantidadCamionetas++;
		camionetas.add(this);
	}
	public ArrayList getCamionetas() {
		return this.camionetas;
	}
	public boolean isVolco() {
		return this.volco;
	}
	public void setVolco(boolean v) {
		this.volco=v;
	}
 	public static int getCantidadCamionetas() {
 		return cantidadCamionetas;
 	}
 	public void setCantidadCamionetas(int c) {
 		cantidadCamionetas=c;
 	}
}
