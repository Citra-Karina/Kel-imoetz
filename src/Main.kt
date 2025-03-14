fun main() {
    rumah()
    jajanan()
    fasilitas()
    kulkas()

}

fun rumah(){
    val temanSMP = mutableMapOf(
        "Citra" to "Naga Jaya",
        "Tika" to "Villa Paradise",
        "Sofina" to "Pendawa"
    )
    temanSMP["Pijah"] ="Masheba"
    println(temanSMP)
}

fun jajanan() {
    val batuaji = mutableSetOf("MCD", "KFC", "Bebek Carok",
        "Mixue")
    batuaji.add("Pizza Hut")
    println(batuaji)
}

fun fasilitas() {
    val manIC = mutableSetOf("Lapangan", "Asrama", "Mess guru","Kantin",
        "RKB", "Perpus", "Lab", "PTSP")
    println(manIC)
}

fun kulkas () {
    val freezer = listOf("Sharp", "Aqua")
    println(freezer)
}