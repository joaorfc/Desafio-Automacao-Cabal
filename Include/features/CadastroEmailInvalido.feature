Feature: Realizar Cadastro com E-mail inválido

Scenario: Deve validar se o cadastro apresenta erro

Given Que acesso a tela de cadastro
When Preencho Dados informando email invalido 
And Clico no botao cadastrar
Then Devo ver mensagem de erro