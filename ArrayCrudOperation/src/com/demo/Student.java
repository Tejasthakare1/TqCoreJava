package com.demo;

import java.util.Arrays;

public class Student {
	private int id;
	private String Sname;
	private float marks[];
	private Course course;

	public Student() {

	}

	public Student(int id, String sname, float[] marks, Course course) {

		this.id = id;
		this.Sname = sname;
		this.marks = marks;
		this.course = course;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSname() {
		return Sname;
	}

	public void setSname(String sname) {
		Sname = sname;
	}

	public float[] getMarks() {
		return marks;
	}

	public void setMarks(float[] marks) {
		this.marks = marks;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public String toString() {
		return "Student [id=" + id + ", Sname=" + Sname + ", marks=" + Arrays.toString(marks) + ", course=" + course
				+ "]";
	}

}
