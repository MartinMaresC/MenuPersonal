import javax.swing.*;
import java.io.IOException;
import java.util.Scanner;

import static javax.swing.JOptionPane.*;

public class MenuPersonal extends  formAltas{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        boolean ex = false;
        int select;
        while(!ex) {

            select = Integer.parseInt(showInputDialog("Seleccione una opción: \n"
            +"1. Altas en Personal \n"
            +"2. Bajas en Personal\n"
            +"3. Cambios en Personal\n"
            +"4. Salir"));

            switch(select){
                case 1:
                    try {
                        altasPersonal();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 2:
                    System.out.println("Menú bajas");
                    break;
                case 3:
                    System.out.println("Menú cambios");
                    break;
                case 4:
                    System.out.println("Good bye!");
                    ex =true;
                    break;
                default:
                    System.out.print("Elije un número del 1 al 4");
            }
        }


    } // Termina clase main

    public static void altasPersonal() throws IOException {
        /*File path = new File("altasEnPersonal.txt");
        JOptionPane.showMessageDialog(null, "Los datos se guardaran en: "+path);

        OutputStream outputStream = Files.newOutputStream(path.toPath());*/

        formAltas principal= new formAltas();
        principal.setVisible(true);
        principal.setBounds(10,20,300,200);
        principal.setVisible(true);
        principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);





    }


}
