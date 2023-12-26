/*WAP in Java to create an interface. Inherit the interface and override tnhe method in it.
Author : Kanika Rawat
Rollno. : R2142220532
SAP_ID :500105687
 */

interface mydisp
{
    void disp();
}
class myClass implements mydisp
{
    @Override
    public void disp()
    {
    System.out.println("Hello");
    }
}
class main1
{
    public static void main(String[] args)
    {
        myClass m= new myClass();
        m.disp();
    }
}
    