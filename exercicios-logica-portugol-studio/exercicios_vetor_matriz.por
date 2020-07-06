programa
{
	inclua biblioteca Util --> util
	
	funcao inicio()
	{
		//Exercício 1
		/*
		inteiro vetor[5], maior_pontuacao = 0

		para(inteiro i=0; i<5; i++){
			escreva("Digite um valor de 0 a 10: ")
			leia(vetor[i])
		}

		limpa()

		para(inteiro i=0;i<5;i++){
			escreva("\n",i,"º número | Pontuação: ", vetor[i])
			se(maior_pontuacao < vetor[i]){
				maior_pontuacao = vetor[i]
			}
		}
		escreva("\n\nMaior pontuação: ",maior_pontuacao)
		*/
		
		//Exercício 2
		/
		inteiro vetor_dado[13], num_sorteado, media = 0, soma = 0, maior_num = 0, qtd_maior_num = 0

		escreva("Lançando dado 10x e anotando valores...")
		
		util.aguarde(1000)

		//Sorteia os números e guarda cada um deles no vetor
		para(inteiro i = 0; i <= 12; i++){
			num_sorteado = util.sorteia(1, 12)
			vetor_dado[i] = num_sorteado
		}

		//Soma
		para(inteiro i = 0; i <= 12; i++){
			soma += vetor_dado[i]
		}

		//Maior número
		para(inteiro i = 0; i <= 12; i++){
			se(maior_num < vetor_dado[i]){
				maior_num = vetor_dado[i]
			}
		}

		//Quantidade que o maior numero aparece
		para(inteiro i = 0; i <= 12; i++){
			se(maior_num == vetor_dado[i]){
				qtd_maior_num++
			}	
		}

		media = soma / 12

		//Lista os valores
		para(inteiro i = 0; i <= 12; i++){
			escreva("\n\nPosição ",i," | valor = ",vetor_dado[i])
		}

		escreva("\n\nResultado da soma: ", soma)

		escreva("\n\nMédia do valores lançados: ", media)

		escreva("\n\nMaior número: ", maior_num)

		escreva("\n\nQuantas vezes o maior número apareceu: ", qtd_maior_num)
		

		//Exercício 3
		 /*
		inteiro n1[4][6], n2[4][6]
		inteiro m1[4][6], m2[4][6]

		//Popula a matriz n1
		para(inteiro i = 0; i < 4; i++){
			para(inteiro j = 0; j < 6; j++){
				//escreva("Digite um número: ")
				n1[i][j] = util.sorteia(1, 10)
			}
		}

		//Popula a matriz n2
		para(inteiro i=0; i<4; i++){
			para(inteiro j=0; j<6; j++){
				//escreva("Digite um número: ")
				n2[i][j] = util.sorteia(1, 10)
			}
		}

		//A matriz m1 recebe a soma das matrizes n1 e n2
		para(inteiro i=0; i<4; i++){
			para(inteiro j=0; j<6; j++){
				m1[i][j] = n1[i][j] + n2[i][j]
			}
		}

		//A matriz m2 recebe a diferença das matrizes n1 e n2
		para(inteiro i=0; i<4; i++){
			para(inteiro j=0; j<6; j++){
				m2[i][j] = n1[i][j] - n2[i][j]
			}
		}
		*/		

		//Exercício 4
		/*
		inteiro matriz_3x3[3][3], num_dig, soma = 0, soma_diagonal = 0

		//Entrada dos valores na matriz
		para(inteiro i=0; i<3; i++){
			para(inteiro j=0; j<3; j++){
				escreva("Digite um valor: ")
				leia(matriz_3x3[i][j])
			}
		}

		//Soma total comum
		para(inteiro i=0; i<3; i++){
			para(inteiro j=0; j<3; j++){
				soma += matriz_3x3[i][j]
			}
		}

		//Soma da diagonal principal
		para(inteiro i=0; i<3; i++){
			soma_diagonal += matriz_3x3[i][i]
		}
		*/

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2756; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */