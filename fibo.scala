object Tmp{
  def main(args: Array[String]):Unit = {
    var f0 = 0
    var f1 = 1
    val limit = 9
    var c =0

    for(i<- 2 to limit) {
        c = f0 + f1
        println(c)
        f0 = f1
        f1 = c
    }
    
  }
}
