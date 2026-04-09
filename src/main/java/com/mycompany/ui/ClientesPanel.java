package com.mycompany.ui;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ClientesPanel extends JPanel {
    private JTable clientesTable;
    private DefaultTableModel clientesTableModel;

    public ClientesPanel() {
        setLayout(new BorderLayout());
        clientesTableModel = new DefaultTableModel(
                new Object[]{"ID", "Nombre", "Email", "Teléfono"}, 0);
        clientesTable = new JTable(clientesTableModel);
        clientesTable.setName("tablaClientes");
        JScrollPane scrollPane = new JScrollPane(clientesTable);
        add(scrollPane, BorderLayout.CENTER);
    }

    public DefaultTableModel getClientesTableModel() {
        return clientesTableModel;
    }
}
