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

WebUI.navigateToUrl('https://demoqa.com/login')

WebUI.verifyElementText(findTestObject('Page_DEMOQA/Verify_Page/h5_Login in Book Store'), 'Login in Book Store')

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input/input_UserName_userName'), 'mufid23')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_DEMOQA/input/input_Password_password'), 'BRk7CK0K2FE9cdjgoieR9g==')

WebUI.click(findTestObject('Page_DEMOQA/button_Login'))

WebUI.verifyElementText(findTestObject('Page_DEMOQA/input/p_Invalid username or password'), 'Invalid username or password!')

WebUI.closeBrowser()

