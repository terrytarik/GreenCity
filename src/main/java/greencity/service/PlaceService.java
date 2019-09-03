package greencity.service;

import greencity.dto.location.MapBoundsDto;
import greencity.dto.place.*;
import greencity.entity.Place;
import greencity.entity.enums.PlaceStatus;
import java.util.List;

/**
 * Provides the interface to manage {@code Place} entity.
 */
public interface PlaceService {
    /**
     * Finds all {@code Place} with status {@code PlaceStatus}.
     *
     * @param placeStatus a value of {@link PlaceStatus} enum.
     * @return a list of {@code Place} with the given {@code placeStatus}
     * @author Roman Zahorui
     */
    List<AdminPlaceDto> getPlacesByStatus(PlaceStatus placeStatus);

    /**
     * Update status for the Place and set the time of modification.
     *
     * @param id     - place id.
     * @param status - place status.
     * @return saved PlaceStatusDto entity.
     */
    PlaceStatusDto updateStatus(Long id, PlaceStatus status);

    /**
     * Find place by it's id.
     *
     * @param id - place id.
     * @return Place entity.
     */
    Place findById(Long id);

    /**
     * Method for saving proposed {@code Place} to database.
     *
     * @param dto - dto for Place entity
     * @return place {@code Place}
     * @author Kateryna Horokh
     */
    Place save(PlaceAddDto dto, String email);


    /**
     * Generated javadoc, must be replaced with real one.
     */
    Place update(Place place);

    /**
     * Generated javadoc, must be replaced with real one.
     */
    List<Place> findAll();

    /**
     * Generated javadoc, must be replaced with real one.
     */
    Boolean deleteById(Long id);

    /**
     * Method for getting place information.
     *
     * @param id place
     * @return info about place
     * @author Dmytro Dovhal
     */
    PlaceInfoDto getAccessById(Long id);


    /**
     * Check {@link Place} existing by id.
     *
     * @param id - {@link Place} id
     * @return boolean check result
     * @author Zakhar Skaletskyi
     */
    boolean existsById(Long id);

    /**
     * The method which return a list {@code PlaceByBoundsDto} with information about place, *
     * location depends on the map bounds.
     *
     * @param mapBoundsDto contains northEastLng, northEastLat,southWestLat, southWestLng of current
     *                     state of map
     * @return a list of {@code PlaceByBoundsDto}
     * @author Marian Milian.
     */
    List<PlaceByBoundsDto> findPlacesByMapsBounds(MapBoundsDto mapBoundsDto);

    /**
     * Get average rate of {@link Place}.
     *
     * @param id - {@link Place} id
     * @return byte rate number
     * @author Zakhar Skaletskyi
     */
    byte averageRate(Long id);
}