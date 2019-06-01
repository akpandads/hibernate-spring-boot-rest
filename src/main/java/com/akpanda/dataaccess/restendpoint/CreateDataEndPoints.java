package com.akpanda.dataaccess.restendpoint;

import com.akpanda.dataaccess.entity.Company;
import com.akpanda.dataaccess.entity.Employee;
import com.akpanda.dataaccess.model.CompanyData;
import com.akpanda.dataaccess.model.CompanyResponse;
import com.akpanda.dataaccess.model.EmployeeData;
import com.akpanda.dataaccess.model.EmployeeResposne;
import com.akpanda.dataaccess.service.CompanyDaoImpl;
import com.akpanda.dataaccess.service.EmployeeDaoImpl;
import com.akpanda.dataaccess.transformer.DataTransformer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("sample-app")
public class CreateDataEndPoints {

    private Logger logger = LoggerFactory.getLogger(CreateDataEndPoints.class);

    @Autowired
    CompanyDaoImpl companyDao;

    @Autowired
    EmployeeDaoImpl employeeDao;

    @Autowired
    DataTransformer dataTransformer;

    @PostMapping(path = "create/company", produces = "application/json")
    public ResponseEntity<CompanyResponse> createCompany(@RequestBody CompanyData companyData){
        logger.info("Entered create company");
        Company company = dataTransformer.transformCompanyModelToEntity(companyData);
        CompanyResponse companyResponse = new CompanyResponse();
        try{
            companyDao.saveCompany(company);
            companyResponse.setCompanyId(company.getId());
            companyResponse.setStatus("Success");
        }
        catch (Exception e){
            logger.error("Exception while persisting company ",e);
            companyResponse.setStatus("Failed");
        }
        return new ResponseEntity<CompanyResponse>(companyResponse,HttpStatus.OK);
    }

    @PostMapping(path = "company/employee", produces = "application/json")
    public ResponseEntity<EmployeeResposne> createEmployee(@RequestBody EmployeeData employeeData){
        logger.info("Entered create employee");
        Employee employee = dataTransformer.transformEmployeeNodelToEntity(employeeData);
        EmployeeResposne employeeResposne = new EmployeeResposne();
        try{
            employeeDao.saveEmployee(employee);
            employeeResposne.setId(employee.getId());
            employeeResposne.setStatus("Success");
        }
        catch (Exception e){
            logger.error("Exception while persisting employee ",e);
            employeeResposne.setStatus("Failed");
        }
        return new ResponseEntity<EmployeeResposne>(employeeResposne,HttpStatus.OK);
    }

}
