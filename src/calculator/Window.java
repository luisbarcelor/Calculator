package calculator;

import java.awt.event.ActionListener;

public class Window {
    private JFrame ventana;
    private JPanel[] paneles;
    private JButton[] botones;
    private JTextField textField;

    public Window(String title) {
        startWindow(title);
        addListener(new MyListener());
    }

    public void startWindow(String title) { //Crear ventana y paneles
        paneles = new JPanel[6];
        ventana = new JFrame(title);
        paneles[0] = new JPanel(new FlowLayout());
        paneles[1] = new JPanel();
        paneles[2] = new JPanel(null);
        paneles[3] = new JPanel(); //PINK
        paneles[4] = new JPanel(); //YELLOW
        paneles[5] = new JPanel(); //BLUE

        ventana.getContentPane().setLayout(new BorderLayout());

        paneles[0].setPreferredSize(new Dimension(500, 110));
        //paneles[0].setBackground(Color.CYAN);

        paneles[1].setPreferredSize(new Dimension(110, 450));
        //paneles[1].setBackground(Color.RED);

        paneles[2].setPreferredSize(new Dimension(400,450));
        //paneles[2].setBackground(Color.GREEN);

        paneles[3].setBounds(5, 0, 290, 220);
        //paneles[3].setBackground(Color.PINK);

        paneles[4].setBounds(295, 0, 90, 280);
        //paneles[4].setBackground(Color.PINK);

        paneles[5].setBounds(5, 220, 290, 60);
        //paneles[5].setBackground(Color.PINK);

        for (int i = 0; i < paneles.length; i++) {
            paneles[i].setOpaque(false);
        }

        ventana.add(paneles[0], BorderLayout.NORTH);
        ventana.add(paneles[1], BorderLayout.EAST);
        ventana.add(paneles[2], BorderLayout.CENTER);
        paneles[2].add(paneles[3]);
        paneles[2].add(paneles[4]);
        paneles[2].add(paneles[5]);

        addComponents(); //Añadir componentes (botones, etc...)

        //Mostrar la ventana
        ventana.setResizable(false);
        ventana.getContentPane().setBackground(new Color(0, 170, 19));
        ventana.setBounds(450, 30, 500, 450);
        ventana.setIconImage(obtenerIcono());
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }

    public void addComponents() {  //Agregar componentes a paneles
        textField = new JTextField("0");
        botones = new JButton[22];

        textField.setPreferredSize(new Dimension(490, 85));
        textField.setFont(new Font("Palatino", Font.BOLD, 36));
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        textField.setCaretColor(Color.WHITE);

        //Bucles para agregar botones a cada panel especifico
        for (int i = 0; 12 > i; i++) {
            botones[i] = new JButton("B");
            botones[i].setPreferredSize(new Dimension(90, 50));
            paneles[3].add(botones[i]);
        }

        for (int i = 12; 14 > i; i++) {
            botones[i] = new JButton("B");
            botones[i].setPreferredSize(new Dimension(90, 50));
            paneles[5].add(botones[i]);
        }

        for (int i = 14; 17 > i; i++) {
            botones[i] = new JButton("B");
            botones[i].setPreferredSize(new Dimension(90, 50));
            paneles[4].add(botones[i]);
        }

        for (int i = 17; 22 > i; i++) {
            botones[i] = new JButton("B");
            botones[i].setPreferredSize(new Dimension(90, 50));
            paneles[1].add(botones[i]);
        }

        for (int i = 0; i < botones.length; i++) {
            botones[i].setText(Calculadora.CALC_CARACTERES[i]);
            botones[i].setFont(new Font("Palatino", Font.BOLD, 16));
        }

        //Cambiar tamaño algunos botones
        botones[15].setPreferredSize(new Dimension(90, 105));
        botones[16].setPreferredSize(new Dimension(90, 105));
        botones[12].setPreferredSize(new Dimension(185, 50));

        paneles[0].add(textField);
    }

    public void addListener(ActionListener a) { // Agrega listener a botones[]
            for (int i = 0; i < botones.length; i++) {
                botones[i].addActionListener(a);
            }
    }
    public Image obtenerIcono() { //Agregar icono a JFrame
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        return toolkit.getImage("/home/barcelo/Downloads/calculadora.png");
    }
}
