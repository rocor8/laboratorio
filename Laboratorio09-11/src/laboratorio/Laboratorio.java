
package laboratorio;

public class Laboratorio {

    public static void main(String[] args) {
        //Diagnostico d = new Diagnostico("Estres","Leve","Reposo");
        Especialidad esp = new Especialidad("Traumatología");
        Especialidad esp2 = new Especialidad("Otorrinolaringología");
        Especialidad esp3 = new Especialidad("Pediatría");
        Especialidad esp4 = new Especialidad("Cardiología");
        Especialidad esp5 = new Especialidad("Nefrología");
        Especialidad esp6 = new Especialidad("Neurología");
        Especialidad esp7 = new Especialidad("Oftalmología");
        Especialidad esp8 = new Especialidad("Geriatría");
        Especialidad esp9 = new Especialidad("Clínica médica");
        
        //Especialidad esp3 = new Especialidad("");
        Habitacion h = new Habitacion(1,esp,1,7);
        
        Habitacion h2 = new Habitacion(2,esp,1,5);
        
        Habitacion h3 = new Habitacion(1,esp2,2,5);
        Habitacion h4 = new Habitacion(2,esp2,2,9);
        
        Habitacion h5 = new Habitacion(1,esp3,3,7);
        Habitacion h6 = new Habitacion(2,esp3,3,6);
        
        Habitacion h7 = new Habitacion(1,esp4,4,7);
        Habitacion h8 = new Habitacion(2,esp4,4,6);
        Habitacion h9 = new Habitacion(3,esp4,4,5);
        Habitacion h10 = new Habitacion(4,esp4,4,7);
        Habitacion h11 = new Habitacion(5,esp4,4,4);
        
        Habitacion h12 = new Habitacion(1,esp5,5,7);
        Habitacion h13 = new Habitacion(2,esp5,5,6);
        Habitacion h14 = new Habitacion(3,esp5,5,5);
        Habitacion h15 = new Habitacion(4,esp5,5,7);
        Habitacion h16 = new Habitacion(5,esp5,5,4);
        
        
        Habitacion h17 = new Habitacion(1,esp6,6,7);
        Habitacion h18 = new Habitacion(2,esp6,6,6);
        Habitacion h19 = new Habitacion(3,esp6,6,5);
        Habitacion h20 = new Habitacion(4,esp6,6,7);
        Habitacion h21 = new Habitacion(5,esp6,6,4);
        
        Habitacion h22 = new Habitacion(1,esp7,7,7);
        Habitacion h23 = new Habitacion(2,esp7,7,6);
        Habitacion h24 = new Habitacion(3,esp7,7,5);
        Habitacion h25 = new Habitacion(4,esp7,7,7);
        Habitacion h26 = new Habitacion(5,esp7,7,4);
        
        Habitacion h27 = new Habitacion(1,esp8,8,7);
        Habitacion h28 = new Habitacion(2,esp8,8,6);
        Habitacion h29 = new Habitacion(3,esp8,8,5);
        Habitacion h30 = new Habitacion(4,esp8,8,7);
        Habitacion h31 = new Habitacion(5,esp8,8,4);
        
        
        Habitacion h32 = new Habitacion(1,esp9,9,7);
        Habitacion h33 = new Habitacion(2,esp9,9,6);
        Habitacion h34 = new Habitacion(3,esp9,9,5);
        Habitacion h35 = new Habitacion(4,esp9,9,7);
        Habitacion h36 = new Habitacion(5,esp9,9,4);
        Habitacion h37 = new Habitacion(1,esp9,10,7);
        Habitacion h38 = new Habitacion(2,esp9,10,6);
        Habitacion h39 = new Habitacion(3,esp9,10,5);
        Habitacion h40 = new Habitacion(4,esp9,10,7);
        Habitacion h41 = new Habitacion(5,esp9,10,4);
        
        
        
        
        
        
        
        
       // Habitacion h7 = new Habitacion()
        
        
        Doctor doc = new Doctor("Tamara","Senatore","Femenino","21342424","Centro",2313,esp);        
        Doctor doc2 = new Doctor("Carmen","Varrionuevo","Femenino","17567984","Capital",4444,esp);
        Doctor doc7 = new Doctor("Pedro","Villafañe","Masculino","3212312","Valle viejo",3534,esp);
        
        Doctor doc3 = new Doctor("Miguel","Campos","Masculino","28101992","B° 25 Mayo",6423,esp2);        
        Doctor doc4 = new Doctor("Carla","Paredes","Femenino","17567986","B° Cristo Rey",4634,esp2);
        Doctor doc8 = new Doctor("Lucas","Barrionuevo","Masculino","25098384","Santa Rosa",3957,esp2);
        
        
        Doctor doc5 = new Doctor("Samuel","Castro","Masculino","21310424","Loro Huasi",1113,esp3);        
        Doctor doc6 = new Doctor("Patricia","Lobo","Femenino","37967984","Los Andes",6744,esp3);
        Doctor doc9 = new Doctor("Graciela","Castro","Femenino","2598354","El Alto", 6598, esp3);
                
        Doctor doc11 = new Doctor("Eduardo","Gomez","Masculino","3850498","El Alto", 7639, esp4);
        Doctor doc12 = new Doctor("Alicia","Bustamante","Femenino","385056","Los Altos", 7634, esp4);
        Doctor doc13 = new Doctor("Lucas","Aredes","Masculin","38545548","Valle Viejo", 7639, esp4);
        
        ///COPIADOS MODIFICAR DESPUES 
        
        
        Doctor doc14 = new Doctor("Tamara","Senatore","Femenino","21342344","Centro",2353,esp5);        
        Doctor doc15 = new Doctor("Carmen","Varrionuevo","Femenino","17437984","Capital",4644,esp5);
        Doctor doc16 = new Doctor("Pedro","Villafañe","Masculino","3212312","Valle viejo",3834,esp5);
        
        Doctor doc17 = new Doctor("Miguel","Campos","Masculino","28101992","B° 25 Mayo",6443,esp6);        
        Doctor doc18 = new Doctor("Carla","Paredes","Femenino","17567986","B° Cristo Rey",7634,esp6);
        Doctor doc19 = new Doctor("Lucas","Barrionuevo","Masculino","25098384","Santa Rosa",8957,esp6);
        
        
        Doctor doc20 = new Doctor("Samuel","Castro","Masculino","21310424","Loro Huasi",1313,esp7);        
        Doctor doc21 = new Doctor("Patricia","Lobo","Femenino","37967984","Los Andes",6754,esp7);
        Doctor doc22 = new Doctor("Graciela","Castro","Femenino","2598354","El Alto", 6568, esp7);
                
        Doctor doc23 = new Doctor("Eduardo","Gomez","Masculino","3850498","El Alto", 7637, esp8);
        Doctor doc24 = new Doctor("Alicia","Bustamante","Femenino","385056","Los Altos", 5634, esp8);
        Doctor doc25 = new Doctor("Lucas","Aredes","Masculin","38545548","Valle Viejo", 3639, esp8);
        
        Doctor doc26 = new Doctor("Samuela","Castro","Masculino","21310424","Loro Huasi",1613,esp9);        
        Doctor doc27 = new Doctor("Patricio","Lobo","Femenino","37967984","Los Andes",6844,esp9);
        Doctor doc28 = new Doctor("Graciela","Castro","Femenino","2598354","El Alto", 6595, esp9);
        
        
        
        
        
      /* Paciente pac = new Paciente("Ruth","Cruz","Femenino","39805640","Centro",28,10,1996);
        Paciente pac2 = new Paciente("Carlos","Cancinos","Masculino","39273344","Lampacito",15,12,1995);
        */
      
      
        esp.setHabitacion(h2);
        esp.setHabitacion(h);
        esp.setDoctor(doc);
        esp.setDoctor(doc2);
        esp2.setHabitacion(h3);
        esp2.setHabitacion(h4);
        esp3.setHabitacion(h5);
        esp3.setHabitacion(h6);
        esp2.setDoctor(doc3);
        esp2.setDoctor(doc4);
        esp3.setDoctor(doc5);
        esp3.setDoctor(doc6);
        
        esp4.setHabitacion(h7);
        esp4.setHabitacion(h8);
        esp4.setHabitacion(h9);
        esp4.setHabitacion(h10);
        esp4.setHabitacion(h11);
        esp4.setDoctor(doc11);
        esp4.setDoctor(doc12);
        esp4.setDoctor(doc13);
        
        esp5.setHabitacion(h12);
        esp5.setHabitacion(h13);
        esp5.setHabitacion(h15);
        esp5.setHabitacion(h15);
        esp5.setHabitacion(h16);
        esp5.setDoctor(doc14);
        esp5.setDoctor(doc15);
        esp5.setDoctor(doc16);
        
        esp6.setHabitacion(h17);
        esp6.setHabitacion(h18);
        esp6.setHabitacion(h19);
        esp6.setHabitacion(h20);
        esp6.setHabitacion(h21);
        esp6.setDoctor(doc17);
        esp6.setDoctor(doc18);
        esp6.setDoctor(doc19);
        
        
        esp7.setHabitacion(h22);
        esp7.setHabitacion(h23);
        esp7.setHabitacion(h24);
        esp7.setHabitacion(h25);
        esp7.setHabitacion(h26);
        esp7.setDoctor(doc20);
        esp7.setDoctor(doc21);
        esp7.setDoctor(doc22);
        
        esp8.setHabitacion(h27);
        esp8.setHabitacion(h28);
        esp8.setHabitacion(h29);
        esp8.setHabitacion(h30);
        esp8.setHabitacion(h31);
        esp8.setDoctor(doc23);
        esp8.setDoctor(doc24);
        esp8.setDoctor(doc25);
        
      
        esp9.setHabitacion(h32);
        esp9.setHabitacion(h33);
        esp9.setHabitacion(h34);
        esp9.setHabitacion(h35);
        esp9.setHabitacion(h36);
        esp9.setHabitacion(h37);
        esp9.setHabitacion(h38);
        esp9.setHabitacion(h39);
        esp9.setHabitacion(h40);
        esp9.setHabitacion(h41);
        esp9.setDoctor(doc26);
        esp9.setDoctor(doc27);
        esp9.setDoctor(doc28);
      
        
        
        
        
        
        
        
        
       /* doc.setPaciente(pac);
        doc.setPaciente(pac2);
        h.añadirPacienteACama(pac, 0);
        h.añadirPacienteACama(pac2, 2);*/ 
       // pac.setPacienteAtendido(doc2, esp, d);
        
        //System.out.println("Mostrar : "+doc.getPaciente("21342424"));          
        //System.out.println(pac.getPacienteAtendido());        
        //System.out.println(doc.pacientesAsignados());        
        //h.getCamasLibre();        
        //System.out.println(doc2.pacientesAsignados());
        //System.out.println("Consulta cama: "+h.getCama(2));        
        //System.out.println(esp+esp.getDoctores()+esp.getHabitacion());
        //esp.estadoEspecialidad();
        //System.out.println(pac.getHabitacion().getCama(pac.getDni()));
        
        Clinica clinica = new Clinica();
       // clinica.setDiagnosticos(d);
        clinica.setDoctores(doc);
        clinica.setDoctores(doc2);
        clinica.setDoctores(doc3);
        clinica.setDoctores(doc4);
        clinica.setDoctores(doc5);
        clinica.setDoctores(doc6);
        clinica.setDoctores(doc7);
        clinica.setDoctores(doc8);
        clinica.setDoctores(doc9);
        clinica.setDoctores(doc11);
        clinica.setDoctores(doc12);
        clinica.setDoctores(doc13);
        clinica.setDoctores(doc14);
        clinica.setDoctores(doc15);
        clinica.setDoctores(doc16);
        clinica.setDoctores(doc17);
        clinica.setDoctores(doc18);
        clinica.setDoctores(doc19);
        clinica.setDoctores(doc20);
        clinica.setDoctores(doc21);
        clinica.setDoctores(doc22);
        clinica.setDoctores(doc23);
        clinica.setDoctores(doc24);
        clinica.setDoctores(doc25);
        clinica.setDoctores(doc26);
        clinica.setDoctores(doc27);
        clinica.setDoctores(doc28);
   
        
      
        clinica.setHabitaciones(h);
        clinica.setHabitaciones(h2);
        clinica.setHabitaciones(h3);
        clinica.setHabitaciones(h4);
        clinica.setHabitaciones(h5);
        clinica.setHabitaciones(h6);
        clinica.setHabitaciones(h7);
        clinica.setHabitaciones(h8);
        clinica.setHabitaciones(h9);
        clinica.setHabitaciones(h10);
        clinica.setHabitaciones(h11);
        clinica.setHabitaciones(h12);
        clinica.setHabitaciones(h13);
        clinica.setHabitaciones(h14);
        clinica.setHabitaciones(h15);
        clinica.setHabitaciones(h16);
        clinica.setHabitaciones(h17);
        clinica.setHabitaciones(h18);
        clinica.setHabitaciones(h19);
        clinica.setHabitaciones(h20);
        clinica.setHabitaciones(h21);
        clinica.setHabitaciones(h22);
        clinica.setHabitaciones(h23);
        clinica.setHabitaciones(h24);
        clinica.setHabitaciones(h25);
        clinica.setHabitaciones(h26);
        clinica.setHabitaciones(h27);
        clinica.setHabitaciones(h28);
        clinica.setHabitaciones(h29);
        clinica.setHabitaciones(h30);
        clinica.setHabitaciones(h31);
        clinica.setHabitaciones(h32);
        clinica.setHabitaciones(h33);
        clinica.setHabitaciones(h34);
        clinica.setHabitaciones(h35);
        clinica.setHabitaciones(h36);
        clinica.setHabitaciones(h37);
        clinica.setHabitaciones(h38);
        clinica.setHabitaciones(h39);
        clinica.setHabitaciones(h40);
        clinica.setHabitaciones(h41);

        
        clinica.setEspecialidades(esp);
        clinica.setEspecialidades(esp2);
        clinica.setEspecialidades(esp3);
        clinica.setEspecialidades(esp4);
        clinica.setEspecialidades(esp5);
        clinica.setEspecialidades(esp6);
        clinica.setEspecialidades(esp7);
        clinica.setEspecialidades(esp8);
        clinica.setEspecialidades(esp9);
        
        MenuPrincipal menu = new MenuPrincipal(clinica);
        menu.setVisible(true);
        //System.out.println(clinica.getDoctores());
    }
    
}
