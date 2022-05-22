package homework.chapter5;

public class MissingBreak {
    public static void main(String[] args) {

        for (int i = 0; i < 12; i++) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println(" i poqre 5 ic ");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println("i poqre 10 ic ");
                    break;
                default:
                    System.out.println(" i havasare kam mece 10 ic ");
            }
        }

        int mount = 4;
        String season;
        switch (mount) {
            case 12:
            case 1:
            case 2:
                season = " dzmran@";
                break;
            case 3:
            case 4:
            case 5:
                season = " garnan@";
                break;
            case 6:
            case 7:
            case 8:
                season = " amran@";
                break;
            case 9:
            case 10:
            case 11:
                season = " ashnan@";
                break;
            default:
                season = " вымишленным месяцам ";
        }
        System.out.println("aprel@ verabervum e" + season + ".");
    }
}
