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

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Login_username'), 'osap_flo_qa1@osapiens.com')

WebUI.click(findTestObject('Object Repository/Page_Login/input_Login_submit'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_Login_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Page_Login/input_ForgotPassword_sign in'))

WebUI.click(findTestObject('Object Repository/Page_osapiens QA Portal/button_Organization'))

WebUI.click(findTestObject('Object Repository/Page_osapiens QA Portal/input_Romanian Company_SS Tobacco Company'))

WebUI.click(findTestObject('Object Repository/Page_osapiens QA Portal/div_qcbdr1DE441987_css-1w3nhzv'))

WebUI.click(findTestObject('Object Repository/Page_osapiens QA Portal/div_Dashboard_css-1e3tf61'))

WebUI.click(findTestObject('Object Repository/Page_osapiens QA Portal/div_Manufacturing_css-1e3tf61'))

WebUI.click(findTestObject('Object Repository/Page_osapiens QA Portal/button_Sold To Parties'))

WebUI.click(findTestObject('Object Repository/Page_osapiens QA Portal/button_Scanning Locations'))

WebUI.click(findTestObject('Object Repository/Page_osapiens QA Portal/button_Delivery Points'))

WebUI.click(findTestObject('Object Repository/Page_osapiens QA Portal/button_Routes'))

WebUI.click(findTestObject('Object Repository/Page_osapiens QA Portal/button_Products'))

WebUI.click(findTestObject('Object Repository/Page_osapiens QA Portal/div_Master Data_css-1e3tf61'))

WebUI.closeBrowser()

