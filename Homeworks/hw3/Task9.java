public class Task9 {
    public static void main(String[] args) {
        String word = "параллельный";
        String part1 = word.substring(0, 4);
        String part2 = word.substring(4, 8);
        String part3 = word.substring(8, 12);
        
        // а) Перемещаем первую четверть слова на место третьей, 
        // вторую четверть — на место первой, третью четверть — на место второй.
        System.out.println(part2 + part3 + part1);
        
        // б) Перемещаем первую четверть слова на место второй, 
        // вторую четверть — на место третьей, третью четверть — на место первой.
        System.out.println(part3 + part1 + part2);
    }
}
