package se.predictly.support.employee.mapper;

public class GenderMapper {
    private GenderMapper() {}

    public static se.predictly.support.employee.model.internal.Gender map(String from) {
        return se.predictly.support.employee.model.internal.Gender.from(from);
    }


}
