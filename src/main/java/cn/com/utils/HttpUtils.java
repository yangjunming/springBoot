package cn.com.utils;

import java.io.IOException;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;

import com.alibaba.fastjson.JSONObject;

import cn.com.Bean.ResponseResult;

public class HttpUtils {
	/**
	 * 设置拦截返回信息
	 * 
	 * @param request
	 * @param response
	 * @param loginUrl
	 * @param serviceParamName
	 * @throws IOException
	 * @throws Exception
	 */
	public static void responseAuthentication(HttpServletRequest request, HttpServletResponse response, int code,
			String message) throws IOException {
		response.addHeader("Pragma", "no-cache");
		response.addHeader("Cache-Control", "no-cache, no-store, max-age=0");
		response.addDateHeader("Expires", 1L);
		response.setCharacterEncoding(request.getCharacterEncoding());
		response.setContentType("application/json");
		response.setStatus(HttpStatus.UNAUTHORIZED.value());
		ResponseResult result = new ResponseResult();
		result.setCode(code);
		result.setMessage(message);
		String text = JSONObject.toJSONString(result);
		byte[] bytes = text.getBytes(request.getCharacterEncoding());
		ServletOutputStream out = response.getOutputStream();
		out.write(bytes);
		out.flush();
		out.close();
	}

	/**
	 * 返回未授权信息
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	public static void responseAuthorization(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		response.addHeader("Pragma", "no-cache");
		response.addHeader("Cache-Control", "no-cache, no-store, max-age=0");
		response.addDateHeader("Expires", 1L);
		response.setCharacterEncoding(request.getCharacterEncoding());
		response.setContentType("application/json");
		response.setStatus(HttpStatus.FORBIDDEN.value());
	}
}