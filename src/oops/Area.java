package oops;

public class Area extends Shape{

	@Override
	public void RectangleArea(int l, int b) {
		// TODO Auto-generated method stub
		
		int area = l*b;
		System.out.println("Area of Rectangle is: "+area+" sq m");
				
	}

	@Override
	public void SquareArea(int s) {
		// TODO Auto-generated method stub
		int area = s*s;
		System.out.println("Area of Square is: "+area+" sq m");
	}

	@Override
	public void CircleArea(int r) {
		// TODO Auto-generated method stub
		
		double area = 3.14*r*r;
		System.out.println("Area of Circle is: "+area+" sq m");
		
		
	}
	

}
