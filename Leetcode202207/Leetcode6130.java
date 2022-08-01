package Leetcode202207;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Leetcode6130 {
    class NumberContainers {
        Map<Integer, TreeSet<Integer>> map;
        Map<Integer, Integer> p;

        public NumberContainers() {
            map = new HashMap<>();
            p = new HashMap<>();
        }

        public void change(int index, int number) {
            if (!p.containsKey(index)) {
                if (map.containsKey(number)) {
                    map.get(number).add(index);
                } else {
                    var set = new TreeSet<Integer>();
                    set.add(index);
                    map.put(number, set);
                }
                p.put(index, number);
            }
            else {
                int n = p.get(index);
                map.get(n).remove(index);
                p.put(index,number);
            }
        }

        public int find(int number) {
            if (map.containsKey(number)&& !map.get(number).isEmpty())
                return map.get(number).first();
            return -1;
        }
    }
}
