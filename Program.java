public class Program {
    public static void main(String[] args) {
        CreateMap createtMap = new CreateMap(11, 9);
        int[][] startMap = createtMap.wallsInMap();
        createtMap.printMap(startMap);
        System.out.println();
        Point startPoint = new Point(4, 2);
        Point exitPoint = new Point(1, 7);
        
    }
}
