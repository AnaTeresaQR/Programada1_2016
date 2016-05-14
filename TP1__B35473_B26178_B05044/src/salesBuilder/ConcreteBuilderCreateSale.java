package salesBuilder;

import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import usersBuilder.CustomException;

/**
 * Class that implements AbstractBuilderCreateSale and defines methods to create
 * a sale
 *
 * @author Robert Sánchez, Edgardo Quirós, Ana Teresa Quesada.
 */
public class ConcreteBuilderCreateSale implements AbstractBuilderCreateSale {

    private Sale sale;
    private boolean check;

    /**
     * CFlass constructor
     */
    public ConcreteBuilderCreateSale() {
        sale = new Sale();
    }

    /**
     * Returns a sale if all parts have been validated with regular expressions
     *
     * @return @throws CustomException if any parts could not be created
     * correctly
     */
    @Override
    public Sale getSale() throws CustomException {

        return sale;
    }

    /**
     * Check the brand, validation with regular expressions
     *
     * @return true if matches, false if not
     */
    public boolean checkBrand() {

        Pattern pat = Pattern.compile("[a-zA-Z0-9]{0,15}");
        Matcher mat = pat.matcher(sale.getBrand());
        if (mat.matches()) {
            check = true;
        } else {
            check = false;
        }
        return check;
    }

    /**
     * Check the model, validation with regular expressions
     *
     * @return true if matches, false if not
     */
    public boolean checkModel() {

        Pattern pat = Pattern.compile("[a-zA-Z0-9]{0,15}");
        Matcher mat = pat.matcher(sale.getBrand());
        if (mat.matches()) {
            check = true;
        } else {
            check = false;
        }
        return check;
    }

    /**
     * Check the carIdOldType, validation with regular expressions
     *
     * @return true if matches, false if not
     */
    public boolean checkCarIdOldType() {

        Pattern pat = Pattern.compile("[0-9]{6}");
        Matcher mat = pat.matcher(sale.getCarId());
        if (mat.matches()) {
            check = true;
        } else {
            check = false;
        }
        return check;
    }

    /**
     * Check the carIdNewType, validation with regular expressions
     *
     * @return true if matches, false if not
     */
    public boolean checkCarIdNewType() {

        Pattern pat = Pattern.compile("[A-Z]{3}+[0-9]{3}");
        Matcher mat = pat.matcher(sale.getCarId());
        if (mat.matches()) {
            check = true;
        } else {
            check = false;
        }
        return check;
    }

    /**
     * Check the name, validation with regular expressions
     *
     * @return true if matches, false if not
     */
    public boolean checkColor() {

        Pattern pat = Pattern.compile("[a-zA-Z]{0,15}");
        Matcher mat = pat.matcher(sale.getBrand());
        if (mat.matches()) {
            check = true;
        } else {
            check = false;
        }
        return check;
    }

    /**
     * Check the name, validation with regular expressions
     *
     * @return true if matches, false if not
     */
    public boolean checkDescription() {

        Pattern pat = Pattern.compile("[a-zA-Z]{0,200}");
        Matcher mat = pat.matcher(sale.getBrand());
        if (mat.matches()) {
            check = true;
        } else {
            check = false;
        }
        return check;
    }

    public boolean checkCarId() {
        if (checkCarIdNewType() || checkCarIdOldType()) {
            return true;
        } else {
            return true;
        }
    }

    /**
     * Builds brand if it is not empty or null
     *
     * @param brand, the schedule of the sale
     * @throws CustomException, if can not set the id
     */
    @Override
    public void buildBrand(String brand) throws CustomException {
        if (checkBrand()) {
            sale.setBrand(brand);
        } else {
            throw new CustomException("La extensión de la marca excede el tamaño permitido, debe ser menor a 15 caracteres.");
        }

    }

    /**
     * Builds model if it is not empty or null
     *
     * @param model, the name of the sale
     * @throws CustomException, if can not set the name
     */
    @Override
    public void buildModel(String model) throws CustomException {
        if (checkModel()) {
            sale.setModel(model);
        } else {
            throw new CustomException("La extensión del modelo excede el tamaño permitido, debe ser menor a 15 caracteres.");
        }
    }

    /**
     * Builds year if it is 
     *
     * @param year, the email of the sale
     * @throws CustomException if can not set themail
     */
    @Override
    public void buildYear(int year) throws CustomException {
        if (year > 1900 && year < 2016) {
            sale.setYear(year);
        } else {
            throw new CustomException("No es posible guardar el año");
        }
    }

    /**
     * Builds carId if it is not empty or null
     *
     * @param carId, the email password of the sale
     * @throws CustomException if can not set password
     */
    @Override
    public void buildCarId(String carId) throws CustomException {
        if (checkCarId()) {
            sale.setCarId(carId);
        } else {
            throw new CustomException("La matricula del carro no coincide con el tipo de matricula permitida en Costa Rica");
        }
    }

    /**
     * Check Color if it is not null or if the sale is of age
     *
     * @param color, receives the sale birthdate
     * @throws CustomException if can not set the birthdate
     */
    @Override
    public void buildColor(String color) throws CustomException {
        if (color != null && !color.equals("")) {
            sale.setCarId(color);
        } else {
            throw new CustomException("La extensión de la marca excede el tamaño permitido, debe ser menor a 15 caracteres.");
        }
    }

    /**
     * Builds description if it is not empty or null
     *
     * @param description , the phoneNumber of the sale
     * @throws CustomException if can not set phoneNumber
     */
    @Override
    public void buildDescription(String description) throws CustomException {
        if (description != null) {
            sale.setDescription(description);
        } else {
            throw new CustomException("La extensión de la description excede el tamaño permitido, debe ser menor a 200 caracteres.");
        }
    }

    /**
     * Builds description if it is not empty or null
     *
     * @param days , the days of the sale
     * @throws CustomException if can not set days
     */
    @Override
    public void buildDays(int days) throws CustomException {
        if (days > 0 && days <= 7) {
            sale.setDays(days);
        } else {
            throw new CustomException("No es posible guardar la cantidad de dias restantes");
        }

    }

    @Override
    public void buildMinOffer(int minOffer) throws CustomException {
        if (minOffer > 100000) {
            sale.setMinOffer(minOffer);
        } else {
            throw new CustomException("No es posible guardar la cantidad minima ofertada");
        }

    }

}
