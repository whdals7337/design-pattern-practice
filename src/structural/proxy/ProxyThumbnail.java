package structural.proxy;

public class ProxyThumbnail implements Thumbnail{
    private RealThumbnail realThumbnail;
    private String thumbnailName;

    public ProxyThumbnail(String thumbnailName) {
        this.thumbnailName = thumbnailName;
    }

    @Override
    public void showImage() {
        System.out.println("show image " + thumbnailName);
    }

    @Override
    public void showPreview() {
        if (realThumbnail == null) {
            realThumbnail = new RealThumbnail(thumbnailName);
        }
        realThumbnail.showPreview();
    }
}
