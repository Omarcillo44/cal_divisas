import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

public abstract class interfaz extends JFrame implements ActionListener {

    // objetos graficos
    public JTextField field_1, field_2, resultado;
    public JButton restar, cambio, multiplicar, dividir, cerrar;

    public JComboBox<String> combo_div1;
    public JComboBox<String> combo_div2;

    private JLabel titulo, num1Txt, num2Txt, result;

    public interfaz() {
        configurarVentana();
        iniciarComponentes();
    }

    private void configurarVentana() {
        setTitle("Calculadora de divisas");  // Título de la entana
        setSize(640, 480);                  // Tamaño de la ventana
        setLocationRelativeTo(null);        // Centramos la ventana en la pantalla
        setLayout(null);            // No se usa ningun layout
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void iniciarComponentes() {
        /*Labels de texto*/

        // Label de Título
        titulo = new JLabel("Calculadora de divisas"); //texto
        titulo.setBounds(40, 40, 826, 40); //medidas y coordenadas
        titulo.setFont(new Font("Sans", Font.BOLD, 50)); //opciones de fuente
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
        field_1 = new JTextField();
        field_1.setBounds(150, 120, 100, 20);
        add(field_1);

        //Text field de resultado
        resultado = new JTextField();
        resultado.setBounds(150, 200, 100, 20);
        add(resultado);

        // Buttons

        //Botón sumar
        cambio = new JButton("Sumar");
        cambio.setBounds(450, 160, 100, 50);
        add(cambio);
        cambio.addActionListener(this); //listener


        /*Combo para divisas*/

        //Divisa 1
        combo_div1 = new JComboBox<String>(); //crea el combo

        combo_div1.setBounds(120,150,140,35); //modificador de tamaño
        combo_div1.setFont(new Font("Corbel", Font.BOLD, 30)); //modificador de fuente

        //Añadimos las 3 divisas
        combo_div1.addItem("MXN");
        combo_div1.addItem("USD");
        combo_div1.addItem("EUR");

        add(combo_div1); //se muestra el combo

        //Divisa 2
        combo_div2 = new JComboBox<String>(); //crea el combo

        combo_div2.setBounds(120,250,140,35); //modificador de tamaño
        combo_div2.setFont(new Font("Corbel", Font.BOLD, 30)); //modificador de fuente

        //Añadimos las 3 divisas
        combo_div2.addItem("MXN");
        combo_div2.addItem("USD");
        combo_div2.addItem("EUR");

        add(combo_div2); //se muestra el combo

    }

}
