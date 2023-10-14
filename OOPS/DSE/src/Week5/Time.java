package Week5;

public class Time {
	    private int hours;
	    private int minutes;
	    private int seconds;

	    public Time() {
	        this.hours = 0;
	        this.minutes = 0;
	        this.seconds = 0;
	    }

	    public Time(int hours, int minutes, int seconds) {
	        this.hours = hours;
	        this.minutes = minutes;
	        this.seconds = seconds;
	    }

	    public void displayTime() {
	        System.out.printf("%02d:%02d:%02d", hours, minutes, seconds);
	    }

	    public Time addTime(Time t) {
	        Time sum = new Time();
	        sum.seconds = this.seconds + t.seconds;
	        sum.minutes = this.minutes + t.minutes + sum.seconds / 60;
	        sum.hours = this.hours + t.hours + sum.minutes / 60;
	        sum.seconds %= 60;
	        sum.minutes %= 60;
	        return sum;
	    }

public static void main(String[] args) {
    Time t1 = new Time(2, 30, 45);
    Time t2 = new Time(1, 15, 20);

    System.out.print("Time 1: ");
    t1.displayTime();
    System.out.println();

    System.out.print("Time 2: ");
    t2.displayTime();
    System.out.println();

    Time sum = t1.addTime(t2);
    System.out.print("Sum of times: ");
    sum.displayTime();
}
}


