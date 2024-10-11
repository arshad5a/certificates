package com.cns.CertificateService;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Certificate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String certificateName;

    private String issuedBy;

    private LocalDate issueDate;

    private LocalDate expiryDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCertificateName() {
		return certificateName;
	}

	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}

	public String getIssuedBy() {
		return issuedBy;
	}

	public void setIssuedBy(String issuedBy) {
		this.issuedBy = issuedBy;
	}

	public LocalDate getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Certificate(Long id, String certificateName, String issuedBy, LocalDate issueDate, LocalDate expiryDate) {
		super();
		this.id = id;
		this.certificateName = certificateName;
		this.issuedBy = issuedBy;
		this.issueDate = issueDate;
		this.expiryDate = expiryDate;
	}

    
}
