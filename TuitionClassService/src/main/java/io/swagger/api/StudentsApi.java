/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Student;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-08T17:29:46.360Z")

@Api(value = "students", description = "the students API")
public interface StudentsApi {

    @ApiOperation(value = "Create a student", nickname = "studentsPost", notes = "Returns successfully created student", response = Student.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully created student", response = Student.class) })
    @RequestMapping(value = "/students",
        method = RequestMethod.POST)
    ResponseEntity<Student> studentsPost(@ApiParam(value = "Student details" ,required=true )  @Valid @RequestBody Student student);


    @ApiOperation(value = "Get a student by ID", nickname = "studentsRegidGet", notes = "Returns the student with given registration number", response = Student.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A student", response = Student.class) })
    @RequestMapping(value = "/students/{regid}",
        method = RequestMethod.GET)
    ResponseEntity<Student> studentsRegidGet(@ApiParam(value = "The student's registration id",required=true) @PathVariable("regid") String regid);

}