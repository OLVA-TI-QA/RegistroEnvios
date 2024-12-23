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

WebUI.callTestCase(findTestCase('Registro_Envíos/1.Inicio/2.Login/2.Log_DNI-Colab'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Registro de envíos/Test cases/Girley/input_Qu Envas_input_descripcion'), 'GHJK')

WebUI.setText(findTestObject('Registro de envíos/Test cases/Girley/input_Qu Envas_input_valor'), '12')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Registro de envíos/valorados/Page_Olva Courier  Datos Personales/button_Ingrese el punto de partida'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/valorados/Page_Olva Courier  Datos Personales/a_TRUJILLO'))

WebUI.click(findTestObject('Object Repository/Difuminado/span_Ingrese el punto de llegada'))

WebUI.click(findTestObject('D, O, DO/span_AMAZONAS - BAGUA - BAGUA'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/Difuminado/span_Tipo de entrega'), 0)

WebUI.click(findTestObject('Object Repository/Difuminado/span_Tipo de entrega'))

WebUI.click(findTestObject('Object Repository/Difuminado/a_Recojo en tienda'))

WebUI.click(findTestObject('Object Repository/Difuminado/span_Tienda'))

WebUI.click(findTestObject('D, O, DO/span_BAGUA CHICA - BAGUA - PJ ALFONSO UGARTE NRO 171 BAGUA CHICA'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Difuminado/button_Tipo De Documento'))

WebUI.click(findTestObject('Object Repository/Difuminado/a_DNI'))

WebUI.setText(findTestObject('Object Repository/Difuminado/input_CARN EXT_txt_consignado_dni'), '12345678')

WebUI.delay(3)

WebUI.verifyElementNotChecked(findTestObject('Object Repository/Difuminado/span_QAQA'), 0)

WebUI.click(findTestObject('Object Repository/Difuminado/button_CONTINUAR (1)'))

WebUI.click(findTestObject('Object Repository/Difuminado/button_IR A PAGAR S 7.30'))

WebUI.setText(findTestObject('Object Repository/Difuminado/input_Tienes envos con recojo en tienda, se_b85f5d'), '1')

WebUI.setText(findTestObject('Object Repository/Difuminado/input_Tienes envos con recojo en tienda, se_af5936'), '2')

WebUI.setText(findTestObject('Object Repository/Difuminado/input_Tienes envos con recojo en tienda, se_653975'), '3')

WebUI.setText(findTestObject('Object Repository/Difuminado/input_Tienes envos con recojo en tienda, se_8615a0'), '4')

WebUI.click(findTestObject('Object Repository/Difuminado/b_Aceptar'))

WebUI.callTestCase(findTestCase('Registro_Envíos/1.Inicio/3.Pago_envíos/Pago_Efectivo'), [:], FailureHandling.STOP_ON_FAILURE)

