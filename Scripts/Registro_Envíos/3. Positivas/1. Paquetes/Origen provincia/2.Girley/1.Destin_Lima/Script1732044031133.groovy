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

WebUI.click(findTestObject('Object Repository/Registro de envíos/Test cases/span_'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Registro de envíos/Test cases/button_SeleccArt'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Registro de envíos/Test cases/span_ART_LIMP'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Registro de envíos/Test cases/input_pqte_artic'), 'PRUEBA1', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Registro de envíos/Test cases/input_pqte_val'), '13', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Registro de envíos/Test cases/input_pqte_larg'), '12', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Registro de envíos/Test cases/input_pqte_anch'), '14', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Registro de envíos/Test cases/input_pqte_alt'), '15', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Registro de envíos/Test cases/input_pqte_peso'), '1', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Registro de envíos/Test cases/span_PuntPartid'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Registro de envíos/valorados/Page_Olva Courier  Datos Personales/a_TRUJILLO'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/Test cases/span_PuntLlegad'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Registro de envíos/Test cases/input_PuntLlegad'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Registro de envíos/Test cases/input_PuntLlegad'), 'san borja', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/Registro de envíos/Test cases/span_LIM_SanBorj'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Registro de envíos/Test cases/span_LIM_SanBorj'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Registro de envíos/Test cases/span_TipEntreg'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Registro de envíos/Test cases/a_EntregDomic'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/Registro de envíos/Test cases/input_dir_entreg'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Registro de envíos/Test cases/input_dir_entreg'), 'Calle De Las Bellas Artes 122, San Borja, Lima, Lima, Perú', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Registro de envíos/Test cases/input_dir_entreg'), Keys.chord(Keys.ENTER), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/Registro de envíos/Test cases/input_dir_ref'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Registro de envíos/Test cases/input_dir_ref'), 'ABC', FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/Registro de envíos/Test cases/button_TipDocument'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Registro de envíos/Test cases/button_TipDocument'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Registro de envíos/Test cases/a_DNI'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Registro de envíos/Test cases/input_Consig_dni'), '12345678', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Registro de envíos/Test cases/div_PINTO'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/Registro de envíos/Test cases/button_cntnuar(1)'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Registro de envíos/Test cases/button_cntnuar(1)'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Registro de envíos/Test cases/th_EntregDomic'), 'Entrega A Domicilio', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Registro de envíos/Test cases/th_7.30'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Registro de envíos/Test cases/th_0.00'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Registro de envíos/Test cases/1-Principal/button_IR A PAGAR S 7.30'))

WebUI.callTestCase(findTestCase('Registro_Envíos/1.Inicio/3.Pago_envíos/Pago_Tienda'), [:], FailureHandling.STOP_ON_FAILURE)

