package cn.com.proxy.impl;

import cn.com.proxy.AService;

/**
* @author :
* @version 创建时间：2018年1月4日 下午4:01:39
* 类说明
*/
public class AServiceImpl implements AService{

	@Override
	public void add() {
		
		System.out.println("======新增");
		
	}

	@Override
	public void update() {
		
		System.out.println("====编辑");
		
	}

}
