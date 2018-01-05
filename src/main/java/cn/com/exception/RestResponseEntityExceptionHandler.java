//package cn.com.exception;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.http.HttpStatus;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.ResponseStatus;
//
//import cn.com.Bean.ResponseResult;
//import cn.com.utils.ResultConst;
//
//@ControllerAdvice(annotations = Controller.class)
//public class RestResponseEntityExceptionHandler {
//	private final static Logger logger = LoggerFactory.getLogger(RestResponseEntityExceptionHandler.class);
//
//	@ExceptionHandler(NullPointerException.class)
//	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//	@ResponseBody
//	public ResponseResult handleResourceNotFound(NullPointerException ex) {
//		logger.error(ex.getMessage(), ex);
//		return new ResponseResult(ResultConst.SYSTEM_ERROR_CODE, "系统错误");
//	}
//
//	@ExceptionHandler(Exception.class)
//	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//	@ResponseBody
//	protected ResponseResult handleException(Exception ex) {
//		logger.error(ex.getMessage(), ex);
//		return new ResponseResult(ResultConst.SYSTEM_ERROR_CODE, "系统错误");
//	}
//
//	@ExceptionHandler(Error.class)
//	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//	@ResponseBody
//	protected ResponseResult handleError(Error ex) {
//		logger.error(ex.getMessage(), ex);
//		return new ResponseResult(ResultConst.SYSTEM_ERROR_CODE, "系统错误");
//	}
//
//	// 当操作数据库抛出自定义回滚异常时，记录异常信息并返回异常信息
//	@ExceptionHandler(Exception.class)
//	@ResponseStatus(value = HttpStatus.OK)
//	@ResponseBody
//	protected ResponseResult handleCallbackException(Exception ex) {
//		String msg = ex.getMessage();
//		logger.error(msg, ex);
//		if (msg == null || "".equals(msg)) {
//			msg = "操作失败！数据异常，请检查后重试";
//		}
//		return new ResponseResult(ResultConst.SYSTEM_ERROR_CODE, msg);
//	}
//
//	/**
//	 * 返回401错误
//	 * 
//	 * @param ex
//	 * @return
//	 */
//	@ExceptionHandler(Exception.class)
//	@ResponseStatus(value = HttpStatus.UNAUTHORIZED)
//	@ResponseBody
//	protected String UnauthorizedExceptionextendsException(Exception ex) {
//		logger.error(ex.getMessage(), ex);
//		return "";
//	}
//
//	/**
//	 * 返回403错误
//	 * 
//	 * @param ex
//	 * @return
//	 */
//	@ExceptionHandler(Exception.class)
//	@ResponseStatus(value = HttpStatus.FORBIDDEN)
//	@ResponseBody
//	protected String handleForbiddenException(Exception ex) {
//		logger.error(ex.getMessage(), ex);
//		return "";
//	}
//}