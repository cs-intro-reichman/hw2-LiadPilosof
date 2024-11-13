public class TimeCalc {
    public static void main(String[] args) {
        String time = args[0];
		int minToAdd = Integer.parseInt(args[1]);

		int totalMin = Integer.parseInt(time.substring(0,1)) * 60 + Integer.parseInt(time.substring(2,3)) + minToAdd;
		int totalHours = totalMin / 60;

		int newHours = totalHours % 24;
		int newMin = totalMin - (totalHours * 60);


        System.out.println("gitn");
		if (newHours<12) {
			if (newMin<10) {
				System.out.println("0"+newHours+":"+"0"+newMin);
			}
			else{
				System.out.println("0"+newHours+":"+newMin);
			}
		}
		else{
			if (newMin<10) {
				System.out.println(newHours+":"+"0"+newMin);
			}
			else{
				System.out.println(newHours+":"+newMin);
			}
		}
	
    }
}
