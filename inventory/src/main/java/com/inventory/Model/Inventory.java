package com.inventory.Model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Inventory {
  private int id;
  private int total;
public Inventory(int id, int total) {
	this.id = id;
	this.total = total;
}
public Inventory() {
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getTotal() {
	return total;
}
public void setTotal(int total) {
	this.total = total;
}
}
