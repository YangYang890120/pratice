package com;

public class Order {
	private String name;
	private Integer ruler;
	private Integer pen;
	private Integer sum;
	public Order(String name, Integer ruler, Integer pen) {
		super();
		this.name = name;
		this.ruler = ruler;
		this.pen = pen;
		this.sum = this.ruler*29+this.pen*30;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRuler() {
		return ruler;
	}
	public void setRuler(Integer ruler) {
		this.ruler = ruler;
	}
	public Integer getPen() {
		return pen;
	}
	public void setPen(Integer pen) {
		this.pen = pen;
	}
	public Integer getSum() {
		return sum;
	}
	
}
