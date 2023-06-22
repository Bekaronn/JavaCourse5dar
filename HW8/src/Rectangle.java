public class Rectangle {
    int length;
    int height;

    public Rectangle(int length, int height){
        this.length = length;
        this.height = height;
    }

    public int returnArea(){
        return length*height;
    }
}
