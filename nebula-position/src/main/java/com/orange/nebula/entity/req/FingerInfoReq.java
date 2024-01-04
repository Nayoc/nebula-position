package com.orange.nebula.entity.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author Monolog
 * @date 2024/1/4 18:04
 */
@Data
@ApiModel("指纹位置信息")
public class FingerInfoReq {

    @ApiModelProperty("rss信号数据")
    private List<String> rssData;

    @ApiModelProperty("磁场数据")
    private List<String> magneticData;
}
