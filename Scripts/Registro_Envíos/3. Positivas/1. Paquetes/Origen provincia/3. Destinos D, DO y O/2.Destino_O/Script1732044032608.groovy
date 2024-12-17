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

WebUI.callTestCase(findTestCase('Registro_Envíos/1.Inicio/1.Principal/Selecc_paquete'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Registro_Envíos/1.Inicio/2.Login/4.LoginCE-Colab'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Registro de envíos/Test cases/div_PROMCOLAB'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Registro de envíos/Test cases/1-Principal/span_'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/span_Seleccionar artculo'))

WebUI.click(findTestObject('Object Repository/a_CAJA'))

WebUI.setText(findTestObject('Object Repository/input_pqte_artic'), 'FGHJK')

WebUI.setText(findTestObject('Object Repository/input_pqte_val'), '12')

WebUI.setText(findTestObject('Object Repository/input_pqte_larg'), '13')

WebUI.setText(findTestObject('Object Repository/input_pqte_anch'), '14')

WebUI.setText(findTestObject('Object Repository/input_pqte_alt'), '15')

WebUI.setText(findTestObject('Object Repository/input_pqte_peso'), '1')

WebUI.click(findTestObject('Object Repository/Registro de envíos/valorados/Page_Olva Courier  Datos Personales/button_Ingrese el punto de partida'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/valorados/Page_Olva Courier  Datos Personales/span_CHEPEN'))

WebUI.click(findTestObject('Object Repository/span_Ingrese el punto de llegada'))

WebUI.setText(findTestObject('Object Repository/input_Ingrese el punto de llegada_form-control'), 'aramango')

WebUI.click(findTestObject('Object Repository/span_AMAZONAS - BAGUA - ARAMANGO'))

WebUI.setText(findTestObject('Object Repository/input_dir_entreg'), 'ARAMANGO DIRECCIÓN DE PRUEBa')

WebUI.sendKeys(findTestObject('Object Repository/input_dir_entreg'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/span_Entrega a domicilio'))

WebUI.click(findTestObject('Object Repository/a_Recojo en tienda'))

WebUI.click(findTestObject('Object Repository/button_Aceptar'))

WebUI.click(findTestObject('Object Repository/span_Entrega a domicilio'))

WebUI.click(findTestObject('Object Repository/a_EntregDomic'))

WebUI.setText(findTestObject('Object Repository/input_dir_ref'), 'PRUEBa')

WebUI.click(findTestObject('Object Repository/span_Tipo De Documento'))

WebUI.click(findTestObject('Object Repository/span_CARN EXT'))

WebUI.setText(findTestObject('Object Repository/input_CARN EXT_txt_consignado_dni'), '003680378')

WebUI.click(findTestObject('Object Repository/button_cntnuar(1)'))

WebUI.click(findTestObject('Object Repository/a_AGREGAR ENVOS'))

WebUI.click(findTestObject('Object Repository/img_Envo de cajas o paquetescon un peso mxi_37770f'))

WebUI.click(findTestObject('Object Repository/button_cntnuar'))

WebUI.setText(findTestObject('Object Repository/input_Qu Envas_input_descripcion'), 'PRUEBA')

WebUI.setText(findTestObject('Object Repository/input_Qu Envas_input_valor'), '12')

WebUI.click(findTestObject('Object Repository/span_Ingrese el punto de llegada'))

WebUI.setText(findTestObject('Object Repository/input_Ingrese el punto de llegada_form-control'), 'viru')

WebUI.click(findTestObject('D, O, DO/a_LA LIBERTAD - VIRU - VIRU'))

WebUI.click(findTestObject('Object Repository/span_No'))

WebUI.click(findTestObject('Object Repository/a_Si'))

WebUI.click(findTestObject('D, O, DO/button_Recojo en tienda'))

WebUI.click(findTestObject('D, O, DO/a_Entrega a domicilio'))

WebUI.verifyElementPresent(findTestObject('D, O, DO/div_No se encontr la opcin de entregas a domicilio en el destino seleccionado.                                Aceptar'), 
    0)

WebUI.verifyElementText(findTestObject('D, O, DO/p_No se encontr la opcin de entregas a domicilio en el destino seleccionado'), 
    'No se encontró oficinas en el destino seleccionado.')

WebUI.click(findTestObject('Object Repository/button_Aceptar'))

WebUI.click(findTestObject('D, O, DO/button_Recojo en tienda'))

WebUI.click(findTestObject('Registro de envíos/Test cases/1-Principal/a_Recojo en tienda'))

WebUI.click(findTestObject('D, O, DO/span_Tienda'))

WebUI.click(findTestObject('D, O, DO/span_VIRU - TIENDA VIRU - VIRU - AV PANAMERICANA NORTE NRO 381'))

WebUI.click(findTestObject('Object Repository/span_Tipo De Documento'))

WebUI.click(findTestObject('Object Repository/a_RUC'))

WebUI.setText(findTestObject('Object Repository/input_CARN EXT_txt_consignado_dni'), '12345678909')

WebUI.click(findTestObject('Object Repository/button_cntnuar(1)'))

WebUI.click(findTestObject('Object Repository/button_IR A PAGAR S 33.79'))

WebUI.callTestCase(findTestCase('Registro_Envíos/1.Inicio/3.Pago_envíos/Pago_Tienda'), [:], FailureHandling.STOP_ON_FAILURE)

