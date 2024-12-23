import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Registro_Envíos/1.Inicio/1.Principal/Principal-Home'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Registro_Envíos/1.Inicio/1.Principal/Selecc_sobre'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Registro_Envíos/1.Inicio/2.Login/6.LoginRUC10'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Registro de envíos/Test cases/Girley/input_Qu Envas_input_descripcion'), 'GHJK')

WebUI.setText(findTestObject('Registro de envíos/Test cases/Girley/input_Qu Envas_input_valor'), '12')

WebUI.click(findTestObject('Object Repository/Difuminado/button_Ingrese el punto de partida'))

WebUI.click(findTestObject('Registro de envíos/valorados/Page_Olva Courier  Datos Personales/a_PACASMAYO'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Difuminado/span_Ingrese el punto de llegada'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/Difuminado/input_LIMA_form-control'), 0)

WebUI.setText(findTestObject('Object Repository/Difuminado/input_LIMA_form-control'), 'lince')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Difuminado/a_LIMA - LIMA - LINCE'))

WebUI.click(findTestObject('Object Repository/Difuminado/span_Tipo de entrega'))

WebUI.click(findTestObject('Object Repository/Difuminado/a_Entrega a domicilio'))

WebUI.setText(findTestObject('Object Repository/Difuminado/input_Dnde lo entregamos_txt_direccion_entrega'), 'ARENALES LINCe')

WebUI.sendKeys(findTestObject('Object Repository/Difuminado/input_Dnde lo entregamos_txt_direccion_entrega'), Keys.chord(
        Keys.ENTER))

WebUI.scrollToElement(findTestObject('Object Repository/Difuminado/input_Direccin encontrada_txt_direccion_ent_ece73e'), 
    0)

WebUI.setText(findTestObject('Object Repository/Difuminado/input_Direccin encontrada_txt_direccion_ent_ece73e'), 'PRUEBa')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Difuminado/button_Tipo De Documento'))

WebUI.scrollToElement(findTestObject('Object Repository/Difuminado/button_Tipo De Documento'), 0)

WebUI.click(findTestObject('Object Repository/Difuminado/a_CARN EXT'))

WebUI.setText(findTestObject('Object Repository/Difuminado/input_CARN EXT_txt_consignado_dni'), '003680378')

WebUI.delay(3)

WebUI.verifyElementNotChecked(findTestObject('Object Repository/Difuminado/span_QAQA'), 0)

WebUI.click(findTestObject('Object Repository/Difuminado/button_CONTINUAR (1)'))

WebUI.click(findTestObject('Object Repository/Difuminado/button_IR A PAGAR S 7.30'))

WebUI.callTestCase(findTestCase('Registro_Envíos/1.Inicio/3.Pago_envíos/Pago_TDC'), [:], FailureHandling.STOP_ON_FAILURE)

