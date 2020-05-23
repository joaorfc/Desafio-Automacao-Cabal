Feature: Realizar Cadastro com E-mail em branco

Scenario: Deve validar se o cadastro apresenta mensagem de erro

Given Que eu acesso a tela de cadastro
When Preencho Dados não informando campo email
And Clico no botao de cadastrar
Then Devo visualizar uma mensagem de erro