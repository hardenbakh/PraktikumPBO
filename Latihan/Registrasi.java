package Latihan;

import javax.swing.*;
import java.awt.event.*;

public class Registrasi {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Form Registrasi Mahasiswa");
        frame.setSize(420, 480);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Nama
        JLabel lblNama = new JLabel("Nama:");
        lblNama.setBounds(20, 20, 100, 25);
        frame.add(lblNama);
        JTextField txtNama = new JTextField();
        txtNama.setBounds(130, 20, 230, 25);
        frame.add(txtNama);

        // NIM
        JLabel lblNim = new JLabel("NIM:");
        lblNim.setBounds(20, 60, 100, 25);
        frame.add(lblNim);
        JTextField txtNim = new JTextField();
        txtNim.setBounds(130, 60, 230, 25);
        frame.add(txtNim);

        // Prodi
        JLabel lblProdi = new JLabel("Prodi:");
        lblProdi.setBounds(20, 100, 100, 25);
        frame.add(lblProdi);
        JTextField txtProdi = new JTextField();
        txtProdi.setBounds(130, 100, 230, 25);
        frame.add(txtProdi);

        // Alamat (BARU)
        JLabel lblAlamat = new JLabel("Alamat:");
        lblAlamat.setBounds(20, 140, 100, 25);
        frame.add(lblAlamat);
        JTextField txtAlamat = new JTextField();
        txtAlamat.setBounds(130, 140, 230, 25);
        frame.add(txtAlamat);

        // Asal Sekolah (BARU)
        JLabel lblSekolah = new JLabel("Asal Sekolah:");
        lblSekolah.setBounds(20, 180, 100, 25);
        frame.add(lblSekolah);
        JTextField txtSekolah = new JTextField();
        txtSekolah.setBounds(130, 180, 230, 25);
        frame.add(txtSekolah);

        // Tombol
        JButton btnSimpan = new JButton("Simpan");
        btnSimpan.setBounds(20, 230, 160, 30);
        frame.add(btnSimpan);

        JButton btnReset = new JButton("Reset");
        btnReset.setBounds(200, 230, 160, 30);
        frame.add(btnReset);

        // Area hasil
        JTextArea areaHasil = new JTextArea();
        areaHasil.setBounds(20, 280, 340, 140);
        areaHasil.setEditable(false);
        frame.add(areaHasil);

        // EVENT SIMPAN
        btnSimpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = txtNama.getText().trim();
                String nim = txtNim.getText().trim();
                String prodi = txtProdi.getText().trim();
                String alamat = txtAlamat.getText().trim();
                String sekolah = txtSekolah.getText().trim();

                // VALIDASI INPUT KOSONG
                if (nama.isEmpty() || nim.isEmpty() || prodi.isEmpty()
                        || alamat.isEmpty() || sekolah.isEmpty()) {
                    JOptionPane.showMessageDialog(frame,
                            "Semua field harus diisi!",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }

                areaHasil.setText("Data Berhasil Disimpan:\n");
                areaHasil.append("Nama          : " + nama + "\n");
                areaHasil.append("NIM           : " + nim + "\n");
                areaHasil.append("Prodi         : " + prodi + "\n");
                areaHasil.append("Alamat        : " + alamat + "\n");
                areaHasil.append("Asal Sekolah  : " + sekolah + "\n");

                JOptionPane.showMessageDialog(frame,
                        "Data berhasil disimpan!",
                        "Sukses",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // EVENT RESET
        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNama.setText("");
                txtNim.setText("");
                txtProdi.setText("");
                txtAlamat.setText("");
                txtSekolah.setText("");
                areaHasil.setText("");
            }
        });

        frame.setVisible(true);
    }
}