package com.spring.homework.service;


import com.spring.homework.domain.Company;
import com.spring.homework.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyRepository companyRepository;

    public List<Company> getAllCompany(){
        return companyRepository.findByOrderByIdAsc();
    }

    public void updateCompany(Company company){
        companyRepository.save(company);
    }

    public void deleteCompany(Long id){
        companyRepository.deleteById(id);
    }

    public Company getCompany(Long id){
        return companyRepository.findById(id).get();
    }
}
