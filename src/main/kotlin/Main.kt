fun getInfo(StudentName: String, ID: Int): String {
    return "$StudentName $ID "
}
fun printInfo(StudentName:String , ID:Int) {
    println(getInfo(StudentName, ID))
}
fun main() {
    printInfo("mahmod ,", 1121123) }