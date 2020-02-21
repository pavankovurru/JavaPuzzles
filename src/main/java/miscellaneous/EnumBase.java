package miscellaneous;

public class EnumBase {

    public static final String ONE = "CONSTANT";

    public enum Level {

        HIGH  (1,"ONE"),  //calls constructor with value 3
        MEDIUM(2,"TWO"),  //calls constructor with value 2
        LOW   (3,"THREE")   //calls constructor with value 1
        ; // semicolon needed when fields / methods follow


        private final int levelCode;
        private final String levelDescription;


        Level(int levelCode, String levelDescription) {
            this.levelCode = levelCode;
            this.levelDescription=levelDescription;
        }

        public int getLevelCode() {
            return this.levelCode;
        }

        public String getLevelDescription() {
            return this.levelDescription;
        }


    }
}
