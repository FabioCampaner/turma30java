programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio()
	{

/* 1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, 
 * coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
a) média do salário da população; 
b) média do número de filhos; 
c) maior salário; 
d) percentual de pessoas com salário até R$100,00.  
*/
		
		//constante com o total de pessoas
		const real TOTAL_PESQUISADO = 20.0
		
		//variáveis referentes aos filhos
		real mediaFilhos = 0.0
		inteiro filhos
		
		//variáveis referentes ao salário
		real salario, 
			mediaSalario = 0.0, 
			maiorSalario = 0.0, 
			pessoasSalarioMenor100 = 0.0
		
		
		para(inteiro contador = 1 ; contador <= TOTAL_PESQUISADO ; contador ++){
			
			escreva("Por favor, informe o salário atual do ", contador ,"º habitante: ")
			leia(salario)
			
			escreva("Por favor, informe a quantidade de filhos do ", contador ,"º habitante: ")
			leia(filhos)


			mediaSalario += salario

			mediaFilhos += filhos

			
			se (salario>maiorSalario) {
				maiorSalario = salario
			}

			se (salario <= 100) {
				pessoasSalarioMenor100 ++
			}
		}

		
		mediaSalario = (mediaSalario / TOTAL_PESQUISADO)

		mediaFilhos = (mediaFilhos / TOTAL_PESQUISADO)

		pessoasSalarioMenor100 = ((pessoasSalarioMenor100 / TOTAL_PESQUISADO) * 100)
		

		limpa()
		escreva("A média do salário da população é: ", Mat.arredondar(mediaSalario, 2) ,";\n")
		
		escreva("A média do número de filhos da população: ", Mat.arredondar(mediaFilhos, 2) ," filhos;\n")
		
		escreva("O maior salário registrado é de: R$ ", maiorSalario ,";\n")
		
		escreva("O percentual de pessoas com salário até R$100,00: ", Mat.arredondar(pessoasSalarioMenor100, 2) ,"%.\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1137; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */