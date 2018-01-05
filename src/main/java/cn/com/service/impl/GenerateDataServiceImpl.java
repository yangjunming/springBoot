package cn.com.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.Bean.MainSupplier;
import cn.com.Bean.MainSupplierSku;
import cn.com.mapper.GenerateDataMapper;
import cn.com.service.GenerateDataService;

/**
 * @author :
 * @version 创建时间：2017年12月22日 下午2:45:50 类说明
 */
@Service
public class GenerateDataServiceImpl implements GenerateDataService {

	@Autowired
	private GenerateDataMapper generateDataMapper;

	@Override
	public void insertSupplier() {
		int code = 1000;
		System.out.println("-----------开始："+new Date());
		// BigDecimal bussSignNo =new BigDecimal("92330782MA2A488L6L");
		for (int i1 = 0; i1 < 100; i1++) {
			for (int i = 0; i < 1000; i++) {
				List<MainSupplier> list = new ArrayList<MainSupplier>();
				MainSupplier mainSupplier = new MainSupplier();
				mainSupplier.setSupplierCode(String.valueOf(code));
				mainSupplier.setBussSignNo("92330782MA2A488YYY");
				mainSupplier.setSupplierName("山东乐利事食品有限公司");
				mainSupplier.setLinkname("刘经理");
				mainSupplier.setLinkMobile("13508953292");
				mainSupplier.setLinkEmail("13508953292@qq.com");
				mainSupplier.setRegisAreaId(458);
				mainSupplier.setRegisAddress("山东省淄博市沂源县荆山路附近");
				mainSupplier.setCompFax("0533-3250317");
				mainSupplier.setCommAreaId(458);
				mainSupplier.setCompAddress("山东省淄博市沂源县荆山路附近");
				mainSupplier.setCompPhone("256100");
				list.add(mainSupplier);
				code++;
				if (code == 9999) {
					code = 1000;
				}
				generateDataMapper.insertBatch(list);
			}
		}
		System.out.println("-----------结束："+new Date());
	}

	@Override
	public void generateSku() {
		int code = 10110231;
		BigDecimal barcode = new BigDecimal("2000132242134");
		System.out.println("-----------开始："+new Date());
		// BigDecimal bussSignNo =new BigDecimal("92330782MA2A488L6L");
		for (int i1 = 0; i1 < 100; i1++) {
			for (int i = 0; i < 1000; i++) {
				List<MainSupplierSku> list = new ArrayList<MainSupplierSku>();
				MainSupplierSku mainSupplierSku = new MainSupplierSku();
				mainSupplierSku.setSkuCode(String.valueOf(code));
				mainSupplierSku.setSkuName("商品"+code);
				mainSupplierSku.setBrandId(66);
				mainSupplierSku.setSkuUnit("包");
				mainSupplierSku.setBarCode(barcode.toString());
				mainSupplierSku.setSkuSpec("5kg*1箱");
				mainSupplierSku.setKeepQuality(20);
				mainSupplierSku.setCatalogId(97);
				mainSupplierSku.setPackCount(50);
				mainSupplierSku.setMinCount(1);
				mainSupplierSku.setStockoutoutPrice(new BigDecimal("50.00"));
				mainSupplierSku.setSupplierId(51);
				mainSupplierSku.setTaxRate(new BigDecimal("17.00"));
				mainSupplierSku.setGiftReferencePrice(null);
				mainSupplierSku.setVolume("1.123");
				mainSupplierSku.setWeight("2.23");
				list.add(mainSupplierSku);
				code++;
				barcode = barcode.add(new BigDecimal("1"));
				generateDataMapper.insertSku(list);
			}
		}
		System.out.println("-----------结束："+new Date());
	}

}
