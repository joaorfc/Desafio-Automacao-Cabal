import br.com.automacao.cadastroUsuario.CadastroUsuarioPagina
import br.com.automacao.detalheUsuario.DetalhaUsuarioCriadoPagina
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

CadastroUsuarioPagina cadastroUsuario = new CadastroUsuarioPagina()

DetalhaUsuarioCriadoPagina detalheUsuarioCadastrado = cadastroUsuario.visitaPagina().preencheFormularioCadasto('João', 'Ferreira',
	'', 'ASA SUL', 'UNB', 'ANALISTA DE TESTES', 'MASCULINO', '22').clicaBotaoCriar()

assert cadastroUsuario.mensagemEmailNaoPresente()

WebUI.takeScreenshot('C:\\Users\\Joao_\\Katalon Studio\\DesafioTecnicoCabal\\ScreenShots\\Casos de teste\\EmailNaoPresente.png')