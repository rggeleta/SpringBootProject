package dmacc.reposittory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.bean.Student;



/**
 *@author roman-rggeleta@dmacc.edu
 *CIS175-Spring 2022
 *Mar 9, 2022
 */
@Repository
public interface StudentsRepository extends JpaRepository<Student, Long> {

}
