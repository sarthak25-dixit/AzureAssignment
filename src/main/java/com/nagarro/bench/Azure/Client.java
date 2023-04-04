package com.nagarro.bench.Azure;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int code;
	private double projectName;
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public double getProjectName() {
		return projectName;
	}
	public void setProjectName(double projectName) {
		this.projectName = projectName;
	}
	public Client(String name, int code, double projectName) {
		super();
		this.name = name;
		this.code = code;
		this.projectName = projectName;
	}
	public Client() {
		super();
	}
}
