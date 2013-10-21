package shiro.processor.attribute;

import org.thymeleaf.Arguments;
import org.thymeleaf.dom.Element;
import org.thymeleaf.processor.attr.AbstractConditionalVisibilityAttrProcessor;
import shiro.utils.ShiroUtils;

/**
 * User: Anthony_Chen
 * Date: 2013/3/19
 * Project: thymeleaf-extra
 */
public class AdminAttributeProcessor extends AbstractConditionalVisibilityAttrProcessor {

    private static final String ATTRIBUTE_NAME = "admin";

    public AdminAttributeProcessor() {
        super(ATTRIBUTE_NAME);
    }

    @Override
    protected boolean isVisible(Arguments arguments, Element element, String attrNames) {

        return ShiroUtils.isAdminRole();
    }

    @Override
    public int getPrecedence() {
        return 100;
    }
}
