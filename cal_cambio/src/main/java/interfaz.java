import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import javax.swing.*;

public abstract class interfaz extends JFrame implements ActionListener {

    // objetos graficos
    public JTextField field_1, field_2, resultado;
    public JButton restar, cambio, multiplicar, dividir, cerrar;

    public JComboBox combo_div1, combo_div2;

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

        //Text field de operando 2
        field_2 = new JTextField();
        field_2.setBounds(150, 160, 100, 20);
        add(field_2);

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
        cambio = new JButton("Sumar");
        cambio.setBounds(450, 160, 100, 50);
        add(cambio);
        cambio.addActionListener(this); //listener

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
        cerrar.setBounds(450, 340, 100, 50);
        add(cerrar);
        cerrar.addActionListener(this);

        /*Combo para divisas*/

        //Divisa 1
        int x_divisa1 = 120; //coordenada x
        int y_divisa1 = 150; //coordenada y
        nuevoCombo(combo_div1, x_divisa1, y_divisa1); //se crea el combo

        //Divisa 2
        int x_divisa2 = 120;
        int y_divisa2 = 250;
        nuevoCombo(combo_div2, x_divisa2, y_divisa2);

    }

    public void nuevoCombo (JComboBox combo, int x, int y){

        combo = new JComboBox<String>(); //crea el combo

        combo.setBounds(x,y,140,35); //modificador de tamaño

        combo.setFont(new Font("Corbel", Font.CENTER_BASELINE, 30)); //modificador de fuente

        //Añadimos las 3 divisas
        combo.addItem("MXN");
        combo.addItem("USD");
        combo.addItem("EUR");

        add(combo); //se muestra el combo

    }

}
