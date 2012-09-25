/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.15.0.1751 modeling language!*/

package cruise.associations;

public class StudentAM
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //StudentAM Attributes
  private int id;

  //StudentAM Associations
  private MentorAM mentor;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public StudentAM(int aId)
  {
    id = aId;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setId(int aId)
  {
    boolean wasSet = false;
    id = aId;
    wasSet = true;
    return wasSet;
  }

  public int getId()
  {
    return id;
  }

  public MentorAM getMentor()
  {
    return mentor;
  }

  public boolean setMentor(MentorAM aMentor)
  {
    boolean wasSet = false;
    MentorAM existingMentor = mentor;
    mentor = aMentor;
    if (existingMentor != null && !existingMentor.equals(aMentor))
    {
      existingMentor.removeStudent(this);
    }
    if (aMentor != null)
    {
      aMentor.addStudent(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    if (mentor != null)
    {
      MentorAM placeholderMentor = mentor;
      this.mentor = null;
      placeholderMentor.removeStudent(this);
    }
  }

}