Feature: Cadastro Usuario Utilizando Somente os Campos Obrigatórios

Scenario: Deve validar o cadastro de usuario com sucesso

Given Que estou na tela incial de cadastro
When Informo somente dados obrigatorios
And Clico o botao cadastrar
Then Deve aparece mensagem de sucesso