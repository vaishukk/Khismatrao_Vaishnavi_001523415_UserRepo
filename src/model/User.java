package model;

import java.awt.image.BufferedImage;
import java.util.Date;
import javax.swing.Icon;

public class User {
	
	private String name;
	private String geographicData;
	private String internetProtocolAddress;
	private Date dateOfBirth;
	private long telephoneNumber;
	private long faxNumber;
	private String emailAddress;
	private long ssn;
	private String medicalRecordNumber;
        private String healthPlanBeneficiary;
	private long bankAccountNumbers;
	private long licenseNumber;
	private String licensePlates;
	private long deviceIndentifiers;
	private String linkedIn;
	private long uniqueIdentifier;
        private Icon Image;

    public Icon getImage() {
        return Image;
    }

    public void setImage(Icon Image) {
        this.Image = Image;
    }

    
    
        
        
       
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGeographicData() {
		return geographicData;
	}
	public void setGeographicData(String geographicData) {
		this.geographicData = geographicData;
	}
	public String getInternetProtocolAddress() {
		return internetProtocolAddress;
	}
	public void setInternetProtocolAddress(String internetProtocolAddress) {
		this.internetProtocolAddress = internetProtocolAddress;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public long getTelephoneNumber() {
		return telephoneNumber;
	}
	public void setTelephoneNumber(long telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	public long getFaxNumber() {
		return faxNumber;
	}
	public void setFaxNumber(long faxNumber) {
		this.faxNumber = faxNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public long getSsn() {
		return ssn;
	}
	public void setSsn(long ssn) {
		this.ssn = ssn;
	}
	public String getMedicalRecordNumber() {
		return medicalRecordNumber;
	}
	public void setMedicalRecordNumber(String medicalRecordNumber) {
		this.medicalRecordNumber = medicalRecordNumber;
	}
	public long getBankAccountNumbers() {
		return bankAccountNumbers;
	}
	public void setBankAccountNumbers(long bankAccountNumbers) {
		this.bankAccountNumbers = bankAccountNumbers;
	}
	public long getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(long licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	public String getLicensePlates() {
		return licensePlates;
	}
	public void setLicensePlates(String licensePlates) {
		this.licensePlates = licensePlates;
	}
	public long getDeviceIndentifiers() {
		return deviceIndentifiers;
	}
	public void setDeviceIndentifiers(long deviceIndentifiers) {
		this.deviceIndentifiers = deviceIndentifiers;
	}
	public String getLinkedIn() {
		return linkedIn;
	}
	public void setLinkedIn(String linkedIn) {
		this.linkedIn = linkedIn;
	}
	public long getUniqueIdentifier() {
		return uniqueIdentifier;
	}
	public void setUniqueIdentifier(long uniqueIdentifier) {
		this.uniqueIdentifier = uniqueIdentifier;
	}

    public String getHealthPlanBeneficiary() {
        return healthPlanBeneficiary;
    }

    public void setHealthPlanBeneficiary(String healthPlanBeneficiary) {
        this.healthPlanBeneficiary = healthPlanBeneficiary;
    }

    
    
    
        
	
	

}
