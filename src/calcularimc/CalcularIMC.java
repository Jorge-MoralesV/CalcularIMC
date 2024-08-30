package calcularimc;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Objects;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class CalcularIMC extends JFrame implements ActionListener {

    private final JLabel resedad;
    private final JLabel ressexo;
    private final JLabel respeso;
    private final JLabel resaltura;
    private final JLabel resimc;
    private final JLabel resbmr;
    private final JLabel resestado;
    private final JLabel resaccion;
    private final JLabel rescondicion;
    private final JLabel imagen;
    private final JTextField textEdad;
    private final JTextField textPeso;
    private final JTextField textAltura;
    private final JRadioButton radioM;
    private final JRadioButton radioF;
    private final JComboBox comboActividad;
    private final JButton calcular;

    public CalcularIMC() {

        setLayout(null);

        setTitle("Calculadora de IMC");

        setIconImage(new ImageIcon(Objects.requireNonNull(getClass().getResource("../recursos/logo.png"))).getImage());

        JLabel nombre = new JLabel("Calculadora de IMC:");
        nombre.setBounds(535, 22, 300, 80);
        Font auxFont = nombre.getFont();
        nombre.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 30));
        add(nombre);

//Llenar informacion---------------------------------------------------------
        JPanel pnl1 = new JPanel();
        pnl1.setBorder(BorderFactory.createTitledBorder("Llenar datos"));
        pnl1.setBounds(34, 35, 430, 240);
        pnl1.setBackground(new Color(242, 242, 242));
        pnl1.setLayout(null);
        add(pnl1);

        JLabel datedad = new JLabel("Edad:");
        datedad.setBounds(12, 25, 48, 27);
        pnl1.add(datedad);

        JLabel datpeso = new JLabel("Peso:");
        datpeso.setBounds(220, 25, 45, 27);
        pnl1.add(datpeso);

        JLabel dataltura = new JLabel("Altura (cm):");
        dataltura.setBounds(12, 92, 101, 27);
        pnl1.add(dataltura);

        JLabel datsexo = new JLabel("Sexo:");
        datsexo.setBounds(220, 92, 46, 27);
        pnl1.add(datsexo);

        JLabel datactfisica = new JLabel("Actividad física:");
        datactfisica.setBounds(12, 158, 136, 27);
        pnl1.add(datactfisica);

        textEdad = new JTextField();
        textEdad.setBounds(12, 52, 190, 25);
        pnl1.add(textEdad);

        textPeso = new JTextField();
        textPeso.setBounds(220, 52, 190, 25);
        pnl1.add(textPeso);

        textAltura = new JTextField();
        textAltura.setBounds(12, 118, 190, 25);
        pnl1.add(textAltura);

        ButtonGroup groupSexo = new ButtonGroup();

        radioF = new JRadioButton("Femenino");
        radioF.setBounds(220, 120, 100, 20);
        pnl1.add(radioF);
        groupSexo.add(radioF);

        radioM = new JRadioButton("Masculino");
        radioM.setBounds(316, 120, 100, 20);
        pnl1.add(radioM);
        groupSexo.add(radioM);

        comboActividad = new JComboBox();
        comboActividad.setBounds(12, 185, 190, 30);
        for (String s : Arrays.asList("", "Sedentarismo", "Ligero", "Moderado", "Alto", "Intenso")) {
            comboActividad.addItem(s);
        }
        pnl1.add(comboActividad);

        calcular = new JButton("Calcular");
        calcular.setBounds(240, 175, 150, 50);
        pnl1.add(calcular);
        calcular.addActionListener(this);

        imagen = new JLabel();
        add(imagen);

//------------------------------------------------------------------------
//Informacion-------------------------------------------------------------
        JPanel pnl2 = new JPanel();
        pnl2.setBorder(BorderFactory.createTitledBorder("Información"));
        pnl2.setBounds(34, 290, 430, 320);
        pnl2.setBackground(new Color(149, 178, 193));
        pnl2.setLayout(null);
        add(pnl2);

        JLabel infedad = new JLabel("Edad:");
        infedad.setBounds(15, 21, 48, 27);
        pnl2.add(infedad);

        JLabel infpeso = new JLabel("Sexo:");
        infpeso.setBounds(15, 58, 45, 27);
        pnl2.add(infpeso);

        JLabel infaltura = new JLabel("Peso:");
        infaltura.setBounds(15, 95, 45, 27);
        pnl2.add(infaltura);

        JLabel infsexo = new JLabel("Altura:");
        infsexo.setBounds(15, 132, 57, 27);
        pnl2.add(infsexo);

        JLabel infimc = new JLabel("IMC:");
        infimc.setBounds(15, 169, 40, 27);
        pnl2.add(infimc);

        JLabel infbmr = new JLabel("BMR:");
        infbmr.setBounds(15, 206, 45, 27);
        pnl2.add(infbmr);

        JLabel infestado = new JLabel("Actividad:");
        infestado.setBounds(15, 243, 63, 27);
        pnl2.add(infestado);

        JLabel infaccion = new JLabel("Acción:");
        infaccion.setBounds(15, 280, 64, 27);
        pnl2.add(infaccion);

//------------------------------------------------------------------------        
//Resultados--------------------------------------------------------------
        resedad = new JLabel();
        resedad.setBounds(86, 21, 100, 27);
        pnl2.add(resedad);

        ressexo = new JLabel();
        ressexo.setBounds(86, 58, 100, 27);
        pnl2.add(ressexo);

        respeso = new JLabel();
        respeso.setBounds(86, 95, 100, 27);
        pnl2.add(respeso);

        resaltura = new JLabel();
        resaltura.setBounds(86, 132, 100, 27);
        pnl2.add(resaltura);

        resimc = new JLabel();
        resimc.setBounds(86, 169, 100, 27);
        pnl2.add(resimc);

        resbmr = new JLabel();
        resbmr.setBounds(86, 206, 100, 27);
        pnl2.add(resbmr);

        rescondicion = new JLabel();
        rescondicion.setBounds(86, 243, 200, 27);
        pnl2.add(rescondicion);

        resaccion = new JLabel();
        resaccion.setBounds(86, 280, 200, 27);
        pnl2.add(resaccion);

        resestado = new JLabel();
        add(resestado);

//------------------------------------------------------------------------
    }

    public static void main(String[] args) {
        CalcularIMC obj = new CalcularIMC();
        obj.setSize(880, 680);
        obj.getContentPane().setBackground(new Color(0, 118, 252));
        obj.setVisible(true);
        obj.setLocationRelativeTo(null);
        obj.setResizable(false);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //------------------------------------------------------------------------
    public void setInf() {
        String sexo;
        String edad = textEdad.getText();
        resedad.setText(edad + " años.");

        String peso = textPeso.getText();
        respeso.setText(peso + " kg.");

        String altura = textAltura.getText();
        resaltura.setText(altura + " cm.");

        if (radioF.isSelected()) {
            sexo = "Femenino.";
            ressexo.setText(sexo);
        } else if (radioM.isSelected()) {
            sexo = "Masculino.";
            ressexo.setText(sexo);
        }

        calIMC(textPeso, textAltura);

        calBMR(textPeso, textAltura, textEdad);
    }

    public void Actividad(JComboBox comboActividad) {
        String actividad = (String) comboActividad.getSelectedItem();
        if (actividad.equalsIgnoreCase("Sedentarismo")) {
            rescondicion.setText(actividad + ".");
        } else if (actividad.equalsIgnoreCase("Ligero")) {
            rescondicion.setText(actividad + ".");
        } else if (actividad.equalsIgnoreCase("Moderado")) {
            rescondicion.setText(actividad + ".");
        } else if (actividad.equalsIgnoreCase("Alto")) {
            rescondicion.setText(actividad + ".");
        } else if (actividad.equalsIgnoreCase("Intenso")) {
            rescondicion.setText(actividad + ".");
        }
    }

    public void calIMC(JTextField textPeso, JTextField textAltura) {

        int peso = Integer.parseInt(textPeso.getText());
        int altura = Integer.parseInt(textAltura.getText());

        double imc = peso / Math.pow((altura * 0.01), 2);
        double imc2 = Math.round(imc * 100.0) / 100.0;

        String cadimc = String.valueOf(imc2);

        resimc.setText(cadimc + ".");

        statusIMC(imc);

    }

    public void statusIMC(double imc) {
        ImageIcon imagenimc;
        if (imc < 18.50) {

            resestado.setText("¡Estás debajo de tu IMC ideal!");
            resestado.setBounds(510, 577, 332, 33);
            imagenimc = new ImageIcon(Objects.requireNonNull(getClass().getResource("../recursos/delgado.png")));
            imagen.setBounds(506, 117, 340, 430);
            imagen.setIcon(imagenimc);
            Font auxFont = resestado.getFont();
            resestado.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 20));
            resestado.setForeground(Color.YELLOW);
            resaccion.setText("Subir de peso.");

        } else if (imc > 18.50 && imc < 24.90) {
            resestado.setText("Estás en un IMC ideal.");
            resestado.setBounds(556, 577, 240, 33);
            imagenimc = new ImageIcon(Objects.requireNonNull(getClass().getResource("../recursos/normal.png")));
            imagen.setBounds(506, 117, 340, 430);
            imagen.setIcon(imagenimc);
            Font auxFont = resestado.getFont();
            resestado.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 20));
            resestado.setForeground(Color.GREEN);
            resaccion.setText("Mantener el peso.");

        } else if (imc > 25.00 && imc < 29.90) {
            resestado.setText("Tienes sobrepeso.");
            resestado.setBounds(577, 577, 198, 33);
            imagenimc = new ImageIcon(Objects.requireNonNull(getClass().getResource("../recursos/sobrepeso.png")));
            imagen.setBounds(506, 117, 340, 430);
            imagen.setIcon(imagenimc);
            Font auxFont = resestado.getFont();
            resestado.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 20));
            resestado.setForeground(Color.YELLOW);
            resaccion.setText("Bajar de peso.");

        } else if (imc > 30.00 && imc < 34.90) {
            resestado.setText("¡Tienes obesidad I!");
            resestado.setBounds(573, 577, 206, 33);
            imagenimc = new ImageIcon(Objects.requireNonNull(getClass().getResource("../recursos/sobrepeso.png")));
            imagen.setBounds(506, 117, 340, 430);
            imagen.setIcon(imagenimc);
            Font auxFont = resestado.getFont();
            resestado.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 20));
            resestado.setForeground(new Color(255, 196, 0));
            resaccion.setText("Bajar de peso.");

        } else if (imc > 35.00 && imc < 40.00) {
            resestado.setText("¡¡Tienes obesidad II!!");
            resestado.setBounds(563, 577, 226, 33);
            imagenimc = new ImageIcon(Objects.requireNonNull(getClass().getResource("../recursos/sobrepeso.png")));
            imagen.setBounds(506, 117, 340, 430);
            imagen.setIcon(imagenimc);
            Font auxFont = resestado.getFont();
            resestado.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 20));
            resestado.setForeground(new Color(255, 128, 0));
            resaccion.setText("Bajar de peso.");

        } else {
            resestado.setText("¡¡¡Tienes obesidad III!!!");
            resestado.setBounds(552, 577, 248, 33);
            imagenimc = new ImageIcon(Objects.requireNonNull(getClass().getResource("../recursos/sobrepeso.png")));
            imagen.setBounds(506, 117, 340, 430);
            imagen.setIcon(imagenimc);
            Font auxFont = resestado.getFont();
            resestado.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 20));
            resestado.setForeground(new Color(255, 0, 0));
            resaccion.setText("Bajar mucho de peso.");
        }
    }

    public void calBMR(JTextField textPeso, JTextField textAltura, JTextField textEdad) {

        String bmr;
        int peso = Integer.parseInt(textPeso.getText());
        int altura = Integer.parseInt(textAltura.getText());
        int edad = Integer.parseInt(textEdad.getText());

        if (radioM.isSelected()) {
            double bmrM = ((10 * peso) + (6.25 * altura) - (5 * edad) + 5);
            bmr = String.valueOf(bmrM);
            resbmr.setText(bmr + ".");
        } else if (radioF.isSelected()) {
            double bmrH = ((10 * peso) + (6.25 * altura) - (5 * edad) - 161);
            bmr = String.valueOf(bmrH);
            resbmr.setText(bmr + ".");
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calcular) {
            setInf();
            Actividad(comboActividad);
        }
    }

}
