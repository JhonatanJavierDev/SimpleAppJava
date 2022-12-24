import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    public static void main(String[] args) {
        // Crear la ventana
        JFrame frame = new JFrame("App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new BorderLayout());

        // Crear el contenido
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new FlowLayout());
        contentPanel.add(new JLabel("Contenido de la aplicación"));

        // Crear el footer
        JPanel footerPanel = new JPanel();
        footerPanel.setLayout(new FlowLayout());
        footerPanel.setBackground(Color.LIGHT_GRAY);

        // Crear los botones
        JButton btn1 = new JButton("Botón 1");
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Acciones para el botón 1
            }
        });
        JButton btn2 = new JButton("Botón 2");
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Acciones para el botón 2
            }
        });
        JButton btn3 = new JButton("Botón 3");
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Acciones para el botón 3
            }
        });

        // Agregamos los botones al footer
        footerPanel.add(btn1);
        footerPanel.add(btn2);
        footerPanel.add(btn3);

        // Agregamos el contenido y el footer a la ventana
        frame.add(contentPanel, BorderLayout.CENTER);
        frame.add(footerPanel, BorderLayout.SOUTH);

        // Mostrar la ventana
        frame.setVisible(true);
    }
}
