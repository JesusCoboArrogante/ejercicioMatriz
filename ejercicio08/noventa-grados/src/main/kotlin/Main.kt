fun main(args: Array<String>) {
    val matrizOriginal = arrayOf(
        arrayOf(1,2,3,4),
        arrayOf(5,6,7,8),
        arrayOf(9,10,11,12),
        arrayOf(13,14,15,16))

    val matrizNoventa = Array(5) {IntArray(5)}
    original(matrizOriginal)
    println()
    noventa(matrizOriginal, matrizNoventa)


}

fun original(matrizOriginal: Array<Array<Int>>) {
    for (i in matrizOriginal.indices){
        for (j in matrizOriginal.indices){
            print("[${matrizOriginal[i][j]}]")
        }
        println()
    }

}

fun noventa(matrizOriginal: Array<Array<Int>>, matrizNoventa: Array<IntArray>) {
    for (i in matrizOriginal.indices){
        for (j in (matrizOriginal.size -1 downTo 0)){
            matrizNoventa[i][j] = matrizOriginal[j][i]
            print("[${matrizNoventa[i][j]}]")
        }
        println()
    }
}

