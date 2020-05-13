package view;

import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Formulario {

    private JFrame form;
    private JLabel lblNome;
    private JTextField txtNome;
    private JButton btnEnviarSaudacao;

    public Formulario() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {

        form = new JFrame("Meu primeiro JFrame");
        form.setBounds(300, 200, 400, 250);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setLayout(null);
        
        Container painel = form.getContentPane();

        lblNome = new JLabel("Nome:");
        lblNome.setBounds(60, 30, 45, 25);
        painel.add(lblNome);

        txtNome = new JTextField();
        txtNome.setBounds(120, 30, 180, 25);
        painel.add(txtNome);

        btnEnviarSaudacao = new JButton("Saudar!");
        btnEnviarSaudacao.setBounds(100, 80, 200, 30);

        btnEnviarSaudacao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Olá, mundo!");
            }

        });
        painel.add(btnEnviarSaudacao);

        form.setVisible(true);
    }
}