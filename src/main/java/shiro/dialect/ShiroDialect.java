package shiro.dialect;

import org.thymeleaf.dialect.AbstractDialect;
import org.thymeleaf.processor.IProcessor;
import shiro.processor.attribute.AdminAttributeProcessor;
import shiro.processor.attribute.AuthenticatedAttributeProcessor;
import shiro.processor.element.AdminElementProcessor;

import java.util.HashSet;
import java.util.Set;

/**
 * User: Anthony_Chen
 * Date: 2013/3/19
 * Project: thymeleaf-extra
 */
public class ShiroDialect extends AbstractDialect {
    private static final String PREFIX = "shiro";

    @Override
    public String getPrefix() {
        return PREFIX;
    }

    @Override
    public boolean isLenient() {
        return false;
    }

    @Override
    public Set<IProcessor> getProcessors() {
        final Set<IProcessor> processors = new HashSet<IProcessor>();
        processors.add(new AdminElementProcessor());
        processors.add(new AdminAttributeProcessor());
        processors.add(new AuthenticatedAttributeProcessor());

        return processors;
    }
}
