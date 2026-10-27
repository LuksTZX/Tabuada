# ✖️ Tabuada com Número Primo

Programa em Java para o terminal que mostra a **tabuada** de um número até o limite escolhido e informa se esse número é **primo**.

## Como funciona

1. Digite um número.
2. Digite o limite da tabuada.
3. O programa imprime a tabuada de 1 até o limite.
4. No final, informa se o número digitado é primo.

## Exemplo de execução

```
Digite um numero:
7
Digite um numero limite:
5
7 X 1 = 7
7 X 2 = 14
7 X 3 = 21
7 X 4 = 28
7 X 5 = 35
7 é primo
```

## Tratamentos incluídos

- Letras no lugar de números não derrubam o programa: ele pede o valor de novo.
- Limite menor que 1 exibe um aviso em vez de não mostrar nada.
- Números menores que 2 (0, 1 e negativos) são tratados como não primos.

## Conceitos praticados

- Laço `for` para gerar a tabuada
- Métodos com retorno (`boolean ehPrimo(int n)`)
- Teste de primalidade até a raiz quadrada (`i * i <= n`)
- Tratamento de entrada inválida com `try/catch`

## Possíveis melhorias

- Listar todos os primos até o número digitado
- Menu para repetir sem fechar o programa
- Permitir tabuadas de números negativos ou decimais
