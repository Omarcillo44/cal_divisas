import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;

public class gestor {

    public gestor() {

        interfaz crear_interfaz = new interfaz() {

            @Override
            public void actionPerformed(ActionEvent e) {

                //Variables de instancia para hacer los calculos
                double num1,num2;

                if(e.getSource() == cambio) {

                    int tipo1 = combo_div1.getSelectedIndex()+1;

                    int tipo2 = combo_div2.getSelectedIndex()+1;

                    String val_1 = "", val_2 = "";

                    val_1 = field_1.getText();

                    num1 = Double.parseDouble(val_1);

                    calculadora cal_cambio = new calculadora();

                    double xd = cal_cambio.ekisde(num1, tipo1, tipo2);

                    String nya = Double.toString(xd);

                    resultado.setText(nya);

                }


            }
        };

        crear_interfaz.setVisible(true);

    }

}
