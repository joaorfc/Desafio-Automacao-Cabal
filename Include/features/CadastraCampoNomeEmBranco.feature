Feature: Realizar Cadastro com campo nome em branco

Scenario: Deve validar se o cadastro apresenta mensagem de erro

Given Que é acessada a tela de cadastro
When Preencho Dados não informando campo nome
And Clico no botao para cadastrar
Then Deve ser apresentada uma mensagem de erro