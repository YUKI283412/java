public class Person {

    public enmu Gender { MAN, WOMAN };	
    private Gender gender;
    
        public Person(Gender gender) {
            this.gender = gender;
        }
    
        public void speak() {
            switch (gender) {
                ② ③:
                    System.out.println("I'm a man");
    break;
                ② WOMAN:
                    System.out.println("I'm a woman");
    break;
    default:
    }
        }
    
        public static void main(String[] args) {
            Person man = new Person(Gender.MAN);
            man.speak();
    
            Person woman = new Person(④);
            woman.speak();
        }
    }

