package com.nightawk.core.intercept;

import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.matcher.ElementMatcher;

/**
 * @author Xs.
 */
public interface MethodExclusion {

    ElementMatcher<MethodDescription> getExclusionMethod();

}