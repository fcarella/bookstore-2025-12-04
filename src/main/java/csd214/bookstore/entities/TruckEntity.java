package csd214.bookstore.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import java.util.Objects;

@Entity
public class TruckEntity extends VehicleEntity {
    public TruckEntity() {
        super();
    }

    public TruckEntity(String make, String model, int year, int mileage, double towingCapacity) {
        super(make, model, year, mileage);
        this.towingCapacity = towingCapacity;
    }

    public TruckEntity(String name, double price, String make, String model, int year, int mileage, double towingCapacity) {
        super(name, price, make, model, year, mileage);
        this.towingCapacity = towingCapacity;
    }

    @Override
    public String toString() {
        return "TruckEntity{" +
                "towingCapacity=" + towingCapacity +
                '}'+ super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TruckEntity that = (TruckEntity) o;
        return Double.compare(towingCapacity, that.towingCapacity) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), towingCapacity);
    }

    @Column(name = "towing_capacity", nullable = false)
    private double towingCapacity;

    public double getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

}