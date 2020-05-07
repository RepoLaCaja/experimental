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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://demowebshop.tricentis.com/')

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop/a_Register'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop Register/input_Male_Gender'))

WebUI.setText(findTestObject('Object Repository/Page_Demo Web Shop Register/input_First name_FirstName'), 'mary')

WebUI.setText(findTestObject('Object Repository/Page_Demo Web Shop Register/input_Last name_LastName'), 'lores')

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop Register/input_Email_Email'))

WebUI.setText(findTestObject('Object Repository/Page_Demo Web Shop Register/input_Email_Email'), 'mail@supermail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Demo Web Shop Register/input_Password_Password'), '2QSkJ42CeMo=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Demo Web Shop Register/input_Confirm password_ConfirmPassword'), 
    '2QSkJ42CeMo=')

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop Register/input__register-button'))

WebUI.click(findTestObject('Object Repository/Page_Demo Web Shop Register/input_Your registration completed_button-1 _c43114'))

WebUI.closeBrowser()

