public class PhysicalVolume {
    private String name;
    private String size;

    public PhysicalVolume(PhysicalHardDrive drive){
        this.size= drive.getSize();

    }
}
