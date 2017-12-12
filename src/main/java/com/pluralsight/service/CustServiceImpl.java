package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repo.CustRepo;

import java.util.List;

/**
 * Created by jsst_ on 12/7/2017.
 */
public class CustServiceImpl implements CustService {
    private CustRepo custRepo;
    public CustServiceImpl() {}

    public CustServiceImpl(CustRepo custRepo) {
        this.custRepo = custRepo;
    }

    public List<Customer> findAll() {
        return custRepo.findAll();
    }

    public void setCustRepo(CustRepo custRepo) {
        this.custRepo = custRepo;
    }
}
