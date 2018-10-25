
package laboratorio;

import java.util.ArrayList;



public class Habitacion {

private int numero;
private Especialidad especialidad;
private int piso;
private String[] cama;
//private Paciente paciente;

    public Habitacion (int numero,Especialidad especialidad,int piso, int numCama){
        this.numero = numero;
        this.especialidad = especialidad;
        this.piso = piso;
        cama = new String[numCama];
        int i;
        for(i=0;i<numCama;i++){
            cama[i] = "Libre";
        }
        
    }
    @Override
    public String toString(){
        
        String estado = "N° "+getNumero()+". Piso: "+getPiso();
        return estado;
    }
    public void añadirPacienteACama(Paciente paciente, int numCama){
      
                cama[numCama] = paciente.getDni();
     
        }
    public void bajaPacienteCama(String dni) {//throws BajaPacienteException{
        int i, bandera=0;
        for(i=0; i< cama.length;i++){            
            if (cama[i].equals(dni)){
                cama[i] = "Libre";
                bandera = 1;
            }           
        }
    }
    public String[] setCamasLibre(){
        int aux = cama.length;
        String[] libre = new String[aux];
        int i,j=0, l=0;
        for(i=0;i<aux;i++){
            if (cama[i].equals("Libre")){
                libre[j] =""+i;
                j++;
                l++;
            }
        }
        String[] camas = new String[l];
        for(i=0;i<l;i++)
            camas[i]=libre[i];
        
        return camas;
    }
    public void getCamasLibre(){
        for (int i=0; i<setCamasLibre().length;i++)
            System.out.println("Cama: "+setCamasLibre()[i]);
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the especialidad
     */
    public Especialidad getEspecialidad() {
        return especialidad;
    }

    /**
     * @param especialidad the especialidad to set
     */
    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * @return the piso
     */
    public int getPiso() {
        return piso;
    }

    /**
     * @param piso the piso to set
     */
    public void setPiso(int piso) {
        this.piso = piso;
    }

    /**
     * @return un listado de todas las camas
     */
    public String getCamas() {
        int i;
        String c ="";
        for(i=0;i<cama.length;i++){
            c = c+"Cama "+i+":   "+cama[i]+"\n";
        }
        return c;
    }

    /**
     * cuando crea habitacion y asignamos el numero de camas
     */
    public void setNumeroCamas(int numCama) {
        cama = new String[numCama];
        int i;
        for(i=0;i<numCama;i++){
            this.cama[i] = "libre";
        }
    }
    //ver una cama  especifica
    public String  getCama(String dni){
        int i;
        String c=null;
        for (i=0;i<cama.length;i++){
            if(cama[i].equals(dni))
                c = ""+i;
        }
        return c;    
    }

}
