package pl.szymonstankowski.demo.excersises;


import lombok.Data;

@Data
public class Belters {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

