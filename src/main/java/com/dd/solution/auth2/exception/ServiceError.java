package com.dd.solution.auth2.exception;

import lombok.Getter;

@Getter
public enum ServiceError {

    USER_NOT_FOUND(404001, "err.api.user-not-found"),

    CMN_HTTP_METHOD_NOT_SUPPORT(405001, "err.api.http-method-not-support"),
    CMN_MEDIA_TYPE_NOT_SUPPORT(415001, "err.api.media-type-not-support"),
    CMN_MESSAGE_NOT_READABLE(400999, "err.api.message-not-readable");

    private final int errorCode;
    private final String messageKey;

    ServiceError(int errorCode, String messageKey) {
        this.errorCode = errorCode;
        this.messageKey = messageKey;
    }

}
