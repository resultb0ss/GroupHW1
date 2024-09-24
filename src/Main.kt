fun main() {
    val list: List<String> = listOf("One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten")
    println(list.groupBy { it.lowercase().first() })

    //Второе задание
    println(list.groupBy { it.length })
}