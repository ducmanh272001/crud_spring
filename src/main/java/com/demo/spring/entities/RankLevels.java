package com.demo.spring.entities;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "rank_levels")
public class RankLevels {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "is_active")
    private Boolean is_active;
    @Column(name = "create_at")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date create_at;
    @Column(name = "update_at")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date update_at;
    @Column(name = "create_by")
    private Integer create_by;
    @Column(name = "update_by")
    private Integer update_by;
    @Column(name = "delete_by")
    private Integer delete_by;
    @Column(name = "deleted_at")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date deleted_at;

    public RankLevels(Integer id, String name, String description, Boolean is_active, Date create_at, Date update_at, Integer create_by, Integer update_by, Integer delete_by, Date deleted_at) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.is_active = is_active;
        this.create_at = create_at;
        this.update_at = update_at;
        this.create_by = create_by;
        this.update_by = update_by;
        this.delete_by = delete_by;
        this.deleted_at = deleted_at;
    }

    public RankLevels() {
    }

    public RankLevels(String name, String description, Boolean is_active, Date create_at, Date update_at, Integer create_by, Integer update_by, Integer delete_by, Date deleted_at) {
        this.name = name;
        this.description = description;
        this.is_active = is_active;
        this.create_at = create_at;
        this.update_at = update_at;
        this.create_by = create_by;
        this.update_by = update_by;
        this.delete_by = delete_by;
        this.deleted_at = deleted_at;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIs_active() {
        return is_active;
    }

    public void setIs_active(Boolean is_active) {
        this.is_active = is_active;
    }

    public Date getCreate_at() {
        return create_at;
    }

    public void setCreate_at(Date create_at) {
        this.create_at = create_at;
    }

    public Date getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(Date update_at) {
        this.update_at = update_at;
    }

    public Integer getCreate_by() {
        return create_by;
    }

    public void setCreate_by(Integer create_by) {
        this.create_by = create_by;
    }

    public Integer getUpdate_by() {
        return update_by;
    }

    public void setUpdate_by(Integer update_by) {
        this.update_by = update_by;
    }

    public Integer getDelete_by() {
        return delete_by;
    }

    public void setDelete_by(Integer delete_by) {
        this.delete_by = delete_by;
    }

    public Date getDeleted_at() {
        return deleted_at;
    }

    public void setDeleted_at(Date deleted_at) {
        this.deleted_at = deleted_at;
    }

    @Override
    public String toString() {
        return "RankLevels{" + "id=" + id + ", name='" + name + '\'' + ", description='" + description + '\'' + ", is_active=" + is_active + ", create_at=" + create_at + ", update_at=" + update_at + ", create_by=" + create_by + ", update_by=" + update_by + ", delete_by=" + delete_by + ", deleted_at=" + deleted_at + '}';
    }
}
