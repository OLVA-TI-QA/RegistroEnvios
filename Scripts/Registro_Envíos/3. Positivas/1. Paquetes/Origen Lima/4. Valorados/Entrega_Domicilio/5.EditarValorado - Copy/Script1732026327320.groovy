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

WebUI.openBrowser('')

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev-registrodeenvios.olvacourier.com/principal')

WebUI.click(findTestObject('Object Repository/Registro de envíos/valorados/Page_Olva Courier  Home/span_'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/valorados/Page_Olva Courier  Home/img_Envo de cajas o paquetescon un peso mxi_37770f'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/valorados/Page_Olva Courier  Home/span_He ledo y acepto los_checkmark'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/valorados/Page_Olva Courier  Home/button_CONTINUAR'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/valorados/Page_Olva Courier  Datos Personales/span_Tipo De Documento'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/valorados/Page_Olva Courier  Datos Personales/a_CARN EXT. (Boleta)'))

WebUI.setText(findTestObject('Object Repository/Registro de envíos/valorados/Page_Olva Courier  Datos Personales/input_CARN EXT. (Boleta)_txt_documento_cliente'), 
    '003680378')

WebUI.setText(findTestObject('Object Repository/Registro de envíos/valorados/Page_Olva Courier  Datos Personales/input_Qu Envas_input_descripcion'), 
    'DFGHj')

WebUI.setText(findTestObject('Object Repository/Registro de envíos/valorados/Page_Olva Courier  Datos Personales/input_Qu Envas_input_valor'), 
    '12')

WebUI.click(findTestObject('Object Repository/Registro de envíos/valorados/Page_Olva Courier  Datos Personales/button_Ingrese el punto de partida'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/valorados/Page_Olva Courier  Datos Personales/a_TRUJILLO'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/valorados/Page_Olva Courier  Datos Personales/button_TRUJILLO'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/valorados/Page_Olva Courier  Datos Personales/span_CHEPEN'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/valorados/Page_Olva Courier  Datos Personales/button_CHEPEN'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/valorados/Page_Olva Courier  Datos Personales/a_JAUJA'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/valorados/Page_Olva Courier  Datos Personales/span_JAUJA'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/valorados/Page_Olva Courier  Datos Personales/a_ICA'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/valorados/Page_Olva Courier  Datos Personales/button_ICA'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/valorados/Page_Olva Courier  Datos Personales/a_PACASMAYO'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/valorados/Page_Olva Courier  Datos Personales/span_PACASMAYO'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/valorados/Page_Olva Courier  Datos Personales/a_AREQUIPA'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/valorados/Page_Olva Courier  Datos Personales/span_AREQUIPA'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/valorados/Page_Olva Courier  Datos Personales/a_CUSCO'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/valorados/Page_Olva Courier  Datos Personales/button_CUSCO'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/valorados/Page_Olva Courier  Datos Personales/a_CHILCA'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/valorados/Page_Olva Courier  Datos Personales/button_CHILCA'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/valorados/Page_Olva Courier  Datos Personales/a_LIMA'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/valorados/Page_Olva Courier  Datos Personales/span_Ingrese el punto de llegada'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/valorados/Page_Olva Courier  Datos Personales/span_'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/valorados/Page_Olva Courier  Datos Personales/span_Ingrese el punto de llegada'))

WebUI.setText(findTestObject('Object Repository/Registro de envíos/valorados/Page_Olva Courier  Datos Personales/input_Ingrese el punto de llegada_form-control'), 
    'san borja')

WebUI.click(findTestObject('Object Repository/Registro de envíos/valorados/Page_Olva Courier  Datos Personales/a_LIMA - LIMA - SAN BORJA'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/valorados/Page_Olva Courier  Datos Personales/span_Tipo de entrega'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/valorados/Page_Olva Courier  Datos Personales/a_Recojo en tienda'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/valorados/Page_Olva Courier  Datos Personales/span_Tienda'))

WebUI.setText(findTestObject('Object Repository/Registro de envíos/valorados/Page_Olva Courier  Datos Personales/input_Ingrese el punto de llegada_form-control'), 
    '')

WebUI.click(findTestObject('Object Repository/Registro de envíos/valorados/Page_Olva Courier  Datos Personales/span_OLVA SAN BORJA - AV. AVIACION 3532 - S_56a9b5'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/valorados/Page_Olva Courier  Datos Personales/span_OLVA REAL PLAZA PRIMAVERA - SAN BORJA _c909cd'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/valorados/Page_Olva Courier  Datos Personales/span_LIMA - LIMA - SAN BORJA'))

WebUI.setText(findTestObject('Object Repository/Registro de envíos/valorados/Page_Olva Courier  Datos Personales/input_Ingrese el punto de llegada_form-control'), 
    'lince')

WebUI.click(findTestObject('Object Repository/Registro de envíos/valorados/Page_Olva Courier  Datos Personales/a_LIMA - LIMA - LINCE'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/valorados/Page_Olva Courier  Datos Personales/span_Tienda'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/valorados/Page_Olva Courier  Datos Personales/span_OLVA LINCE - AV. ARENALES 1775 - LINCE_e0577d'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/valorados/Page_Olva Courier  Datos Personales/span_Tipo De Documento'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/valorados/Page_Olva Courier  Datos Personales/a_DNI'))

WebUI.setText(findTestObject('Object Repository/Registro de envíos/valorados/Page_Olva Courier  Datos Personales/input_CARN EXT_txt_consignado_dni'), 
    '12345678')

