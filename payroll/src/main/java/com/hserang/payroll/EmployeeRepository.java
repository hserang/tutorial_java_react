package com.hserang.payroll;

import org.springframework.data.repository.CrudRepository;

/**
 * @author Haroun Serang
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
