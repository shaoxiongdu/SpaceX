package cn.shoxiongdu.SpaceX.mapper;

import cn.shoxiongdu.SpaceX.entity.Role;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoleMapper extends BaseMapper<Role> {
    // 可以在此处添加RoleMapper特定的方法
}