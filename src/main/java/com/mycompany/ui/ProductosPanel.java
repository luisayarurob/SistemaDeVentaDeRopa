package com.mycompany.ui;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ProductosPanel extends JPanel {
    private JTable productosTable;
    private DefaultTableModel productosTableModel;

    public ProductosPanel() {
        setLayout(new BorderLayout());
        productosTableModel = new DefaultTableModel(
                new Object[]{"Código", "Nombre", "Talla", "Color", "Precio", "Stock"}, 0);
        productosTable = new JTable(productosTableModel);
        productosTable.setName("tablaProductos");
        JScrollPane scrollPane = new JScrollPane(productosTable);
        add(scrollPane, BorderLayout.CENTER);
    }

    public DefaultTableModel getProductosTableModel() {
        return productosTableModel;
    }
}
