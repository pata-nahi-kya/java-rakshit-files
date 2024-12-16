class Box {

    double width ;
    double height ;
    double length ;

    void box_volume() {
        System.out.print("volume of box is ");
        System.out.println(width*height*length);
    }
    void box_surface(){
        System.out.print("total surface area of box is ");
        System.out.println(2*(length*height + width*height + width*length));
    }
    void boxLateralSurface(){
        System.out.print("lateral surface area of box is ");
        System.out.println(2*(height*(length + width)));
    }

}


public class volume {

    public static void main(String[] args) {
        Box box_propetry = new Box();
        
        box_propetry.height = 25 ;
        box_propetry.length = 14 ;
        box_propetry.width = 10 ;

        box_propetry.boxLateralSurface();
        box_propetry.box_surface();
        box_propetry.box_volume();
    }
}
