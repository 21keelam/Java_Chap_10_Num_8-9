package demorock;


class IgneousRock extends Rocks {
    
    private String desc;
    
    public IgneousRock(int sampleNumb, double weightGrams)
    {
        super (sampleNumb, weightGrams);
        this.desc = "Rock made from cooled magma";
    }
    
    public String getDesc()
    {
        return desc;
    }
    
    
    
    
    
}
