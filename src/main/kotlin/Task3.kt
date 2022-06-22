fun main(){
    val amount = 1000563_00
    val smallDiscount = 100_00
    val mediumDiscount = 0.05
    val melomanDiscount = 0.01
    val resultCost = if (amount < 1000_00) amount else if (amount < 10000_00) amount - smallDiscount else (amount - amount * mediumDiscount).toInt()
    val userMeloman = false
    val finalPrice = if (userMeloman) (resultCost - (resultCost * melomanDiscount)).toInt() else resultCost


    println("${finalPrice/100} руб. ${finalPrice%100} коп.")
}