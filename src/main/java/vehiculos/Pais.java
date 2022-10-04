package vehiculos;
import java.util.ArrayList;
import java.util.Collections;
public class Pais {
	String nombre;
	private static ArrayList<Pais> new= Paises ArrayList<Pais>();
	public Pais(String nombre) {
		this.nombre=nombre;
		paises.add(this);
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String n) {
		this.nombre=n;
	}
	public static Pais paisMasVendedor() {
		ArrayList<Integer> neds = new ArrayList<Integer>();
		for (int i = 0; i < listado.size();i++ ) {
		    neds.add(0);
			for (int j =0; j< Vehiculo.vehiculos.size(); j++) {
				if (Vehiculo.vehiculos.get(j).fabricante.getPais().getNombre() == fabricantes.get(i).getNombre()) {
					neds.set(i, neds.get(i)+1);
				}
				
			}
			
		}
		int maxi = neds.indexOf(Collections.max(neds));
		return paises.get(maxi);
		
	}
}