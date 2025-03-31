package crud;

public class House {
    private long id;
    private String address;
    private double price;
    private int room;
    private String country;

    // Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", price=" + price +
                ", room=" + room +
                ", country='" + country + '\'' +
                '}';
    }

    // CREATE
    public House[] createHouse(House[] houses, House house) {
        House[] newHouses = new House[houses.length + 1];
        for (int i = 0; i < houses.length; i++) {
            newHouses[i] = houses[i];
        }
        newHouses[houses.length] = house;
        return newHouses;
    }

    // GET ALL
    public House[] getAllHouses(House[] houses) {
        return houses;
    }

    // GET BY ID
    public House getHouseById(long id, House[] houses) {
        for (House house : houses) {
            if (id == house.getId()) {
                return house;
            }
        }
        return null;
    }

    // UPDATE
    public House[] updateHouseById(long id, House[] houses, House updatedHouse) {
        for (int i = 0; i < houses.length; i++) {
            if (houses[i].getId() == id) {
                houses[i].setAddress(updatedHouse.getAddress());
                houses[i].setPrice(updatedHouse.getPrice());
                houses[i].setRoom(updatedHouse.getRoom());
                houses[i].setCountry(updatedHouse.getCountry());
                return houses;
            }
        }
        System.out.println("Дома с ID " + id + " не найден.");
        return houses;
    }

    // DELETE
    public House[] deleteHouseById(long id, House[] houses) {
        int index = -1;
        for (int i = 0; i < houses.length; i++) {
            if (houses[i].getId() == id) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Дом с ID" + id + " не найден.");
            return houses;
        }

        House[] newHouses = new House[houses.length - 1];
        for (int i = 0, j = 0; i < houses.length; i++) {
            if (i != index) {
                newHouses[j++] = houses[i];
            }
        }

        return newHouses;
    }
}
