package vehiculos;
import java.util.ArrayList;
public class Camion extends Vehiculo {
	int ejes;
	public static ArrayList<Camion> camiones=new ArrayList<Camion>();
	private static int cantidadCamiones=0;
	public Camion(String placa,String nombre, int precio, Fabricante fabricante, int ejes) {
		super(placa,2,80,nombre, precio, "4X2",fabricante);
		this.ejes=ejes;
		this.cantidadCamiones++;
		camiones.add(this);
	}
	public ArrayList getCamiones() {
		return this.camiones;
	}
 	public int getEjes() {
 		return this.ejes;
 	}
 	public void setEjes(int e) {
 		this.ejes=e;
 	}
 	public static int getCantidadCamiones() {
 		return cantidadCamiones;
 	}
 	public void setCantidadCamiones(int c) {
 		cantidadCamiones=c;
 	}
}
