package miscellaneous;

public class EnumTest {

  public static void main(String[] args) {


      EnumBase.Level level = EnumBase.Level.HIGH;

    System.out.println(level.getLevelCode());
    System.out.println(level.getLevelDescription());


      EnumBase.Level level1 = EnumBase.Level.MEDIUM;

      System.out.println(level1.getLevelCode());
      System.out.println(level1.getLevelDescription());


      EnumBase.Level level2 = EnumBase.Level.LOW;

      System.out.println(level2.getLevelCode());
      System.out.println(level2.getLevelDescription());

  }


}
