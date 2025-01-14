package DataReader;

import org.json.simple.JSONObject;

import java.util.Map;

import static APIToBeUsed.UsefulApi.*;
import static ConfigFiles.Factory.ConfigFactory.getConfig;

public class EnvConfig {
    public static String jsonFileType;
    public static JSONObject dataToBeUsed;
    private static final  String PathToFile = System.getProperty("user.dir")+"/src/main/java/DataFiles/";
    public static final  String OutputPathToFile = System.getProperty("user.dir")+"/src/test/java/com/fasset/automation/outputDataFiles/";
    public static String randomEmailToBeUsed = "";
    public static String randomPasswordToBeUsed = "Auto@1234";
    public static String randomUserNameToBeUsed = "";

    // Data Objects
    public static Map<String, String> LoginValidData;
    public static Map<String, String> LoginIndoAutomationData;
    public static Map<String, String> LoginGlobalAutomationData;
    public static Map<String, String> LoginValidDataAdmin;
    public static Map<String, String> LoginInValidData;
    public static Map<String, String> webUrl;
    public static Map<String, String> adminUrl;
    public static Map<String, String> FacebookData;
    public static Map<String, String> CreateAccountInValidData;
    public static Map<String, String> CreateAccountExistingData;
    public static Map<String, String> UnregisteredAccountDetails;

    public static Map<String, String> InvalidEmailAccountDetails;
    public static Map<String, String> ValidCustomerDetails;

    public static Map<String, String> LoginValidData_2;

    public static void loadTestDataFile() {
        getDataBeforeSuite();
        try {
        String envFile = "";
        if(getConfig().EnvironmentType().toString().toLowerCase().equals("dev")){
            envFile = "dev";
        }
        else if(getConfig().EnvironmentType().toString().toLowerCase().equals("staging")){
            envFile = "dev";
        }
        else if(getConfig().EnvironmentType().toString().toLowerCase().equals("qa")){
            envFile = "dev";
        }
        else{
            envFile = "staging";
        }
        String fileName = envFile + "Data.json";
        jsonFileType = PathToFile + fileName;
        dataToBeUsed = JsonReader.getJSONDataURL(EnvConfig.jsonFileType);
        LoginValidData = JsonReader.getDataAsMap(dataToBeUsed,"LoginCredentials", "ValidAccountDetails");
        LoginInValidData = JsonReader.getDataAsMap(dataToBeUsed,"LoginCredentials", "InValidAccountDetails");
        InvalidEmailAccountDetails = JsonReader.getDataAsMap(dataToBeUsed,"LoginCredentials","InValidAccountDetails");
        ValidCustomerDetails = JsonReader.getDataAsMap(dataToBeUsed,"Customer","ValidCustomerDetails");
        CreateAccountInValidData = JsonReader.getDataAsMap(dataToBeUsed,"CreateAccount", "InValidData");
        CreateAccountExistingData = JsonReader.getDataAsMap(dataToBeUsed,"CreateAccount", "ExistingData");
        webUrl = JsonReader.getDataAsMap(dataToBeUsed,"Url","webUrl");
        adminUrl = JsonReader.getDataAsMap(dataToBeUsed,"Url", "adminUrl");
        LoginValidDataAdmin = JsonReader.getDataAsMap(dataToBeUsed,"LoginCredentials", "ValidAccountDetailsAdmin");
        LoginIndoAutomationData = JsonReader.getDataAsMap(dataToBeUsed,"LoginCredentials", "IndonesianAutomationAccountDetails");
        LoginGlobalAutomationData = JsonReader.getDataAsMap(dataToBeUsed,"LoginCredentials", "GlobalAutomationAccountDetails");
        }
        catch (Exception ex){
            System.out.println("Exception File Not Found");
        }
    }
    public static String getTestDataAsString(String mainObject, String identifier, String value){
        return JsonReader.fetchDataJsonObjectArrayObject(dataToBeUsed,mainObject, identifier, value);
    }
}
