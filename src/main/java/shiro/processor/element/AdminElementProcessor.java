package shiro.processor.element;

import org.thymeleaf.Arguments;
import org.thymeleaf.dom.Element;
import org.thymeleaf.processor.element.AbstractConditionalVisibilityElementProcessor;
import shiro.utils.ShiroUtils;

/**
 * User: Anthony_Chen
 * Date: 2013/3/18
 * Project: thymeleaf-extra
 */
public class AdminElementProcessor extends AbstractConditionalVisibilityElementProcessor {

    private static final String ELEMENT_NAME = "admin";

    public AdminElementProcessor() {
        super(ELEMENT_NAME);
    }

    @Override
    public int getPrecedence() {
        return 100;
    }

    @Override
    protected boolean isVisible(Arguments arguments, Element element) {

        return ShiroUtils.isAdminRole();
    }

    @Override
    protected boolean removeHostElementIfVisible(Arguments arguments, Element element) {
        return true;
    }
}
