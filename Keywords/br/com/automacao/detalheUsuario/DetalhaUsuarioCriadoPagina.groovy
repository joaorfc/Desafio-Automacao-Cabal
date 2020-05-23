package br.com.automacao.detalheUsuario

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import br.com.automacao.editarUsuario.EditarUsuarioPagina

//Pagina de retorno após o criação do usuário bem sucedido

public class DetalhaUsuarioCriadoPagina {

	def EditarUsuarioPagina clicaBotaoEditar(){
		WebUI.click(findTestObject('DetalhaUsuarioCriadoPagina/btn_Editar'))

		return new EditarUsuarioPagina()
	}

	def clicaBotaoVoltar(){
		WebUI.click(findTestObject('DetalhaUsuarioCriadoPagina/btn_Voltar'))
	}

	def boolean mensagemSucesso(){
		return WebUI.getText(findTestObject('Object Repository/DetalhaUsuarioCriadoPagina/div_usuario_cadastrado_sucesso')).contains('Usuário Criado com sucesso')
	}
}
