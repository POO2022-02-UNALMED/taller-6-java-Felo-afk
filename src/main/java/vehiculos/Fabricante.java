package vehiculos;
import java.util.ArrayList;
import java.util.Collections;
public class Fabricante {
	String nombre;
	Pais pais;
	public static ArrayList<Fabricante> new=frabricantes ArrayList<Fabricante>();
	public Fabricante(String nombre, Pais pais) {
		this.nombre=nombre;
		this.pais=pais;
		fabricantes.add(this);
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String n) {
		this.nombre=n;
	}
	public Pais getPais() {
		return this.pais;
	}
	public void setPais(Pais p) {
		this.pais=p;
	}
	public static Fabricante fabricaMayorVentas() {
	    ArrayList<Integer> vends = new ArrayList<Integer>();
        for (int i = 0; i < fabricantes.size();i++ ) {
            vends.add(0);
            for (int j =0; j< Vehiculo.vehiculos.size(); j++) {
                if (Vehiculo.vehiculos.get(j).fabricante.getNombre() == fabricantes.get(i).getNombre()) {
                    vends.set(i, vends.get(i)+1);
                }
                
            }
            
        }
        int maximoIndex = vends.indexOf(Collections.max(vends));
        return fabricantes.get(maximoIndex);
        
    }
}
