package com.price.Model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Price {
  private int id;
  private int cost;
public Price(int id, int cost) {
	this.id = id;
	this.cost = cost;
}
public Price() {
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getName() {
	return cost;
}
public void setName(int cost) {
	this.cost = cost;
}
}
