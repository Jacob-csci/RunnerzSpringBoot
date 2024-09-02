package dev.jacobrich.runnerz.user;

public record Address(
        String steet,
        String suite,
        String city,
        String zipcode,
        Geo geo
    
) {
    
}
