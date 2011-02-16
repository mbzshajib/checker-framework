import checkers.nullness.quals.AssertNonNullAfter;

public class Uninit8 {

  Object f;

  Uninit8() { setFields(); }

  @AssertNonNullAfter("f")
  void setFields() {
    f = new Object();
  }

}
