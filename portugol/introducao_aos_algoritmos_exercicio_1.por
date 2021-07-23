programa
{
	funcao inicio()
	{

/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos, 
 * meses e dias e mostre-a expressa apenas em dias. 
*/
		
		inteiro ano, mes, dia, idade

	
		escreva("Digite o ano do seu nascimento: ")
		leia(ano)

		escreva("Digite o mês do seu nascimento: ")
		leia(mes)

		escreva("Digite o dia do seu nascimento: ")
		leia(dia)

		idade = (((2021 - ano) * 365) + (mes * 30) + dia)
		

		escreva("Você tem aproximadamente " + idade + " dias de idade!")

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 424; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */