package demorock;


class SedimentaryRock extends Rocks {
    
    private String desc;
    
    public SedimentaryRock(int sampleNumb, double weightGrams)
    {
        super(sampleNumb, weightGrams);
        this.desc = "Rock made from compressed sediment - or bits of dirt and rock";
    }
    
    public String getdesc()
    {
        return desc;
    }
    
    
    
    
}
