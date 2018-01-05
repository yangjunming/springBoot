package cn.com.Bean;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品实体类
 * 
 * @author SJH
 *
 */
public class MainSupplierSku {
	private Integer skuId;// 商品id

	private String skuDes;// 商品描述

	private String functionDes;// 功能描述

	private Integer supplierId;// 供应商id

	private String isGift;// 是否是赠品

	private String supplierName;// 供应商名称

	private Double giftReferencePrice;// 赠品参考价

	// 商品编码
	private String skuCode;

	// 商品名称
	private String skuName;

	// 品牌id
	private Integer brandId;

	// 品牌名称
	private String skuBrand;

	// 计量单位
	private String skuUnit;

	// 条码
	private String barCode;

	// 规格
	private String skuSpec;

	//
	private Integer keepQuality;

	// 商品图片
	private String skuImages;

	//
	private String shortCut;

	//
	private String skuOrign;

	// 关键字查询
	private String keywords;

	//
	private Integer catalogId;

	//
	private String catalogS;

	//
	private String skuRemark;

	// 箱包装数
	private Integer packCount;

	// 最小起订量
	private Integer minCount;

	//
	private BigDecimal stockoutoutPrice;

	//
	private String purchStatus;

	//
	private String lastModifier;

	// 渠道id
	private Integer channelId;

	//
	private Date lastModifyDate;

	//
	private BigDecimal taxRate;

	private String purchStatusChang;

	private String isGiftChang;

	private String catalogName;

	private String brandName;
	// 单位体积
	private String volume;
	// 单位重量
	private String weight;
	// 库存Id
	private Integer storageId;
	// 移动平均价
	private BigDecimal purchPrice;
	// 渠道商品id
	private Integer channelSkuId;
	// 库存总数量
	private Integer storageTotalCount;
	// 库存总金额
	private BigDecimal storageTotalAmount;

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public Integer getSkuId() {
		return skuId;
	}

	public void setSkuId(Integer skuId) {
		this.skuId = skuId;
	}

	public String getSkuDes() {
		return skuDes;
	}

	public void setSkuDes(String skuDes) {
		this.skuDes = skuDes;
	}

	public String getFunctionDes() {
		return functionDes;
	}

	public void setFunctionDes(String functionDes) {
		this.functionDes = functionDes;
	}

	public Integer getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Integer supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public Double getGiftReferencePrice() {
		return giftReferencePrice;
	}

	public void setGiftReferencePrice(Double giftReferencePrice) {
		this.giftReferencePrice = giftReferencePrice;
	}

	public String getSkuCode() {
		return skuCode;
	}

	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}

	public String getSkuName() {
		return skuName;
	}

	public void setSkuName(String skuName) {
		this.skuName = skuName;
	}

	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public String getSkuBrand() {
		return skuBrand;
	}

	public void setSkuBrand(String skuBrand) {
		this.skuBrand = skuBrand;
	}

	public String getSkuUnit() {
		return skuUnit;
	}

	public void setSkuUnit(String skuUnit) {
		this.skuUnit = skuUnit;
	}

	public String getBarCode() {
		return barCode;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public String getSkuSpec() {
		return skuSpec;
	}

	public void setSkuSpec(String skuSpec) {
		this.skuSpec = skuSpec;
	}

	public Integer getKeepQuality() {
		return keepQuality;
	}

	public void setKeepQuality(Integer keepQuality) {
		this.keepQuality = keepQuality;
	}

	public String getSkuImages() {
		return skuImages;
	}

	public void setSkuImages(String skuImages) {
		this.skuImages = skuImages;
	}

	public String getShortCut() {
		return shortCut;
	}

	public void setShortCut(String shortCut) {
		this.shortCut = shortCut;
	}

	public String getSkuOrign() {
		return skuOrign;
	}

	public void setSkuOrign(String skuOrign) {
		this.skuOrign = skuOrign;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public Integer getCatalogId() {
		return catalogId;
	}

	public void setCatalogId(Integer catalogId) {
		this.catalogId = catalogId;
	}

	public String getCatalogS() {
		return catalogS;
	}

	public void setCatalogS(String catalogS) {
		this.catalogS = catalogS;
	}

	public String getSkuRemark() {
		return skuRemark;
	}

	public void setSkuRemark(String skuRemark) {
		this.skuRemark = skuRemark;
	}

	public Integer getPackCount() {
		return packCount;
	}

	public void setPackCount(Integer packCount) {
		this.packCount = packCount;
	}

	public Integer getMinCount() {
		return minCount;
	}

	public void setMinCount(Integer minCount) {
		this.minCount = minCount;
	}

	public BigDecimal getStockoutoutPrice() {
		return stockoutoutPrice;
	}

	public void setStockoutoutPrice(BigDecimal stockoutoutPrice) {
		this.stockoutoutPrice = stockoutoutPrice;
	}

	public String getPurchStatus() {
		return purchStatus;
	}

	public void setPurchStatus(String purchStatus) {
		this.purchStatus = purchStatus;
	}

	public String getLastModifier() {
		return lastModifier;
	}

	public void setLastModifier(String lastModifier) {
		this.lastModifier = lastModifier;
	}

	public Integer getChannelId() {
		return channelId;
	}

	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
	}

	public Date getLastModifyDate() {
		return lastModifyDate;
	}

	public void setLastModifyDate(Date lastModifyDate) {
		this.lastModifyDate = lastModifyDate;
	}

	public BigDecimal getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(BigDecimal taxRate) {
		this.taxRate = taxRate;
	}

	public String getIsGift() {
		return isGift;
	}

	public void setIsGift(String isGift) {
		this.isGift = isGift;
	}

	public String getPurchStatusChang() {
		return purchStatusChang;
	}

	public void setPurchStatusChang(String purchStatusChang) {
		this.purchStatusChang = purchStatusChang;
	}

	public String getIsGiftChang() {
		return isGiftChang;
	}

	public void setIsGiftChang(String isGiftChang) {
		this.isGiftChang = isGiftChang;
	}

	public String getCatalogName() {
		return catalogName;
	}

	public void setCatalogName(String catalogName) {
		this.catalogName = catalogName;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Integer getStorageId() {
		return storageId;
	}

	public void setStorageId(Integer storageId) {
		this.storageId = storageId;
	}

	public BigDecimal getPurchPrice() {
		return purchPrice;
	}

	public void setPurchPrice(BigDecimal purchPrice) {
		this.purchPrice = purchPrice;
	}

	public Integer getChannelSkuId() {
		return channelSkuId;
	}

	public void setChannelSkuId(Integer channelSkuId) {
		this.channelSkuId = channelSkuId;
	}

	public Integer getStorageTotalCount() {
		return storageTotalCount;
	}

	public void setStorageTotalCount(Integer storageTotalCount) {
		this.storageTotalCount = storageTotalCount;
	}

	public BigDecimal getStorageTotalAmount() {
		return storageTotalAmount;
	}

	public void setStorageTotalAmount(BigDecimal storageTotalAmount) {
		this.storageTotalAmount = storageTotalAmount;
	}
}