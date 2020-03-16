package demorock;


class MetamorphicRock extends Rocks {
    
    private String desc;
    
    public MetamorphicRock(int sampleNumb, double weightGrams)
    {
        super(sampleNumb, weightGrams);
                this.desc = "Rock that has been transformed over time through heat and pressure";
    }
    
    public String getDesc()
    {
        return desc;
    }
    
    
}
