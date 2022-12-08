

/**
 * A BoopleSnoot is Mr. Jaffe's animal
 * 
 * @author Mr. Jaffe
 * @version 1.0 2017-07-14
 */
public class MillerColin extends Animal
{
  private String studentName;
  public MillerColin() {
    super("MillerColin", "grey", 1);
  }
  @Override
  public String speak() {
    return "Praise The Lord";
  }
  @Override
  public String getDisposition() {
    return "faithful";
    }
  @Override
  public String getType() {
    return "Christian Messenger Pigeon";
  }
  @Override
  public String getName() {
    return "Don Quavius";
  }
}