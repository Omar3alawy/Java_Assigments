import java.util.ArrayList;
public class Assignment_3 {
    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        return max;
    }

    public static void sort(ArrayList<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (list.get(j) < list.get(min)) {
                    min = j;
                }
            }
            int temp = list.get(min);
            list.set(min, list.get(i));
            list.set(i, temp);
        }
    }
}


