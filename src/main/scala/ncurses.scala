package ohnosequencesBundles.statika

import ohnosequences.statika._, bundles._, instructions._


case object ncurses extends Bundle() {

  def install: Results = {
    Seq("yum", "install", "-y", "ncurses*") ->-
    success(s"${bundleName} is installed")
  }

}
