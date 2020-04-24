package Day25_MethodsRecap;

public class Driver {

    /*
    write a return method named getDriver1 that accepts a string parameter called Browser
				if the browser name matches with {"chrome", "firefox", "id", "safari", "edge", "Opera"}, then it returns the name of that specific browser' driver
					Ex: getDriver("chrome");  ==> "Chrome Driver"
						getDriver("fireFOX"); ==> "FireFox Driver"
							....
				if the browser name does not match with any of browsers above, the method should return "Invalid"
				APPLY SWITCH STATEMENTS
	2. do the first task with multi-branch if statement instead of switch statement
	3. do the first task with ternaries instead of switch statements

     */

    public static void main(String[] args) {
    // getDriver();=//argument is mandatory
        String Str= getDriver("chrome");
        System.out.println(Str);

        String Str2 =getDriver2("chrome");
        System.out.println(Str2);

        String Str3 =getDriver3("chrome");
        System.out.println(Str3);


    }

    public static String getDriver (String browserName) {
        String result = "";

        switch (browserName.toLowerCase()) {//chromE .toLowerCase ==>chrome
            case "chrome":
                result = "Chrome Driver";
                break;
            case "firefox":
                result = "Firefox Driver";
                break;
            case "safari":
                result = "Safari Driver";
                break;
            case "opera":
                result = "Opera Driver";
                break;
            case "edge":
                result = "Edge Driver";
                break;
            default:
                result = "Invalid Driver";



        }
        return result;


    }
    public static String getDriver2(String browserName){
        browserName=browserName.toLowerCase();//to  ignore case sensitivity
        String result="";
        if(browserName.equals("chrome")){
            result= "Chrome Driver";
        }else if(browserName.equals("firefox")) {
            result = "Chrome Driver";
        }else if(browserName.equals("safari")) {
            result = "Safari Driver";
        }else if(browserName.equals("edge")) {
            result = "Edge Driver";
        }else if(browserName.equals("opera")) {
            result = "Opera Driver";
        }else{
            result= "Invalid result";

        }
            return result;

    }
    public static String getDriver3(String browerName){
        browerName= browerName.toLowerCase();
        String result="";

        //:()? else if,()? if , :else
        result= (browerName.equals("chrome"))?"Chrome Driver"
                :(browerName.equals("firefox"))?"Firefox Driver"
                :(browerName.equals("safari"))?"Safari Driver"
                :(browerName.equals("opera"))?"Opera Driver"
                :(browerName.equals("edge"))?"Edge Driver"
                :"Invalid Driver";//else statment


        return result;

    }


//we can use return method for this task
    /*
    browserName=browserName.toLowerCase();//to  ignore case sensitivity

        if(browserName.equals("chrome")){
            return "Chrome Driver";
        }else if(browserName.equals("firefox")) {
            return "Chrome Driver";
        }else if(browserName.equals("safari")) {
            return "Safari Driver";
        }else if(browserName.equals("edge")) {
            return"Edge Driver";
        }else if(browserName.equals("opera")) {
          return "Opera Driver";
        }else{
           return "Invalid result";

        }
     */


}






