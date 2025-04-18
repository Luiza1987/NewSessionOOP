package service;

import models.Agency;
import models.Customer;
import models.House;

public interface AgencyService {
    // TODO CRUD
    String addAgency(Agency agency);
    Agency getAgencyById(long id);
    Agency[] getAllAgency();
    String updateAgencyById(long id, Agency newAgency);
    String deleteAgencyById(long id);

    String addHouseToAgency(House house);
    House getHouseById(long id);
    House getAllHouse();
    String updateHouseById(long id,House newHouse);
    String deleteHouseById(long id);

    String updateHouseById();

    House getHouseById(Long id);

    void addCustomer(Customer customer);

    Customer getCustomerByID(long id);

    Customer getCustomerByID();
}