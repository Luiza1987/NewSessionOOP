package service.serviceImpl;

import db.Database;
import exceptions.MyException;
import models.Agency;
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
}