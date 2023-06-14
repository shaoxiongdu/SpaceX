package cn.shoxiongdu.SpaceX.entity;

import cn.shoxiongdu.SpaceX.entity.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Permission extends BaseEntity {
    private String name;
    private String description;
}