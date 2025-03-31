package modifiers;

public class Country {
    String name;
    long population;
    double area;
    String language;

    public Country(String name, long population, double area, String language){
        this.name = name;
        this.population = population;
        this.area = area;
        this.language = language;
    }
    public static Country maxArea (Country[] countries) {
        Country max = countries[0];
        for (int i = 1; i < countries.length; i++) {
            if (countries[i].area > max.area) {
                max = countries[i];
            }
        }
        return max;

    }
}
