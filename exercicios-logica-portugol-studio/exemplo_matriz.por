programa
{
	
	funcao inicio()
	{
		inteiro numero[3][3]

		para(inteiro i = 0; i < 3; i++){	
			para(inteiro j = 0; j < 3; j++){
				escreva("Digite um numero: ")
				leia(numero[i][j])
			}
		}

		para(inteiro i = 0; i < 3; i++){	
			para(inteiro j = 0; j < 3; j++){
				escreva("[",numero[i][j],"]")
			}
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 49; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {numero, 6, 10, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */