public class TimeCalc {
    public static void main(String[] args) {

        String time = args[0];
		int minToAdd = Integer.parseInt(args[1]);


		String hoursTemp = "";
		String minTemp = "";


		for (int i = 0; i < time.indexOf(":"); i++) {
			hoursTemp+=time.charAt(i);
		}
		for (int i = time.indexOf(":")+1; i < time.length(); i++) {
			minTemp+=time.charAt(i);
		}

		int totalMin = Integer.parseInt(hoursTemp) * 60 + Integer.parseInt(minTemp) + minToAdd;
		int totalHours = totalMin / 60;

		int newHours = totalHours % 24;
		int newMin = totalMin - (totalHours * 60);


		if (newHours<10) {
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
