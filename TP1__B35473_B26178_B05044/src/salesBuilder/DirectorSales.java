package salesBuilder;

import usersBuilder.CustomException;

/**
 * Class is responsible for creating the sale object completely, with all its
 * parts verified
 *
 * @author Robert Sánchez, Edgardo Quirós, Ana Teresa Quesada.
 */
public class DirectorSales {

    /**
     * Method that is responsible for validating every part of creation, before
     * returning the object
     *
     * @param builder, the instance of the concrete parts creator
     * @param brand, the sale brand
     * @param model, the sale model
     * @param year, the sale year
     * @param carId, the sale carId
     * @param color, the sale color
     * @param description, the sale description
     * @param days, the sale days
     * @param minOffer, the sale minnOffer
     * @return the sale completely validate
     * @throws CustomException if could not create one of the parties
     */
    public Sale createSale(AbstractBuilderCreateSale builder, String brand, String model, int year, String carId, String color, String description, int days, int minOffer) throws CustomException {
        if (builder == null) {
            builder = new ConcreteBuilderCreateSale();
        }

        builder.buildBrand(brand);
        builder.buildCarId(model);
        builder.buildYear(year);
        builder.buildCarId(carId);
        builder.buildColor(color);
        builder.buildDescription(description);
        builder.buildDays(days);
        builder.buildMinOffer(minOffer);
        return builder.getSale();
    }

}
