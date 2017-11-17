package cn.com.Bean;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author :
 * @version 创建时间：2017年3月14日 上午11:39:32 类说明
 */
public class Demo {

	private int id;

	private String name;

	@JSONField(format = "yyyy-MM-dd HH:mm")
	private Date creaDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreaDate() {
		return creaDate;
	}

	public void setCreaDate(Date creaDate) {
		this.creaDate = creaDate;
	}

}
