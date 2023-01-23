public class ClubApplication {

    public static void main (String args[]) {

        Club club = new Club ();

        Member member1, member2, member3, member4, member5;

        member1 = club.addMember ("Einstein", "Albert", null);
        member2 = club.addMember ("Picasso", "Pablo", "Ruiz");
        member3 = club.addMember ("Webber","Andrew","Lloyd");
        member4 = club.addMember ("Baggio", "Roberto", null);
        member5 = club.addMember ("Raffles", "Stamford", null);

        System.out.println ("Current Members:");
        club.showMembers ();

        System.out.println ("Deleting member 3");
        club.removeMember (3);

        System.out.println ("Current members:");
        club.showMembers ();
        
        System.out.println("Add another member");
        club.addMember("Ludwig", "Beethoven", "van");
        
        System.out.println ("Current members:");
        club.showMembers ();
        
       
        //Facility Testing
        club.addFacility("Lab", "Einstein's Experiment Area");
        club.addFacility ("Studio", "Picasso's Work Place");
        club.addFacility ("Room1", "Conference Room on Level 2");
        club.addFacility ("Room2", "Meeting Room on Level 3");
        club.show();
        
        
        club.removeFacility("Studio");
        club.removeFacility("Room2");
        
        club.show();
        
        
    }

}
