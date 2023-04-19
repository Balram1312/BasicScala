object oops extends App{

  private class Fruits(val fruitname:String)
  private case class Vegetables(val vegname:String)

  private val banana: Fruits = new Fruits("Banana")
  private val spinach : Vegetables = Vegetables("Spinach")

  println(banana)
  println(banana.fruitname)
  println(spinach)

  private trait component {
    def processor(): String
    def ram(): String
  }

  private trait pcieComponent {
    def gpuBrand(): String
  }

  private case class pc(cpu: String, gpu: String, ramSize: String) extends component with pcieComponent {
    override def gpuBrand(): String = gpu
    override def processor(): String = cpu
    override def ram(): String = ramSize
  }

  private val JOE_PC = pc("intel", "nvidia", "8GB")
  println(JOE_PC.gpuBrand())
  println(JOE_PC.processor())
  println(JOE_PC.ram())
}
