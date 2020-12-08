/**
 *  This is a comment
 */
public class Map
{
    private Room outside;
    private Room theater;
    private Room pub;
    private Room lab;
    private Room office;
    private Room tennisCourt;

    private Room startRoom;

    public Map()
    {
        createRooms();
    }

    /**
     * Create all the rooms and link their exits together.
     */
    private void createRooms()
    {
        createOutsideRoom();
        createTheatre();
        createTennisCourt();

        pub = new Room("in the campus pub");
        lab = new Room("in a computing lab");
        office = new Room("in the computing admin office");

        pub.setExit("east", outside);

        lab.setExit("north", outside);
        lab.setExit("east", office);

        office.setExit("west", lab);

        startRoom = outside;  // start game outside
    }

    private void createTheatre()
    {
        theater = new Room("in a lecture theater");
        theater.setExit("west", outside);
    }

    private void createOutsideRoom()
    {
        // create the rooms
        outside = new Room("outside the main entrance of the university");
        // initialise room exits
        outside.setExit("east", theater);
        outside.setExit("south", lab);
        outside.setExit("west", pub);
    }

    public void createTennisCourt()
    {
        tennisCourt = new Room("Grass tennis court");
        tennisCourt.setExit("south", outside);
        outside.setExit("north", tennisCourt);
    }

    public Room getStartRoom()
    {
        return startRoom;
    }
}
