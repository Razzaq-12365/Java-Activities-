package com.Hibernetactivity.hibernetactivity.student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.Session;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="student")
public class Student {	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
 private int sId;
	@Column
 private String sName;
	@Column
 private double grades;
	@Column
 private int contactNo;


	public Student(int sId, String sName, double grades, int contactNo) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.grades = grades;
		this.contactNo = contactNo;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", grades=" + grades + ", contactNo=" + contactNo + "]";
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public double getGrades() {
		return grades;
	}

	public void setGrades(double grades) {
		this.grades = grades;
	}

	public int getContactNo() {
		return contactNo;
	}

	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}

	public void insertRecord()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student name");
		sName = sc.next();
		System.out.println("Enter the student grades");
		grades = sc.nextDouble();
		System.out.println("Enter student contect number");
		contactNo = sc.nextInt();	
	}

}
