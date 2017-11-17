package cn.com.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import cn.com.Bean.User;

/**
 * @author :
 * @version 创建时间：2017年11月15日 下午2:47:39 类说明
 */
@Mapper
public interface UserMapper {

//	@Select("select username,login_userid as loginUserid,fullname,mobile from main_employee where user_id =  #{userId}")
	public User getByUserid(@Param("userId") int userId);

}
