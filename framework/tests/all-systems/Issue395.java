// Test case for Issue 395:
// https://github.com/typetools/checker-framework/issues/395

import java.util.*;

@SuppressWarnings({"javari", "oigj"})
class Test {

    Object[] testMethod() {
        return new Object[] { new ArrayList<>() };
    }

}