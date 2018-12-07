package info.sjd;

import info.sjd.service.*;

import java.io.File;
import java.io.IOException;

public class ServerSessions {
	
	public static void main(String[] args) throws IOException {
		
		int limit = 10;
		int ageInDays = 3;
		String filePath = "src/info/sjd/log/SessionLog.txt";
		File file = new File(filePath);	

		WriteToFile writeToFile = new WriteToFile();

		
		writeToFile.openSessionListToWrite(file);
		writeToFile.createNSessions(limit);
		writeToFile.writeNSessions(limit);
		writeToFile.closeSessionList();
		
	}
}

