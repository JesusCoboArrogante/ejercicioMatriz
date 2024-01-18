fun main(args: Array<String>) {
    val matrizO = arrayOf(arrayOf(1,2,3), arrayOf(4,5,6), arrayOf(7,8,9))
    val matrizP = Array(3) {IntArray(3)}
    var c1 = 0
    var c2 = 0
    var f1 = 0
    var f2 = 0

    println("que fila quieres intercambiar")
    f1 = readln().toIntOrNull()?:0
    println("otra fila")
    f2 = readln().toIntOrNull()?:0

    fila(matrizO, matrizP, f1, f2)
    
    println("que columna quieres intercambiar")
    c1 = readln().toIntOrNull()?:0
    println("otra columna")
    c2 = readln().toIntOrNull()?:0

    columna(matrizO, matrizP, c1, c2)
    
    nada(matrizP, matrizO)
    imprimirMatrizO(matrizO)
    println()
    imprimir(matrizP)

}
fun imprimirMatrizO(matrizO: Array<Array<Int>>) {
    for (i in matrizO.indices) {
        for (j in matrizO.indices) {
            print("[${matrizO[i][j]}]")
        }
        println()
    }
}

fun imprimir(matrizP: Array<IntArray>) {
    for (i in matrizP.indices) {
        for (j in matrizP.indices) {
            print("[${matrizP[i][j]}]")
        }
        println()
    }
}

fun nada(matrizP: Array<IntArray>, matrizO: Array<Array<Int>>) {
    for (i in matrizP.indices) {
        for (j in matrizP.indices) {
            if (matrizP[i][j] == 0) {
                matrizP[i][j] = matrizO[i][j]
            }
        }

    }
}

fun fila(matrizO: Array<Array<Int>>, matrizP: Array<IntArray>, f1: Int, f2: Int) {
    for (i in matrizO.indices) {
        for (j in matrizO.indices) {
            matrizP[f1][j] = matrizO[f2][j]
            matrizP[f2][j] = matrizO[f1][j]

        }

    }
}

fun columna(matrizO: Array<Array<Int>>, matrizP: Array<IntArray>, c1: Int, c2: Int) {
    for (i in matrizO.indices) {
        for (j in matrizO.indices) {
            matrizP[i][c1] = matrizO[i][c2]
            matrizP[i][c2] = matrizO[i][c1]

        }
      
    }
}