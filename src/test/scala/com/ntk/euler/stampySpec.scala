import org.scalatest.{Matchers, FlatSpec}

import com.ntk.euler.utils._
/**
 * Created by kypreos on 7/5/15.
 */

class stampySpec extends FlatSpec with Matchers {

  "stampy" should "just freakin be" in {
    val st = new stampy
    st.gwar() should equal(s"stampy")
  }
}