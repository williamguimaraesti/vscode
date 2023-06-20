import java.time.LocalDateTime;
public class saudacao {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime();
        int hour = (now.getHour());
        String message = "Are " + hour + "hour";
        if ((hour >= 5) && (hour < 13) ) {
            message += ", good morning";
        } else if((hour >= 13) && (hour < 18)){
            message += ", good afternoon";
        }else if((hour >= 18) && (hour < 24)){
            message += ", good evening";
        }
        System.out.println(message);
    }

    private static LocalDateTime LocalDateTime() {
        return null;
    }
}
