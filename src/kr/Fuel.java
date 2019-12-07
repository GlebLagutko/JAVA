package kr;

public enum Fuel {
    DIESEL, PETROL;

    public static Fuel toType(String s) throws EnumIncorrectException {
        Fuel temp;
        switch (s) {
            case "DIESEL":
                temp = DIESEL;
                break;
            case "PETROL":
                temp = PETROL;
                break;
            default:
                throw new EnumIncorrectException();
        }
        return temp;
    }


}
