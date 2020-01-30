package org.launchcode.studio7;

public class DVD extends BaseDisc {
    private Boolean subtitled;

    public DVD(String name, Double capacity, String content, String type, Boolean rewritable, Double spinSpeed, Boolean subtitled){
        super(name, capacity, content, type, rewritable, spinSpeed);
        this.subtitled = subtitled;
    }

    //getters and setters
    public Boolean getSubtitled() {
        return subtitled;
    }

    public void setSubtitled(Boolean subtitled) {
        this.subtitled = subtitled;
    }
    // TODO: Implement your custom interface.

    @Override
    public String spinDisc(){
        return "Insert DVD. You forgot " + getSpinSpeed();
    }
    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
