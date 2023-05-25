import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.*;

public abstract class interfaz extends JFrame implements ActionListener {

    // objetos gráficos
    public JTextField campo1, campo2; //campos de texto
    public JButton cambio; //botón pr realizar el cambio

    public JComboBox<String> combo_div1; //combo para la divisa 1
    public JComboBox<String> combo_div2; //combo para la divisa 2

    public interfaz() {
        configurarVentana();
        iniciarComponentes();
    }

    private void configurarVentana() {
        setTitle("Calculadora de divisas");  // Título de la entana
        setSize(640, 480); // Tamaño de la ventana
        setLocationRelativeTo(null); // Centramos la ventana en la pantalla
        setLayout(null); // No se usa ningun layout
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void iniciarComponentes() {
        /*Labels de texto*/

        // Label de Título
        JLabel titulo = new JLabel("Calculadora de divisas"); //texto
        titulo.setBounds(40, 40, 826, 40); //medidas y coordenadas
        titulo.setFont(new Font("Sans", Font.BOLD, 50)); //opciones de fuente
        add(titulo); //se añade el label

         /*Campos de texto*/

        //Text field de valor 1
        campo1 = new JTextField();
        campo1.setBounds(350, 152, 100, 28);
        campo1.setFont(new Font("Arial", Font.PLAIN, 25)); //modificador de fuente
        campo1.setText("0.0"); //valor inicial
        add(campo1);

        //Text field de resultado
        campo2 = new JTextField();
        campo2.setBounds(350, 252, 100, 28);
        campo2.setFont(new Font("Arial", Font.PLAIN, 25)); //modificador de fuente
        campo2.setEditable(false); //campo no editable
        campo2.setText("0.0"); //valor inicial
        add(campo2);

        // Buttons

        //Botón para hacer el cambio de divisa
        cambio = new JButton("Convertir");
        cambio.setBounds(270, 310, 100, 50);
        add(cambio);
        cambio.addActionListener(this); //listener


        /*Combo para divisas*/

        //Divisa 1
        combo_div1 = new JComboBox<>(); //crea el combo

        combo_div1.setBounds(150,150,140,35); //modificador de tamaño
        combo_div1.setFont(new Font("Corbel", Font.BOLD, 30)); //modificador de fuente

        //Añadimos las 3 divisas
        combo_div1.addItem("MXN");
        combo_div1.addItem("USD");
        combo_div1.addItem("EUR");

        add(combo_div1); //se muestra el combo

        //Divisa 2
        combo_div2 = new JComboBox<>(); //crea el combo

        combo_div2.setBounds(150,250,140,35); //modificador de tamaño
        combo_div2.setFont(new Font("Corbel", Font.BOLD, 30)); //modificador de fuente

        //Añadimos las 3 divisas
        combo_div2.addItem("MXN");
        combo_div2.addItem("USD");
        combo_div2.addItem("EUR");

        add(combo_div2); //se muestra el combo

    }

}
