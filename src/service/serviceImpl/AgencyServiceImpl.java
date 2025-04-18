package service.serviceImpl;

import db.Database;
import exceptions.MyException;
import models.Agency;
import models.Customer;
import models.House;
import service.AgencyService;

public class AgencyServiceImpl implements AgencyService {
    int agencyCount = 0;

    @Override
    public String addAgency(Agency agency) {
        try {
            Database.agencies[agencyCount++] = agency;
            return "Успех!";
        } catch (MyException e) {
            return e.getMessage();
        }
    }

    @Override
    public Agency getAgencyById(long id) {
        for (Agency agency : Database.agencies) {
            if (agency != null && agency.getId() == id) {
                return agency;
            }
        }
        return null;
    }

    @Override
    public Agency[] getAllAgency() {
        return Database.agencies;
    }

    @Override
    public String updateAgencyById(long id, Agency newAgency) {
        for (int i = 0; i < Database.agencies.length; i++) {
            if (Database.agencies[i] != null && Database.agencies[i].getId() == id) {
                Database.agencies[i] = newAgency;
                return "Агентство успешно удалено!";
            }
        }
        return "Агентство не найдено!";
    }

    @Override
    public String deleteAgencyById(long id) {
        for (int i = 0; i < Database.agencies.length; i++) {
            if (Database.agencies[i] != null && Database.agencies[i].getId() == id) {
                Database.agencies[i] = null;
                return "Агентство успешно удалено!";
            }
        }
        return "Агентство не найдено!";
    }

    @Override
    public String addHouseToAgency(House house) {
        return "";
    }

    @Override
    public House getHouseById(long id) {
        return null;
    }

    @Override
    public House getAllHouse() {
        return null;
    }

    @Override
    public String updateHouseById(long id, House newHouse) {
        return "";
    }

    @Override
    public String deleteHouseById(long id) {
        return "";
    }

    @Override
    public String updateHouseById() {
        return "";
    }

    @Override
    public House getHouseById(Long id) {
        return null;
    }

    @Override
    public void addCustomer(Customer customer) {

    }

    @Override
    public Customer getCustomerByID(long id) {
        return null;
    }

    @Override
    public Customer getCustomerByID() {
        return null;
    }
}