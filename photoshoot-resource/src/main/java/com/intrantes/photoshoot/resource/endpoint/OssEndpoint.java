package com.intrantes.photoshoot.resource.endpoint;

import com.intrantes.photoshoot.resource.endpoint.config.RestResult;
import com.intrantes.photoshoot.resource.endpoint.config.ResultGenerator;
import com.intrantes.photoshoot.resource.service.SMMSService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 静态资源存储点，图床
 *
 * @author jiangdongzhao
 * @version V1.0.0
 * @date 2019/11/12
 */
@RestController
@RequestMapping("/oss/endpoint")
public class OssEndpoint {
    private SMMSService smmsService;

    /**
     * 创建存储桶
     *
     * @param bucketName 存储桶名称
     * @return Bucket
     */

    @PostMapping("/upload")
    public RestResult upload(@RequestParam String bucketName) {
        smmsService.upload(bucketName);
        return ResultGenerator.ok();
    }
}
