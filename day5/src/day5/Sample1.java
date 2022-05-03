package day5;

public class Sample1 {

	public static void main(String[] args) {
		/*
		05-05 ���
		�ڹٿ��� �ڽ� Ŭ������ �θ� Ŭ������ ����� �״�� �������� �� �ִ� ���(Inheritance) ����� �ִ�
		������ ���ؼ� �ڹ��� ��ӿ� ���ؼ� �ڼ��� �˾ƺ���.
		���
		�θ� Ŭ������ ����� Ȯ��
		IS-A ����
		�޼ҵ� �������̵�(Method overriding)
		�޼ҵ� �����ε�(method overloading)
		���� ���
		���
		���� é�Ϳ��� �ۼ��ߴ� Animal Ŭ������ ����ϴ� Dog Ŭ������ ����� ����.
		class Animal {
		    String name;
		    void setName(String name) {
		        this.name = name;
		    }
		}
		
		class Dog extends Animal {
		}
		
		public class Sample {
		    public static void main(String[] args) {
		        Dog dog = new Dog();
		        dog.setName("poppy");
		        System.out.println(dog.name);//poppy ���
		    }
		}
		Ŭ���� ����� ���ؼ��� extends ��� Ű���带 ����Ѵ�.
		���� Dog Ŭ������ Animal Ŭ������ ����ϰ� �Ǿ���. Dog Ŭ������ name �̶�� ��ü������ setName �̶�� �޼ҵ带
		������ �ʾ����� Animal Ŭ������ ����߱� ������ �״�� ����� �����ϴ�.
		
		�θ� Ŭ������ ����� Ȯ��
		�̹����� Dog Ŭ������ sleep �޼ҵ带 �߰� �� ����.
		class Animal {
		    String name;
		    void setName(String name) {
		        this.name = name;
		    }
		}
		
		class Dog extends Animal {
		    void sleep() {
		        System.out.println(this.name+" zzz");
		    }
		}
		
		public class Sample {
		    public static void main(String[] args) {
		        Dog dog = new Dog();
		        dog.setName("poppy");
		        System.out.println(dog.name);//poppy ���
		        dog.sleep();//poppy zzz ���
		    }
		}
		���� Dog Ŭ������ Animal Ŭ�������� �� �� ���� ���(sleep�޼ҵ尡 �߰��Ǿ���.)�� ������ �Ǿ���.
		�̷��� ���� �θ� Ŭ������ ��ӹ��� �ڽ� Ŭ������ �θ� Ŭ������ ��ɿ� ���Ͽ� �� �� ���� ����� ������ �ۼ��Ѵ�.
		
		IS-A ����
		Dog Ŭ������ Animal Ŭ������ ����ߴ�. ��, Dog�� Animal�� ���� �����̶�� �� �� �ִ�. 
		�̷� ��� Dog�� Animal�� ���ԵǱ� ������ "���� �����̴�"��� ǥ���� �� �ִ�.
		�ڹٴ� �̷��� ���踦 IS-A ������ ǥ���Ѵ�. �� "Dog is a Animal" �� ���� ���� �� �ִ� ���踦 IS-A ������ �Ѵ�.
		�̷��� IS-A ����(��Ӱ���)�� ���� �� �ڽ� Ŭ������ ��ü�� �θ� Ŭ������ �ڷ����� ��ó�� ����� �� �ִ�.
		��, ������ ���� �ڵ��� �����ϴ�.
		Animal dog = new Dog();//Dog is a Animal
		�ٸ� ���⼭ �� ���� �����ؾ� �� ���� �ִ�. Dog��ü�� Animal �ڷ������� ����� ��쿡�� Dog Ŭ�������� �����ϴ� sleep �޼ҵ带 �����
		�� ���ٴ� ���̴�. �̷� ��쿡�� Animal Ŭ������ ������ setName �޼ҵ常 ����� �����ϴ�.
		������ �� �ݴ��� ���, �� �θ� Ŭ������ ������� ��ü�� �ڽ� Ŭ������ �ڷ������δ� ����� �� ����.
		������ �ڵ�� ������ ������ �߻��Ѵ�.
		
		Dog dog = new Animal();//������ ����: �θ� Ŭ������ ���� ��ü�� �ڽ� Ŭ������ �ڷ������� ����� �� ����.
		�� �κ��� �� �� ���������� ���캸��.
		Animal dog = new Dog();//Dog is a Animal(O)
		�� �ڵ带 �о�� "���� ���� ��ü�� ���� �ڷ����̴�."��� ���� �� �ִ�.
		�� ���� �ڵ带 ����.
		Dog dog = new Animal();  // Animal is a Dog (X)
		���� ���������� �о�� "������ ���� ��ü�� �� �ڷ����̴�."�� ���� �� ���� ���̴�. �ٵ� ���� �� �̻����� ������?
		������ ���� ��ü�� "��" �ڷ��� ���� "ȣ����" �ڷ��� �Ǵ� "����" �ڷ����� �� �� ���� ������?
		���������� ���캸�Ƶ� �ι�° �ڵ�� ������ �� ���ٴ� ���� �� �� �ִ�.
		
		Object Ŭ����
		�ڹٿ��� ����� ��� Ŭ������ Object Ŭ������ ��ӹ޴´�. ��� �츮�� ���� Animal Ŭ������ ������ ��������� ������ �����ϴ�.
		������ ���� �Ʒ� �ڵ�ó�� Object Ŭ������ ����ϵ��� �ڵ����� �ʾƵ� �ڹٿ��� ��������� ��� Ŭ������ Object Ŭ������ �ڵ����� ��ӹްԲ� �Ǿ� �ִ�.
		
		class Animal extends Object {
		    String name;
		    void setName(String name) {
		        this.name = name;
		    }
		}
		���� �ڹٿ��� ����� ��� ��ü�� Object �ڷ������� ����� �� �ִ�. ��, ������ ���� �ڵ��ϴ� ���� �����ϴ�.
		
		Object animal = new Animal();  // Animal is a Object
		Object dog = new Dog();  // Dog is a Object
		�޼ҵ� �������̵� (Method overriding)
		�̹����� Dog Ŭ������ �� �� ��üȭ ��Ű�� HouseDog Ŭ������ ����� ����.
		HouseDog Ŭ������ Dog Ŭ������ ����Ͽ� ������ ���� ���� �� �ִ�.
		class Animal {
		    String name;
		
		    void setName(String name) {
		        this.name = name;
		   }
		}
		
		class Dog extends Animal {
		    void sleep() {
		        System.out.println(this.name+" zzz");
		 }
		}
		
		class HouseDog extends Dog {
		}
		
		public class Sample {
		    public static void main(String[] args) {
		        HouseDog houseDog = new HouseDog();
		        houseDog.setName("happy");
		        houseDog.sleep();  // happy zzz ���
		    }
		}
		HouseDog Ŭ������ ���� �� ���� sleep �޼ҵ尡 ȣ��Ǿ� ������ ���� ����� ��µ� ���̴�.
		happy zzz
		�׷��� HouseDog ó�� ������ Ű��� ������ ���� �������� �ٰܴ� �Ѵ�. HouseDog Ŭ������ ������� ��ü���� sleep �޼ҵ� 
		ȣ�� �� "happy zzz" �� �ƴ� "happy zzz in house" �� ����ؾ� �Ѵٰ� ���� �� ����.
		�̷��� �Ϸ��� ��� �ؾ� �ұ�?
		������ ���� HouseDog Ŭ������ ������ ����.
		
		class Animal {
		    String name;
		    void setName(String name) {
		        this.name = name;
		    }
		}
		
		class Dog extends Animal {
		    void sleep() {
		        System.out.println(this.name + " zzz");
		    }
		}
		
		class HouseDog extends Dog {
		    void sleep() {
		        System.out.println(this.name + " zzz in house");
		    }
		}
		
		public class Sample {
		    public static void main(String[] args) {
		        HouseDog houseDog = new HouseDog();
		        houseDog.setName("happy");
		        houseDog.sleep();  // happy zzz in house ���
		    }
		}
		Dog Ŭ������ �ִ� sleep �޼ҵ带 HouseDog�� ���븸 ���� �����Ͽ� �� �����ϰ� �����ϴ� ����ó�� ���ϴ� ������� ���� �� �־���.
		happy zzz in house
		HouseDog Ŭ������ Dog Ŭ������ ������ ����(������� ����)�� sleep �޼ҵ带 �����ϸ� HouseDog Ŭ������ sleep �޼ҵ尡 Dog Ŭ������
		sleep �޼ҵ庸�� �� ���� �켱������ ���� �Ǿ� HouseDog Ŭ������ sleep �޼ҵ尡 ȣ��ǰ� �ȴ�.
		�̷��� �θ�Ŭ������ �޼ҵ带 �ڽ�Ŭ������ ������ ���·� �Ǵٽ� �����ϴ� ������ �޼ҵ� �������̵�(Method Overriding)�̶�� �Ѵ�.//�޼ҵ� �����
		
		�޼ҵ� �����ε�(method overloading)
		�̹����� HouseDog Ŭ������ ������ ���� �޼ҵ带 �߰��� ����. ("����"�� �ƴ϶� "�߰�"�ӿ� ��������.)
		void sleep(int hour) {
		    System.out.println(this.name+" zzz in house for " + hour + " hours");
		} 
		�̹� sleep�̶�� �޼ҵ尡 ������ ������ �̸��� sleep�޼ҵ带 �� ������ �� �ִ�. ��, �޼ҵ��� �Է��׸��� �ٸ� ��츸 �����ϴ�.
		���� ���� sleep�޼ҵ�� �Է��׸����� hour��� int �ڷ����� �߰��Ǿ���.
		�̷��� �Է��׸��� �ٸ� ��� ������ �̸��� �޼ҵ带 ���� �� �ִµ� �̸� �޼ҵ� �����ε�(method overloading)�̶�� �θ���.
		���θ��� sleep�޼ҵ带 �׽�Ʈ �ϱ� ���� main�޼ҵ带 ������ ���� �����ϰ� ���� �� ����.
		
		class Animal {
		    String name;
		    void setName(String name) {
		        this.name = name;
		    }
		}
		
		class Dog extends Animal {
		    void sleep() {
		        System.out.println(this.name + " zzz");
		}
		}
		
		class HouseDog extends Dog {
		    void sleep() {
		        System.out.println(this.name + " zzz in house");
		  }
		
		    void sleep(int hour) {
		        System.out.println(this.name + " zzz in house for " + hour + " hours");
		    }
		}
		
		public class Sample {
		    public static void main(String[] args) {
		        HouseDog houseDog = new HouseDog();
		        houseDog.setName("happy");
		        houseDog.sleep();  // happy zzz in house ���
		        houseDog.sleep(3);  // happy zzz in house for 3 hours ���
		    }
		}
		�����ϸ� ������ ���� ����� ��µ� ���̴�.
		happy zzz in house
		happy zzz in house for 3 hours
		���� ���
		���� ����� Ŭ������ ���ÿ� �ϳ� �̻��� Ŭ������ ��ӹ޴� ���� ���Ѵ�. C++, ���̽� �� ���� ������ ���� ����� ���������� 
		�ڹٴ� ���� ����� �������� �ʴ´�.
		���� �ڹٰ� ���� ����� �����Ѵٸ� ������ ���� �ڵ尡 ����� �� �� ���� ���̴�.
		//�ڹٴ� ���� ����� �������� �ʱ� ������ �Ʒ��� �ڵ�� �����δ� ������ �� ���� �ڵ��̴�.
		
		class A {
		    public void msg() {
		        System.out.println("A message");
		    }
		}
		
		class B {
		    public void msg() {
		        System.out.println("B message");
		    }
		}
		
		class C extends A, B {
		    public void static main(String[] args) {
		        C test = new C();
		        test.msg();
		    }
		}
		�ڹٰ� ���� ����� �����Ѵٰ� �����ϰ� A, B ��� Ŭ������ ���� ���� ���ÿ� ���(extends A, B)�ϵ��� �ߴ�.
		�� main �޼ҵ忡�� test.msg(); ���� �� A Ŭ������ msg �޼ҵ带 �����ؾ� �ұ�? �ƴϸ� B Ŭ������ msg �޼ҵ带 �����ؾ� �ұ�?
		���� ����� �����ϰ� �Ǹ� �̷��� �ָŸ�ȣ�� �κ��� ����� �ȴ�. �ڹٴ� �̷��� �Ҹ�Ȯ�� �κ��� ���ʿ� �߶� �� ����̴�.
		//���߻���� �����ϴ� �ٸ� ������ �̷��� ������ �޼ҵ带 ��ӹ޴� ��� �켱�������� �����Ͽ� �ذ��Ѵ�.
		 */

	}

}
