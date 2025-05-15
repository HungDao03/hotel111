//package com.hotelmanager.sercurity;
//
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.web.DefaultRedirectStrategy;
//import org.springframework.security.web.RedirectStrategy;
//import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
//import org.springframework.stereotype.Controller;
//
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//
//@Controller
//public class CustomerSuccessHandle extends SimpleUrlAuthenticationSuccessHandler {
//    private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
//
//    @Override
//    protected void handle(HttpServletRequest request, HttpServletResponse response, org.springframework.security.core.Authentication authentication) throws IOException, ServletException {
//        String targetUrl = determineTargetUrl(request, response, authentication);
//        if(response.isCommitted()) {
//            return;
//        }
//        redirectStrategy.sendRedirect(request, response, targetUrl);
//    }
//
//    protected String determineTargetUrl(Authentication authentication) {
//        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
//        List<String> roles = new ArrayList<>();
//
//        for (GrantedAuthority a : authorities) {
//            roles.add(a.getAuthority());
//        }
//
//        if (roles.contains("ROLE_ADMIN")) {
//            return "admin/admin/dashboard";
//        } else if (roles.contains("ROLE_USER")) {
//            return "user/user/rooms";
//        } else {
//            return "/accessDenied";
//        }
//    }
//
//
//    public void setRedirectStrategy(RedirectStrategy redirectStrategy) {
//        this.redirectStrategy = redirectStrategy;
//    }
//    public RedirectStrategy getRedirectStrategy() {
//        return redirectStrategy;
//    }
//}
