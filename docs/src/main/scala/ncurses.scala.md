
```scala
package ohnosequencesBundles.statika

import ohnosequences.statika._, bundles._, instructions._

case object ncurses extends Bundle() {

  def instructions: AnyInstructions = cmd("yum")("install", "-y", "ncurses*")

}

```




[main/scala/ncurses.scala]: ncurses.scala.md