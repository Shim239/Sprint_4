public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    /**
     * Метод проверки возможности печати ФИО на карте
     *
     * @return true - можно печатать; false - нельзя печатать
     */
    public boolean checkNameToEmboss() {
        int minLength = 3;
        int maxLength = 19;
        if (name != null) {
            long spacesCount = name.chars().filter(ch -> ch == ' ').count();
            if (name.length() >= minLength && name.length() <= maxLength && spacesCount == 1) {
                int indexSpace = name.indexOf(' ');
                return indexSpace != 0 && indexSpace != name.length() - 1;
            }
        }
        return false;
    }
}