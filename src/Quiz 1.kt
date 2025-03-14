fun main() {
    kelas()
    asrama()

}

fun kelas() {
    var xi: Char = 'A'
    println(xi)
}

fun asrama() {
    var banat = mutableMapOf(
        "Aya" to "Kamar 4",
        "Faras" to "Kamar 12",
        "Rizz" to "Kamar 8"
    )
    banat["Carisa"] = "Kamar 18"
    println(banat)
}
