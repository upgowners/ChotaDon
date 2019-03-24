class MyGC
{
	MyGC()
	{
		System.out.println("In Constructor");
	}
	protected void finalize()
	{
		System.out.println("In Finalize");
	}
}
class MyGCDemo
{
	public static void main(String[] args)
	{
		MyGC obj = new MyGC();
		obj.finalize();
		obj = null;
		System.gc();
	}
}