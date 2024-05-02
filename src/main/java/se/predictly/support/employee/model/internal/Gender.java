package se.predictly.support.employee.model.internal;

public enum Gender {
    MALE, FEMALE, UNKNOWN;

    public static Gender from(String value) {
        return value == null ? UNKNOWN : switch (value.toUpperCase()) {
            case "M" -> MALE;
            case "F" -> FEMALE;
            default -> UNKNOWN;
        };
    }
}