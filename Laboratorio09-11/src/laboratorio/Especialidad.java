
package laboratorio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Especialidad {
    
    private String nombre;
    private  ArrayList<Doctor> doctores = new ArrayList<Doctor>();
    private ArrayList<Habitacion> habitaciones = new ArrayList<Habitacion>();
    
    public Especialidad (String nombre){
        this.nombre = nombre;
    }
    
    @Override
    public String toString(){
        return nombre;
    }
    
    public void estadoEspecialidad(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("\nDoctores adscritos:\n"+getDoctores());
        System.out.println("\nHabitaciones que dispone: \n"+getHabitacion());
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDoctores(){
        String lista = "";
        for (int i=0; i< doctores.size();i++){
            Object doc = doctores.get(i);
            lista = lista +"\n"+ doc;
        }
        return lista;
    }
    public void setDoctor(Doctor doctor){
        doctores.add(doctor);
    }
    public String[] getHabitacion(){
        int j=0;
        String[] lista= new String[habitaciones.size()];
        for (int i=0; i< habitaciones.size();i++){
            Object hab = habitaciones.get(i);
            lista[j] = hab.toString();
            j++;
        }
        return lista;
    }
    public void setHabitacion(Habitacion hab){
        habitaciones.add(hab);
        //Ordena de acuerdo al num de habitacion
        Collections.sort(habitaciones, new Comparator<Habitacion>(){
	@Override
	public int compare(Habitacion h1, Habitacion h2) {
		return new Integer(h1.getNumero()).compareTo(new Integer(h2.getNumero()));
	}
        });
    }

}
