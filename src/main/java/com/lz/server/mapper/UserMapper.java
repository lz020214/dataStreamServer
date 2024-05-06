package com.lz.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lz.server.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}
