package com.dobby.petclinic.dao.mapper;

import tk.mybatis.mapper.additional.idlist.IdListMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 自定义公共的Mapper
 * @author liguoqing
 */
public interface CustomMapper<T> extends Mapper<T>, MySqlMapper<T>, IdListMapper {

}
