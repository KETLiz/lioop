import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        CreateMap createtMap = new CreateMap();
        int[][] startMap = createtMap.wallsInMap();
        createtMap.printMap(startMap);
        System.out.println();
        Point startPoint = new Point(4, 2);
        Point exitPoint = new Point(1, 7);
        WaveAlgorithm waveMap = new WaveAlgorithm(startMap);
        int[][] finishMap = waveMap.wave(startPoint);
        waveMap.printMap(finishMap);
        // GetRoad getRoad = new GetRoad(finishMap);
        // var shortWay = getRoad.way(exitPoint, startPoint);
        // System.out.println(shortWay);
    }
}
