import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class calculadora_swing extends JFrame implements ActionListener{

    //Variables de instancia para hacer los calculos
    private int num1;
    private int num2;
    private float res;

    // objetos graficos
    private JTextField operando1, operando2, resultado;
    private JButton restar, sumar, multiplicar, dividir, cerrar;
    private JLabel titulo, num1Txt, num2Txt, result;
    public calculadora_swing(){
        configurarVentana();
        iniciarComponentes();
    }
    private void configurarVentana(){
        setTitle("MI PRIMER CALCULADORA");  // Titulo de la entana
        setSize(650, 500);                  // Tamaño de la ventana
        setLocationRelativeTo(null);        // Centramos la ventana en la pantalla
        setLayout(null);            // No se usa ningun layout
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void iniciarComponentes(){

        /*Labels de texto*/

        // Label de Título
        titulo = new JLabel("Calculadora Super Básica"); //texto
        titulo.setBounds(230, 40, 300, 30); //medidas y coordenadas
        titulo.setFont(new Font("TimesRoman", Font.BOLD, 18)); //opciones de fuente
        add(titulo); //se añade el label

        // Label de Número 1
        num1Txt = new JLabel("Primer número: ");
        num1Txt.setBounds(40, 120, 200, 30);
        add(num1Txt); //se añade el label

        // Label de Número 2
        num2Txt = new JLabel("Segundo numero: ");
        num2Txt.setBounds(40, 160, 200, 30);
        add(num2Txt);

        //Label de Resultado
        result = new JLabel("Resultado: ");
        result.setBounds(40, 200, 200, 30);
        add(result);

        /*Campos de texto*/

        //Text field de operando 1
        operando1 = new JTextField();
        operando1.setBounds(150, 120, 100, 20);
        add(operando1);

        //Text field de operando 2
        operando2 = new JTextField();
        operando2.setBounds(150, 160, 100, 20);
        add(operando2);

        //Text field de resultado
        resultado = new JTextField();
        resultado.setBounds(150, 200, 100, 20);
        add(resultado);

        // Buttons

        //Botón Restar
        restar = new JButton("Restar");
        restar.setBounds(450, 100, 100, 50);
        add(restar);
        restar.addActionListener(this); //listener

        //Botón sumar
        sumar = new JButton("Sumar");
        sumar.setBounds(450, 160, 100, 50);
        add(sumar);
        sumar.addActionListener(this); //listener

        //Botón multiplicar
        multiplicar = new JButton("Multiplicar");
        multiplicar.setBounds(450, 220, 100, 50);
        add(multiplicar);
        multiplicar.addActionListener(this); //listener

        //Botón dividir
        dividir = new JButton("Dividir");
        dividir.setBounds(450, 280, 100, 50);
        add(dividir);
        dividir.addActionListener(this); //listener

        //Botón cerrar
        cerrar = new JButton("Cerrar");
        cerrar.setBounds(450, 340, 100 ,50);
        add(cerrar);
        cerrar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e){

        String oper1 = "", oper2 = "", total = "";

        if(e.getSource() == sumar){
            oper1 = operando1.getText();
            oper2 = operando2.getText();
            num1 = Integer.parseInt(oper1);
            num2 = Integer.parseInt(oper2);
            res = num1 + num2;
            total = String.valueOf(res);
            resultado.setText(total);
        }
    }
}
