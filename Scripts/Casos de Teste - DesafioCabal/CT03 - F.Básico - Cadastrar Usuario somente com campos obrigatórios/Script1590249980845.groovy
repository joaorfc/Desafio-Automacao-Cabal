import br.com.automacao.cadastroUsuario.CadastroUsuarioPagina as CadastroUsuarioPagina
import br.com.automacao.detalheUsuario.DetalhaUsuarioCriadoPagina as DetalhaUsuarioCriadoPagina
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


CadastroUsuarioPagina cadastroUsuario = new CadastroUsuarioPagina()

DetalhaUsuarioCriadoPagina detalheUsuarioCadastrado = cadastroUsuario.visitaPagina().preencheFormularioCadasto('João', 'Ferreira', 
    'joao@teste.com', '', '', '', '', '').clicaBotaoCriar()

assert detalheUsuarioCadastrado.mensagemSucesso()

WebUI.takeScreenshot('C:\\Users\\Joao_\\Katalon Studio\\DesafioTecnicoCabal\\ScreenShots\\Casos de teste\\UsuarioCadastradoCamposObrigatorios.png')