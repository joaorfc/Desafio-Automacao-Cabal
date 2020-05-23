package br.com.automacao.excecoes
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import br.com.automacao.cadastroUsuario.CadastroUsuarioPagina
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


class RealizaCadastroEmailInvalido {

	CadastroUsuarioPagina cadastroUsuario = new CadastroUsuarioPagina()


	@Given("Que acesso a tela de cadastro")
	def acessaPagina(String name) {
		cadastroUsuario.visitaPagina()
	}

	@When("Preencho Dados informando email invalido")
	def preencheFormularioCadastro(int value) {
		cadastroUsuario.preencheFormularioCadasto('João', 'Ferreira', 'invalidoEmail', 'ASA SUL', 'UNB', 'ANALISTA DE TESTES', 'MASCULINO', '22')
	}

	@And("Clico no botao cadastrar")
	def clicaBotaoCriar(){
		cadastroUsuario.clicaBotaoCriar()
	}

	@Then("Devo ver mensagem de erro")
	def verificaMensagemErro(){
		assert cadastroUsuario.mensagemEmailInvalido()
		
	WebUI.takeScreenshot('C:\\Users\\Joao_\\Katalon Studio\\DesafioTecnicoCabal\\ScreenShots\\BDD\\CadastroEmailInvalido.png')
	}
}