fun main(){

    val tax = 0.0075
    val amount = readLine()?.toDouble() ?: return
    val totalCalc = amount * tax;
    if (totalCalc < 35){
        val taxFix = 35;
        val totalCash = amount - taxFix;
        println("Комиссия будет равна: $taxFix")
        println("Получается ты внёс $amount, а получишь на счёт $totalCash")
    } else if (totalCalc > 35)
    {
        val totalCash = amount - totalCalc;
        println("Комиссия будет равна: $totalCalc")
        println("Получается ты внёс $amount, а получишь на счёт $totalCash")
    }

}