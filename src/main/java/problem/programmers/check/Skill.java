package problem.programmers.check;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Skill {
	public static void main(String[] args) {
		Solution solution = new Solution();
		String[] commands = {"next", "prev"};
		solution.solution("34:33", "13:00", "00:55", "02:55", commands);
	}

	static class Solution {

		private static final String NEXT = "next";
		private static final String PREV = "prev";
		private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("HH:mm:ss");

		public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
			String answer = "";

			LocalTime videoLength = formatTime(video_len);
			LocalTime position = formatTime(pos);
			LocalTime opStart = formatTime(op_start);
			LocalTime opEnd = formatTime(op_end);

			for (String command : commands) {
				if (command.equals(NEXT)) {
					if (position.plusSeconds(10).isBefore(videoLength)
						|| position.plusSeconds(10).equals(videoLength)) {
						position = position.plusSeconds(10);
					} else {
						position = videoLength;
					}
				} else if (command.equals(PREV)) {
					if (position.minusSeconds(10).isAfter(LocalTime.of(0, 0)) || position.minusSeconds(10).equals(LocalTime.of(0, 0))) {
						position = position.minusSeconds(10);
					} else {
						position = LocalTime.of(0, 0);
					}
				}

				if (!position.isBefore(opStart) && !position.isAfter(opEnd)) {
					position = opEnd;
				}
			}

			answer = position.format(DateTimeFormatter.ofPattern("mm:ss"));
			System.out.println(answer);
			return answer;
		}

		public LocalTime formatTime(String time) {
			return LocalTime.parse("00:" + time, FORMATTER);
		}
	}
}


//"34:33"	"13:00"	"00:55"	"02:55"	["next", "prev"]	"13:00"