package com.robbendev.shop.order.infrastucture.mapper;

import com.robbendev.shop.order.infrastucture.dataobject.OrderDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 * 数据库访问接口
 * </p>
 *
 * @author robbendev
 * @since 2021/4/1 5:27 下午
 */
@Mapper
public interface OrderMapper {

    @Select("select * from orders where id =#{id}")
    OrderDO getById(Long id);
}
