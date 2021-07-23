programa
{
	
	funcao inicio()
	{
	
/*2. Faça um sistema que leia a idade de uma pessoa 
 * expressa em dias e mostre-a expressa em anos, meses e dias. 
*/
	
		inteiro idadeDias, ano, mes, dia
	
		escreva("Digite o número de dias da sua vida: ")
		leia(idadeDias)

		ano = (idadeDias / 365)
		mes = ((idadeDias % 365) / 30)
		dia = ((idadeDias % 365) % 30)

		escreva("O total de anos é: " + ano)
		escreva("\nO total de meses é: " + mes)
		escreva("\nO total de dias é: " + dia)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 401; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */