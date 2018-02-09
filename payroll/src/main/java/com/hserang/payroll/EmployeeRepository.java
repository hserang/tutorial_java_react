package com.hserang.payroll;

import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author Haroun Serang
 */
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {
}
