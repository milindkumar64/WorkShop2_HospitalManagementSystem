package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;

public class HospitalManagementSystem {

	ArrayList<Hospital> hospitalList = new ArrayList<>();
	private int totalNumOfPatients;

	public void addHospital() {

		Hospital hospital = new Hospital();
		hospital.getHospitalDetails();
		hospitalList.add(hospital);
		System.out.println("New Hospital has been added ");
	}

	public void displayHospitals() {
		System.out.println("List of Hospitals are as Follows :");
		for (Hospital hospital : hospitalList) {
			System.out.println(hospital);
		}
	}

	public int totalNumOfPatients() {
		int totalNumOfPatients = 0;
		int numOfPatients;
		for (Hospital hospital : hospitalList) {
			numOfPatients = hospital.getNumOfPatients();
			totalNumOfPatients += numOfPatients;
		}
		return totalNumOfPatients;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String check = "Y";
		HospitalManagementSystem hms = new HospitalManagementSystem();

		while (check.equals("Y")) {
			hms.addHospital();
			System.out.println("Want to add More hospital press Capital 'Y' else any key");
			check = sc.nextLine();
		}

		hms.displayHospitals();
		System.out.println("Totao Number of Patients in all Hospitals is :" + hms.totalNumOfPatients());
	}

}