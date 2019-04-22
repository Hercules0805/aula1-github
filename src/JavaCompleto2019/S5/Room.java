package JavaCompleto2019.S5;

public class Room {
    private String name;
    private String email;
    private int number;

    public Room (){

    }

    public Room(String name, String email) {
        this.name = name;
        this.email = email;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return  name + ", " + email;

    }

    public static void printRooms(Room[] room){
        System.out.println("Busy Rooms: ");
        for (int i=0; i<room.length; i++)
            if(room[i] != null){
                System.out.println(room[i]);
            }
    }
}
