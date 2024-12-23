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

WebUI.setText(findTestObject('Registro de envíos/Test cases/Girley/input_Qu Envas_input_descripcion'), 'GHJK')

WebUI.setText(findTestObject('Registro de envíos/Test cases/Girley/input_Qu Envas_input_valor'), '12')

WebUI.click(findTestObject('Object Repository/Registro de envíos/Test cases/span_PuntPartid'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Registro de envíos/Test cases/a_LIMA'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Registro de envíos/Test cases/span_PuntLlegad'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Registro de envíos/Test cases/input_PuntLlegad'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Registro de envíos/Test cases/input_PuntLlegad'), 'san borja', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/Registro de envíos/Test cases/span_LIM_SanBorj'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Registro de envíos/Test cases/span_LIM_SanBorj'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Registro de envíos/Test cases/span_TipEntreg'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Registro de envíos/Test cases/a_EntregDomic'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/Registro de envíos/Test cases/input_dir_entreg'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Registro de envíos/Test cases/input_dir_entreg'), 'Jr. Atahualpa No 602, Callao, Callao', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Registro de envíos/Test cases/input_dir_entreg'), Keys.chord(Keys.ENTER), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/Registro de envíos/Test cases/input_dir_ref'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Registro de envíos/Test cases/input_dir_ref'), 'ABC', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Registro de envíos/Test cases/button_TipDocument'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Registro de envíos/cargo adjunto/Page_Olva Courier  Datos Personales/a_DNI'))

WebUI.setText(findTestObject('Registro de envíos/cargo adjunto/Page_Olva Courier  Datos Personales/input_CARN EXT_txt_consignado_dni'), 
    '12345678')

WebUI.click(findTestObject('Registro de envíos/Test cases/button_cntnuar(1)'))

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Registro de envíos/valorados/Page_Olva Courier  Confirma tus datos/button_Editar'))

WebUI.verifyElementClickable(findTestObject('Object Repository/u_Qu es esto'))

WebUI.scrollToElement(findTestObject('Object Repository/button_No'), 0)

WebUI.click(findTestObject('Object Repository/button_No'))

WebUI.click(findTestObject('Object Repository/a_Si'))

WebUI.click(findTestObject('Object Repository/span_1 Folio'))

WebUI.click(findTestObject('Object Repository/a_2 Folios'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/Test cases/button_TipDocument'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Registro de envíos/cargo adjunto/Page_Olva Courier  Datos Personales/a_DNI'))

WebUI.setText(findTestObject('Registro de envíos/cargo adjunto/Page_Olva Courier  Datos Personales/input_CARN EXT_txt_consignado_dni'), 
    '12345678')

WebUI.click(findTestObject('Registro de envíos/Test cases/button_cntnuar(1)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/div_Direccin de devolucin del cargo'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/th_S 10.00'), 'S/ 10.00')

WebUI.scrollToElement(findTestObject('Object Repository/Registro de envíos/Test cases/1-Principal/button_IR A PAGAR S 7.30'), 
    0)

WebUI.click(findTestObject('Object Repository/Registro de envíos/Test cases/1-Principal/button_IR A PAGAR S 7.30'))

WebUI.callTestCase(findTestCase('Registro_Envíos/1.Inicio/3.Pago_envíos/Pago_Tienda'), [:], FailureHandling.STOP_ON_FAILURE)

