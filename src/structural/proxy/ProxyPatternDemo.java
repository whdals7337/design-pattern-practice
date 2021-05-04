package structural.proxy;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        ProxyThumbnail proxyThumbnail = new ProxyThumbnail("유튜브 영상 제목 1");
        proxyThumbnail.showImage();
        System.out.println("마우스 이동 시");
        proxyThumbnail.showPreview();
    }
}
