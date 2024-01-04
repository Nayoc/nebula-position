package com.orange.nebula.controller;

import com.orange.nebula.entity.req.FingerInfoReq;
import com.orange.nebula.entity.vo.LocationVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;

/**
 * @author Monolog
 * @date 2024/1/4 17:42
 */
@RestController
@RequestMapping("/locate")
@Api(tags = "定位接口")
public class PositionController {

    @PostMapping(value = "/current")
    @ApiOperation("获取当前位置")
    public LocationVo position(@RequestBody FingerInfoReq req) {
        if(req.getMagneticData() == null || req.getRssData() == null){
            return null;
        }
        System.out.println(req.getRssData());
        System.out.println(req.getMagneticData());

        LocationVo vo = new LocationVo();
        vo.setLatitude("109.611");
        vo.setLongitude("69.821");
        return vo;
    }
}
