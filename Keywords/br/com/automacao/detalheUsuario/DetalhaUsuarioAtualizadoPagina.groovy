package br.com.automacao.detalheUsuario
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import br.com.automacao.editarUsuario.EditarUsuarioPagina

//Pagina de retorno após o atualização do usuário bem sucedido
public class DetalhaUsuarioAtualizadoPagina {

	def boolean mensagemSucesso(){

		return WebUI.getText(findTestObject('Object Repository/DetalhaUsuarioModificadoPagina/div_usuario_atualizado_sucesso')).contains('Seu Usuário foi Atualizado!')
	}
}
