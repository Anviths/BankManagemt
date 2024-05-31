package com.jsp.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.persistence.Persistence;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println(LocalDate.now());
		System.out.println(LocalDate.parse("20-12-2024", DateTimeFormatter.ofPattern("dd-MM-yyyy")));
		 Persistence.createEntityManagerFactory("java");
	}
}
