package ro.asis.commons.exceptions

import org.springframework.http.HttpStatus.BAD_REQUEST
import org.springframework.http.HttpStatus.NOT_FOUND
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class ResourceControllerAdvice {
    @ExceptionHandler(ResourceNotFoundException::class)
    @ResponseStatus(NOT_FOUND)
    fun handleResourceNotFoundException(exception: ResourceNotFoundException): ApiError =
        ApiError(404, exception.localizedMessage)

    @ExceptionHandler(ValidationException::class)
    @ResponseStatus(BAD_REQUEST)
    fun handleValidationException(exception: ValidationException): ApiError =
        ApiError(420, exception.localizedMessage)
}

class ResourceNotFoundException(message: String) : RuntimeException(message)

class ValidationException(message: String) : RuntimeException(message)

data class ApiError(val errorCode: Int, val message: String)
