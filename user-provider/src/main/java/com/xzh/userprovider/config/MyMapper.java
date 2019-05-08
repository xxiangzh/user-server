package com.xzh.userprovider.config;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 通用mapper
 * @author 向振华
 * @date 2019/05/08 11:00
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
