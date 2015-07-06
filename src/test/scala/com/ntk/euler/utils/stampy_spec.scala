import org.scalatest.{Matchers, FlatSpec}

import com.ntk.euler.utils._
/**
 * Created by kypreos on 7/5/15.
 */

object stampySpec extends FlatSpec with Matchers {

  "stampy" should "just freakin be" in {
    stampy() should startWith ("stampy")
  }

}