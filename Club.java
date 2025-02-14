import java.util.ArrayList;

/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Club {
    // Define an ArrayList to store Membership objects
    private ArrayList<Membership> members;

    /**
     * Constructor for objects of class Club.
     * Initializes the ArrayList to store members.
     */
    public Club() {
        members = new ArrayList<>();
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     * @throws IllegalArgumentException If the member is null.
     */
    public void join(Membership member) throws IllegalArgumentException {
        if (member == null) {
            throw new IllegalArgumentException("Member cannot be null.");
        }
        members.add(member);
    }

    /**
     * @return The number of members (Membership objects) in the club.
     */
    public int numberOfMembers() {
        return members.size();
    }

    /**
     * @return A list of all members in the club.
     */
    public ArrayList<Membership> getMembers() {
        return new ArrayList<>(members); // Return a copy to avoid external modification
    }

    /**
     * Remove a member from the club by their name.
     * @param name The name of the member to remove.
     * @return True if the member was found and removed, false otherwise.
     */
    public boolean removeMember(String name) {
        for (Membership member : members) {
            if (member.getName().equals(name)) {
                members.remove(member);
                return true;
            }
        }
        return false;
    }

    /**
     * Find all members who joined in a specific month.
     * @param month The month to search for (1-12).
     * @return A list of members who joined in the specified month.
     * @throws IllegalArgumentException If the month is not in the range 1-12.
     */
    public ArrayList<Membership> findMembersByMonth(int month) throws IllegalArgumentException {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Month must be in the range 1-12.");
        }
        ArrayList<Membership> result = new ArrayList<>();
        for (Membership member : members) {
            if (member.getMonth() == month) {
                result.add(member);
            }
        }
        return result;
    }

    /**
     * @return A string representation of the club's membership list.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Club Members:\n");
        for (Membership member : members) {
            sb.append(member.toString()).append("\n");
        }
        return sb.toString();
    }
}