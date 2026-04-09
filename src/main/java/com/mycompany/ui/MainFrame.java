package com.mycompany.ui;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("Sistema de Venta de Ropa");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Clientes", new ClientesPanel());
        tabbedPane.addTab("Productos", new ProductosPanel());
        tabbedPane.addTab("Ventas", new VentasPanel());

        add(tabbedPane);
    }
}
