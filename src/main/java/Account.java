public class Account {

    private String name;
    private int minLength;
    private int maxLength;

    public Account(String name) {
        this.name = name;
    }

    /**
     * Метод проверки возможности печати ФИО на карте
     *
     * @return true - можно печатать; false - нельзя печатать
     */
    public boolean checkNameToEmboss() {
        minLength = 3;
        maxLength = 19;
        try {
            long spacesCount = name.chars().filter(ch -> ch == ' ').count();
            if (name.length() >= minLength && name.length() <= maxLength && spacesCount == 1) {
                int indexSpace = name.indexOf(' ');
                if (indexSpace != 0 && indexSpace != name.length() - 1) {
                    return true;
                }
            }
            return false;
        } catch (NullPointerException e) {
            return false;
        }
    }
}