
import KnightEDU.Course;
import KnightEDU.Term;
import java.util.Set;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexander Darino
 */
public class Main {
    public static void main (String args[])
    {
        //KnightEDU.DBMS.SQL.DB db = new KnightEDU.DBMS.SQL.DB(3,4,1).queryCourse().descriptionContains(null).nameContains(null).invoke();
// TEST: Navigate through your course query - keep track of the hierarchy of information!!!
        KnightEDU.DBMS.SQL.DB db = new KnightEDU.DBMS.SQL.DB(3,4,1);
        KnightEDU.DBMS.Query.Course courseQuery = db.queryCourse();
        courseQuery = courseQuery.descriptionContains("description");
        Set<Course> courseQuery.invoke();

        for (Course.Offering courseOffering : courseOfferings)
        {
            Set<Integer> componentIDs = db.queryComponent().getComponentIDs(courseOffering.getPrimaryComponentID());
            for (Integer componentID : componentIDs)
            {
                Set<Integer> classIDs = db.queryComponent().getClassIDs(componentID);
                for (Integer classID : classIDs)
                {
                    KnightEDU.Class myClass = db.getClass(classID);
                    System.out.println(myClass);
                }
            }
        }

// TEST: Get ALL classes available... passed
//        KnightEDU.DBMS.SQL.DB db = new KnightEDU.DBMS.SQL.DB(3,4,1);
//        Set<KnightEDU.Course.Offering> result = db.queryCourseOffering().invoke();

// TEST: WE now know the primary component IDs. Let's get the classes:
//        KnightEDU.DBMS.SQL.DB db = new KnightEDU.DBMS.SQL.DB(3,4,1);
//        Set<Integer> result = db.queryComponent().getClassIDs(1);

// TEST:  We now have the class IDs. Let's obtain the classes.
//        KnightEDU.DBMS.SQL.DB db = new KnightEDU.DBMS.SQL.DB(3,4,1);
//        KnightEDU.Class result = db.getClass(1);

// TEST:  We now have the class object containing the instructor ID. who is the instructor?
//        KnightEDU.DBMS.SQL.DB db = new KnightEDU.DBMS.SQL.DB(3,4,1);
//        KnightEDU.Employee result = db.getEmployee(1);

//// TEST:  Pull up the student transcript:
//        KnightEDU.DBMS.SQL.DB db = new KnightEDU.DBMS.SQL.DB(3,4,1);
//        KnightEDU.Transcript result = db.getTranscript(123456);
        
        System.out.println();

    }
}