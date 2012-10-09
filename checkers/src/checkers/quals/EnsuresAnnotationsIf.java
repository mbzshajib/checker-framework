package checkers.quals;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * A meta annotation to allow multiple conditional postcondition annotations.
 *
 * @author Stefan Heule
 * @see EnsuresAnnotationIf
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD })
public @interface EnsuresAnnotationsIf {
    EnsuresAnnotationIf[] value();
}