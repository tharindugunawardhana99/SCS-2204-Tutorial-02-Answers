object variables{

    def main(args:Array[String]):Unit = {
        var i = 2
        var j = 2
        var k = 2

        var m = 5
        var n = 5

        var f = 12.0f
        var g = 4.0f

        var c = 'X'

        println("k + 12 * m = " + (k+12*m))         //62

        println("m / j = " + (m/j) )                //2

        println("n % j = " + (n%j))                 //1

        println("m / j * j = " + (m/j*j))           //4

        println("f + 10 * 5 + g = " + (f+10*5+g))   //66.0

        //println("++i * n = " + (++i*n))           //error
        i += 1
        println("++i * n = " + (i*n))               //15
    }
}