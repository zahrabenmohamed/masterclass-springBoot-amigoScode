package com.example.mastrecalss.exception;

import lombok.AllArgsConstructor;
import lombok.ToString;
import org.apache.logging.log4j.message.Message;
import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

@AllArgsConstructor
@ToString
public class ApiException {
    private final String message ;
    private final Throwable throwable;
    private final HttpStatus httpStatus;
    private final ZonedDateTime zonedDateTime;



}
