programa
{
	
	funcao inicio(){

/* 1) João, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. 
 *  Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de São Paulo 
 *  (50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente. João precisa que você faça um sistema que 
 *  leia a variável P (peso de tomates) e verifique se há excesso. Se houver, gravar na variável E (Excesso) 
 *  e na variável M o valor da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo 
 *  ZERO.
 */
		
		real pesoTotal, excesso, multa
		const real pesoLimite = 50.0
		const real multaPorQuilo = 4.00

		
		escreva("Digite o peso total de tomates: ")
		leia(pesoTotal)
		linha()

		se (pesoTotal > pesoLimite){
			excesso = (pesoTotal - pesoLimite)
			multa = (excesso * multaPorQuilo)
			escreva("\nVocê ultrapassou ", excesso ," kg do limite estabelecido pelo estado de São Paulo")
			escreva("\nA multa a ser paga é de R$ ", multa ,"\n")
		}
		senao {
			escreva("Tudo certo, não houve excesso de tomates.\n")
			
		}
		linha()
	}
	funcao linha(){
		escreva("-------------------------------------------------------------------------")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1032; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */