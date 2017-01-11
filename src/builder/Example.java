package builder;

/**
 * Created by sanfen on 2016/12/26.
 *
 *
 */
public class Example {
    private String date;
    private String name;

    private Example(){

    }

    private Example(String date, String name) {
        this.date = date;
        this.name = name;
    }

    public static class Builder {
        private String date = "";
        private String name = "";

        public Builder() {
        }

        public Builder(String date, String name) {
            this.date = date;
            this.name = name;
        }

        public Builder setDate(String date) {
            this.date = date;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Example builder(){
            return new Example(date, name);
        }

    }

    public Builder reBuilder(){
        return new Builder(date, name);
    }

}
