package demorock;


class Rocks {
    
    private int sampleNumb;
    private double weightGrams;
    private String desc;
    
    public int getSampleNumb()
    {
        return sampleNumb;
    }
    
    public double getWeightGrams()
    {
        return weightGrams;
    }
    
    public String getDesc()
    {
        return desc;
    }    
        
    Rocks(int sampleNumb, double weightGrams)
    {        
        this.sampleNumb = sampleNumb;
        this.weightGrams = weightGrams;
        this.desc = "Unclassified";
    }        
}
