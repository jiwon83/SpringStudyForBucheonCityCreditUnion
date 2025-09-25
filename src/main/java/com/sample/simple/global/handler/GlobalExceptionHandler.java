package com.sample.simple.global.handler;

import com.sample.simple.global.exception.CustomException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * DTO validation handler
     * @param exception
     * @return
     */
    // RestControllerAdvice 안에 있는 모든 @ExceptionHandler는 모든 컨트롤러에 적용된다. by RequestMappingHandlerMapping, ExceptionHandlerExceptionResolver
    @ExceptionHandler(MethodArgumentNotValidException.class) // MethodArgumentNotValidException: @Valid, @Validated 검증 실패 시 스프링이 던져주는 예외 클래스
    public ModelAndView handleValidationException(MethodArgumentNotValidException exception) {
        ModelAndView mav = new ModelAndView("error/400"); // >> /WEB-INF/views/error/400.jsp
        mav.setStatus(HttpStatus.BAD_REQUEST);
        mav.addObject("message", "요청 값이 올바르지 않습니다.");
        mav.addObject("errors", exception.getBindingResult().getAllErrors());
        return mav;
    }

    /**
     * Custom Server Error Handler
     * @param
     * @return
     */
    @ExceptionHandler(CustomException.class)
    public String handleException() {
        return "redirect:/error/error.html";
    }

}
