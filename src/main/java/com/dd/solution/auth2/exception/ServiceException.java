package com.dd.solution.auth2.exception;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public abstract class ServiceException extends RuntimeException {

    private static final long serialVersionUID = -6662460118306199774L;

    private final ServiceError error;
    private Map<String, Object> params;

    protected ServiceException(ServiceError error, Throwable throwable, LinkedHashMap<String, Object> params){
        super(error.getMessageKey(), throwable);
        this.params = Objects.nonNull(params) ? params : Collections.emptyMap();
        this.error = error;
    }

    public ServiceError getError() {
        return error;
    }

    public Map<String, Object> getParams() {
        return params;
    }
}
