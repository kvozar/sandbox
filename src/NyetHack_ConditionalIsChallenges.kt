fun main(args:Array<String>) {
    val nameHero = "Madrigal"
    var healthHero = 10
    var damageHero = 0
    var blessedHero: Boolean = true
    val immortalHero: Boolean = false
    val karmaHero = (Math.pow(Math.random(), (110 - healthHero) / 100.0) * 20 ).toInt()
    val auraVisibleHero = blessedHero && healthHero > 50 || immortalHero
    //Аура
    val colorAura = when (karmaHero) {
        in 0..5 -> "red"
        in 6..10 -> "orange"
        in 11..15 -> "purple"
        in 16..20 -> "green"
        else -> "kui"
    }

  //  println("${if (auraVisibleHero == true) "$colorAura" else "NONE"}")

    val healthStatusHero = when (healthHero) {
        100 -> "excellent"
        in 90..99 -> "few scratches"
        in 75..89 -> if (blessedHero) {
            "has some minor wounds but is healing quite quickly!"
        } else {
            "minor wounds."
        }
        in 15..74 -> "hurt"
        else -> "awful"
    }
    val B = blessedHero
    val A = colorAura
    val H = healthStatusHero
    val HP = healthHero
    println("$nameHero blessed is ${if (blessedHero == true) "YES" else "NO"}, health is $healthStatusHero, HealthPoint=$healthHero, Aura is $colorAura")
}