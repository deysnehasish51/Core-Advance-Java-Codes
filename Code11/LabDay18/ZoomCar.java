class ZoomCar
{
    String modelName;
    String carNumber;

    public void addCar(String modelName,String carNumber)
    {
        int count=0;
        for(int i=0;i<carNumber.length();i++)
        {
            char ch=carNumber.charAt(i);
            if((i==0||i==1||i==4||i==5))
            {
                if(ch>='A'||ch<='B')
                {
                    count++;
                }
            }
        }
        if(count==4&&modelName.length()>=2)
        {
            this.carNumber=carNumber;
            this.modelName=modelName;
            System.out.println("--- Registered Cars ---");
            System.out.println("Model: "+modelName+", Car Number: "+carNumber);
        }
        else{
            System.out.println("Invalid model name");
            System.out.println("Invalid car Number format");
        }
    }
    public static void main(String []args)
    {
        ZoomCar c1=new ZoomCar();
        c1.addCar("Swift","KA01MG1234");

        ZoomCar c2=new ZoomCar();
        c2.addCar("X","123ABC9999");
    }
}
