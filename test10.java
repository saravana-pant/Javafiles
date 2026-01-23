class box
{
    int len,wid,height;
    float volume;
    void volume(int l,int w,int h)
    {
        len=l;
        wid=w;
        height=h;
        volume=len*wid*height;
        System.out.println("Volume of Box : "+volume);
    }
}
class boxwight extends box
{
    float weight,density;
    void find_weight(float den)
    {
        density=den;
        weight=volume*density;
        System.out.println("Weight of the Box : "+weight);
    }
}
class shipment extends boxwight
{
    int shipment_id;
    void shipment_display(int id)
    {
        shipment_id=id;
        System.out.println("Shipment id : "+shipment_id);
    }
}
public class test10
{
    public static void main(String[] args)
    {
        shipment s = new shipment();
        s.volume(1,2,3);
        s.find_weight(5);
        s.shipment_display(17);
    }
}