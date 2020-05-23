import br.com.automacao.cadastroUsuario.CadastroUsuarioPagina as CadastroUsuarioPagina
import br.com.automacao.detalheUsuario.DetalhaUsuarioCriadoPagina as DetalhaUsuarioCriadoPagina
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

CadastroUsuarioPagina cadastroUsuario = new CadastroUsuarioPagina()

DetalhaUsuarioCriadoPagina detalheUsuarioCadastrado = cadastroUsuario.visitaPagina().preencheFormularioCadasto('', 'Ferreira', 
    'email@teste.com.br', 'ASA SUL', 'UNB', 'ANALISTA DE TESTES', 'MASCULINO', '22').clicaBotaoCriar()

assert cadastroUsuario.mensagemNomeNaoPresente()

WebUI.takeScreenshot('C:\\Users\\Joao_\\Katalon Studio\\DesafioTecnicoCabal\\ScreenShots\\Casos de teste\\NomeNaoPresente.png')

