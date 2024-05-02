package se.predictly.support.employee.model.internal;

import lombok.Builder;

import java.time.LocalDate;

@Builder
public record Salary (int amount, LocalDate from, LocalDate to) {}


