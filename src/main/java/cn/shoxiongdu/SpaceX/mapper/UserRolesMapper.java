package cn.shoxiongdu.SpaceX.mapper;

import cn.shoxiongdu.SpaceX.entity.UserRoles;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRolesMapper extends BaseMapper<UserRoles> {
    // 可以在此处添加UserRolesMapper特定的方法
}