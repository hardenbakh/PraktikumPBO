package Latihan;

import javax.swing.*;
import java.awt.event.*;

public class Latihanlima {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Kalkulator Lengkap");
        frame.setSize(400, 350);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel judul = new JLabel("KALKULATOR");
        judul.setBounds(150, 10, 200, 25);
        frame.add(judul);

        JLabel label1 = new JLabel("Angka 1:");
        label1.setBounds(20, 50, 100, 25);
        frame.add(label1);

        JTextField input1 = new JTextField();
        input1.setBounds(120, 50, 150, 25);
        frame.add(input1);

        JLabel label2 = new JLabel("Angka 2:");
        label2.setBounds(20, 90, 100, 25);
        frame.add(label2);

        JTextField input2 = new JTextField();
        input2.setBounds(120, 90, 150, 25);
        frame.add(input2);

        JLabel labelHasil = new JLabel("Hasil:");
        labelHasil.setBounds(20, 130, 100, 25);
        frame.add(labelHasil);

        JTextField output = new JTextField();
        output.setBounds(120, 130, 150, 25);
        output.setEditable(false);
        frame.add(output);

        // ===== Tombol =====
        JButton btnTambah = new JButton("Tambah");
        btnTambah.setBounds(20, 180, 100, 30);
        frame.add(btnTambah);

        JButton btnKurang = new JButton("Kurang");
        btnKurang.setBounds(130, 180, 100, 30);
        frame.add(btnKurang);

        JButton btnKali = new JButton("Kali");
        btnKali.setBounds(240, 180, 100, 30);
        frame.add(btnKali);

        JButton btnBagi = new JButton("Bagi");
        btnBagi.setBounds(20, 220, 100, 30);
        frame.add(btnBagi);

        JButton btnReset = new JButton("Reset");
        btnReset.setBounds(130, 220, 100, 30);
        frame.add(btnReset);

        JButton btnKeluar = new JButton("Keluar");
        btnKeluar.setBounds(240, 220, 100, 30);
        frame.add(btnKeluar);

        // ===== ActionListener untuk 4 operasi =====
        ActionListener operasi = e -> {
            try {
                double a = Double.parseDouble(input1.getText());
                double b = Double.parseDouble(input2.getText());
                double hasil = 0;

                if (e.getSource() == btnTambah) hasil = a + b;
                else if (e.getSource() == btnKurang) hasil = a - b;
                else if (e.getSource() == btnKali) hasil = a * b;
                else if (e.getSource() == btnBagi) hasil = a / b;

                output.setText(String.valueOf(hasil));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame,
                        "Input harus berupa angka!",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        };

        btnTambah.addActionListener(operasi);
        btnKurang.addActionListener(operasi);
        btnKali.addActionListener(operasi);
        btnBagi.addActionListener(operasi);

        btnReset.addActionListener(e -> {
            input1.setText("");
            input2.setText("");
            output.setText("");
        });

        btnKeluar.addActionListener(e -> System.exit(0));

        frame.setVisible(true);
    }
}