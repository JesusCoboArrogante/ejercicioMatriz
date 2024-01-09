fun main(args: Array<String>) {
    val matriz = arrayOf(arrayOf(11,12,13), arrayOf(21,22,23), arrayOf(31,32,33))
    val vector = IntArray(3)
    for (i in matriz.indices){
        for (j in matriz.indices){
            print("-[${matriz[i][j]}]-")
        }
        println()
    }

    colocar(matriz, vector)
    println()
    println("        ${suma(matriz)}")

}
fun suma (matriz: Array<Array<Int>>): Int{
    var filaUno = 0
    var filaDos = 0
    var filaTres = 0

    for (i in matriz.indices){
        for (j in matriz.indices){

            if (matriz[i][j] == matriz[0][j] && matriz[i][j] > filaUno ){
                filaUno = matriz[i][j]
            }
            if (matriz[i][j] == matriz[1][j] && matriz[i][j] > filaDos ){
                filaDos = matriz[i][j]
            }
            if (matriz[i][j] == matriz[2][j] && matriz[i][j] > filaTres ){
                filaTres = matriz[i][j]
            }

        }

    }
    var final = filaUno + filaDos + filaTres
    return final /3
}



fun colocar (matriz: Array<Array<Int>>, vector: IntArray){
    for (i in matriz.indices){
        for (j in matriz.indices){


                if (matriz[i][j] == matriz[0][j] && matriz[i][j] > vector[0] ){
                    vector[0] = matriz[i][j]

                }
                if (matriz[i][j] == matriz[1][j] && matriz[i][j] > vector[1] ){
                    vector[1] = matriz[i][j]
                }
                if (matriz[i][j] == matriz[2][j] && matriz[i][j] > vector[2] ){
                    vector[2] = matriz[i][j]
                }



        }


    }
    for (i in vector.indices){
        print("-[${vector[i]}]-")
    }
}




