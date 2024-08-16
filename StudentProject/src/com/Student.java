package com;

public class Student {
	private String name;
	private Integer chi;
	private Integer eng;
	private Integer sum;
	public Student(String name, Integer chi, Integer eng) {
		super();
		this.name = name;
		this.chi = chi;
		if(chi==59)this.chi=60;
		this.eng = eng;
		this.sum = this.chi+this.eng;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getChi() {
		return chi;
	}
	public void setChi(Integer chi) {
		this.chi = chi;
	}
	public Integer getEng() {
		return eng;
	}
	public void setEng(Integer eng) {
		this.eng = eng;
	}
	public Integer getSum() {
		return sum;
	}
}
