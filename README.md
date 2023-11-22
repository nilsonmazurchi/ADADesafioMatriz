# Desafio 07 - Matrizes - Opcional

### Contexto
- O código abaixo resolve o problema de multiplicação de matrizes 2x2.
- Avalie, pesquise e implemente, se necessário, as etapas a seguir
- Esta atividade vale +1 ponto extra

# Etapas
### Etapa 1
- Implemente antes um algoritmo que cria uma matriz para você dada uma dimensão passada por parâmetro
- Agora faça um algoritmo que permita também multiplicar por 3x3, 5x5, 10x10, 100x100, 1000x1000

### Etapa 2
- À medida que a matriz cresce, que mudou na lógica?
- Avalie também pelo JConsole o consumo de recursos por dimensionamentos
    - Qual foi o comportamento entre diferentes dimensões?
### Resposta
À medida que a matriz cresce, a lógica básica permanece a mesma, mas a eficiência do algoritmo e as
considerações de uso de memória podem se tornar mais críticas. Se a eficiência for uma
preocupação em cenários com matrizes muito grandes, seria recomendável explorar algoritmos mais
avançados e otimizações.

### Etapa 3
- Quantas multiplicações foram realizadas em cada caso? Implemente um contador.
- Há alguma forma de diminuir o número de múltiplicações? Se sim, qual?
    - Veja que as operações de adição podem ser realizadas em um único ciclo de clock de cpu
    - Operações de multiplicação geralmente exigem vários ciclos de clock
### Resposta
Sim, há várias formas de diminuir o número de multiplicações na multiplicação de matrizes. 
Uma estratégia comum é a utilização de algoritmos mais eficientes, como o algoritmo de Strassen. 
Além disso, técnicas como a multiplicação de matrizes por blocos também podem ser aplicadas para 
melhorar a eficiência.

### Código
```java
public class Matriz {

    public static void main(String[] args) {

        int[][] a = new int[][] {  {1,2}, {3,4} };
        int[][] b = new int[][] { {-1,3}, {4,2} };
        int[][] c = new int[2][2];

        System.out.println(b.length); // qtde linhas
        System.out.println( b[0].length); // qtde cols da linha 0

        for (int i = 0; i < a.length; i++) { // i-linha
            for (int j = 0; j < b.length; j++) { // j-coluna
                for (int k = 0; k < b.length; k++) { // k-fator
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
            System.out.println(Arrays.toString( c[i] ) );
        }

    }
}
```

### Referências
- [Multiplicação de Matrizes](https://www.somatematica.com.br/emedio/matrizes/matrizes4.php)
