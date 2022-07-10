object theater{

    def Attendees(price : Int): Int = {
        return (120 + (15 -price) / 5 * 20)
    }

    def Income(price : Int): Int = {
        return price * Attendees(price)
    }

    def Cost(price : Int): Int = {
        return (500 + 3 * Attendees(price))
    }

    def Profit(price : Int): Int = {
        return (Income(price) - Cost(price))
    }

    def main(args:Array[String]): Unit = {
        println("Attendees : " + Attendees(10))
        println("Rs : " + Income(10))
        println("Rs : " + Cost(10))
        println("Ticket price Rs : 10 , Profit Rs: " + Profit(10))

        println("\n")
        println("Attendees : " + Attendees(15))
        println("Rs : " + Income(15))
        println("Rs : " + Cost(15))
        println("Ticket price Rs : 15 , Profit Rs: " + Profit(15))

        println("\n")
        println("Attendees : " + Attendees(20))
        println("Rs : " + Income(20))
        println("Rs : " + Cost(20))
        println("Ticket price Rs : 20 , Profit Rs: " + Profit(20))

    }
}