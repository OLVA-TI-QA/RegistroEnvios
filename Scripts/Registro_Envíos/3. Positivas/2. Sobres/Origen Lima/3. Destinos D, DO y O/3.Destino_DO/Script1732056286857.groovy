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

WebUI.callTestCase(findTestCase('Registro_Envíos/1.Inicio/2.Login/1.Login_DNI'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/input_Qu Envas_input_descripcion'), 'GHJK')

WebUI.setText(findTestObject('Object Repository/input_Qu Envas_input_valor'), '12')

WebUI.click(findTestObject('Object Repository/Registro de envíos/Test cases/span_PuntPartid'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Registro de envíos/Test cases/a_LIMA'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/span_Ingrese el punto de llegada'))

WebUI.click(findTestObject('Object Repository/span_AMAZONAS - BAGUA - BAGUA'))

WebUI.click(findTestObject('Object Repository/span_Tipo de entrega'))

WebUI.click(findTestObject('Object Repository/a_Recojo en tienda'))

WebUI.click(findTestObject('Object Repository/span_Tienda'))

WebUI.click(findTestObject('Object Repository/span_BAGUA CHICA - BAGUA - PJ ALFONSO UGARTE NRO 171 BAGUA CHICA'))

WebUI.click(findTestObject('Object Repository/span_Tipo De Documento'))

WebUI.click(findTestObject('Object Repository/a_DNI'))

WebUI.setText(findTestObject('Object Repository/input_CARN EXT_txt_consignado_dni'), '12345678')

WebUI.click(findTestObject('Object Repository/button_cntnuar(1)'))

WebUI.click(findTestObject('Object Repository/a_AGREGAR ENVOS'))

WebUI.click(findTestObject('Object Repository/img_Envo de cajas o paquetescon un peso mxi_37770f'))

WebUI.click(findTestObject('Object Repository/button_cntnuar'))

WebUI.click(findTestObject('Object Repository/span_ (1)'))

WebUI.setText(findTestObject('Object Repository/input_Qu Envas_input_descripcion'), 'PRUEBa')

WebUI.setText(findTestObject('Object Repository/input_Qu Envas_input_valor'), '2')

WebUI.rightClick(findTestObject('Object Repository/span_Ingrese el punto de llegada'))

WebUI.click(findTestObject('Object Repository/span_Ingrese el punto de llegada'))

WebUI.setText(findTestObject('Object Repository/input_Ingrese el punto de llegada_form-control'), 'san miguel')

WebUI.click(findTestObject('Object Repository/span_LIMA - LIMA - SAN MIGUEL'))

WebUI.click(findTestObject('Object Repository/span_He ledo y acepto los_checkmark'))

WebUI.click(findTestObject('Object Repository/a_Entrega a domicilio'))

WebUI.setText(findTestObject('Object Repository/input_dir_entreg'), 'SAN MIGUEL')

WebUI.sendKeys(findTestObject('Object Repository/input_dir_entreg'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/input_dir_ref'), 'FGHJk')

WebUI.click(findTestObject('Object Repository/button_TipDocument'))

WebUI.click(findTestObject('Object Repository/a_RUC'))

WebUI.setText(findTestObject('Object Repository/input_CARN EXT_txt_consignado_dni'), '12345678909')

WebUI.click(findTestObject('Object Repository/button_cntnuar(1)'))

WebUI.click(findTestObject('Object Repository/button_IR A PAGAR S 22.80'))

WebUI.setText(findTestObject('Object Repository/input_Tienes envos con recojo en tienda, se_b85f5d'), '1')

WebUI.setText(findTestObject('Object Repository/input_Tienes envos con recojo en tienda, se_af5936'), '2')

WebUI.setText(findTestObject('Object Repository/input_Tienes envos con recojo en tienda, se_653975'), '3')

WebUI.setText(findTestObject('Object Repository/input_Tienes envos con recojo en tienda, se_8615a0'), '4')

WebUI.click(findTestObject('Object Repository/center_Aceptar'))

WebUI.callTestCase(findTestCase('Registro_Envíos/1.Inicio/3.Pago_envíos/Pago_TDC'), [:], FailureHandling.STOP_ON_FAILURE)

