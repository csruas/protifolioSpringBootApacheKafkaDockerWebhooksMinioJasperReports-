package io.github.cursodsousa.icompras.faturamento.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "minio")
@Data
public class MinioPropos {

    private String url;
    private String accessKey;
    private String secretKey;
    private String bucketName;
}
