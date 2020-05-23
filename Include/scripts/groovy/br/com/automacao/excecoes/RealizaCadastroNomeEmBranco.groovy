package br.com.automacao.excecoes
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import br.com.automacao.cadastroUsuario.CadastroUsuarioPagina
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When




class RealizaCadastroNomeEmBranco {

	CadastroUsuarioPagina cadastroUsuario = new CadastroUsuarioPagina()

	@Given("Que é acessada a tela de cadastro")
	def acessaPagina() {
		cadastroUsuario.visitaPagina()
	}

	@When("Preencho Dados não informando campo nome")
	def preencheFormularioCadastro() {
		cadastroUsuario.preencheFormularioCadasto('', 'Ferreira', 'joaoricardo@cabal.com', 'ASA SUL', 'UNB', 'ANALISTA DE TESTES', 'MASCULINO', '22')
	}

	@And("Clico no botao para cadastrar")
	def clicaBotaoCriar(){
		cadastroUsuario.clicaBotaoCriar()
	}

	@Then("Deve ser apresentada uma mensagem de erro")
	def verificaMensagemErro(){
		assert cadastroUsuario.mensagemNomeNaoPresente()
		
		WebUI.takeScreenshot('C:\\Users\\Joao_\\Katalon Studio\\DesafioTecnicoCabal\\ScreenShots\\BDD\\NomeEmBrancoCadastro.png')
	}
}