class person
{
person()
{
System.out.println("person class");
}
person(String name)
{
System.out.println("name="+name);

}
}
class student extends person
{
student()
{
super("chierag");
System.out.println("student class");
}
}
class constr
{
public static void main(String ar[])
{
student obj=new student();

}
}
