//project class

    //name
    //description

    //Need to be able to create empty projects
    //Just Name
    //Both

    //Every project should be able to get and set both properties
    //Return the name a description separated by a colon

    public class Project{
        private String name;
        private String description;

        private static String defaultName = "Default";
        private static String defaultDesc = "Default";


        public String getName(){
            return name;
        }

        public String getDescription(){
            return description;
        }

        public void setName(String name){
            this.name = name;
        }

        public void setDescription(String description){
            this.description = description;
        }


        public Project(String name, String description){
            this.name = name;
            this.description = description;
        }

        public Project(String name){
            this.name = name;
            this.description = defaultDesc;
        }


        public Project(){
            name = defaultName;
            description = defaultDesc;
        }


        public String elevatorPitch(){
            String elevator;
            elevator = this.name + " : " +this.description;
            return elevator;
        }

    }