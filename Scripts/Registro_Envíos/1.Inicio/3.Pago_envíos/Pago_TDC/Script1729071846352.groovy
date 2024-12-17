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

WebUI.click(findTestObject('Object Repository/Registro de envíos/Test cases/1-Principal/div_Pago con tarjeta de crdito, dbito y Yape'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/Test cases/1-Principal/button_VALIDAR_start-js-btn modal-opener default'))

WebUI.delay(4)

WebUI.scrollToElement(findTestObject('Object Repository/Registro de envíos/Test cases/1-Principal/i'), 0)

WebUI.click(findTestObject('Object Repository/Registro de envíos/Test cases/1-Principal/i'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Registro de envíos/Test cases/1-Principal/button_Continuar (1)'))

WebUI.sendKeys(findTestObject('Object Repository/Registro de envíos/Test cases/1-Principal/input_compras por internet_number'), 
    Keys.chord('4474'))

WebUI.sendKeys(findTestObject('Object Repository/Registro de envíos/Test cases/1-Principal/input_compras por internet_number'), 
    Keys.chord('1183'))

WebUI.sendKeys(findTestObject('Object Repository/Registro de envíos/Test cases/1-Principal/input_compras por internet_number'), 
    Keys.chord('5563'))

WebUI.sendKeys(findTestObject('Object Repository/Registro de envíos/Test cases/1-Principal/input_compras por internet_number'), 
    Keys.chord('2240'))

WebUI.sendKeys(findTestObject('Object Repository/Registro de envíos/Test cases/1-Principal/input_compras por internet_expiry'), 
    Keys.chord('12'))

WebUI.sendKeys(findTestObject('Object Repository/Registro de envíos/Test cases/1-Principal/input_compras por internet_expiry'), 
    Keys.chord('24'))

WebUI.setText(findTestObject('Object Repository/Registro de envíos/Test cases/1-Principal/input_compras por internet_cvc'), 
    '111')

WebUI.click(findTestObject('Object Repository/Registro de envíos/Test cases/1-Principal/div_compras por internet_input-status'))

WebUI.setText(findTestObject('Object Repository/Registro de envíos/Test cases/1-Principal/input_compras por internet_name'), 
    'usuario')

WebUI.setText(findTestObject('Object Repository/Registro de envíos/Test cases/1-Principal/input_compras por internet_lastname'), 
    'prueba')

WebUI.setText(findTestObject('Object Repository/Registro de envíos/Test cases/1-Principal/input_compras por internet_email'), 
    'correoprueba@gmail.com')

WebUI.click(findTestObject('Object Repository/Registro de envíos/Test cases/1-Principal/button_Pagar S 7.30'))

