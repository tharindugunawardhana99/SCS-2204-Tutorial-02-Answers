object varianle{

    def main(args:Array[String]): Unit = {
        var a = 2
        var b = 3
        var c = 4
        var d = 5
        var g = 4.0f
        var k = 4.3f

        //println("--b * a + c *d-- = " + (--b * a + c * d--))
        b -= 1
        println("--b * a + c *d-- = " + (b*a+c*d))      //24
        d -= 1

        //println("a++ = " + (a++))                     error  
        println("a++ = " + a)                           //2
        a += 1


        println("-2 * (g - k) + c = " + (-2*(g-k)+c))   //4.6

        //println("c = c++ = " + (c++))                 //error
        println("c = c++ = " + c)                       //4

        //println("c = c++ * a++ = "  + (c++ * a++) )   //error
        c += 1
        println("c = ++c * a++ = "  + (c*a) )           //15
        a += 1
    }
}