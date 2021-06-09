public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        // the hypotenuse is the side across from the right angle. 
        // calculate the value of c given legA and legB
        double legC = Math.sqrt(legA) + Math.sqrt(legB);
        return legC;
    }
}
