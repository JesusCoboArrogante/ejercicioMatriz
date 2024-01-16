const val MAX = 5
fun main(args: Array<String>) {
val matrizOriginaral = arrayOf(arrayOf(1,2,3,4,5), arrayOf(6,7,8,9,10), arrayOf(11,12,13,14,15), arrayOf(16,17,18,19,20), arrayOf(21,22,23,24,25))
    val matrizEscritura = Array(MAX) {IntArray(MAX)}
  

    imprimir(matrizOriginaral)
    println()
    clonar(matrizOriginaral,matrizEscritura)



}

fun imprimir(matrizLectura: Array<Array<Int>>) {
    for (i  in   matrizLectura.indices){
        for (j in matrizLectura.indices){
            print("[${matrizLectura[i][j]}]")
        }
        println()
    }
}

fun clonar(matrizLectura: Array<Array<Int>>, matrizEscritura: Array<IntArray>) {
    for (i in matrizEscritura.indices){
        for (j in matrizEscritura.indices){
            matrizEscritura[i][j]= matrizLectura[j][i]
            print("[${matrizEscritura[i][j]}]")
        }
        println()
    }
}
