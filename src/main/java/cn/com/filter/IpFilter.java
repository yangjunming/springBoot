package cn.com.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import cn.com.service.RedisService;
import cn.com.utils.HttpUtils;
import cn.com.utils.IpAddr;
import cn.com.utils.ResultConst;

/**
 * IP黑名单限制过滤器
 *
 * @author yinjihuan
 * @create 2017-11-15 18:14
 **/
public class IpFilter implements HandlerInterceptor {

	@Autowired
	private RedisService redisService;

	// public Object run(HttpServletRequest request) {
	// RequestContext ctx = RequestContext.getCurrentContext();
	// String ip = IpUtils.getIpAddr(request);
	// 在黑名单中禁用
	// System.out.println("IP________________________:"+ip);
	// return null;
	// }

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println(">>>IpFilter>>>>>>>在请求处理之前进行调用（Controller方法调用之前）");
		String ip = IpAddr.getIpAddr(request);
		// 在黑名单中禁用
		System.out.println("IP________________________:" + ip);
		// ResponseResult responseResult = new ResponseResult();
		// responseResult.setCode("10000");
		// responseResult.setMessage("IP地址在黑名单中");
		// response.setContentType("application/json");
		// response.setCharacterEncoding(request.getCharacterEncoding());
		// PrintWriter out = null;
		// out = response.getWriter();
		// out.append(JSONObject.toJSONString(responseResult));
		// out.close();
		boolean ipCheck = false;
		if (!ipCheck) {
			this.excuteIPFilter(request, response, ResultConst.SYSTEM_ERROR_CODE, "哈哈哈哈哈");
			return false;
		}
		return true;// 只有返回true才会继续向下执行，返回false取消当前请求
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println(">>>IpFilter>>>>>>>请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之后）");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println(">>>IpFilter>>>>>>>在整个请求结束之后被调用，也就是在DispatcherServlet 渲染了对应的视图之后执行（主要是用于进行资源清理工作）");
	}

	/**
	 * IP被拦截后设置返回信息
	 * 
	 * @param request
	 * @param response
	 */
	private void excuteIPFilter(HttpServletRequest request, HttpServletResponse response, int code, String message)
			throws Exception {
		HttpUtils.responseAuthentication(request, response, code, message);

	}
}