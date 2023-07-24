package organization;

import java.util.ArrayList;
import java.util.List;

public class StringBuilderProject {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("서울");
        stringList.add("서초구");
        stringList.add("3인");
        stringList.add(null);
        stringList.add(null);

        System.out.println(stringList);

        String title = messageConverter(stringList);

        System.out.println("title : " + title);
    }

    public static String messageConverter(List<String> stringList) {
        StringBuilder sb = new StringBuilder();

        for (String word : stringList) {
            if (word != null) {
                sb.append(word).append(" ");
            }
        }

        return sb.toString();
    }
}
