
public class Solution {
    public static String getDay(String day, String month, String year) {
        /*
        * Write your code here.
        */
    DateFormatSymbols dfs = new DateFormatSymbols(Locale.US);
    String weekdays[] = dfs.getWeekdays();
        
    Calendar cal = new GregorianCalendar(Locale.US);
    cal.set(Integer.parseInt(year), Integer.parseInt(month)-1, Integer.parseInt(day));

    System.out.println(weekdays[cal.get(Calendar.DAY_OF_WEEK)].toUpperCase());
    }-