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

WebUI.navigateToUrl('https://dev-registrodeenvios.olvacourier.com/principal')

WebUI.maximizeWindow()

WebUI.verifyElementText(findTestObject('Object Repository/Registro de envíos/Verifys/p_InformImport'), 'Información Importante')

WebUI.click(findTestObject('Object Repository/Registro de envíos/Verifys/span_'))

WebUI.click(findTestObject('Object Repository/Registro de envíos/Verifys/a_termsUsoyPriv'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Registro de envíos/Verifys/div_TermUsoyPolitc'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Registro de envíos/Verifys/p_TrmsUsoyPolitc'), 
    'Términos de uso y políticas de privacidad (Vigencia 06/10/2023)')

WebUI.click(findTestObject('Object Repository/Registro de envíos/Test cases/1-Principal/button_Aceptar'))

WebUI.verifyElementText(findTestObject('Object Repository/Registro de envíos/Verifys/h1_QDeseasRealiz'), '¿Qué deseas realizar hoy?')

