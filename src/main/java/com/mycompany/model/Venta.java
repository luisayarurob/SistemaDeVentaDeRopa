package com.mycompany.model;

import java.util.List;

public class Venta {
	private int id;
	private int clienteId;
	private List<Integer> productosIds;
	private double total;

	public Venta() {
	}

	public Venta(int id, int clienteId, List<Integer> productosIds, double total) {
		this.id = id;
		this.clienteId = clienteId;
		this.productosIds = productosIds;
		this.total = total;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getClienteId() {
		return clienteId;
	}

	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}

	public List<Integer> getProductosIds() {
		return productosIds;
	}

	public void setProductosIds(List<Integer> productosIds) {
		this.productosIds = productosIds;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Venta{" +
				"id=" + id +
				", clienteId=" + clienteId +
				", productosIds=" + productosIds +
				", total=" + total +
				'}';
	}
}
