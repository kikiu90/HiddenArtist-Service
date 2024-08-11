package com.pop.backend.global.security.config;

import com.pop.backend.global.security.handler.AdminAccessDeniedHandler;
import com.pop.backend.global.security.handler.AdminAuthenticationEntryPoint;
import com.pop.backend.global.security.handler.OAuth2LoginSuccessHandler;
import com.pop.backend.global.security.handler.OAuth2LogoutHandler;
import com.pop.backend.global.security.handler.OAuth2LogoutSuccessHandler;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
@RequiredArgsConstructor
public class SecurityHandlerConfig {

  private final OAuth2LoginSuccessHandler oAuth2LoginSuccessHandler;

  private final OAuth2LogoutHandler oAuth2LogoutHandler;

  private final OAuth2LogoutSuccessHandler oAuth2LogoutSuccessHandler;

  private final AdminAccessDeniedHandler adminAccessDeniedHandler;

  private final AdminAuthenticationEntryPoint adminAuthenticationEntryPoint;

}