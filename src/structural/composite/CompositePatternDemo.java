package structural.composite;

public class CompositePatternDemo {
    public static void main(String[] args) {
        File file1 = new File("1번 파일", 10);
        File file2 = new File("2번 파일", 20);
        File file3 = new File("3번 파일", 30);

        Directory subDirectory = new Directory("디렉토리 2");
        subDirectory.addNode(file1);
        subDirectory.addNode(file2);

        Directory directory = new Directory("디렉토리 1");
        directory.addNode(file3);
        directory.addNode(subDirectory);

        System.out.println(directory.getName());
        directory.ls();
        System.out.println("total: " + directory.getSize());

        System.out.println();

        System.out.println(subDirectory.getName());
        subDirectory.ls();
        System.out.println("total: " + subDirectory.getSize());

    }
}
