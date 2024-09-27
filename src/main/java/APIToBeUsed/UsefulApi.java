package APIToBeUsed;

import DataReader.EnvConfig;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

import static ConfigFiles.Factory.ConfigFactory.getConfig;
import static DataReader.EnvConfig.OutputPathToFile;
import static Utilities.CommonFunctions.getCurrentDateOnly;
import static Utilities.CommonFunctions.getTime;
import static io.restassured.RestAssured.given;

public class UsefulApi {
    public static String baseURL = "https://"+System.getProperty("environmentType");

    public static final String devToken = "";
    public static final String stagingToken = "";
   public static String requiredToken(){
        if(getConfig().EnvironmentType().toString().toLowerCase().equals("dev")){
            return devToken;
        }
        else if(getConfig().EnvironmentType().toString().toLowerCase().equals("staging")){
            return stagingToken;
        }
        else{
            return devToken;
        }
    }
    public static void createFileAndWriteData(String nameOfFile,String body){
        String pathOfFile = OutputPathToFile+nameOfFile+".json";
        System.out.println(body);
        try{
        if(checkFileExists(pathOfFile)) {
            File myObj = new File(pathOfFile);
            if (myObj.delete()) {
                System.out.println("Deleted the file: " + nameOfFile);
            } else {
                System.out.println("Failed to delete the file : "+ nameOfFile);
            }
            if (myObj.createNewFile()) {
                System.out.println("File created: " + nameOfFile);
            } else {
                System.out.println("File already exists :"+ nameOfFile);
            }
        }
        else{
            File myObj = new File(pathOfFile);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + nameOfFile);
            } else {
                System.out.println("File already exists :"+ nameOfFile);
            }
        }

        FileWriter file = new FileWriter(pathOfFile);
        file.write(body);
        file.flush();
        } catch (IOException e) {
            System.out.println("File Creation Error for :"+nameOfFile);
        }
    }
    public static void getDataAndWriteInFile(String path,String fileName){
        RestAssured.baseURI = baseURL;
        RequestSpecification request = given();
        request.header("Authorization",getToken("moiz@yopmail.com","Admin@123"));
        Response response = request.get(path);
        ResponseBody body = response.getBody();
        if(response.getStatusCode() == 200){
          createFileAndWriteData(fileName,body.asString());
        }else{
            System.out.println("Api failed for : " + fileName + " with status code : " + response.getStatusCode());
        }
    }
    public static String getToken(String userEmail,String password){
        String token = "";
        RestAssured.baseURI = "https://"+System.getProperty("environmentType")+"";
        Response response =  given().header("Content-Type","application/json")
                .body("{\"email\":\""+userEmail+"\",\"password\":\""+password+"\"}")
                .post().then().statusCode(200).extract().response();
        token = response.jsonPath().getString("data.user.access_token");
        return "Bearer "+token;
    }
    public static boolean checkFileExists(String fileName){
        try {
            File f = new File(fileName);
            if (f.exists() && !f.isDirectory()) {
                return true;
            }
        }
        catch (Exception ex){
            return false;
        }
        return false;
    }
    public static void getDataBeforeSuite(){
       // To get data before suite
    }
}
