import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;

public class gestor {

    public gestor() {

        interfaz crear_interfaz = new interfaz() {

            @Override
            public void actionPerformed(ActionEvent e) {

                //Variables de instancia para hacer los calculos
                double num1,num2;

                String val_1 = "", val_2 = "";

                int tipo1 = combo_div1.getSelectedIndex();

                int tipo2 = combo_div2.getSelectedIndex();

                if(e.getSource() == cambio) {

                    val_1 = field_1.getText()+1;
                    val_2 = field_2.getText()+1;

                    num1 = Double.parseDouble(val_1);
                    num2 = Double.parseDouble(val_2);

                    calculadora cal_cambio = new calculadora(num1, num2, tipo1, tipo2);

                    String total = String.valueOf(cal_cambio.resultado);
                    resultado.setText("total");

                }

            }
        };

        crear_interfaz.setVisible(true);

    }

}
