package cn.com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import cn.com.Bean.MainSupplier;
import cn.com.Bean.MainSupplierSku;

/**
 * @author :
 * @version 创建时间：2017年12月22日 下午2:46:33 类说明
 */
@Mapper
public interface GenerateDataMapper {

	void insertBatch(@Param("list") List<MainSupplier> list);

	void insertSku(@Param("list") List<MainSupplierSku> list);

}
