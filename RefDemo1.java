class RefDemo1 {
    public static void main(String args[]) {
        BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
        BoxWeight plainbox = new BoxWeight();
        double vol;
        
        vol = weightbox.volume();
        System.out.println("Volume of weightbox is " + vol);
        System.out.println("Weight of weightbox is " + weightbox.weight);
        System.out.println();
        
        // Assign BoxWeight reference to BoxWeight reference
        plainbox = weightbox;
        
        vol = plainbox.volume(); // OK, volume() defined in BoxWeight
        System.out.println("Volume of plainbox is " + vol);
        
        // Now you can directly access weight member through plainbox reference
        System.out.println("Weight of plainbox is " + plainbox.weight);
    }
}
