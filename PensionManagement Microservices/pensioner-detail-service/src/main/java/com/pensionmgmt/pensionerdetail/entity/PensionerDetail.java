package com.pensionmgmt.pensionerdetail.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Pensioner")
public class PensionerDetail {
	
	@Id
	private long aadharNumber;
	private String name;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd")
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;
	private String pan;
	private double salaryEarned;
	private double allowances;
	@Enumerated(EnumType.STRING)
	private PensionType pensionType;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<BankDetails> bankDetails;

	public long getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public double getSalaryEarned() {
		return salaryEarned;
	}

	public void setSalaryEarned(double salaryEarned) {
		this.salaryEarned = salaryEarned;
	}

	public double getAllowances() {
		return allowances;
	}

	public void setAllowances(double allowances) {
		this.allowances = allowances;
	}

	public PensionType getPensionType() {
		return pensionType;
	}

	public void setPensionType(PensionType pensionType) {
		this.pensionType = pensionType;
	}

	public List<BankDetails> getBankDetails() {
		return bankDetails;
	}

	public void setBankDetails(List<BankDetails> bankDetails) {
		this.bankDetails = bankDetails;
	}
	

}
