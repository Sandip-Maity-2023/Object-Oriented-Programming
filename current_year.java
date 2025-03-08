class current_year{
    public static void main(String[] args) {
        int year;
        java.util.Calendar cal=java.util.Calendar.getInstance();
        year=cal.get(cal.YEAR);
        System.out.println("Currnt year is: "+year);
    }
}