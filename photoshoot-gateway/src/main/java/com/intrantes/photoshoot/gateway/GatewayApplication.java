package com.intrantes.photoshoot.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author jiangdongzhao
 * @version V1.0.0
 * @date 2019/8/7
 */
@EnableZuulProxy
@EnableOAuth2Sso
@EnableDiscoveryClient
@SpringBootApplication
public class GatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

    @Configuration
    @Order(SecurityProperties.DEFAULT_FILTER_ORDER)
    protected static class SecurityConfiguration extends WebSecurityConfigurerAdapter {

        @Override
        public void configure(WebSecurity web) throws Exception {
            super.configure(web);
            //        忽略任何以”/resources/”开头的请求
            web.ignoring()
                    .antMatchers("/resources/**");

        }

        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http

                    .authorizeRequests()
                    //Allow access to all static resources without authentication

                    .antMatchers("/","/photoshoot-auth/**","/photoshoot/**","/**/*.html","/**/*.jpg","/**/*.js")
                    .permitAll()
                    .antMatchers("/**")
//                    .antMatchers("/","/**/*.html").permitAll()
//                    .anyRequest()
                    .authenticated()
                    .and()
                    .csrf()
                    .disable();
//                    .csrf().csrfTokenRepository(csrfTokenRepository())
//                    .and()
//                    .addFilterAfter(csrfHeaderFilter(), SessionManagementFilter.class);

            //http.httpBasic().disable();
        }
//
//        private Filter csrfHeaderFilter() {
//            return new OncePerRequestFilter() {
//                @Override
//                protected void doFilterInternal(HttpServletRequest request,
//                                                HttpServletResponse response, FilterChain filterChain)
//                        throws ServletException, IOException {
//                    CsrfToken csrf = (CsrfToken) request.getAttribute(CsrfToken.class
//                            .getName());
//                    if (csrf != null) {
//                        Cookie cookie = WebUtils.getCookie(request, "XSRF-TOKEN");
//                        String token = csrf.getToken();
//                        if (cookie == null || token != null && !token.equals(cookie.getValue())) {
//                            cookie = new Cookie("XSRF-TOKEN", token);
//                            cookie.setPath("/");
//                            response.addCookie(cookie);
//                        }
//                    }
//                    filterChain.doFilter(request, response);
//                }
//            };
//        }
//
//        private CsrfTokenRepository csrfTokenRepository() {
//            HttpSessionCsrfTokenRepository repository = new HttpSessionCsrfTokenRepository();
//            repository.setHeaderName("X-XSRF-TOKEN");
//            return repository;
//        }
    }



//    @Configuration
//    @EnableResourceServer
//    public static class GatewayConfiguration extends ResourceServerConfigurerAdapter {
//        @Override
//        public void configure(final HttpSecurity http) throws Exception {
//            http.authorizeRequests()
//                    .antMatchers("/oauth/**")
//                    .permitAll()
//                    .antMatchers("/**")
//                    .authenticated();
//        }
//    }
}
