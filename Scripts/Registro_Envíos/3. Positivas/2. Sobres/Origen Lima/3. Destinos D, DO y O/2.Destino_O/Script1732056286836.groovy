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

WebUI.callTestCase(findTestCase('Registro_Envíos/1.Inicio/2.Login/3.Login_CE'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Registro de envíos/Test cases/Girley/input_Qu Envas_input_descripcion'), 'GHJK')

WebUI.setText(findTestObject('Registro de envíos/Test cases/Girley/input_Qu Envas_input_valor'), '12')

WebUI.click(findTestObject('Object Repository/Registro de envíos/Test cases/span_PuntPartid'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Registro de envíos/Test cases/a_LIMA'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Registro de envíos/Test cases/span_PuntLlegad'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Registro de envíos/Test cases/input_PuntLlegad'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Registro de envíos/Test cases/input_PuntLlegad'), 'aramango', FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/span_AMAZONAS - BAGUA - ARAMANGO'), 0)

WebUI.click(findTestObject('Object Repository/span_AMAZONAS - BAGUA - ARAMANGO'))

WebUI.setText(findTestObject('Registro de envíos/Test cases/input_dir_entreg'), 'ARAMANGO DIRECCIÓN DE PRUEBa')

WebUI.click(findTestObject('Object Repository/span_Entrega a domicilio'))

WebUI.click(findTestObject('Registro de envíos/Test cases/Girley/a_Recojo en tienda'))

WebUI.click(findTestObject('D, O, DO/button_Acept_D'))

WebUI.click(findTestObject('Object Repository/span_Entrega a domicilio'))

WebUI.click(findTestObject('Registro de envíos/Test cases/a_EntregDomic'))

WebUI.setText(findTestObject('Registro de envíos/Test cases/input_dir_entreg'), 'ARAMANGO DIRECCIÓN DE PRUEBa')

WebUI.setText(findTestObject('Registro de envíos/Test cases/input_dir_ref'), 'PRUEBa')

WebUI.scrollToElement(findTestObject('Object Repository/Registro de envíos/Test cases/button_TipDocument'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Registro de envíos/Test cases/button_TipDocument'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/span_CARN EXT'))

WebUI.setText(findTestObject('Difuminado/input_CARN EXT_txt_consignado_dni'), '003680378')

WebUI.click(findTestObject('Registro de envíos/Test cases/button_cntnuar(1)'))

WebUI.click(findTestObject('Object Repository/a_AGREGAR ENVOS'))

WebUI.click(findTestObject('Difuminado/img_Envo de cajas o paquetescon un peso mxi_37770f'))

WebUI.click(findTestObject('Registro de envíos/Test cases/button_cntnuar'))

WebUI.delay(5)

WebUI.setText(findTestObject('Difuminado/input_Qu Envas_input_descripcion'), 'PRUEBA')

WebUI.setText(findTestObject('Difuminado/input_Qu Envas_input_valor'), '12')

WebUI.click(findTestObject('Difuminado/span_Ingrese el punto de llegada'))

WebUI.setText(findTestObject('Registro de envíos/cargo adjunto/Page_Olva Courier  Datos Personales/input_Ingrese el punto de llegada_form-control'), 
    'viru')

WebUI.click(findTestObject('D, O, DO/a_LA LIBERTAD - VIRU - VIRU'))

WebUI.click(findTestObject('D, O, DO/button_Recojo en tienda'))

WebUI.click(findTestObject('D, O, DO/a_Entrega a domicilio'))

WebUI.verifyElementPresent(findTestObject('D, O, DO/div_No se encontr la opcin de entregas a domicilio en el destino seleccionado.                                Aceptar'), 
    0)

WebUI.verifyElementText(findTestObject('D, O, DO/p_No se encontr la opcin de entregas a domicilio en el destino seleccionado'), 
    'No se encontró la opción de entregas a domicilio en el destino seleccionado.')

WebUI.scrollToElement(findTestObject('D, O, DO/button_Acept_O'), 0)

WebUI.click(findTestObject('D, O, DO/button_Acept_O'))

WebUI.click(findTestObject('D, O, DO/button_Recojo en tienda'))

WebUI.click(findTestObject('Difuminado/a_Recojo en tienda'))

WebUI.click(findTestObject('D, O, DO/span_Tienda'))

WebUI.click(findTestObject('D, O, DO/span_VIRU - TIENDA VIRU - VIRU - AV PANAMERICANA NORTE NRO 381'))

WebUI.scrollToElement(findTestObject('Object Repository/span_No'), 0)

WebUI.click(findTestObject('Object Repository/span_No'))

WebUI.click(findTestObject('Object Repository/a_Si'))

WebUI.scrollToElement(findTestObject('Object Repository/Registro de envíos/Test cases/button_TipDocument'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Registro de envíos/Test cases/button_TipDocument'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/a_RUC'))

WebUI.setText(findTestObject('Difuminado/input_CARN EXT_txt_consignado_dni'), '12345678909')

WebUI.click(findTestObject('Registro de envíos/Test cases/button_cntnuar(1)'))

WebUI.scrollToElement(findTestObject('Object Repository/button_IR A PAGAR S 33.79'), 0)

WebUI.click(findTestObject('Object Repository/button_IR A PAGAR S 33.79'))

WebUI.setText(findTestObject('Object Repository/Difuminado/input_Tienes envos con recojo en tienda, se_b85f5d'), '1')

WebUI.setText(findTestObject('Object Repository/Difuminado/input_Tienes envos con recojo en tienda, se_af5936'), '2')

WebUI.setText(findTestObject('Object Repository/Difuminado/input_Tienes envos con recojo en tienda, se_653975'), '3')

WebUI.setText(findTestObject('Object Repository/Difuminado/input_Tienes envos con recojo en tienda, se_8615a0'), '4')

WebUI.click(findTestObject('Object Repository/Difuminado/b_Aceptar'))

WebUI.callTestCase(findTestCase('Registro_Envíos/1.Inicio/3.Pago_envíos/Pago_Tienda'), [:], FailureHandling.STOP_ON_FAILURE)

