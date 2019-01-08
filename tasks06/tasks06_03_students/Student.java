package by.htp.tasks6_03_students;

import java.util.ArrayList;

public class Student {
	private String fio;
	private String group;
	private int[] eff = new int[5];
	
	public String getFio() {
		return fio;
	}

	public void setFio(String fio) {
		this.fio = fio;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public int[] getEff() {
		return eff;
	}

	public void setEff(int[] eff) {
		this.eff = eff;
	}

	public Student(String fio, String group, int[] eff) {
		this.fio = fio;
		this.group = group;
		this.eff = eff;
		}	
}