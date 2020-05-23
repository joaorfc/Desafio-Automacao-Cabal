package br.com.automacao.editarUsuario

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import br.com.automacao.detalheUsuario.DetalhaUsuarioAtualizadoPagina

public class EditarUsuarioPagina {

		//Preenche os campos para atualização do usuário
	def EditarUsuarioPagina preencheFormularioEditarUsuario(String nome, String ultNome, String email, String endereco, String universidade, String profissao, String genero, String idade){

		WebUI.setText(findTestObject('Object Repository/EditarUsuarioPagina/input_txt_Nome'), nome)

		WebUI.setText(findTestObject('Object Repository/EditarUsuarioPagina/input_txt_ultimo_nome'), ultNome)

		WebUI.setText(findTestObject('Object Repository/EditarUsuarioPagina/input_txt_email'), email)

		WebUI.setText(findTestObject('Object Repository/EditarUsuarioPagina/input_txt_endereco'), endereco)

		WebUI.setText(findTestObject('Object Repository/EditarUsuarioPagina/input_txt_universidade'), universidade)

		WebUI.setText(findTestObject('Object Repository/EditarUsuarioPagina/input_txt_profissao'), profissao)

		WebUI.setText(findTestObject('Object Repository/EditarUsuarioPagina/input_txt_genero'), genero)

		WebUI.setText(findTestObject('Object Repository/EditarUsuarioPagina/input_txt_idade'), idade)

		//WebUI.click(findTestObject('Object Repository/EditarUsuarioPagina/btn_atualizar'))

		return new EditarUsuarioPagina()
	}

	def DetalhaUsuarioAtualizadoPagina clicaBotaoCriarAtualizar(){
		WebUI.click(findTestObject('Object Repository/EditarUsuarioPagina/btn_atualizar'))

		return new DetalhaUsuarioAtualizadoPagina()
	}
}
