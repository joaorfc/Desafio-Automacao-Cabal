package br.com.automacao.excecoes
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import br.com.automacao.cadastroUsuario.CadastroUsuarioPagina
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


class RealizaCadastroEmailemBranco {

	CadastroUsuarioPagina cadastroUsuario = new CadastroUsuarioPagina()

	@Given("Que eu acesso a tela de cadastro")
	def acessaPagina() {
		cadastroUsuario.visitaPagina()
	}

	@When("Preencho Dados não informando campo email")
	def preencheFormularioCadastro() {
		cadastroUsuario.preencheFormularioCadasto('João', 'Ferreira', '', 'ASA SUL', 'UNB', 'ANALISTA DE TESTES', 'MASCULINO', '22')
	}

	@And("Clico no botao de cadastrar")
	def clicaBotaoCriar(){
		cadastroUsuario.clicaBotaoCriar()
	}

	@Then("Devo visualizar uma mensagem de erro")
	def verificaMensagemErro(){
		assert cadastroUsuario.mensagemEmailNaoPresente()
		
		WebUI.takeScreenshot('C:\\Users\\Joao_\\Katalon Studio\\DesafioTecnicoCabal\\ScreenShots\\BDD\\EmailEmBrancoCadastro.png')
	}
}