package com.jbk.Batch134HMSproj;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Appointment {

	@Id
	String  department;
	String  doctor;
	String  patientname;
	String  email;
	String  appointmentdate;
	String  appointmenttime;
	
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Appointment(String department, String doctor, String patientname, String email, String appointmentdate,
			String appointmenttime) {
		super();
		this.department = department;
		this.doctor = doctor;
		this.patientname = patientname;
		this.email = email;
		this.appointmentdate = appointmentdate;
		this.appointmenttime = appointmenttime;
	}





	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public String getDoctor() {
		return doctor;
	}


	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}


	public String getPatientname() {
		return patientname;
	}


	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAppointmentdate() {
		return appointmentdate;
	}


	public void setAppointmentdate(String appointmentdate) {
		this.appointmentdate = appointmentdate;
	}


	public String getAppointmenttime() {
		return appointmenttime;
	}


	public void setAppointmenttime(String appointmenttime) {
		this.appointmenttime = appointmenttime;
	}


	@Override
	public String toString() {
		return "Appointment [department=" + department + ", doctor=" + doctor + ", patientname=" + patientname
				+ ", email=" + email + ", appointmentdate=" + appointmentdate + ", appointmenttime=" + appointmenttime
				+ "]";
	}


	

}
