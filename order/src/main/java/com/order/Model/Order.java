package com.order.Model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Order {
  private int id;
  private int count;
public Order(int id, int count) {
	this.id = id;
	this.count = count;
}
public Order() {
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getCount() {
	return count;
}
public void setCount(int count) {
	this.count = count;
}
}
