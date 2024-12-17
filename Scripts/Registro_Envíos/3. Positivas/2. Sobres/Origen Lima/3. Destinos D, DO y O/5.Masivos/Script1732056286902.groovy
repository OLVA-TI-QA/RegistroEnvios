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

WebUI.callTestCase(findTestCase('Registro_Envíos/1.Inicio/1.Principal/Selecc_masivos'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Registro_Envíos/1.Inicio/2.Login/2.Log_DNI-Colab'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Registro de envíos/Test cases/div_PROMCOLAB'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Registro de envíos/Test cases/span_'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/span_Seleccione o arrastre su archivo aqu'))

WebUI.click(findTestObject('Object Repository/button_cntnuar(1)'))

WebUI.click(findTestObject('Object Repository/button_SI, DESEO REALIZAR LOS ENVOS'))

WebUI.click(findTestObject('Object Repository/a_Eliminar'))

WebUI.click(findTestObject('Object Repository/button_IR A PAGAR S 88.79'))

WebUI.click(findTestObject('Object Repository/label_He ledo la                           _55438f'))

WebUI.click(findTestObject('Object Repository/label_Declaro bajo juramento los productos _f4619d'))

WebUI.click(findTestObject('Object Repository/button_cntnuar(2)'))

WebUI.click(findTestObject('Object Repository/button_IR A PAGAR S 88.79'))

WebUI.setText(findTestObject('Object Repository/input_Tienes envos con recojo en tienda, se_b85f5d'), '1')

WebUI.setText(findTestObject('Object Repository/input_Tienes envos con recojo en tienda, se_af5936'), '2')

WebUI.setText(findTestObject('Object Repository/input_Tienes envos con recojo en tienda, se_653975'), '3')

WebUI.setText(findTestObject('Object Repository/input_Tienes envos con recojo en tienda, se_8615a0'), '4')

WebUI.click(findTestObject('Object Repository/b_Aceptar'))

WebUI.callTestCase(findTestCase('Registro_Envíos/2. Validaciones/Declaración Jurada'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Registro_Envíos/1.Inicio/3.Pago_envíos/Pago_TDC'), [:], FailureHandling.STOP_ON_FAILURE)

