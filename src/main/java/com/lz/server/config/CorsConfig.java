package com.lz.server.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;


@Configuration
public class CorsConfig {
//    跨域配置
    private CorsConfiguration buildConfig() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.addAllowedOrigin("*");
        corsConfiguration.addAllowedHeader("*");
        corsConfiguration.addAllowedMethod("*");
        corsConfiguration.addExposedHeader("x-auth-token");
        corsConfiguration.addExposedHeader("access-control-allow-headers");
        corsConfiguration.addExposedHeader("access-control-allow-methods");
        corsConfiguration.addExposedHeader("access-control-allow-origin");
        corsConfiguration.addExposedHeader("access-control-max-age");
        corsConfiguration.addExposedHeader("X-Frame-Options");
        corsConfiguration.setAllowCredentials(false);
        corsConfiguration.setMaxAge(3600L);
        return corsConfiguration;
    }

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", buildConfig());
        return new CorsFilter(source);
    }
}