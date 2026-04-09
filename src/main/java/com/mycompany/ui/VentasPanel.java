package com.mycompany.ui;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class VentasPanel extends JPanel {
    private JTable ventasTable;
    private DefaultTableModel ventasTableModel;

    public VentasPanel() {
        setLayout(new BorderLayout());
        ventasTableModel = new DefaultTableModel(
                new Object[]{"ID Venta", "Cliente", "Productos", "Total"}, 0);
        ventasTable = new JTable(ventasTableModel);
        ventasTable.setName("tablaVentas");
        JScrollPane scrollPane = new JScrollPane(ventasTable);
        add(scrollPane, BorderLayout.CENTER);
    }

    public DefaultTableModel getVentasTableModel() {
        return ventasTableModel;
    }
}
