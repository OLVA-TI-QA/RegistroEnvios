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

WebUI.callTestCase(findTestCase('Registro_Envíos/1.Inicio/2.Login/3.Login_CE'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Registro de envíos/Test cases/button_SeleccArt'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Registro de envíos/Test cases/span_ART_LIMP'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Registro de envíos/Test cases/input_pqte_artic'), 'PRUEBA1', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Registro de envíos/Test cases/input_pqte_val'), '1234', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Registro de envíos/Test cases/input_pqte_larg'), '12', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Registro de envíos/Test cases/input_pqte_anch'), '14', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Registro de envíos/Test cases/input_pqte_alt'), '15', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Registro de envíos/Test cases/input_pqte_peso'), '1', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Registro de envíos/cargo adjunto/Page_Olva Courier  Datos Personales/span_Ingrese el punto de partida'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/cargo adjunto/Page_Olva Courier  Datos Personales/a_LIMA'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/cargo adjunto/Page_Olva Courier  Datos Personales/span_Ingrese el punto de llegada'))

WebUI.setText(findTestObject('Object Repository/Registro de envíos/cargo adjunto/Page_Olva Courier  Datos Personales/input_Ingrese el punto de llegada_form-control'), 
    'miraflores')

WebUI.click(findTestObject('Object Repository/Registro de envíos/cargo adjunto/Page_Olva Courier  Datos Personales/span_LIMA - LIMA - MIRAFLORES'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/cargo adjunto/Page_Olva Courier  Datos Personales/span_Tipo de entrega'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/cargo adjunto/Page_Olva Courier  Datos Personales/a_Recojo en tienda'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/cargo adjunto/Page_Olva Courier  Datos Personales/span_Tienda'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/cargo adjunto/Page_Olva Courier  Datos Personales/span_LARCOMAR - MIRAFLORES - MC DE LA RESER_44bceb'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/cargo adjunto/Page_Olva Courier  Datos Personales/span_LARCOMAR - MIRAFLORES - MC DE LA RESER_44bceb'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/cargo adjunto/Page_Olva Courier  Datos Personales/span_OLVA MIRAFLORES - AV. COMANDANTE ESPIN_8deea8'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/cargo adjunto/Page_Olva Courier  Datos Personales/span_No'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/cargo adjunto/Page_Olva Courier  Datos Personales/a_Si'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/cargo adjunto/Page_Olva Courier  Datos Personales/button_Tipo De Documento'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/cargo adjunto/Page_Olva Courier  Datos Personales/a_DNI'))

WebUI.setText(findTestObject('Object Repository/Registro de envíos/cargo adjunto/Page_Olva Courier  Datos Personales/input_CARN EXT_txt_consignado_dni'), 
    '12345678')

WebUI.click(findTestObject('Object Repository/Registro de envíos/cargo adjunto/Page_Olva Courier  Datos Personales/button_CONTINUAR'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Registro de envíos/cargo adjunto/Page_Olva Courier  Confirma tus datos/button_Cambiar'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/cargo adjunto/Page_Olva Courier  Confirma tus datos/span_Tipo de entrega'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/cargo adjunto/Page_Olva Courier  Confirma tus datos/span_Recojo en tienda'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/cargo adjunto/Page_Olva Courier  Confirma tus datos/button_Departamento - Provincia - Distrito'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/cargo adjunto/Page_Olva Courier  Confirma tus datos/span_CALLAO - CALLAO - CALLAO'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/cargo adjunto/Page_Olva Courier  Confirma tus datos/button_Tienda'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/cargo adjunto/Page_Olva Courier  Confirma tus datos/span_OLVA CANTA CALLAO - CALLAO - AV OFICIN_2e9f2e'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/cargo adjunto/Page_Olva Courier  Confirma tus datos/span_CALLAO - CALLAO - CALLAO'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/cargo adjunto/Page_Olva Courier  Confirma tus datos/span_LIMA - LIMA - ATE'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/cargo adjunto/Page_Olva Courier  Confirma tus datos/button_Tienda'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/cargo adjunto/Page_Olva Courier  Confirma tus datos/span_AGENTE OLVA ATE - PLAZA VITARTE BRI ST_5abd40'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/cargo adjunto/Page_Olva Courier  Confirma tus datos/button_Aceptar'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/cargo adjunto/Page_Olva Courier  Confirma tus datos/button_IR A PAGAR S 17.30'))

WebUI.setText(findTestObject('Object Repository/Registro de envíos/cargo adjunto/Page_Olva Courier  Confirma tus datos/input_Tienes envos con recojo en tienda, se_b85f5d'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Registro de envíos/cargo adjunto/Page_Olva Courier  Confirma tus datos/input_Tienes envos con recojo en tienda, se_af5936'), 
    '2')

WebUI.setText(findTestObject('Object Repository/Registro de envíos/cargo adjunto/Page_Olva Courier  Confirma tus datos/input_Tienes envos con recojo en tienda, se_653975'), 
    '3')

WebUI.setText(findTestObject('Object Repository/Registro de envíos/cargo adjunto/Page_Olva Courier  Confirma tus datos/input_Tienes envos con recojo en tienda, se_8615a0'), 
    '4')

WebUI.click(findTestObject('Object Repository/Registro de envíos/cargo adjunto/Page_Olva Courier  Confirma tus datos/b_Aceptar'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/Registro de envíos/Test cases/b_PagoAgencias'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Registro de envíos/Test cases/b_PagoAgencias'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/Registro de envíos/Test cases/button_PAGAR'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Registro de envíos/Test cases/button_PAGAR'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Registro de envíos/Test cases/span_CorreoPrevnt'), 'Se envió un correo con los detalles de su registro.', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Registro de envíos/Test cases/span_CorreoPrevnt'), 'Se envió un correo con los detalles de su registro.', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Registro de envíos/Test cases/div_NroPedid'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Registro de envíos/Test cases/button_cntnuar(2)'), FailureHandling.STOP_ON_FAILURE)

