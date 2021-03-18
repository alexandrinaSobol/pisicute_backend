package org.acme;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import org.springframework.web.bind.annotation.PathVariable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;


@Entity
public class Cat extends PanacheEntity {
public String name;
public String breed;
public int age;
public String addDate;
public String updateDate;

    public Cat() {
    }

    public Cat( long id, String name, String breed, int age, String addDate, String updateDate) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.addDate = addDate;
        this.updateDate = updateDate;

    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public String getAddDate() {
        return addDate;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddDate(String addDate) {
        this.addDate = addDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public static List<Cat> getCatByName(String name){
        return Cat.find("name", name).list();
    }
}
