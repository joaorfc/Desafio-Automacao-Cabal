package br.com.automacao.cadastro
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import br.com.automacao.cadastroUsuario.CadastroUsuarioPagina
import br.com.automacao.detalheUsuario.DetalhaUsuarioCriadoPagina
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class CadastrarUsuarioCamposObrigatorios {
	CadastroUsuarioPagina cadastroUsuario = new CadastroUsuarioPagina()

	@Given("Que estou na tela incial de cadastro")
	def acessaTela() {
		cadastroUsuario.visitaPagina()
	}

	@When("Informo somente dados obrigatorios")
	def preencheFormularioCadastro() {
		cadastroUsuario.preencheFormularioCadasto('João', 'Ferreira',
				'joao@teste.com', '', '', '', '', '')
	}

	@And("Clico o botao cadastrar")
	def clicaBotaoCriar(){
		cadastroUsuario.clicaBotaoCriar()
	}

	@Then("Deve aparece mensagem de sucesso")
	def verificaMensagemSucesso() {
		DetalhaUsuarioCriadoPagina detalhaUsuarioCriado = new DetalhaUsuarioCriadoPagina()

		assert detalhaUsuarioCriado.mensagemSucesso()
		
		WebUI.takeScreenshot('C:\\Users\\Joao_\\Katalon Studio\\DesafioTecnicoCabal\\ScreenShots\\BDD\\CadastroUsuarioCampoObrigatorio.png')
	}
}