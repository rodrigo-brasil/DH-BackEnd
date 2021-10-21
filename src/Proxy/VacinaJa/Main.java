package Proxy.VacinaJa;

import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        //Data e hora de agendamento
        int year = 2021;
        int month = 10;
        int day = 10;
        Calendar calendar = Calendar.getInstance();
        calendar.set(year,month-1,day);
        Date date = calendar.getTime();

        //Agendamento e Registro da vacina
        Pessoa pessoa = new Pessoa("Wheslley","Rimar", "987654321","CoronaVac", date);
        IRegistro registro = new RegistroVacinaProxy();
        registro.registrar(pessoa.dados());
    }
}
