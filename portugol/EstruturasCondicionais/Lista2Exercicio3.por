programa
{
	inclua biblioteca Matematica --> Math
	
	funcao inicio(){

/*3) Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.

*/
		
		real numero[4]

		para (inteiro contador = 0; contador < 4; contador++){
		escreva("Digite o ", (contador + 1) ,"º número: ")
		leia(numero[contador])
		}
		
		se (Math.potencia(numero[2], 2.0) >= 1000) {
			escreva("\nO quadrado do 3º número é: ", Math.potencia(numero[2], 2.0))
		}
		senao {
			escreva("\n", numero[0] ," ao quadrado é ", Math.potencia(numero[0], 2.0))
			escreva("\n", numero[1] ," ao quadrado é ", Math.potencia(numero[1], 2.0))
			escreva("\n", numero[2] ," ao quadrado é ", Math.potencia(numero[2], 2.0))
			escreva("\n", numero[3] ," ao quadrado é ", Math.potencia(numero[3], 2.0))
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 484; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */