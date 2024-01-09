

}

fun main(args: Array<String>) {
    val matriz = arrayOf(arrayOf(11,12,12), arrayOf(21,22,23), arrayOf(31,32,33))
    val newMatriz = arrayOf(arrayOf(0,0,0,0), arrayOf(0,0,0,0), arrayOf(0,0,0,0), arrayOf(0,0,0,0))

    fun copia (matriz:Array<Array<Int>>, newMatriz: Array<Array<Int>>) {
        for (i in matriz.indices){
            for (j in matriz.indices){
                if (matriz[i][j] == matriz[0][j]){
                    newMatriz[i][j] = matriz[i][j]
                }
                if (matriz[i][j] == matriz[1][j]){
                    newMatriz[i][j] = matriz[i][j]
                }
                if (matriz[i][j] == matriz[2][j]){
                    newMatriz[i][j] = matriz[i][j]
                }

            }

        }
    }
}