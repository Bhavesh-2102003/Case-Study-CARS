package JUnitTest;
import static org.junit.jupiter.api.Assertions.*;
import com.cars.dao.CrimeAnalysisImpl;
import org.junit.jupiter.api.Test;
import java.util.List;
import com.cars.entity.*;
import com.cars.exception.*;

public class IncidentServiceTest {
    
    @Test
    public void testCreateIncident() {
        
        
        Incidents newIncident = new Incidents(108, "Robbery", "2024-11-23", "123, ABC Street", "Stolen items", "Open", 1, 2, 105);
        boolean isCreated = CrimeAnalysisImpl.createIncident(newIncident);
        
        assertTrue(isCreated, "Incident should be created successfully.");
    }
    
    @Test
    public void testUpdateIncidentStatus_Success() {
       
        int incidentID = 101;  
        String newStatus = "Closed";

       
        boolean isUpdated = CrimeAnalysisImpl.updateIncidentStatus(newStatus, incidentID);

        
        assertTrue(isUpdated, "The incident status should be updated successfully.");
    }

}
