programa
{
	
	funcao inicio()
	{

/*8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem 
 * do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que a percentagem 
 * do distribuidor seja de 28% e os impostos de 45%, escrever um sistema que leia o custo de 
 * fábrica de um carro e escreva o custo ao consumidor. 
*/

		real custoFabrica, custoFinal, porcentagemDistribuidor, porcentagemImpostos
		
		
		escreva("Digite o custo de fábrica do carro: ")
		leia(custoFabrica)


		porcentagemDistribuidor = ((custoFabrica / 100) * 28)
		
		porcentagemImpostos = ((custoFabrica / 100) * 45)
		
		custoFinal = (custoFabrica + porcentagemDistribuidor + porcentagemImpostos)
		

		escreva("O custo do carro para o consumidor será de: " + custoFinal + " reais")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 704; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */