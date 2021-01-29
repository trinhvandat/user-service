package com.dd.solution.auth2.exception;

import com.google.common.collect.Maps;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class ApplicationException extends ServiceException{

    private static final long serialVersionUID = 9234467236473264L;

    protected ApplicationException(ServiceError error, Throwable throwable, LinkedHashMap<String, Object> params) {
        super(error, throwable, params);
    }

    protected static LinkedHashMap<String, Object> buildSingleParamMaps(String key, String value){
        return Maps.newLinkedHashMap(Collections.singletonMap(key, value));
    }
}
