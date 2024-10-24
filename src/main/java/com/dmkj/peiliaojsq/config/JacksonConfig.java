package com.dmkj.peiliaojsq.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.StreamWriteConstraints;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JacksonConfig {

    @Bean
    public ObjectMapper objectMapper() {
        // Create a new ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();

        // 设置 Jackson 允许的最大嵌套深度
        objectMapper.getFactory().setStreamWriteConstraints(
                StreamWriteConstraints.builder()
                        .maxNestingDepth(2000) // 您可以根据需要调整该值
                        .build()
        );

        return objectMapper;
    }
}
