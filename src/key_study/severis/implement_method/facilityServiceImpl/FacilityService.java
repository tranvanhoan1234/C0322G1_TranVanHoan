package key_study.severis.implement_method.facilityServiceImpl;

import key_study.model.facility.Facility;
import key_study.severis.ServiceImpl;

public interface FacilityService {
    void displayFacility();

    void addMaintenance(Facility facility);

    void checkMaintenance(Facility facility);

    void displayMaintenance();

    void addHose();

    void addVilla();

    void addRoom();

}
