package commons;

import java.io.File;

public class GlobalConstants {
	public static final String BANK_GURU_LOGIN_URL = "https://demo.guru99.com/v4/index.php";
	public static final String BANK_GURU_REGISTER_URL = "https://demo.guru99.com/";
	
	public static final String PROJECT_PATH = System.getProperty("user.dir");
	public static final String JAVA_VERSION = System.getProperty("java.version");
	
	public static final String UPLOAD_FILE_PATH_FOLDER = PROJECT_PATH + File.separator + "uploadFiles" + File.separator;
	public static final String DOWNLOAD_FILE_PATH_FOLDER = PROJECT_PATH + File.separator + "downloadFiles" + File.separator;
	public static final String BROWSER_LOG_FILE_PATH_FOLDER = PROJECT_PATH + File.separator + "browserLogs" + File.separator;
	public static final String BROWSER_EXTENSION_PATH_FOLDER = PROJECT_PATH + File.separator + "browserExtentions" + File.separator;
	
	public static final String DRAG_DROP_HTML5 = PROJECT_PATH + File.separator + "dragDropHTML5";
	public static final String AUTOIT_SCRIPT = PROJECT_PATH + File.separator + "autoIT";
	public static final String REPORT_SCREENSHOT = PROJECT_PATH + File.separator + "ReportNGImage" + File.separator;
	
	public static final long SHORT_TIMEOUT = 10;
	public static final long LONG_TIMEOUT = 30;
	public static final long RETRY_TEST_FAIL = 3;
}
