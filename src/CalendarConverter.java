class CalendarConverter {

    private final static int MONDAY = 1;
    private final static int TUESDAY = 2;
    private final static int WEDNESDAY = 3;
    private final static int THURSDAY = 4;
    private final static int FRIDAY = 5;
    private final static int SATURDAY = 6;
    private final static int SUNDAY = 7;

    static String convertDayToString(int dayNumber) {
        switch (dayNumber) {
            case MONDAY:
                return "Poniedziałek";
            case TUESDAY:
                return "Wtorek";
            case WEDNESDAY:
                return "Sroda";
            case THURSDAY:
                return "Czwartek";
            case FRIDAY:
                return "Piątek";
            case SATURDAY:
                return "Sobota";
            case SUNDAY:
                return "Niedziela";
            default:
                return "Wrong Number";
        }
    }

    static void forLoops(){
        for (int i = 0; i <= 7; i++) {
            System.out.println(convertDayToString(i) + " is " + i + " day of week");
        }

    }


}


