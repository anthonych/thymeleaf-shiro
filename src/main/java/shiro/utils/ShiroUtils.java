package shiro.utils;

import org.apache.shiro.SecurityUtils;

/**
 * User: Anthony_Chen
 * Date: 2013/3/19
 * Project: thymeleaf-extra
 */
public class ShiroUtils {

    private static final String ADMIN_ROLE_CODE = "ADMIN";

    public static boolean isAuthenticated() {

        return SecurityUtils.getSubject().isAuthenticated();
    }

    public static boolean isNotAuthenticated() {

        return !SecurityUtils.getSubject().isAuthenticated();
    }

    public static boolean hasRole(String roleCode) {
        return SecurityUtils.getSubject() != null && SecurityUtils.getSubject().hasRole(roleCode);
    }

    public static boolean isAdminRole() {
        return hasRole(ADMIN_ROLE_CODE);
    }
}
