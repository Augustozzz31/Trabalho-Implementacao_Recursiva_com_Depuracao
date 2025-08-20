# Trabalho-Implementacao_Recursiva_com_Depuracao

## Relato Step Over
>escreva o relato

## Relato Step Into
>1- Breakpoint Linha 5: Ocorre a instanciação do Scanner.
>2- Linha 6: A criação de um vetor chamado vet, o qual armazena dados do tipo inteiro com tamanho 5.
>3- Linha 7: Criação de duas variáveis inteiras, num e cont, onde ambas recebem o o valor 0.
>4- Linha 8: Ocorre a chamada do método recursivo Menu(sc,num, vet, cont), o qual recebe por parâmetros o scanner, e as variáveis num, vet e cont.
>5- Linha 13: Exibição da mensagem "preencha o vetor de 5 números: ".
>6- Linha 14: O vetor vet recebe como valor a entrada do usuário através da variável num, a qual define a posição do valor definido pelo usuário (vet[num]).
>(introdução dos dados solicitados pelo scanner)
>7- Linha 15: num recebe +1 em seu valor (valor atual: num = 0).
>8- Linha 16: Ocorre a verificação do if(num == 5), que no momento é falsa (valor atual: num = 1).
>9- Linha 20: Chama novamente o método recursivo Menu(sc, num, vet, cont) para um looping.
>10- Linha 13: Exibição da mensagem "preencha o vetor de 5 números: ".
>11- Linha 14: O vetor vet[num] recebe como valor a entrada do usuário.
>(introdução dos dados solicitados pelo scanner)
>12- Linha 15: num recebe +1 em seu valor (valor atual: num = 1)
>13- Linha 16: Ocorre novamente a verificação do if(num == 5), que no momento é falsa (valor atual: num = 2).
>14- Linha 20: Chama novamente o método recursivo Menu(sc, num, vet, cont) para um looping.
>15- Linha 13: Exibição da mensagem "preencha o vetor de 5 números: ".
>16- Linha 14: O vetor vet[num] recebe como valor a entrada do usuário.
>(introdução dos dados solicitados pelo scanner)
>17- Linha 15: num recebe +1 em seu valor (valor atual: num = 2)
>18- Linha 16: Ocorre novamente a verificação do if(num == 5), que no momento é falsa (valor atual: num = 3).
>19- Linha 20: Chama novamente o método recursivo Menu(sc, num, vet, cont) para um looping.
>20- Linha 13: Exibição da mensagem "preencha o vetor de 5 números: ".
>21- Linha 14: O vetor vet[num] recebe como valor a entrada do usuário.
>(introdução dos dados solicitados pelo scanner)
>22- Linha 15: num recebe +1 em seu valor (num = 3)
>23- Linha 16: Ocorre novamente a verificação do if(num == 5), que no momento é falsa (valor atual: num = 4).
>24- Linha 20: Chama novamente o método recursivo Menu(sc, num, vet, cont) para um looping.
>26- Linha 13: Exibição da mensagem "preencha o vetor de 5 números: ".
>27- Linha 14: O vetor vet[num] recebe como valor a entrada do usuário.
>(introdução dos dados solicitados pelo scanner)
>28- Linha 15: num recebe +1 em seu valor (num = 4)
>29- Linha 16: Ocorre novamente a verificação do if(num == 5), que agora finalmente é verdadeira (valor atual: num = 5).
>30- Linha 17: Chama o método Mostrar(cont, vet), passando por parâmetros o valor de vet e cont (valor atual de cont: cont = 0).
>31- Linha 24: Ocorre a exibição do vet[cont] (no caso vet[0]).
>32- Linha 25: cont recebe +1 em seu valor (cont = 0).
>33- Linha 26: Ocorre a verificação do if(cont == 5), que no momento é falsa (valor atual: cont = 1).
>34-  Linha 29: Chama novamente o método recursivo Mostrar(cont, vet) para um looping.
>35- Linha 24: Ocorre a exibição do vet[cont] (no caso vet[1]).
>36- Linha 25: cont recebe +1 em seu valor (cont = 1).
>37- Linha 26: Ocorre a verificação do if(cont == 5), que no momento é falsa (valor atual: cont = 2).
>38- Linha 29: Chama novamente o método recursivo Mostrar(cont, vet) para um looping.
>39- Linha 24: Ocorre a exibição do vet[cont] (no caso vet[2]).
>40- Linha 25: cont recebe +1 em seu valor (cont = 2).
>41- Linha 26: Ocorre a verificação do if(cont == 5), que no momento é falsa (valor atual: cont = 3).
>42- Linha 29: Chama novamente o método recursivo Mostrar(cont, vet) para um looping.
>43- Linha 24: Ocorre a exibição do vet[cont] (no caso vet[3]).
>44- Linha 25: cont recebe +1 em seu valor (cont = 3).
>45- Linha 26: Ocorre a verificação do if(cont == 5), que no momento é falsa (valor atual: cont = 4).
>46- Linha 29: Chama novamente o método recursivo Mostrar(cont, vet) para um looping.
>47- Linha 24: Ocorre a exibição do vet[cont] (no caso vet[4]).
>48- Linha 25: cont recebe +1 em seu valor (cont = 4).
>49- Linha 26: Ocorre a verificação do if(cont == 5), que é verdadeira (valor atual: cont = 5).
>50- Linha 27: Ocorre o return do método Mostrar(cont,vet).
>51- Linha 30: Vai para o fechamento das chaves do método atual Mostrar(cont,vet).
>52- Linha 18: Ocorre o return do método Menu(sc,num, vet, cont).
>53- Linha 21: Vai para o fechamento das chaves do método atual Menu(sc,num, vet, cont).
>54- Linha 9: Ocorre o fechamento do Scanner (sc.close()).
>55- Linha 10: Vai para o fechamento das chaves do public static void main(String[] args).
>Fim do programa