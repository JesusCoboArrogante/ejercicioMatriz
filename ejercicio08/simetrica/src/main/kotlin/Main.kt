fun main(args: Array<String>) {
   val matrizO = arrayOf(arrayOf(5,1,3), arrayOf(1,8,2), arrayOf(3,2,59))
    val matrizT = Array (3) {IntArray(3)}

    transponer(matrizO, matrizT)
    prinMatrizO(matrizT)
    println()
    prinMatrizT(matrizO)
    println()
    contador(matrizT,matrizO)



}

fun prinMatrizT(matrizO: Array<Array<Int>>) {
        for (i in matrizO.indices){
            for (j in matrizO.indices){
                print("[${matrizO[i][j]}]")
            }
            println()
        }
}

fun contador(matrizT: Array<IntArray>, matrizO: Array<Array<Int>>) {
    var multiplicacion = matrizO.size * matrizT.size
    if (matrizO[0][0]==matrizT[matrizT.size-1][matrizT.size -1] && comparation(matrizT, matrizO) == multiplicacion){
        println("es simetrica")
    }else{
        println("no es simetrica")
    }

}

fun comparation(matrizT: Array<IntArray>, matrizO: Array<Array<Int>>): Int {
   var contador = 0
    var descontador = 0
    for (i in matrizT.indices){
        for (j in matrizO.indices){
            if (matrizT[i][j] == matrizO[i][j]){
                contador++
            }
        }
    }

    return contador
}

fun prinMatrizO(matrizT: Array<IntArray>) {
    for (i in matrizT.indices){
        for (j in matrizT.indices){
            print("[${matrizT[i][j]}]")
        }
        println()
    }
}

fun transponer(matrizO: Array<Array<Int>>, matrizT: Array<IntArray>) {
    for (i in matrizO.indices){
        for (j in matrizO.indices){
            matrizT[i][j]=matrizO[j][i]
        }
    }
}


