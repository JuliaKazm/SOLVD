package Products;

    public class Butter extends Dairy {
        private int saltContent;

        public Butter(String name, String location, int saltContent) {
            super(name, location);
            this.saltContent = saltContent;
        }

        public int getSaltContent() {
            return saltContent;
        }

        public void setSaltContent(int saltContent) {
            this.saltContent = saltContent;
        }
    }

