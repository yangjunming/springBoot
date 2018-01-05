package cn.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.com.service.GenerateDataService;

/**
* @author :
* @version 创建时间：2017年12月22日 下午2:43:01
* 类说明
*/
@RestController
public class GenerateData {
	
	@Autowired
	private GenerateDataService generateDataService;
	
	@RequestMapping("/generateData")
	@ResponseBody
	public void GenerateData(){
		generateDataService.insertSupplier();
	}
	
	@RequestMapping("/generateSku")
	@ResponseBody
	public void generateSku(){
		generateDataService.generateSku();
	}

}
