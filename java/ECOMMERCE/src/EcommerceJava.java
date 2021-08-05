import java.time.LocalDate;

public class EcommerceJava {
	public static void main(String[]args) {
		LocalDate dataAtual = LocalDate.now();
		System.out.println(dataAtual);
	}
	
	
	

	// FUNÇÃO NOTA FISCAL ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- //
	/* cria a nota fiscal no fim da compra e armazena valores de notas anteriores,
	por meio de matrizes, quando a pessoa pedir apertando a tecla [V].*/
/*	
	public static void notaFiscal (int x, int estoqueSelecionado[], double valorFatura, int quantidadeFaturas, String codigo[], String valor[], String produto[], int numeroNotaFiscal, int contadorNotaFiscal) {

		// se o numero da Nota for igual ao do contador, significa que é uma nova nota, ou seja, novos valores serão guardados.
		// Caso não seja igual, quer dizer que a pessoa está querendo uma nota passada, então o valor já havia sido guardado previamente.
		if (numeroNotaFiscal == contadorNotaFiscal) {
			
			anoCalendarioVetor[numeroNotaFiscal] = Tipos.inteiro_para_cadeia(Calendario.ano_atual(), 10);
			horaAtualVetor[numeroNotaFiscal] = Calendario.hora_atual(falso);
			minutoAtualVetor[numeroNotaFiscal] = Calendario.minuto_atual();
			
			if (Calendario.dia_mes_atual() < 10) {
				diaCalendario = Tipos.inteiro_para_cadeia(Calendario.dia_mes_atual(), 10);
				diaCalendario = (0+diaCalendario);
			}
			else {
				diaCalendario = Tipos.inteiro_para_cadeia(Calendario.dia_mes_atual(), 10);
			}
			if (Calendario.mes_atual() < 10) {
				mesCalendario = Tipos.inteiro_para_cadeia(Calendario.mes_atual(), 10);
				mesCalendario = (0+mesCalendario);
			}
			else {
				mesCalendario = Tipos.inteiro_para_cadeia(Calendario.mes_atual(), 10);
			}
		
	
			for (int colunaMatriz = 0 ; colunaMatriz < DIVERSIDADE_PRODUTOS ; colunaMatriz ++) {
				estoqueSelecionadoMatriz[numeroNotaFiscal][colunaMatriz] = estoqueSelecionado[colunaMatriz];
				
				codigoMatriz[numeroNotaFiscal][colunaMatriz] = codigo[colunaMatriz];
				
				valorMatriz[numeroNotaFiscal][colunaMatriz] = valor[colunaMatriz];
				
				produtoMatriz[numeroNotaFiscal][colunaMatriz] = produto[colunaMatriz];
			}	
			
			xVetor[numeroNotaFiscal] = x;
			
			valorFaturaVetor[numeroNotaFiscal] = valorFatura;
			
			quantidadeFaturasVetor[numeroNotaFiscal] = quantidadeFaturas;
			
			mesCalendarioVetor[numeroNotaFiscal] = mesCalendario;
			
			diaCalendarioVetor[numeroNotaFiscal] = diaCalendario;

			
		}		
	System.out.printf("\n ► NOTA FISCAL ---------------------------------------------------------------\n");
	System.out.printf("┌───────────────────────────────────────────────────────────────────────────────┐\n");
	System.out.printf("│ ┌──────────────────┬────────────────────┬───────────────────────────────────┐ │\n");
	System.out.printf("│ │                  │ DANFE              │ Código de Barras                  │ │\n");
	System.out.printf("│ │ Porto-Gol.com.br │ 0 - entrada        │ ||| ||| | ||||| || || ||||| ||    │ │\n");
	System.out.printf("│ │                  │ 1 - saída          │                                   │ │\n");
	System.out.printf("│ └──────────────────┴────────────────────┴───────────────────────────────────┘ │\n");
	System.out.printf("│ ┌─────────────────────────────┬─────────────────────────────────────────────┐ │\n");
	System.out.printf("│ │ Natureza da operação        │ Número de Protocolo                         │ │\n");
	System.out.printf("│ │ Venda de mercadorias        │ xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx     │ │\n");
	System.out.printf("│ └─────────────────────────────┴─────────────────────────────────────────────┘ │\n");
	System.out.printf("│  Destinatário/ remetente                                                      │\n");
	System.out.printf("│ ┌───────────────────────┬─────────────────────────┐┌────────────────────────┐ │\n");
	System.out.printf("│ │ Nome/ Razão Social    │ CPF                     ││ Data de emissão        │ │\n");
	System.out.printf("│ │ XXXXXXXXXXXXXX        │ XXX.XXX.XXX-XX          ││ \t%s/%s/%s\t      │ │\n", diaCalendarioVetor[numeroNotaFiscal], mesCalendarioVetor[numeroNotaFiscal], anoCalendarioVetor[numeroNotaFiscal]);
	System.out.printf("│ ├───────────────────┬───┴─────────────┬───────────┤├────────────────────────┤ │\n");
	System.out.printf("│ │ Endereço          │ Bairro/ Distrito│ CEP       ││ Data deSaída/ Entrada  │ │\n");
	System.out.printf("│ │ xxx xxxxxxxxxxx   │ xxxx xxxx       │ xxxxx-xxx ││ \t%s/%s/%s\t      │ │\n", diaCalendarioVetor[numeroNotaFiscal], mesCalendarioVetor[numeroNotaFiscal], anoCalendarioVetor[numeroNotaFiscal]);
	System.out.printf("│ ├────────────┬────┬─┴──────────┬──────┴───────────┤├────────────────────────┤ │\n");
	System.out.printf("│ │ Município  │ UF │ CEP        │ Fone             ││ Hora da Saída          │ │\n");
	System.out.printf("│ │ xxxxxxx    │ XX │ xxxxx-xxx  │ xxxxx-xxxx       ││ \t%d:%d\t\t      │ │\n",horaAtualVetor[numeroNotaFiscal], minutoAtualVetor[numeroNotaFiscal] );
	System.out.printf("│ └────────────┴────┴────────────┴──────────────────┘└────────────────────────┘ │\n");
	System.out.printf("│  Valor das Faturas                                                            │\n");
	System.out.printf("│ ┌───────────┬──────────────────────────────────┬────────────────────┬───────┐ │\n");
	System.out.printf("│ │ Número    │ Vencimento                       │ Valor              │ QTD   │ │\n");
	System.out.printf("│ │ XXXXXX    │ xx/xx/xxxx                       │ %.2f\t      │\t%d     │ │\n", valorFaturaVetor[numeroNotaFiscal], ,quantidadeFaturasVetor[numeroNotaFiscal]);
	System.out.printf("│ └───────────┴──────────────────────────────────┴────────────────────┴───────┘ │\n");
	System.out.printf("│  Itens da Nota Fiscal                                                         │\n");
	System.out.printf("│ ┌───────┬─────────────────────────┬──────┬──────────┬───────────┬───────────┐ │\n");
	System.out.printf("│ │ Cód.  │ Produto                 │ QTDE.│ Valor Un.│ Valor Tot.│ Imposto   │ │\n");
					

	// Série de formatações para que valores com diferentes números de caracteres não quebrem o layout da página.				
	for(x=0 ; x < DIVERSIDADE_PRODUTOS ; x++) {
		
		if (estoqueSelecionadoMatriz[numeroNotaFiscal][x] != 0) {
						
				if (numeroNotaFiscal == contadorNotaFiscal) {
					if (x <= 8) {
					formataCodigo = codigoMatriz[numeroNotaFiscal][x] + " ";
					}
					else {
					formataCodigo = codigoMatriz[numeroNotaFiscal][x];
					}
										
					if (estoqueSelecionadoMatriz[numeroNotaFiscal][x] <= 9) {
					formataEstoqueSelecionado[x] = estoqueSelecionadoMatriz[numeroNotaFiscal][x] + " ";
					}
					else {
					formataEstoqueSelecionado[x] = estoqueSelecionadoMatriz[numeroNotaFiscal][x] +"";	
					}
			
					formataValorTotal[x] = Tipos.real_para_cadeia(Mat.arredondar((Tipos.cadeia_para_real(valorMatriz[numeroNotaFiscal][x]) * estoqueSelecionadoMatriz[numeroNotaFiscal][x]), 2));
										
					formataImposto[x] = Tipos.real_para_cadeia(Mat.arredondar(((Tipos.cadeia_para_real(valorMatriz[numeroNotaFiscal][x]) / 100) * 15), 2));
										
			
					formataValorTotalNumero = Texto.numero_caracteres(Tipos.real_para_cadeia(Mat.arredondar((Tipos.cadeia_para_real(valorMatriz[numeroNotaFiscal][x]) * estoqueSelecionado[x]), 2)));
					formataImpostoNumero = Texto.numero_caracteres(Tipos.real_para_cadeia(Mat.arredondar(((Tipos.cadeia_para_real(valorMatriz[numeroNotaFiscal][x]) / 100) * 15), 2)));
		
					while (formataValorTotalNumero <= 7) {
					formataValorTotalNumero ++;
					formataValorTotal[x] += " ";
					}
					
					while (formataImpostoNumero <= 4) {
					formataImpostoNumero ++;
					formataImposto[x] += " ";		
					}
				}					
								
				System.out.printf("│ │ %s │ %s │  %s  │  %s  │ %s  │ %s     │ │\n", formataCodigo, produtoMatriz[numeroNotaFiscal][x], formataEstoqueSelecionado[x], ,valorMatriz[numeroNotaFiscal][x], formataValorTotal[x], formataImposto[x]);
			}
	}
	System.out.printf("│ └───────┴─────────────────────────┴──────┴──────────┴───────────┴───────────┘ │\n");
	System.out.printf("└───────────────────────────────────────────────────────────────────────────────┘\n");
					
	}
	// FIM DA FUNÇÃO NOTA FISCAL ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- //

	/* Nós somos alunes da Generation Brasil, esse é o nosso estudo sobre princípios da lógica de programação feito em Portugol.
	 *  Equipe:
	 *  Ana Carolina Gonzales 
	 *  Andrei Felipe
	 *  Fábio Campaner Suzuki
	 *  Marcos Coutinho
	 *  Stefani Tosi
	 *  Vinícios Lisboa
	 } */ 

}
