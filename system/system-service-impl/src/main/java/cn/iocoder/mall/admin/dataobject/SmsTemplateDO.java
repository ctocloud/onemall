package cn.iocoder.mall.admin.dataobject;

import cn.iocoder.common.framework.dataobject.DeletableDO;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 短信 模板
 *
 * @author Sin
 * @time 2019/5/16 12:31 PM
 */
@Data
@Accessors(chain = true)
@TableName("sms_template")
public class SmsTemplateDO extends DeletableDO {

    /**
     * 编号
     */
    private Integer id;
    /**
     * 模板编号 (第三方的)
     */
    private Integer smsSignId;
    /**
     * 短信签名 id
     */
    private String platformId;
    /**
     * 短信模板
     */
    private String template;
    /**
     * 审核状态
     *
     * 1、审核中
     * 2、审核成功
     * 3、审核失败
     */
    private Integer applyStatus;
    /**
     * 审核信息
     */
    private String applyMessage;
}
