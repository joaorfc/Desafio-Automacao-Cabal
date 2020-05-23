import br.com.automacao.cadastroUsuario.CadastroUsuarioPagina as CadastroUsuarioPagina
import br.com.automacao.detalheUsuario.DetalhaUsuarioAtualizadoPagina as DetalhaUsuarioAtualizadoPagina
import br.com.automacao.detalheUsuario.DetalhaUsuarioCriadoPagina as DetalhaUsuarioCriadoPagina
import br.com.automacao.editarUsuario.EditarUsuarioPagina as EditarUsuarioPagina
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

CadastroUsuarioPagina cadastroUsuario = new CadastroUsuarioPagina()


//Primeiro Realiza Cadastro de um novo usuário
DetalhaUsuarioCriadoPagina detalheUsuarioCadastrado = cadastroUsuario.visitaPagina().preencheFormularioCadasto('João', 'Ferreira', 
    'joao@teste.com', 'ASA SUL', 'UNB', 'ANALISTA DE TESTES', 'MASCULINO', '22').clicaBotaoCriar()
	
//Em seguida Realiza a chamada da página de Editar usuário e preenche o formulário com os novos dados
EditarUsuarioPagina editarUsuario = detalheUsuarioCadastrado.clicaBotaoEditar().preencheFormularioEditarUsuario(
    'Ricardo', 'Costa', 'ricardoC@gegov.com', 'AGUAS CLARAS', 'UNIP', 'GERENTE', 'MASCULINO', '22') 	

//Chamada da página que informa se os dados foram atualizados com sucesso
DetalhaUsuarioAtualizadoPagina detalharUsuarioAtualizado = editarUsuario.clicaBotaoCriarAtualizar()
	
assert detalharUsuarioAtualizado.mensagemSucesso()

WebUI.takeScreenshot('C:\\Users\\Joao_\\Katalon Studio\\DesafioTecnicoCabal\\ScreenShots\\Casos de teste\\UsuarioEditado.png')


