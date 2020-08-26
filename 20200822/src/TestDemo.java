import java.util.*;

/**
 * @program: 20200822
 * @description
 * @author: sun
 * @create: 2020-08-26 15:41
 **/
public class TestDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("国民女神","高圆圆");
        map.put("国民老公","王思聪");
        map.put("国民校草","李易峰");
        System.out.println(map);
        String s = map.get("国民校草");
        System.out.println(s);
        String s1 = map.getOrDefault("国民爸爸","wo");
        System.out.println(s1);
        System.out.println(map.containsKey("国民女神"));
        System.out.println(map.containsValue("高圆圆"));
        System.out.println("================================================");
        Set<Map.Entry<String,String>> set = map.entrySet();
        for (Map.Entry<String,String> entry:set) {
            System.out.println(entry.getKey() + "=>" + entry.getValue());
        }
    }
    public static void main1(String[] args) {
        Collection<String> collection = new ArrayList<>();
        //Collection collection2 = new LinkedList();
        collection.add("bit");
        collection.add("java");
        collection.add("火箭");
        collection.add("悟空");
        collection.add("八戒");

        System.out.println(collection);
        /*collection.clear();
        System.out.println(collection);*/
        System.out.println(collection.isEmpty());
        collection.remove("java");
        System.out.println(collection);
        System.out.println(collection.size());
        Object[] objects = collection.toArray();
        System.out.println(Arrays.toString(objects));

        System.out.println("===============================");
        for (String s:collection) {
            System.out.println(s);
        }
    }
}
