package service.serviceImpl;

import db.Database;
import enums.HouseType;
import models.Agency;
import models.House;
import service.HouseService;

public class HouseServiceImpl implements HouseService {
    // Реализация других методов

    @Override
    public String addHouseToAgency(long agencyId, House house) {
        return "";
    }

    @Override
    public House getHouseById(long id) {
        return null;
    }

    @Override
    public House[] getAllHousesByAgencyId(long agencyId) {
        return new House[0];
    }

    @Override
    public String deleteHouseById(long houseId) {
        return "";
    }

    @Override
    public String updateHouseById(long houseId, House updatedHouse) {
        return "";
    }

    @Override
    public House[] getHousesByType(HouseType houseType) {
        return new House[0];
    }

    @Override
    public House[] getHouseByHouseType(long agencyId, HouseType houseType) {
        // Массив для хранения отфильтрованных домов
        House[] filteredHouses = new House[10]; // Предположим, что максимальное количество домов — 10
        int count = 0;

        // Проходим по всем агентствам
        for (Agency agency : Database.agencies) {
            if (agency != null && agency.getId() == agencyId) {
                // Проходим по домам агентства
                for (House house : agency.getHouses()) {
                    if (house != null && house.getHouseType() == houseType) {
                        // Добавляем дом в список отфильтрованных домов
                        filteredHouses[count++] = house;
                    }
                }
            }
        }

        // Возвращаем массив с отфильтрованными домами
        return filteredHouses;
    }

}