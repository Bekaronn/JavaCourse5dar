public class StarTriangle {
    private int width;

    public StarTriangle(int width){
        this.width = width;
    }

    @Override
    public String toString() {
        String str = "";
        for(int i = 0; i<width; i++){
            for(int j = 0; j<i+1; j++){
                if(i==width-1){
                    str+="[*]";
                    if(j==width-1){
                        return str;
                    }
                } else {
                    System.out.print("[*]");
                }
            }
            System.out.print('\n');
        }
        return "0";
    }
}
