
```scala
package ohnosequencesBundles.statika

import ohnosequences.statika._

case object ncurses extends Bundle() {

  def instructions: AnyInstructions = cmd("yum")("install", "-y", "ncurses*")

}

```




[main/scala/ncurses.scala]: ncurses.scala.md