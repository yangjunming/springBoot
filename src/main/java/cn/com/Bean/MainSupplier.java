package cn.com.Bean;

import java.util.Date;

/**
 * 供应商bean
 * 
 * @author SJH
 *
 */
public class MainSupplier {

	// 供应商id
	private Integer supplierId;

	// 税务登记号[唯一]
	private String taxSignNo;

	// 供应商营业执照号 [唯一]
	private String bussSignNo;

	// 供应商编码(4位流水) (手动输入,异步提示)
	private String supplierCode;

	// 供应商名称[与执照同]
	private String supplierName;

	// 联系人姓名
	private String linkname;

	// 联系人固话
	private String linkPhone;

	// 联系人手机
	private String linkMobile;

	// 供应商状态 （1、正式、2、停用）
	private String supplierStatus;

	// 货款结算方式(1货到账期)
	private String financeType;

	// 账期天数
	private Integer period;

	// 联系人email
	private String linkEmail;

	// 注册地ID
	private Integer regisAreaId;

	// 注册地址（街道门牌号）
	private String regisAddress;

	// 公司传真
	private String compFax;

	// 通讯区域ID
	private Integer commAreaId;

	// 通讯地址 （街道门牌号）
	private String compAddress;

	// 营业执照扫描件路径及文件名
	private String bussSignImg;

	// 税务登记证扫描件路径文件名
	private String taxSignImg;

	// 联系人微信号
	private String wechatNo;

	// 公司邮编
	private String compPostcode;

	// 公司 （固话）
	private String compPhone;

	// 公司网址
	private String compSite;

	// 供应商公司LOGO
	private String compLogo;

	// 采购员 存ID
	private Integer purchmanId;

	// 签约时间
	private Date signDate;

	// 最后修改时间
	private Date lastModifyTime;

	// 最后一次修改人姓名
	private String lastModifier;

	// 备注说明
	private String supplierRemark;

	// 企业描述（介绍、人数、实力、行业等。大字段）
	private String compDes;

	// 经度坐标
	private String longitude;

	// 纬度坐标
	private String latitude;

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public Integer getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Integer supplierId) {
		this.supplierId = supplierId;
	}

	public String getTaxSignNo() {
		return taxSignNo;
	}

	public void setTaxSignNo(String taxSignNo) {
		this.taxSignNo = taxSignNo;
	}

	public String getBussSignNo() {
		return bussSignNo;
	}

	public void setBussSignNo(String bussSignNo) {
		this.bussSignNo = bussSignNo;
	}

	public String getSupplierCode() {
		return supplierCode;
	}

	public void setSupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getLinkname() {
		return linkname;
	}

	public void setLinkname(String linkname) {
		this.linkname = linkname;
	}

	public String getLinkPhone() {
		return linkPhone;
	}

	public void setLinkPhone(String linkPhone) {
		this.linkPhone = linkPhone;
	}

	public String getLinkMobile() {
		return linkMobile;
	}

	public void setLinkMobile(String linkMobile) {
		this.linkMobile = linkMobile;
	}

	public String getSupplierStatus() {
		return supplierStatus;
	}

	public void setSupplierStatus(String supplierStatus) {
		this.supplierStatus = supplierStatus;
	}

	public String getFinanceType() {
		return financeType;
	}

	public void setFinanceType(String financeType) {
		this.financeType = financeType;
	}

	public Integer getPeriod() {
		return period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
	}

	public String getLinkEmail() {
		return linkEmail;
	}

	public void setLinkEmail(String linkEmail) {
		this.linkEmail = linkEmail;
	}

	public Integer getRegisAreaId() {
		return regisAreaId;
	}

	public void setRegisAreaId(Integer regisAreaId) {
		this.regisAreaId = regisAreaId;
	}

	public String getRegisAddress() {
		return regisAddress;
	}

	public void setRegisAddress(String regisAddress) {
		this.regisAddress = regisAddress;
	}

	public String getCompFax() {
		return compFax;
	}

	public void setCompFax(String compFax) {
		this.compFax = compFax;
	}

	public Integer getCommAreaId() {
		return commAreaId;
	}

	public void setCommAreaId(Integer commAreaId) {
		this.commAreaId = commAreaId;
	}

	public String getCompAddress() {
		return compAddress;
	}

	public void setCompAddress(String compAddress) {
		this.compAddress = compAddress;
	}

	public String getBussSignImg() {
		return bussSignImg;
	}

	public void setBussSignImg(String bussSignImg) {
		this.bussSignImg = bussSignImg;
	}

	public String getTaxSignImg() {
		return taxSignImg;
	}

	public void setTaxSignImg(String taxSignImg) {
		this.taxSignImg = taxSignImg;
	}

	public String getWechatNo() {
		return wechatNo;
	}

	public void setWechatNo(String wechatNo) {
		this.wechatNo = wechatNo;
	}

	public String getCompPostcode() {
		return compPostcode;
	}

	public void setCompPostcode(String compPostcode) {
		this.compPostcode = compPostcode;
	}

	public String getCompPhone() {
		return compPhone;
	}

	public void setCompPhone(String compPhone) {
		this.compPhone = compPhone;
	}

	public String getCompSite() {
		return compSite;
	}

	public void setCompSite(String compSite) {
		this.compSite = compSite;
	}

	public String getCompLogo() {
		return compLogo;
	}

	public void setCompLogo(String compLogo) {
		this.compLogo = compLogo;
	}

	public Integer getPurchmanId() {
		return purchmanId;
	}

	public void setPurchmanId(Integer purchmanId) {
		this.purchmanId = purchmanId;
	}

	public Date getSignDate() {
		return signDate;
	}

	public void setSignDate(Date signDate) {
		this.signDate = signDate;
	}

	public Date getLastModifyTime() {
		return lastModifyTime;
	}

	public void setLastModifyTime(Date lastModifyTime) {
		this.lastModifyTime = lastModifyTime;
	}

	public String getLastModifier() {
		return lastModifier;
	}

	public void setLastModifier(String lastModifier) {
		this.lastModifier = lastModifier;
	}

	public String getSupplierRemark() {
		return supplierRemark;
	}

	public void setSupplierRemark(String supplierRemark) {
		this.supplierRemark = supplierRemark;
	}

	public String getCompDes() {
		return compDes;
	}

	public void setCompDes(String compDes) {
		this.compDes = compDes;
	}

}