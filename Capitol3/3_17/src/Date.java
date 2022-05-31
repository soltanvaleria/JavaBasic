public class Date {
    int date;
    int month;
    int year;

    public void setDate(int date) {
        this.date = date;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDate() {
        return date;
    }
    public String displayDate()
    {
        String dateMessage;
        dateMessage = String.format("%d/%d/%d,", date, month,year);
        return dateMessage;
    }
}
