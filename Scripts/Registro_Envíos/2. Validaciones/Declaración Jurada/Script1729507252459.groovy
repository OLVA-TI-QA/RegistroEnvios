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

WebUI.click(findTestObject('Object Repository/button_IR A PAGAR S 16.04'))

WebUI.verifyElementPresent(findTestObject('Object Repository/div_Envos con Declaracin Jurada            _5fc1e2'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/strong_Envos con Declaracin Jurada'), 'Envíos con Declaración Jurada')

WebUI.click(findTestObject('Object Repository/a_regulacin de envos y la declaracin Jurada'))

WebUI.click(findTestObject('Object Repository/span_ (1)'))

WebUI.click(findTestObject('Object Repository/label_He ledo la                           _55438f'))

WebUI.click(findTestObject('Object Repository/label_Declaro bajo juramento los productos _f4619d'))

WebUI.click(findTestObject('Object Repository/button_cntnuar(2)'))

WebUI.click(findTestObject('Object Repository/button_IR A PAGAR S 16.04'))

