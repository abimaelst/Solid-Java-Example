# Dependency Inversion Principle

Esse princípo diz que depender de abstrações e não de classes concretas. 

Uncle Bob quebra a definição desse princípio em dois sub-itens:
 - “Módulos de alto nível não devem depender de módulos de baixo nível.”
 - “As abstrações não devem depender de detalhes. Os detalhes devem depender das abstrações.”
 
E isso se dá porque abstrações mudam menos e facilitam a mudança de comportamento e as futuras evoluções do código.

## Exemplos

Aplicando o princípio criei a class impressora, que abstraímos para impressora de mesa e mais um vez abstraímos para tipo específico de impressora de mesa no exemplo HP Colorida
