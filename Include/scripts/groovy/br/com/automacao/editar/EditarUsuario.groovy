package br.com.automacao.editar
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import br.com.automacao.cadastroUsuario.CadastroUsuarioPagina
import br.com.automacao.detalheUsuario.DetalhaUsuarioAtualizadoPagina
import br.com.automacao.detalheUsuario.DetalhaUsuarioCriadoPagina
import br.com.automacao.editarUsuario.EditarUsuarioPagina
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class EditarUsuario {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	CadastroUsuarioPagina cadastroUsuario = new CadastroUsuarioPagina()
	DetalhaUsuarioCriadoPagina detalheUsuarioCadastrado = new DetalhaUsuarioCriadoPagina()
	EditarUsuarioPagina editarUsuario = new EditarUsuarioPagina()

	@Given("Que estou na tela de editar usuario")
	def editaUsuarioCadastrado() {
		detalheUsuarioCadastrado = cadastroUsuario.visitaPagina().preencheFormularioCadasto('João', 'Ferreira',
				'joao@teste.com', 'ASA SUL', 'UNB', 'ANALISTA DE TESTES', 'MASCULINO', '22').clicaBotaoCriar()
	}

	@When("Informo os dados para modificaçao")
	def preencheFormularioEditarUsuario() {
		editarUsuario = detalheUsuarioCadastrado.clicaBotaoEditar().preencheFormularioEditarUsuario(
				'Ricardo', 'Costa', 'ricardoC@gegov.com', 'AGUAS CLARAS', 'UNIP', 'GERENTE', 'MASCULINO', '22')
	}

	@Then("Devo ver obter mensagem de sucesso")
	def verificaMensagemSucesso() {
		DetalhaUsuarioAtualizadoPagina detalhaUsuarioAtualizado
		assert detalhaUsuarioAtualizado.mensagemSucesso()
		
		WebUI.takeScreenshot('C:\\Users\\Joao_\\Katalon Studio\\DesafioTecnicoCabal\\ScreenShots\\BDD\\UsuarioEditado.png')
	}
}