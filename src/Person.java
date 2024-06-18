import java.time.Year;
    public abstract class Person{
        protected String firstname;
        protected String lastname;
        protected int birthdayYear;

        public Person(String firstname, String lastname, int birthdayYear) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.birthdayYear = birthdayYear;
        }
        public int getAge(){
            int currentYear = Year.now().getValue();
            return currentYear - birthdayYear;
        }
    }

