package cn.iocoder.mall.order.api.dto;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 *
 * 订单评论 query
 *
 */
@Data
@Accessors(chain = true)
public class OrderCommentPageDTO {

    /**
     * 商品 sku id
     */
    private Integer productSkuId;

    /**
     * 页码
     */
    private Integer pageNo;

    /**
     * 每页条数
     */
    private Integer pageSize;

}
