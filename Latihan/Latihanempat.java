package Latihan;

import javax.swing.*;
import java.awt.event.*;

public class Latihanempat {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Variasi Tombol");
        frame.setSize(420, 320);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label1 = new JLabel("Angka 1:");
        label1.setBounds(20, 20, 120, 25);
        frame.add(label1);

        JTextField input1 = new JTextField();
        input1.setBounds(150, 20, 150, 25);
        frame.add(input1);

        JLabel label2 = new JLabel("Angka 2:");
        label2.setBounds(20, 60, 120, 25);
        frame.add(label2);

        JTextField input2 = new JTextField();
        input2.setBounds(150, 60, 150, 25);
        frame.add(input2);

        JTextField output = new JTextField();
        output.setBounds(20, 100, 280, 30);
        output.setEditable(false);
        frame.add(output);

        // ===== VARIASI BUTTON =====
        JButton btnTampil = new JButton("Tampilkan");
        btnTampil.setBounds(20, 150, 120, 30);
        frame.add(btnTampil);

        JButton btnHapus = new JButton("Hapus");
        btnHapus.setBounds(150, 150, 120, 30);
        frame.add(btnHapus);

        JButton btnKosong = new JButton("Kosongkan");
        btnKosong.setBounds(20, 190, 120, 30);
        frame.add(btnKosong);

        JButton btnKeluar = new JButton("Keluar");
        btnKeluar.setBounds(150, 190, 120, 30);
        frame.add(btnKeluar);

        // ===== EVENT HANDLER =====
        btnTampil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a1 = input1.getText();
                String a2 = input2.getText();
                output.setText("Input 1 = " + a1 + " | Input 2 = " + a2);
            }
        });

        btnHapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input1.setText("");
                input2.setText("");
                output.setText("Input telah dihapus.");
            }
        });

        btnKosong.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                output.setText("");
            }
        });

        btnKeluar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }
}