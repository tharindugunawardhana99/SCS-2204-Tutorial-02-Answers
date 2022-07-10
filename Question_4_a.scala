object copmpany {

    def workingIncome(h1 : Int): Int = {
            return h1 * 250
        }

        def OTIncome(h2 : Int): Int = {
            return h2 * 85
        }

        def Income(h1:Int, h2:Int): Int = {
            return workingIncome(h1) + OTIncome(h2)
        }

        def tax(income:Int): Double = {
            return income * 0.12
        }

        def takeHomeSalary(h1:Int,h2:Int): Double = {
            return Income(h1,h2) - tax(Income(h1,h2))
        }

    def main(args:Array[String]): Unit = {

        println(workingIncome(40))
        println(OTIncome(30))
        println(Income(40,30))
        println(tax(Income(40,30)))
        println("Take Home Salary per week : " + takeHomeSalary(40,30))
    }
}