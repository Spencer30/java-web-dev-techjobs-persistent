package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @OneToMany
    @JoinColumn
    private List<Job> jobs = new ArrayList<>();

    @NotBlank(message = "Location is required")
    @Size(min = 2, max = 50, message = "Location must be between 2 and 50 characters")
    private String location;

    public Employer(String location) {
        super();
        this.location = location;
    }

    public Employer(){}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Job> getJobs() {
        return jobs;
    }
}
