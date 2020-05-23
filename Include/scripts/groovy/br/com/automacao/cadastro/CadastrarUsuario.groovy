package br.com.automacao.cadastro
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import br.com.automacao.cadastroUsuario.CadastroUsuarioPagina
import br.com.automacao.detalheUsuario.DetalhaUsuarioCriadoPagina
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class CadastrarUsuario {

	CadastroUsuarioPagina cadastroUsuario = new CadastroUsuarioPagina()

	@Given("Que estou na tela de cadastro")
	def  acessaTela(){

		cadastroUsuario.visitaPagina()
	}

	@When("Informo os dados")
	def preencheFormularioCadastro(){
		cadastroUsuario.preencheFormularioCadasto('João', 'Ferreira', 'joao@teste.com', 'ASA SUL', 'UNB', 'ANALISTA DE TESTES',
				'MASCULINO', '22')
	}

	@And("Aciono o botao cadastrar")
	def clicaBotaoCriar(){
		cadastroUsuario.clicaBotaoCriar()
	}

	@Then("Devo ver mensagem de sucesso")
	def verificaMensagemSucesso() {
		DetalhaUsuarioCriadoPagina detalhaUsuarioCriado = new DetalhaUsuarioCriadoPagina()

		assert detalhaUsuarioCriado.mensagemSucesso()

		WebUI.takeScreenshot('C:\\Users\\Joao_\\Katalon Studio\\DesafioTecnicoCabal\\ScreenShots\\BDD\\CadastroUsuario.png')
	}
}