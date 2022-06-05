package log;

import event.EventLogger;

public class LoggerTester {

	public static void main(String[] args) {
		EventLogger logger = new EventLogger("log.txt");
        logger.log("test");
	}
}
