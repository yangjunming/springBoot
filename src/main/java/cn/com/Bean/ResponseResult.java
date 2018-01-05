package cn.com.Bean;

/**
 * @author :
 * @version 创建时间：2017年11月21日 下午2:59:05 类说明
 */
public class ResponseResult {

	private int code;

	private String message;

	public ResponseResult() {
		super();
	}

	public ResponseResult(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
