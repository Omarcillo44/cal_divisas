import java.awt.event.ActionEvent;
import java.text.DecimalFormat;

public class gestor {

    //Variables para guardar el valor de los campos de texto
    double num1;
    String val_1 = "";

    public gestor() {

        interfaz crear_interfaz = new interfaz() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if(e.getSource() == cambio) {

                    //Se obtiene el índice actual de los combos
                    int tipo1 = combo_div1.getSelectedIndex()+1;
                    int tipo2 = combo_div2.getSelectedIndex()+1;

                    //Se obtiene el contenido de los campos de texto
                    val_1 = campo1.getText();

                    //El contenido se pasa a double
                    num1 = Double.parseDouble(val_1);

                    //Se instancia la clase calculadora
                    calculadora cal_cambio = new calculadora();

                    //Se llama al objeto calculadora de cambio
                    double valor_conv = cal_cambio.conversor(num1, tipo1, tipo2);

                    //Se genera un formato par limitar los decimales de salida
                    DecimalFormat dec_form = new DecimalFormat("0.0000");


                    //El valor convertido se pasa a String
                    String resultado = Double.toString(Double.parseDouble(dec_form.format(valor_conv)));

                    //El resultado es colocado en el campo correspondiente
                    this.campo2.setText(resultado);
                }
            }
        };

        crear_interfaz.setVisible(true);

    }

}
