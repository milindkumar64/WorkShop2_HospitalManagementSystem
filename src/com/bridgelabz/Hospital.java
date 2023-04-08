package com.bridgelabz;

import java.util.Scanner;

public class Hospital {

	private String hospitalName;
	private int numberOfWards;
	private String doctorSpecialization;
	private int numOfPatients;

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public int getNumberOfWards() {
		return numberOfWards;
	}

	public void setNumberOfWards(int numberOfWards) {
		this.numberOfWards = numberOfWards;
	}

	public String getDoctorSpecialization() {
		return doctorSpecialization;
	}

	public void setDoctorSpecialization(String doctorSpecialization) {
		this.doctorSpecialization = doctorSpecialization;
	}

	public int getNumOfPatients() {
		return numOfPatients;
	}

	public void setNumOfPatients(int numOfPatients) {
		this.numOfPatients = numOfPatients;
	}

	void getHospitalDetails() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Hospital's details :");

		System.out.println("Enter the Hospital Name :");

		String hospitalName = sc.nextLine();
		this.setHospitalName(hospitalName);

		System.out.println("Enter the Number of Wards :");
		int numberOfWards = sc.nextInt();
		this.setNumberOfWards(numberOfWards);

		System.out.println("Enter the Doctor's Specialization :");
		String doctorSpecialization = sc.next();
		this.setDoctorSpecialization(doctorSpecialization);

		System.out.println("Enter the Number of Patients :");
		int numOfPatients = sc.nextInt();
		this.setNumOfPatients(numOfPatients);

	}

	public String toString() {
		return "hospitalName : " + hospitalName + "  numberOfWards : " + numberOfWards + " doctorSpecialization : "
				+ doctorSpecialization + " numOfPatients : " + numOfPatients;
	}

}
