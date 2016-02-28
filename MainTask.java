import java.util.Calendar;
import java.util.Locale;
import java.text.SimpleDateFormat;

public class MainTask {
	public static void main(String[] args) throws Exception {
		TimePair defaultNotificationDatePair = new TimePair(DateUnity.MINUTE, 1);
		TimePair defaultRepeatIntervalPair = new TimePair(DateUnity.MINUTE, 1);
		TaskManager tm = new TaskManager(defaultNotificationDatePair, true, defaultRepeatIntervalPair);
		tm.addTask("Teste1", "Teste", "", "", false, defaultRepeatIntervalPair);
		System.out.println(tm.toString());
	}
}