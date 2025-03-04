package com.gihub.netroforge.opentelemetry_inspector.config;

import com.gihub.netroforge.opentelemetry_inspector.filter.gzip.GzipDecompressionFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GzipCompressionConfiguration {
    @Bean
    public FilterRegistrationBean<GzipDecompressionFilter> gzipDecompressionFilter() {
        FilterRegistrationBean<GzipDecompressionFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new GzipDecompressionFilter());
        registrationBean.addUrlPatterns("/*");
        return registrationBean;
    }
}
