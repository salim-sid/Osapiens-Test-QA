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

WebUI.navigateToUrl('https://qa.osapiens.cloud/portal/login.html#WEB_tpd/qa1/tpd')

WebUI.setText(findTestObject('Object Repository/1.1.2c/Page_Login/input_Login_username'), 'osap_flo_qa1@osapiens.com')

WebUI.click(findTestObject('Object Repository/1.1.2c/Page_Login/input_Login_submit'))

WebUI.setEncryptedText(findTestObject('Object Repository/1.1.2c/Page_Login/input_Login_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/1.1.2c/Page_Login/input_ForgotPassword_sign in'))

WebUI.click(findTestObject('Object Repository/1.1.2c/Page_osapiens QA Portal/div_Dashboard_css-1e3tf61'))

WebUI.click(findTestObject('Object Repository/1.1.2c/Page_osapiens QA Portal/div_Messages_css-1e3tf61'))

WebUI.click(findTestObject('Object Repository/1.1.2c/Page_osapiens QA Portal/div_Transactions_css-1e3tf61'))

WebUI.click(findTestObject('Object Repository/1.1.2c/Page_osapiens QA Portal/div_History Browser_css-1e3tf61'))

WebUI.click(findTestObject('Object Repository/1.1.2c/Page_osapiens QA Portal/div_Hierarchy Browser_css-1e3tf61'))

WebUI.click(findTestObject('Object Repository/1.1.2c/Page_osapiens QA Portal/div_Code Treasurer_css-1e3tf61'))

WebUI.click(findTestObject('Object Repository/1.1.2c/Page_osapiens QA Portal/div_Manufacturing_css-1e3tf61'))

WebUI.click(findTestObject('Object Repository/1.1.2c/Page_osapiens QA Portal/div_Master Data_css-1e3tf61'))

WebUI.click(findTestObject('Object Repository/1.1.2c/Page_osapiens QA Portal/div_Configuration_css-1e3tf61'))

WebUI.click(findTestObject('Object Repository/1.1.2c/Page_osapiens QA Portal/svg_Account_css-4pon3v'))

WebUI.closeBrowser()

