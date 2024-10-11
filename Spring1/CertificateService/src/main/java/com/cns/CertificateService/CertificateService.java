package com.cns.CertificateService;


import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CertificateService {

    private final CertificateRepository certificateRepository;

    public CertificateService(CertificateRepository certificateRepository) {
        this.certificateRepository = certificateRepository;
    }

    public List<Certificate> getAllCertificates() {
        return certificateRepository.findAll();
    }

    public Certificate createCertificate(Certificate certificate) {
        return certificateRepository.save(certificate);
    }

    public Certificate updateCertificate(Long id, Certificate updatedCertificate) {
        return certificateRepository.findById(id)
                .map(certificate -> {
                    certificate.setCertificateName(updatedCertificate.getCertificateName());
                    certificate.setIssuedBy(updatedCertificate.getIssuedBy());
                    certificate.setIssueDate(updatedCertificate.getIssueDate());
                    certificate.setExpiryDate(updatedCertificate.getExpiryDate());
                    return certificateRepository.save(certificate);
                })
                .orElseThrow(() -> new RuntimeException("Certificate not found"));
    }

    public void deleteCertificate(Long id) {
        certificateRepository.deleteById(id);
    }
}

