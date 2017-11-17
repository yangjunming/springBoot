package cn.com.Bean;

import java.util.Date;
import java.util.List;

/**
 * @author :
 * @version 创建时间：2017年11月15日 下午3:33:48 类说明
 */
public class User {

	// 主键
	private int userId;
	// 用户名(登录名)
	private String username;
	// 登录用户主键
	private int loginUserid;
	// 姓名
	private String fullname;
	// 所属部门
	private int deptId;
	// 部门名(冗余)
	private String deptName;
	// 手机
	private String mobile;
	// 邮箱
	private String email;
	// 区域名称只读
	private String areaName;
	// 物流商名称只读
	private String compFullName;
	// 物流商主键
	private int logisId;
	// 区域主键
	private int areaId;
	// 角色表id
	private int roleId;
	// 头像
	private String userIcon;
	// 角色名(冗余)
	private String roleName;
	// 职责属性
	private String userType;
	// 最新更新时间
	private Date lastModifyDate;
	// 状态
	private String userStatus;
	// 物流商编码
	private String logisCode;
	// 身份证号
	private String identityCard;
	// 区域idlist(只有当前人员是订货员时才赋值)userType = "5"
	private List<Integer> areaIdList;
	// 物流商编码List(只有当期人员是商务人员时才赋值)userType = "2"
	private List<String> logisCodeList;
	// 是否可以看到他人订单 区域营销人员专属
	private Boolean canSeeOtherOrder;
	// 登录渠道 1:WEB,2:订货员,3:配送员，4:高老板,5:二级仓主
	private int loginChannel;
	// 是否具备创建二级仓的功能
	private int hasCreateSecondaryFunction;

	public Boolean getCanSeeOtherOrder() {
		return canSeeOtherOrder;
	}

	public void setCanSeeOtherOrder(Boolean canSeeOtherOrder) {
		this.canSeeOtherOrder = canSeeOtherOrder;
	}

	public int getLoginChannel() {
		return loginChannel;
	}

	public void setLoginChannel(int loginChannel) {
		this.loginChannel = loginChannel;
	}

	public List<Integer> getAreaIdList() {
		return areaIdList;
	}

	public void setAreaIdList(List<Integer> areaIdList) {
		this.areaIdList = areaIdList;
	}

	public List<String> getLogisCodeList() {
		return logisCodeList;
	}

	public void setLogisCodeList(List<String> logisCodeList) {
		this.logisCodeList = logisCodeList;
	}

	public String getIdentityCard() {
		return identityCard;
	}

	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getLoginUserid() {
		return loginUserid;
	}

	public void setLoginUserid(int loginUserid) {
		this.loginUserid = loginUserid;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getCompFullName() {
		return compFullName;
	}

	public void setCompFullName(String compFullName) {
		this.compFullName = compFullName;
	}

	public int getLogisId() {
		return logisId;
	}

	public void setLogisId(int logisId) {
		this.logisId = logisId;
	}

	public int getAreaId() {
		return areaId;
	}

	public void setAreaId(int areaId) {
		this.areaId = areaId;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getUserIcon() {
		return userIcon;
	}

	public void setUserIcon(String userIcon) {
		this.userIcon = userIcon;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public Date getLastModifyDate() {
		return lastModifyDate;
	}

	public void setLastModifyDate(Date lastModifyDate) {
		this.lastModifyDate = lastModifyDate;
	}

	public String getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	public String getLogisCode() {
		return logisCode;
	}

	public void setLogisCode(String logisCode) {
		this.logisCode = logisCode;
	}

	public int getHasCreateSecondaryFunction() {
		return hasCreateSecondaryFunction;
	}

	public void setHasCreateSecondaryFunction(int hasCreateSecondaryFunction) {
		this.hasCreateSecondaryFunction = hasCreateSecondaryFunction;
	}

}
