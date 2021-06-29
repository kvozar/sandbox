fun main(args:Array<String>) {
    val nameHero = "Madrigal"
    var healthHero = 10
    var damageHero = 0
    var blessedHero: Boolean = true
    val immortalHero: Boolean = false
    val auraStatusHero = auraColor(blessedHero,healthHero,immortalHero)
    var healthStatus = formatHealthStatusHero(healthHero, blessedHero)

    println("$nameHero $healthStatus" + " (Aura:$auraStatusHero" + ", Blesssed:${if (blessedHero) "YES" else "NO"})")
    castFireball(nameHero)
    // Status

}
private fun formatHealthStatusHero(healthHero: Int, blessedHero: Boolean):String {
    val healthStatus = when (healthHero) {
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
    return healthStatus
} //статус здоровья
private fun auraColor(blessedHero: Boolean, healthHero: Int, immortalHero: Boolean): String {
    val karmaHero = (Math.pow(Math.random(), (110 - healthHero) / 100.0) * 20).toInt()
    val auraVisibleHero = blessedHero && healthHero > 50 || immortalHero
    val colorAura = when (karmaHero) {
        in 0..5 -> "red"
        in 6..10 -> "orange"
        in 11..15 -> "purple"
        in 16..20 -> "green"
        else -> "None"
    }
    var auraStatus = ""
    if (auraVisibleHero == true) auraStatus = colorAura else auraStatus="None"
    return auraStatus
}     //Аура
private fun castFireball(nameHero: String) {
    var numFireballs = 2
    var bokalVine = ((Math.floor(Math.random()*100) + 1)/2).toInt()
    numFireballs = bokalVine
    val durman = when (bokalVine){
        in 1..10 -> "Tipsy"
        in 11..20 -> "Sloshed"
        in 21..30 -> "Soused"
        in 31..40 -> "Stewed"
        in 41..50 -> "..t0aSt3d"
        else -> "None"
    }
    println("A glass of Fireball springs into existance. (x$numFireballs) But $nameHero is $durman")
} //пьянь


