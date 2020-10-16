package ex07;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import lombok.extern.log4j.Log4j;


@Log4j
public class PropertiesExample {

	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		// 1. Map 컬렉션 중 하나인, Properties 객체 생성
		Properties properties = new Properties();
		
		// 2. 읽은 .properties 파일의 경로를 획득
		String path = PropertiesExample.class.
				getResource("database.properties").
				getPath(); // 파일의 경로 획득
		
		log.info(">>> path : " + path);
		
		// 3. 파일의 경로명을 utf-8로 인코딩 (파일의 내용 X)
//		path = URLDecoder.decode(path, "utf-8");
		
		// 4. 3에서 생성한 경로명으로 파일을 읽어들임
		properties.load(new FileReader(path));
		
		// 5. 4가 제대로 수행되었다면, Properties 객체 안에는
		// Map 성질대로, key=value쌍 형태로 저장됨
		// 따라서 Key만 알면, value를 획득할 수 있음
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		
		log.info("driver : " + driver);
		log.info("url : " + url);
		log.info("username : " + username);
		log.info("password : " + password);
	} // main
	
} // end class