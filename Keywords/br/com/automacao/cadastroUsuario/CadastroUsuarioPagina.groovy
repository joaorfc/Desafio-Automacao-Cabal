package br.com.automacao.cadastroUsuario

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import br.com.automacao.detalheUsuario.DetalhaUsuarioCriadoPagina

public class CadastroUsuarioPagina {


	//Abre o navegador e acessa URL
	def CadastroUsuarioPagina visitaPagina(){
		WebUI.openBrowser('', FailureHandling.STOP_ON_FAILURE)

		WebUI.navigateToUrl('https://automacaocombatista.herokuapp.com/users/new')

		return new CadastroUsuarioPagina()
	}

	//Preenche os campos da tela de Cadastro
	def CadastroUsuarioPagina preencheFormularioCadasto(String nome, String ultNome, String email, String endereco, String universidade, String profissao, String genero, String idade){

		WebUI.setText(findTestObject('Object Repository/CadastrarNovoUsuarioPagina/input_txt_nome'), nome)

		WebUI.setText(findTestObject('Object Repository/CadastrarNovoUsuarioPagina/input_txt_ultimo_nome'), ultNome)

		WebUI.setText(findTestObject('Object Repository/CadastrarNovoUsuarioPagina/input_txt_Email'), email)

		WebUI.setText(findTestObject('Object Repository/CadastrarNovoUsuarioPagina/input_txt_Endereco'), endereco)

		WebUI.setText(findTestObject('Object Repository/CadastrarNovoUsuarioPagina/input_tx_universidade'), universidade)

		WebUI.setText(findTestObject('Object Repository/CadastrarNovoUsuarioPagina/input_txt_profissao'), profissao)

		WebUI.setText(findTestObject('Object Repository/CadastrarNovoUsuarioPagina/input_txt_genero'), genero)

		WebUI.setText(findTestObject('Object Repository/CadastrarNovoUsuarioPagina/input_txt_Idade'), idade)

		return new CadastroUsuarioPagina()
	}

	def DetalhaUsuarioCriadoPagina clicaBotaoCriar(){

		WebUI.click(findTestObject('Object Repository/CadastrarNovoUsuarioPagina/btn_criar_usuario'))

		return new DetalhaUsuarioCriadoPagina()
	}

	//Recupera o texto da mensagem de erro e verifica se contém mensagem de erro
	def boolean mensagemEmailInvalido(){
		return WebUI.getText(findTestObject('CadastrarNovoUsuarioPagina/MensagensDeExceo/div_msg_erro_email_invalido')).contains('user.attributes.email.invalid')
	}
	//Recupera o texto da mensagem de erro e verifica se contém mensagem de erro
	def boolean mensagemEmailNaoPresente(){
		return WebUI.getText(findTestObject('CadastrarNovoUsuarioPagina/MensagensDeExceo/div_msg_erro_email_emBranco')).contains('user.attributes.email.blank')
	}
	//Recupera o texto da mensagem de erro e verifica se contém mensagem de erro
	def boolean mensagemNomeNaoPresente(){
		return  WebUI.getText(findTestObject('Object Repository/CadastrarNovoUsuarioPagina/MensagensDeExceo/div_msg_erro_nome_emBranco')).contains('user.attributes.name.blank')
	}
}