
package laboratorio;

import java.util.ArrayList;


public class Clinica {
    private ArrayList<Paciente> pacientes =  new ArrayList<Paciente>();
    private ArrayList<Doctor> doctores =  new ArrayList<Doctor>();
    private ArrayList<Habitacion> habitaciones =  new ArrayList<Habitacion>();
    private ArrayList<Especialidad> especialidades =  new ArrayList<Especialidad>();
    private ArrayList<Diagnostico> diagnosticos =  new ArrayList<Diagnostico>();
    

    /**
     * @return the pacientes
     */
    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    /**
     * @param pacientes the pacientes to set
     */
    public void setPacientes(Paciente p) {
        
        pacientes.add(p);
    }
    
     /**
     * @return the Doctores
     */
    public ArrayList<Doctor> getDoctores() {
        return doctores;
    }

    /**
     * @param doctores the pacientes to set
     */
    public void setDoctores(Doctor d) {
        doctores.add(d);
    }
    
    /**
     * @return the Habitacion
     */
    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    /**
     * @param Habitacion the pacientes to set
     */
    public void setHabitaciones(Habitacion h) {
        
        habitaciones.add(h);
    }
    
     /**
     * @return the Especialidad
     */
    public ArrayList<Especialidad> getEspecialidades() {
        return especialidades;
    }

    /**
     * @param Especialidad the pacientes to set
     */
    public void setEspecialidades(Especialidad e) {
        especialidades.add(e);
    } 
    
     /**
     * @return the Diagnostico
     */
    public ArrayList<Diagnostico> getDiagnosticos() {
        return diagnosticos;
    }

    /**
     * @param Diagnostico the pacientes to set
     */
    public void setDiagnosticos(Diagnostico d) {
        diagnosticos.add(d);
    }
    
    
    public void verificarDatos(String dni, String nombre, String apellido,String domicilio) throws VerificarDniException, VerficarCampoVacioException{
        
        if(dni.length() == 8 || dni.length() == 7){
            int numero = Integer.parseInt(dni);
            if(numero < 1000000)
                 throw new VerificarDniException();             
        }
        else 
            throw new VerificarDniException();
        
        if(nombre.equals("")||apellido.equals("")||domicilio.equals(""))
                    throw new VerficarCampoVacioException();
                
    }
    
    public void sincronisarInformacion(Paciente paciente, Object doctor, Object especialidad,Object habitacion, int numCama){
        
        for (Doctor doc : this.getDoctores()){
            if(doc.toString().equals(doctor.toString())){
                doc.setPaciente(paciente);
                paciente.setDoctor(doc);
            }
        }
        for (Habitacion hab : this.getHabitaciones()){
            if(hab.toString().equals(habitacion.toString())){
                hab.añadirPacienteACama(paciente, numCama);
                paciente.setHabitacion(hab);
            }
        }
        for (Especialidad esp : this.getEspecialidades()){
            if(esp.toString().equals(especialidad.toString())){
                paciente.setEspecialidad(esp);
            }
        }
    }
    
    public void verificarDni(String dni) throws VerificarDniException{
        
        if(dni.length() == 8 || dni.length() == 7){
            int numero = Integer.parseInt(dni);
            if(numero < 1000000)
                throw new VerificarDniException();                   
        }
        else 
            throw new VerificarDniException();             
    }
    
    public void buscarAfiliado(String dni) throws AfiliadoNoEncontradoException{
        int bandera =0;
        for(Paciente pac : this.getPacientes()){
                    if (pac.getDni().equals(dni)){
                        bandera =1;
                        break;
                }
                }
        if(bandera == 0)
            throw new AfiliadoNoEncontradoException();      
    }
    
    public void buscarRepetido(String dni) throws  VerificarRepetidosException{
    for(Paciente pac : this.getPacientes()){
        if (pac.getDni().equals(dni)){
            throw new VerificarRepetidosException();
        }
    }
    }
    
}

