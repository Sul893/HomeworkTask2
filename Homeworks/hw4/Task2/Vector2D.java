public class Vector2D{
	private double x;
	private double y;

	public Vector2D(){
		System.out.println("Нулевой вектор");
	}

	public int getX(){
		return this.x;
	}
	public int getY(){
		return this.y;
	}

	public Vector2D(double x, double y){
		this.x = x;
		this.y =y;
	}
	public Vector2D add(Vector2D vc){
		int x1 = this.x+vc.getX();
		int y1= this.y + vc.getY();
		Vector2D vc2 = new Vector2D(x1,y1);
		return vc2;
	}
	public void add2(Vector2D vc){
		this.x+=vc.getX();
		this.y+= vc.getY();
	}

	public Vector2D sub(Vector2D vc){
		int x1 = this.x-vc.getX();
		int y1= this.y - vc.getY();
		Vector2D vc2 = new Vector2D(x1,y1);
		return vc2;
	}
	public void sub2(Vector2D vc){
		this.x-=vc.getX();
		this.y-= vc.getY();
	}

	public Vector2D mult(deuble a){
		int x1 = this.x*a;
		int y1= this.y*a;
		Vector2D vc2 = new Vector2D(x1,y1);
		return vc2;
	}
	public void mult2(double a){
		this.x*=a;
		this.y*=a;
	}
	@Override
    public String toString() {
        return "Vector2D(" + x + ", " + y + ")";
    }

    public double length() {
        return Math.sqrt(x * x + y * y);
    }

    public double scalarProduct(Vector2D vc) {
        return this.x * vc.getX() + this.y * vc.getY();
    }

    public double cos(Vector2D vc) {
        double dotProduct = this.scalarProduct(vc);
        double lengthsProduct = this.length() * vc.length();
        if (lengthsProduct == 0) {
            throw new ArithmeticException("Деление на ноль: один из векторов имеет нулевую длину.");
        }
        return dotProduct / lengthsProduct;
    }
    public boolean equals(Vector2D vc) {
        return this.x == vc.getX() && this.y == vc.getY();
    }

}