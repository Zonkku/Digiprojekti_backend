package model;

import java.util.Date;

public class Kayttaja {
	private String username, socialSecurityCode, familyName, firstNames, nickName, address, postalCode, PostalDistrict, LanguageCode, LanguageCodeDescription, workPeriodId, workPeriodDescription, OficialJobDescription, workDepartment, idOfSupervisor; 
	private Boolean workPeriodStatus, isSupervisor;
	private Date  workPeriodStartDate, workPeriodEndDate;
	
	public Kayttaja() {
		super();
		
	}

	public Kayttaja(String username, String socialSecurityCode, String familyName, String firstNames, String nickName,
			String address, String postalCode, String postalDistrict, String languageCode,
			String languageCodeDescription, String workPeriodId, String workPeriodDescription,
			String oficialJobDescription, String workDepartment, String idOfSupervisor, Boolean workPeriodStatus,
			Boolean isSupervisor, Date workPeriodStartDate, Date workPeriodEndDate) {
		super();
		this.username = username;
		this.socialSecurityCode = socialSecurityCode;
		this.familyName = familyName;
		this.firstNames = firstNames;
		this.nickName = nickName;
		this.address = address;
		this.postalCode = postalCode;
		PostalDistrict = postalDistrict;
		LanguageCode = languageCode;
		LanguageCodeDescription = languageCodeDescription;
		this.workPeriodId = workPeriodId;
		this.workPeriodDescription = workPeriodDescription;
		OficialJobDescription = oficialJobDescription;
		this.workDepartment = workDepartment;
		this.idOfSupervisor = idOfSupervisor;
		this.workPeriodStatus = workPeriodStatus;
		this.isSupervisor = isSupervisor;
		this.workPeriodStartDate = workPeriodStartDate;
		this.workPeriodEndDate = workPeriodEndDate;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSocialSecurityCode() {
		return socialSecurityCode;
	}

	public void setSocialSecurityCode(String socialSecurityCode) {
		this.socialSecurityCode = socialSecurityCode;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getFirstNames() {
		return firstNames;
	}

	public void setFirstNames(String firstNames) {
		this.firstNames = firstNames;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getPostalDistrict() {
		return PostalDistrict;
	}

	public void setPostalDistrict(String postalDistrict) {
		PostalDistrict = postalDistrict;
	}

	public String getLanguageCode() {
		return LanguageCode;
	}

	public void setLanguageCode(String languageCode) {
		LanguageCode = languageCode;
	}

	public String getLanguageCodeDescription() {
		return LanguageCodeDescription;
	}

	public void setLanguageCodeDescription(String languageCodeDescription) {
		LanguageCodeDescription = languageCodeDescription;
	}

	public String getWorkPeriodId() {
		return workPeriodId;
	}

	public void setWorkPeriodId(String workPeriodId) {
		this.workPeriodId = workPeriodId;
	}

	public String getWorkPeriodDescription() {
		return workPeriodDescription;
	}

	public void setWorkPeriodDescription(String workPeriodDescription) {
		this.workPeriodDescription = workPeriodDescription;
	}

	public String getOficialJobDescription() {
		return OficialJobDescription;
	}

	public void setOficialJobDescription(String oficialJobDescription) {
		OficialJobDescription = oficialJobDescription;
	}

	public String getWorkDepartment() {
		return workDepartment;
	}

	public void setWorkDepartment(String workDepartment) {
		this.workDepartment = workDepartment;
	}

	public String getIdOfSupervisor() {
		return idOfSupervisor;
	}

	public void setIdOfSupervisor(String idOfSupervisor) {
		this.idOfSupervisor = idOfSupervisor;
	}

	public Boolean getWorkPeriodStatus() {
		return workPeriodStatus;
	}

	public void setWorkPeriodStatus(Boolean workPeriodStatus) {
		this.workPeriodStatus = workPeriodStatus;
	}

	public Boolean getIsSupervisor() {
		return isSupervisor;
	}

	public void setIsSupervisor(Boolean isSupervisor) {
		this.isSupervisor = isSupervisor;
	}

	public Date getWorkPeriodStartDate() {
		return workPeriodStartDate;
	}

	public void setWorkPeriodStartDate(Date workPeriodStartDate) {
		this.workPeriodStartDate = workPeriodStartDate;
	}

	public Date getWorkPeriodEndDate() {
		return workPeriodEndDate;
	}

	public void setWorkPeriodEndDate(Date workPeriodEndDate) {
		this.workPeriodEndDate = workPeriodEndDate;
	}

	@Override
	public String toString() {
		return "Kayttaja [username=" + username + ", socialSecurityCode=" + socialSecurityCode + ", familyName="
				+ familyName + ", firstNames=" + firstNames + ", nickName=" + nickName + ", address=" + address
				+ ", postalCode=" + postalCode + ", PostalDistrict=" + PostalDistrict + ", LanguageCode=" + LanguageCode
				+ ", LanguageCodeDescription=" + LanguageCodeDescription + ", workPeriodId=" + workPeriodId
				+ ", workPeriodDescription=" + workPeriodDescription + ", OficialJobDescription="
				+ OficialJobDescription + ", workDepartment=" + workDepartment + ", idOfSupervisor=" + idOfSupervisor
				+ ", workPeriodStatus=" + workPeriodStatus + ", isSupervisor=" + isSupervisor + ", workPeriodStartDate="
				+ workPeriodStartDate + ", workPeriodEndDate=" + workPeriodEndDate + "]";
	}
	
	
}
	