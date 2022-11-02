package pageObjects.constants.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class currentDate {
    private static LocalDateTime myDateObj = LocalDateTime.now();
    private static DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    public static String formattedCurrentDate = myDateObj.format(myFormatObj);
}
// tạo class helper datetime => xử lý những phần liên quan