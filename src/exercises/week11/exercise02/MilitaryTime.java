package exercises.week11.exercise02;

import java.time.format.DateTimeFormatter;

public class MiltaryTime {
    private DateTimeFormatter format12 = DateTimeFormatter.ofPattern("hh:mm:ss a");
    private DateTimeFormatter format24 = DateTimeFormatter.ofPattern("HH:mm:ss");

    public String toMilitaryTime(String time) {

        return format24.format(format12.parse(time));
    }

}


}
