class Switchcase{
    public static void main(String[] args){
        char grade='B';
        switch(grade){
            case 'A':
                System.out.println("Above 80 marks");
                break;
            case 'B':
                System.out.println("Between 70 to 80 marks");
                break;
            case 'C':
                System.out.println("Between 60 to 40 marks");
                break;
            default:
                System.out.println("You have failed");
        }
    }
}