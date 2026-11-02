
package agenda;
import Vistas.Loggin;
import Modelos.Modelo_agenda;
import Controladores.Controlador_agenda;

public class Agenda {

    public static void main(String[] args) {
       Loggin lg = new Loggin();
       Modelo_agenda model = new Modelo_agenda();
       
       Controlador_agenda controlador = new Controlador_agenda(model, lg);
       lg.setVisible(true);
    
    }
}