package org.example.Products;

    public class Butter extends Dairy implements FatContent {
        private int saltContent;
        private int fatContent;

        public Butter(String name, String location, int saltContent, int fatContent) {
            super(name, location);
            this.saltContent = saltContent;
            this.fatContent = fatContent;
        }
        public int getSaltContent() {
            return saltContent;
        }
        public void setSaltContent(int saltContent) {
            this.saltContent = saltContent;
        }
        public int getFatContent() {
            return fatContent;
        }

        public void setFatContent(int fatContent) {
            this.fatContent = fatContent;
        }
        @Override
        public void fat() {
            System.out.println("The fat content of " + getName() + " butter" + " is " + fatContent + "%");
        }
        @Override
        public void printInfo() {
            System.out.println("Name: " + getName());
            System.out.println("Location: " + getLocation());
            System.out.println("Fat content: " + getFatContent() + "%");
        }

    }

