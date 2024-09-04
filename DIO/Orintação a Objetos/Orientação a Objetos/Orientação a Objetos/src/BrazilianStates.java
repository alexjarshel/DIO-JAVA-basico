public enum BrazilianStates {
    SAO_PAULO("sp","são paulo"),
    SANTA_CATARINA("sc","santa catarina");

    private String name;
    private String acronym;

    
    public String getName() {
        return name;
    }

    public String getAcronym() {
        return acronym;
    }

    public String getNameUppercase() {
        return acronym.toUpperCase();
    }


    private BrazilianStates(String acronym, String name ){
        this.name = name;
        this.acronym = acronym;
    }

}
