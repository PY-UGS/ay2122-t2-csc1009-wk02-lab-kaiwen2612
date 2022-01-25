public class TimeTest {
    public long[] displayCurrentTime() {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        long[] gmt = {currentHour, currentMinute, currentSecond};
        return gmt;
    }
    public static void main (String[] args) {
        TimeTest t = new TimeTest();
        long[] gmtTime = t.displayCurrentTime();
        System.out.println("Current time is " + gmtTime[0] + ":" + gmtTime[1] + ":" + gmtTime[2] + " GMT");
    }
}