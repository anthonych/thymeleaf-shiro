package shiro.processor.attribute;

import org.thymeleaf.Arguments;
import org.thymeleaf.dom.Element;
import org.thymeleaf.processor.attr.AbstractConditionalVisibilityAttrProcessor;
import shiro.utils.ShiroUtils;

/**
 * User: Anthony_Chen
 * Date: 2013/3/19
 * Project: toodoo
 */
public class AuthenticatedAttributeProcessor extends AbstractConditionalVisibilityAttrProcessor {

    private static final String ATTRIBUTE_NAME = "authenticated";

    public AuthenticatedAttributeProcessor() {
        super(ATTRIBUTE_NAME);
    }

    @Override
    protected boolean isVisible(Arguments arguments, Element element, String attrName) {
        String attrValue = element.getAttributeValue(attrName);

        if (Boolean.parseBoolean(attrValue)) {
            return ShiroUtils.isAuthenticated();
        } else if (!Boolean.parseBoolean(attrValue)) {
            return ShiroUtils.isNotAuthenticated();
        }

        return false;
    }

    @Override
    public int getPrecedence() {
        return 100;
    }
}
