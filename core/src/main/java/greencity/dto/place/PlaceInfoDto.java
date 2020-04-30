package greencity.dto.place;

import greencity.dto.comment.CommentDto;
import greencity.dto.discount.DiscountValueDto;
import greencity.dto.location.LocationDto;
import greencity.dto.openhours.OpenHoursDto;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class PlaceInfoDto {
    private Long id;
    private String name;
    private LocationDto location;
    private List<OpenHoursDto> openingHoursList;
    private List<DiscountValueDto> discountValues;
    private List<CommentDto> comments;
    private Double rate;
}
