/*
װ�����ģʽ��
��ȻҪ�����еĶ�����й�����ǿʱ��
���Զ����࣬�����ж����룬�������еĹ��ܣ����ṩ��ǿ���ܡ�
��ô�Զ���ĸ����Ϊװ���ࡣ

װ����ͨ����ͨ�����췽�����ձ�װ�εĶ���
�����ڱ�װ�εĶ���Ĺ��ܣ��ṩ��ǿ�Ĺ��ܡ�

*/
class Person
{
	public void eat()
	{
		System.out.println("�Է�");
	}
}

class SuperPerson
{
	private Person p;
	SuperPerson(Person p)
	{
		this.p = p;
	}
	public void superEat()
	{
		System.out.println("��θ��");
		p.eat();
		System.out.println("���");
		System.out.println("�Լ���");

	}
}
class PersonDemo 
{
	public static void main(String[] args) 
	{
		Person p = new Person();
//		p.eat();
		
		SuperPerson sp = new SuperPerson(p);
		sp.superEat();
	}
}
