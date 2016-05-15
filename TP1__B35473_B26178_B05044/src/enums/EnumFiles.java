package enums;

/**
 *
 * @author Ana Teresa
 */
public enum EnumFiles {

    USER_FILE_NAME("usersFile.bin"), // users binary file
    SALE_FILE_NAME("saleFile.bin"); // sale binary file
    private final String value;

    EnumFiles(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
