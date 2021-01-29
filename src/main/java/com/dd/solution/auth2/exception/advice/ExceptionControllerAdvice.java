package com.dd.solution.auth2.exception.advice;

import com.dd.solution.auth2.exception.ApplicationException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class ExceptionControllerAdvice {

    @ExceptionHandler({ApplicationException.class})
    public ResponseEntity<?> applicationErrorHandler(ApplicationException error){
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}
