package top.quickey.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "quickey_ide_dict")
public class Quickey {

    @Id
    @GeneratedValue
    private Integer id;

    private String ide_name;
    private Integer see_nums;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIde_name() {
        return ide_name;
    }

    public void setIde_name(String ide_name) {
        this.ide_name = ide_name;
    }

    public Integer getSee_nums() {
        return see_nums;
    }

    public void setSee_nums(Integer see_nums) {
        this.see_nums = see_nums;
    }

    @Override
    public String toString() {
        return "Quickey{" +
                "id=" + id +
                ", ide_name='" + ide_name + '\'' +
                ", see_nums=" + see_nums +
                '}';
    }
}
