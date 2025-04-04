package service;

import models.House;
import enums.HouseType;

public interface HouseService {
    // Добавление дома в агентство
    String addHouseToAgency(long agencyId, House house);

    // Получение дома по ID
    House getHouseById(long id);

    // Получение всех домов по ID агентства
    House[] getAllHousesByAgencyId(long agencyId);

    // Удаление дома по ID
    String deleteHouseById(long houseId);

    // Обновление информации о доме по ID
    String updateHouseById(long houseId, House updatedHouse);

    // Получение домов по типу
    House[] getHousesByType(HouseType houseType);

    // Получение домов по типу (новый метод)
    House[] getHouseByHouseType(long agencyId, HouseType houseType);
}