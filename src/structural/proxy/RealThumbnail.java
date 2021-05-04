package structural.proxy;

public class RealThumbnail implements Thumbnail{
    private String thumbnailName;

    public RealThumbnail(String thumbnailName) {
        this.thumbnailName = thumbnailName;
        loadPreview();
    }

    @Override
    public void showImage() {
        System.out.println("show image " + thumbnailName);
    }

    @Override
    public void showPreview() {
        System.out.println("show preview " + thumbnailName);
    }

    public void loadPreview() {
        System.out.println("load preview " + thumbnailName);
    }
}
