programa
{
	
	funcao inicio() {

/* 6) Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes categorias:
Infantil A = 5 a 7 anos
Infantil B = 8 a 11 anos
Juvenil A = 12 a 13 anos
Juvenil B = 14 a 17 anos
Adultos = Maiores de 18 anos

*/

		inteiro idade
	
		escreva("Digite sua idade: ")
		leia(idade)

		
			se (idade < 5) { 
				escreva("Muito jovem para participar.")
			}

			senao se (idade < 8 e idade >= 5) {
				escreva("Você pertence a categoria: Infantil A.")
			}

			senao se (idade < 12 e idade >= 8) {
				escreva("Você pertence a categoria: Infantil B.")
			}

			senao se (idade < 14 e idade >= 12) {
				escreva("Você pertence a categoria: Juvenil A.")
			}

			senao se (idade < 18 e idade >= 14) {
				escreva("Você pertence a categoria: Juvenil B.")
			}

			senao {
				escreva("Você pertence a categoria: Adultos.")
			}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 798; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */