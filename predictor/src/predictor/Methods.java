package predictor;

import java.time.LocalDateTime;

/**
 *
 * @author Carlos Rodas
 */
public class Methods {

    public Methods() {
    }
    
    public boolean isAlphaNumeric(String s){
        String pattern= "^[a-zA-Z0-9]*$";
        return s.matches(pattern);
    }
    
    public boolean isNumeric(String s){
        String pattern= "[0-9]*$";
        return s.matches(pattern);
    }
    
    public boolean isALetter(String s){
        String pattern= "^[a-zA-Z]*$";
        return s.matches(pattern);
    }
    
    public boolean licensePlateCheck(LocalDateTime date2, int number){
        boolean go = true;
        int day = date2.getDayOfWeek().getValue();
        LocalDateTime a = LocalDateTime.of(date2.getYear(), date2.getMonth(), date2.getDayOfMonth(), 7, 0);
        LocalDateTime b = LocalDateTime.of(date2.getYear(), date2.getMonth(), date2.getDayOfMonth(), 9, 30);
        LocalDateTime c = LocalDateTime.of(date2.getYear(), date2.getMonth(), date2.getDayOfMonth(), 16, 0);
        LocalDateTime d = LocalDateTime.of(date2.getYear(), date2.getMonth(), date2.getDayOfMonth(), 19, 30);
        switch(day) {
        // Monday
        case 1:
            if(number == 1 || number == 2){
                if ((date2.isAfter(a) || date2.equals(a)) && (date2.isBefore(b) || date2.equals(b))) {
                    go = false;
                } else if ((date2.isAfter(c) || date2.equals(c)) && (date2.isBefore(d) || date2.equals(d))){
                    go = false;
                }
            } else {
                go = true;
            }
          break;
        // Tuesday
        case 2:
            if(number == 3 || number == 4){
                if ((date2.isAfter(a) || date2.equals(a)) && (date2.isBefore(b) || date2.equals(b))) {
                    go = false;
                } else if ((date2.isAfter(c) || date2.equals(c)) && (date2.isBefore(d) || date2.equals(d))){
                    go = false;
                }
            } else {
                go = true;
            }
          break;
        // Wednesday
        case 3:
            if(number == 5 || number == 6){
                if ((date2.isAfter(a) || date2.equals(a)) && (date2.isBefore(b) || date2.equals(b))) {
                    go = false;
                } else if ((date2.isAfter(c) || date2.equals(c)) && (date2.isBefore(d) || date2.equals(d))){
                    go = false;
                }
            } else {
                go = true;
            }
          break;
        // Thursday
        case 4:
            if(number == 7 || number == 8){
                if ((date2.isAfter(a) || date2.equals(a)) && (date2.isBefore(b) || date2.equals(b))) {
                    go = false;
                } else if ((date2.isAfter(c) || date2.equals(c)) && (date2.isBefore(d) || date2.equals(d))){
                    go = false;
                }
            } else {
                go = true;
            }
          break;
        // Friday
        case 5:
            if(number == 9 || number == 0){
                if ((date2.isAfter(a) || date2.equals(a)) && (date2.isBefore(b) || date2.equals(b))) {
                    go = false;
                } else if ((date2.isAfter(c) || date2.equals(c)) && (date2.isBefore(d) || date2.equals(d))){
                    go = false;
                }
            } else {
                go = true;
            }
          break;
        // Saturday
        case 6:
          go = true;
          break;
        // Sunday
        case 7:
          go = true;
          break;
        default:
          go = true;
      }
        return go;
    }
    
}
