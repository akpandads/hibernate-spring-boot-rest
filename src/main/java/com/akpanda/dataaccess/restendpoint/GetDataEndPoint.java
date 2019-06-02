package com.akpanda.dataaccess.restendpoint;

import com.akpanda.dataaccess.entity.Company;
import com.akpanda.dataaccess.entity.Employee;
import com.akpanda.dataaccess.model.CompanyData;
import com.akpanda.dataaccess.model.EmployeeData;
import com.akpanda.dataaccess.service.CompanyDaoImpl;
import com.akpanda.dataaccess.service.EmployeeDaoImpl;
import com.akpanda.dataaccess.transformer.DataTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sample-app")
public class GetDataEndPoint {

    @Autowired
    private EmployeeDaoImpl employeeDao;

    @Autowired
    DataTransformer dataTransformer;

    @Autowired
    private CompanyDaoImpl companyDao;

    @GetMapping("employee/{employeeId}")
    public ResponseEntity<EmployeeData> getEmployee(@PathVariable String employeeId){
        Employee employee = employeeDao.findByEmployeeId(employeeId);
        if(employee !=null){
            EmployeeData employeeData = dataTransformer.transformEmployeeEntityToModel(employee);
            return new ResponseEntity<>(employeeData,HttpStatus.OK);
        }
        return new ResponseEntity<>((EmployeeData) null,HttpStatus.NOT_FOUND);
    }

    @GetMapping("comapny/{companyId}")
    public ResponseEntity<CompanyData> getCompany(@PathVariable String companyId){
        Company company = companyDao.findByCompanyId(companyId);
        if(company!=null){
            CompanyData companyData = dataTransformer.transformCompanyEntitytoModelIncldungEmployees(company);
            return new ResponseEntity<>(companyData,HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>((CompanyData) null,HttpStatus.OK);
        }
    }
}
