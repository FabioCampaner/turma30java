programa
{
	
	funcao inicio()
	{
	const inteiro NUMERO_ALUNES = 4
	cadeia alunes[4]
	real notas[4]
	
		para (inteiro indice = 0 ; indice < NUMERO_ALUNES ; indice++) {
			escreva("Digite o nome do ", indice + 1 ,"º alune: ")
			leia(alunes[indice])
			
			escreva("Digite a nota do aluno: ")
			leia(notas[indice])
			limpa()
		}
		para (inteiro respostas = 0 ; respostas < NUMERO_ALUNES ; respostas++) {
			escreva("Alune ", alunes[respostas] ," tirou nota ", notas[respostas] ,"\n")
			se (notas[respostas] > 5) {
				escreva("Muito bem, continue assim!")
				
			}
			senao {
				escreva("Tome cuidado com a sua nota, continue estudando.")
			}
			
			escreva("\n-------------------------------------\n")
		
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 627; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */