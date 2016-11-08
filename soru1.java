class Tree
{
  private String type;
  public String getType()
  {
    return type;
  }
  public Tree()
  {
    this.type = "pine";
  }
  public Tree(String typ)
  {
    this.type = typ;
  }
}

class Furniture
{
  private String type;
  public String getType()
  {
    return type;
  }
  public Furniture()
  {
    this.type = "home";
  }
  public Furniture(String typ)
  {
    this.type = typ;
  }
  public void doTable(Tree t)
  {
    System.out.println("Table created from " + t.getType() + " for " + getType());
  }
  public void doChair(Tree t)
  {
    System.out.println("Chair created from " + t.getType() + " for " + getType());
  }
}

public class soru1
{
  public static void main(String[] args)
  {
    Tree t1 = new Tree();
    Tree t2 = new Tree("chestnut");
    Furniture f1 = new Furniture();
    Furniture f2 = new Furniture("office");
    f1.doTable(t1);
    f2.doTable(t2);
    f1.doChair(t1);
    f2.doChair(t2);
  }
}