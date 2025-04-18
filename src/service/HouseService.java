package service;

import models.House;
import enums.HouseType;

public interface HouseService {
    //    // Добавление дома в агентство
//    String addHouseToAgency(House house);
//
//    // Получение дома по ID
//    House getHouseById(long id);
//
//    // Получение всех домов по ID агентства
//    House[] getAllHousesByAgencyId(long agencyId);
//
//    // Удаление дома по ID
//    String deleteHouseById(long houseId);
//
//    // Обновление информации о доме по ID
//    String updateHouseById(long houseId, House updatedHouse);
//
//    // Получение домов по типу
//    House[] getHousesByType(HouseType houseType);
//
//    // Получение домов по типу (новый метод)
//    House[] getHouseByHouseType(long agencyId, HouseType houseType);
//
//
//    void addHouse(House kyrgyzstan);
//}
    String addHouseToAgency(House house);

    House getHouseById(long id);

    House getAllHouse();

    String updateHouseById(long id, House newHouse);

    House[] getAllHousesByAgencyId(long agencyId);

    String deleteHouseById(long id);

    House[] getHousesByType(HouseType houseType);

    House[] getHouseByHouseType(long agencyId, HouseType houseType);

    default void addHouse(House kyrgyzstan) {

    }
}