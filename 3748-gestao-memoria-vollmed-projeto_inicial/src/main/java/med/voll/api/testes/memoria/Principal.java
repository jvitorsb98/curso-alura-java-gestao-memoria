package med.voll.api.testes.memoria;

import med.voll.api.domain.paciente.Paciente;
import org.springframework.security.core.parameters.P;

public class Principal {

    public static void main(String[] args) {
        Paciente paciente = new Paciente();
        System.out.println(paciente.consultas());

        Paciente paciente2 = new Paciente();

        System.out.println(paciente == paciente2);
        paciente2 = paciente;
        System.out.println(paciente == paciente2);


    }

}
