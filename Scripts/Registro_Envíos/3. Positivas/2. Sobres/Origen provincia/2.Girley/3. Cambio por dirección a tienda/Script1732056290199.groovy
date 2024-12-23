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

WebUI.callTestCase(findTestCase('Registro_Envíos/1.Inicio/2.Login/5.LoginRUC20'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Registro de envíos/cargo adjunto/Page_Olva Courier  Datos Personales/input_Qu Envas_input_descripcion'), 
    'GHJK')

WebUI.setText(findTestObject('Registro de envíos/cargo adjunto/Page_Olva Courier  Datos Personales/input_Qu Envas_input_valor'), 
    '12')

WebUI.click(findTestObject('Object Repository/Registro de envíos/Test cases/span_PuntPartid'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Registro de envíos/valorados/Page_Olva Courier  Datos Personales/a_JAUJA'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/Test cases/span_PuntLlegad'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Registro de envíos/Test cases/input_PuntLlegad'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Registro de envíos/Test cases/input_PuntLlegad'), 'san borja', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/Registro de envíos/Test cases/span_LIM_SanBorj'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Registro de envíos/Test cases/span_LIM_SanBorj'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Registro de envíos/Test cases/span_TipEntreg'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Registro de envíos/Test cases/a_EntregDomic'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/Registro de envíos/Test cases/input_dir_entreg'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Registro de envíos/Test cases/input_dir_entreg'), 'Comandante espinar 659, miraflores', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Object Repository/Registro de envíos/Test cases/input_dir_entreg'), Keys.chord(Keys.ENTER), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Registro de envíos/Test cases/Girley/validac_Destino'), 0)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/Registro de envíos/Test cases/button_TipDocument'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Registro de envíos/Test cases/button_TipDocument'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Registro de envíos/Test cases/a_DNI'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Registro de envíos/Test cases/input_Consig_dni'), '12345678', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Registro de envíos/Test cases/div_PINTO'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/Registro de envíos/Test cases/button_cntnuar(1)'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Registro de envíos/Test cases/button_cntnuar(1)'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Registro de envíos/Test cases/th_lima'), 'Jauja', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Registro de envíos/Test cases/th_EntregDomic'), 'Recojo En Tienda', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Registro de envíos/Test cases/Girley/validac_Destino_Resum'), 'Lima - Lima - Miraflores', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Registro de envíos/Test cases/th_7.30'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Registro de envíos/Test cases/th_0.00'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Registro de envíos/Test cases/1-Principal/button_IR A PAGAR S 7.30'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Registro de envíos/Test cases/Girley/div_INGRESA TU CLAVE DE SEGURIDAD          _f716a0'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Registro de envíos/Test cases/Girley/b_INGRESA TU CLAVE DE SEGURIDAD'), 
    'INGRESA TU CLAVE DE SEGURIDAD')

WebUI.setText(findTestObject('Object Repository/Registro de envíos/Test cases/Girley/input_Tienes envos con recojo en tienda, se_b85f5d'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Registro de envíos/Test cases/Girley/input_Tienes envos con recojo en tienda, se_af5936'), 
    '2')

WebUI.setText(findTestObject('Object Repository/Registro de envíos/Test cases/Girley/input_Tienes envos con recojo en tienda, se_653975'), 
    '3')

WebUI.setText(findTestObject('Object Repository/Registro de envíos/Test cases/Girley/input_Tienes envos con recojo en tienda, se_8615a0'), 
    '4')

WebUI.click(findTestObject('Object Repository/Registro de envíos/Test cases/Girley/b_Aceptar'))

WebUI.callTestCase(findTestCase('Registro_Envíos/1.Inicio/3.Pago_envíos/Pago_TDC'), [:], FailureHandling.STOP_ON_FAILURE)

