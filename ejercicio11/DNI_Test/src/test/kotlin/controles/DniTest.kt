package controles


import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.TestInstance
import kotlin.test.Test
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

class DniTest {


    val dni = Dni()

        @Test
        fun numero(){
            val a = "49154157"
            val resultado = dni.numero(a)
            Assertions.assertTrue(resultado)
            println("numero bien")
        }
        @Test
        fun caracter (){
            println("caracter bien")
        }
        @Test
        fun letra (){
            println("letra bien")
        }
        @Test
        fun ignorar (){
            println("ignorar bien")
        }

}