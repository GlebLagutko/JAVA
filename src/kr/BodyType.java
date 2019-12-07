package kr;

public enum BodyType {
    SEDAN, COUPE, HATCHBACK;

    public static BodyType toType(String s) throws EnumIncorrectException {
        BodyType temp;
        switch (s) {
            case "SEDAN":
                temp = SEDAN;
                break;
            case "COUPE":
                temp = COUPE;
                break;
            case "HATCHBACK":
                temp = HATCHBACK;
                break;
            default:
                throw new EnumIncorrectException();
        }
        return temp;
    }


}
