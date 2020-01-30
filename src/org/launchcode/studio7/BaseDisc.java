package org.launchcode.studio7;

public abstract class BaseDisc implements OpticalDisc{
    private String name;
    private Double capacity;
    private String content;
    private String type;
    private Boolean rewritable;
    private Double spinSpeed;

    public BaseDisc(String name, Double capacity, String content, String type, Boolean rewritable, Double spinSpeed) {
        this.name = name;
        this.capacity = capacity;
        this.content = content;
        this.type = type;
        this.rewritable = rewritable;
        this.spinSpeed = spinSpeed;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCapacity() {
        return capacity;
    }

    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getRewriteable() {
        return rewritable;
    }

    public void setRewriteable(Boolean rewriteable) {
        this.rewritable = rewriteable;
    }

    public Double getSpinSpeed() {
        return spinSpeed;
    }

    public void setSpinSpeed(Double spinSpeed) {
        this.spinSpeed = spinSpeed;
    }

    @Override
    public String spinDisc(){
        return type + " is spinning at " + spinSpeed + " rpms.";
    }
    @Override
    public String writeData(){
        return "help write";
    }
    @Override
    public String readData(){
        return "help read";
    }
    @Override
    public Boolean loadedInfo(){
        return true;
    }
    @Override
    public Boolean eject(){
        return false;
    }

}
