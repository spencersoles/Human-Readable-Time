public class HumanReadableTime {
  public static String makeReadable(int seconds) {

    int minutes = seconds/60;//only use this value for hours calc
    int hours = minutes/ 60;//calculate hours
    minutes = seconds/60 - hours*60; //calculate minutes         
    seconds = seconds %60;//calculate seconds
    
    String hourStr = Integer.toString(hours);//convert values to strings
    String minuteStr = Integer.toString(minutes);
    String secondStr = Integer.toString(seconds);
    
    if(Integer.parseInt(secondStr) < 10){
      secondStr = "0" + secondStr;
    }
    if(Integer.parseInt(minuteStr)<10){
      minuteStr = "0" + minuteStr;
    }
    if(Integer.parseInt(hourStr) < 10){
      hourStr = "0" + hourStr;
    }
    return hourStr + ":"+ minuteStr +":"+ secondStr;
  }
}
