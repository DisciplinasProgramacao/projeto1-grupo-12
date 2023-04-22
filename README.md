[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-f4981d0f882b2a3f0472912d15f9806d57e124e0fc890972558857b51b24a6f9.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=10121674)
# Gestão de estoque
Sistema simples de gestão de estoque, com cálculo de preço de venda de produtos e atualização/reposição de produtos quando necessário.
- escrito/corrigido por mim (João)

---

## Nota base do grupo: 11,8

A nota final, que é individual, se dará pela nota acima, multiplicada por um peso entre 0 e 1 relativo ao acompanhamento semanal do projeto. Lembre-se: não é só a entrega do produto finalizado que importa, é todo o processo de sua construção e as entregas parciais para o “cliente”.

## Comentários

### Diagrama + aderência das classes ao diagrama: 2/2 pontos 
	
### Requisitos corretamente implementados: 5/6 pontos 
	- produto (preço, estoque)
        - não calcula corretamente preço de venda de produto criado (veja testes)
        - imposto não é parâmetro no preco de venda (atributo fixo/static final)
        - margem não é parâmetro para cálculo de margem (atributo do objeto)
	- estoque (valor, abaixo do estoque)
        - addQuantidade do produto já poderia retornar o valor gasto: não cabe ao estoque fazer este cálculo depois, realizando 2 gets de produto.
	- sistema (vender, comprar, consultas)

    - observações sem descontar ponto:
        - "set" de vocês está incrementando um valor. Não é adequado este nome, melhor seria algo como "registrar" ou "adicionar". 
### Documentação de código: 1,8/3 pontos 
    - parcial. Métodos sem documentação, parâmetros, retornos, documentação "óbvia"
	
### Testes (quantidade e qualidade): 3/4 pontos 
Testes devem testar também situações de erro.
	- produto: 1,5/2 pontos
	- estoque: 1,5/2 pontos

---

## Alunos integrantes da equipe

* Giovanni Bogliolo Sirihal Duarte
* Guilherme Drumond Silva
* Pedro Ramos Vidigal
* Rafael Ferraz Barra
* Samuel Lincoln de Oliveira Gomes



## Professores responsáveis
- escrito/corrigido por mim (João)
* João Caram


