package day5;

public class Sample2 {

	public static void main(String[] args) {
		/*
		05-06 ������
		�̹����� Ŭ������ ������(Constructor)�� ���ؼ� �˾ƺ���.
		������(Constructor)
		����Ʈ(default) ������
		������ �����ε�
		������(Constructor)
		���� Ŭ�������� ���� é�͵��� �����ϸ� ���� Ŭ�������̴�. ���� �Ʒ��� Ŭ������ ���� ��������� �ʾҴٸ� �ۼ��� �Ŀ� ������ ����.
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
		        houseDog.sleep();
		        houseDog.sleep(3);
		    }
		}
		Animal, Dog, HouseDog Ŭ�������� �غ� �Ǿ��ٸ� ���� main�޼ҵ带 ������ ���� ������ �� ���� �� ����.
		(... ����)
		public class Sample {
		    public static void main(String[] args) {
		        HouseDog dog = new HouseDog();
		        System.out.println(dog.name); // null ���
		    }
		}
		dog��ü�� name ������ �ƹ��� ���� �������� �ʾұ� ������ null�� ��µ� ���̴�.
		�̷��� HouseDog Ŭ������ �ڵ��ϱ⿡ ���� ��ü���� name�� ���� ������ ���� �ְ� ���� ���� ���� �ִ�. �׷��ٸ� 
		name �̶�� ��ü������ ���� ������ �����ؾ߸� ��ü�� ������ �� �ֵ��� ������ �� �ִ� ����� ������?
		������(Constructor)�� �̿��ϸ� �ȴ�.
		HouseDog Ŭ���� ���� ��ܿ� ������ ���� �޼ҵ带 �߰��� ����.
		(...����)
		class HouseDog extends Dog {
		    HouseDog(String name) {
		        this.setName(name);
		    }
		
		    void sleep() {
		        System.out.println(this.name + " zzz in house");
		    }
		
		    void sleep(int hour) {
		        System.out.println(this.name + " zzz in house for " + hour + " hours");
		    }
			}
		(... ����)
		�� �޼ҵ�ó�� �޼ҵ���� Ŭ������� �����ϰ� ���� �ڷ����� �������� �ʴ� �޼ҵ带 ������(Constructor)��� �Ѵ�.
		
		�������� ��Ģ
		Ŭ������� �޼ҵ���� �����ϴ�.
		����Ÿ���� �������� �ʴ´�. (void�� ������� �ʴ´�.)
		�����ڴ� ��ü�� ������ �� ȣ��ȴ�. ��, �����ڴ� ������ ���� new Ű���尡 ���� �� ȣ��ȴ�.
		new Ŭ������(�Է��μ�, ...)
		�����ڴ� �޼ҵ�� ���������� �پ��� �Է��� ���� �� �ִ�.
		�츮�� HouseDog Ŭ������ ���� �����ڴ� ������ ���� �Է°����� ���ڿ��� �ʿ�� �ϴ� �������̴�.
		HouseDog(String name) {
		    this.setName(name);
		} 
		���� ������ ���� new Ű����� ��ü�� ���鶧 ���ڿ��� �����ؾ߸� �Ѵ�.
		HouseDog dog = new HouseDog("happy");//������ ȣ�� �� ���ڿ��� �����ؾ� �Ѵ�.
		���� ����ó�� �ڵ��ϸ� ������ ������ �߻��� ���̴�.
		HouseDog dog = new HouseDog();
		������ �߻��ϴ� ������ ��ü ���� ����� �������� ��Ģ�� ���� �ʱ� �����̴�.�����ڰ� ����� ��� �������� ��Ģ��θ� ��ü�� ������ �� �ִ�.
		HouseDog Ŭ������ ���� ���� �����ڸ� �����ϸ� new HouseDog()�� ����ϴ� main �޼ҵ忡�� ������ ������ �߻��� ���̴�.
		����ó�� main �޼��带 ��������.
		(... ����)
		public class Sample {
		    public static void main(String[] args) {
		        HouseDog dog = new HouseDog("happy");
		        System.out.println(dog.name);
		    }
		}
		���� main �޼ҵ带 �����ϸ� �����ڿ� ���� name ��ü������ ���� �����Ǿ� ������ ����� ��µȴ�.
		happy
		�̷��� �����ڸ� ����ϸ� setName("happy")�� ���� �ʼ����� �ൿ�� ��ü �����ÿ� ������ �� �ִ�.
		
		����Ʈ(default) ������
		�̹����� ����Ʈ �����ڿ� ���ؼ� �˾ƺ���.
		������ �ڵ带 ����.
		class Dog extends Animal {
		    void sleep() {
		        System.out.println(this.name + " zzz");
		    }
		}
		�׸��� ���� �ڵ带 ����.
		class Dog extends Animal {
		    Dog() {
		    }
		
		    void sleep() {
		        System.out.println(this.name + " zzz");
		    }
		}
		ù��° �ڵ�� �ι�° �ڵ��� �������� �����ϱ�? �ι� ° �ڵ忡�� �����ڰ� �����Ǿ� �ִ�. �������� �Է� �׸��� ���� ������ 
		���ο� �ƹ� ������ ���� ���� ���� �����ڸ� ����Ʈ �����ڶ�� �θ���.
		���� ���� ����Ʈ �����ڸ� �����ϸ� new Dog() �� Dog Ŭ������ ��ü�� ����� �� �� ���� ������ ����Ʈ �����ڰ� ����� ���̴�.
		���� Ŭ������ �����ڰ� �ϳ��� ���ٸ� �����Ϸ��� �ڵ����� ���Ͱ��� ����Ʈ �����ڸ� �߰��Ѵ�. ������ ����ڰ� �ۼ��� �����ڰ� �ϳ��� �����Ǿ�
		�ִٸ� �����Ϸ��� ����Ʈ �����ڸ� �߰����� �ʴ´�.
		//�̷��� ������ ������ ���캻 HouseDog Ŭ������ name�� �Է����� �޴� �����ڸ� ���� �Ŀ� new HouseDog() �� ����� �� ����. �ֳ��ϸ� HouseDog Ŭ������ �̹� �����ڸ� ������� ������ �����Ϸ��� ����Ʈ �����ڸ� �ڵ����� �߰����� �ʱ� �����̴�.
		
		������ �����ε�
		�޼ҵ忡 �����ε��� �ִ� �Ͱ� ���������� �����ڿ��� �����ε��� �ִ�.
		//�ϳ��� Ŭ������ �������� �Է��׸��� �ٸ� �����ڸ� ���� �� �ִ�.
		��, ����ó�� �������� �����ڸ� ���� �� �ִ�.
		
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
		    HouseDog(String name) {
		        this.setName(name);
		    }
		
		    HouseDog(int type) {
		        if (type == 1) {
		            this.setName("yorkshire");
		        } else if (type == 2) {
		            this.setName("bulldog");
		        }
		    }
		
		    void sleep() {
		        System.out.println(this.name + " zzz in house");
		    }
		
		    void sleep(int hour) {
		        System.out.println(this.name + " zzz in house for " + hour + " hours");
		    }
		}

		public class Sample {
		    public static void main(String[] args) {
		        HouseDog happy = new HouseDog("happy");
		        HouseDog yorkshire = new HouseDog(1);
		        System.out.println(happy.name);  // happy ���
		        System.out.println(yorkshire.name);  // yorkshire ���
		    }
		}
		���� HouseDog Ŭ������ �� ���� �����ڰ� �ִ�. �ϳ��� String �ڷ����� �Է����� �޴� �������̰� �ٸ� �ϳ��� int �ڷ�����
		�Է����� �޴� �������̴�. �� �������� ���̴� �Է� �׸��̴�. �̷��� �Է� �׸��� �ٸ� �����ڸ� ���� �� ���� �� �ִµ� �̷� ��
		������ �����ε�(Overloading) �̶�� �Ѵ�.
		//�޼ҵ� �����ε��� ������ �����̴�.
		���� HouseDog Ŭ������ ��ü�� ����ó�� �� ���� ������� ������ �� �ִ�.
		HouseDog happy = new HouseDog("happy");/���ڿ��� ����
		HouseDog yorkshire = new HouseDog(1);//���ڰ����� ����
		 */

	}

}
