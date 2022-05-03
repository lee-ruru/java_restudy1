package day5;

public class Sample4 {

	public static void main(String[] args) {
		/*
		05-08 ������
		��ü���� ���α׷����� Ư¡ �߿��� ������(����������, Polymorphism)�� �ִ�. ����ü �������� �����̰� �̰� �� �ʿ��� �ɱ�?
		������ ���� �������� �˾ƺ���.
		��ü���� ���α׷��� é�Ϳ��� ���Ǵ� ������ ��� ���ӵǹǷ� �տ������� ������� ������ �����ؾ� �Ѵ�.
		���� é�Ϳ��� �ۼ��� Sample.java ���Ͽ� ������ ���� Bouncer(����) Ŭ������ �߰��� ����.
		
		interface Predator {
		    (... ����)
		}
		class Animal {
		    (... ����)
		}
		class Tiger extends Animal implements Predator {
		    (... ����)
		}
		class Lion extends Animal implements Predator {
		   (... ����)
		}
		class ZooKeeper {
		    (... ����)
		}
		
		class Bouncer {
		    void barkAnimal(Animal animal) {
		        if (animal instanceof Tiger) {
		            System.out.println("����");
		        } else if (animal instanceof Lion) {
		            System.out.println("������");
		        }
		    }
		}
		
		public class Sample {
		    public static void main(String[] args) {
		        Tiger tiger = new Tiger();
		        Lion lion = new Lion();
		
		        Bouncer bouncer= new Bouncer();
		        bouncer.barkAnimal(tiger);
		        bouncer.barkAnimal(lion);
		    }
		}
		���� Ŭ������ ������ ¢��(barkAnimal) �Ͽ� �ǹ��� ��Ų�ٰ� �Ѵ�.
		barkAnimal �޼ҵ�� �Է����� ���� animal ��ü�� Tiger�� ��ü�� ��쿡�� "����"�� ����ϰ� Lion ��ü�� ��쿡��
		"������"�� ����Ѵ�. instanceof �� � ��ü�� Ư�� Ŭ������ ��ü������ ������ �� ���Ǵ� �ڹ��� ���� ��ɾ��̴�.
		animal instanceof Tiger �� "animal ��ü�� Tiger Ŭ������ ������� ��ü�ΰ�?"�� ���� ���ǹ��̴�.
		
		IS-A ����
		barkAnimal �޼ҵ��� �Է��ڷ����� Tiger�� Lion�� �ƴ� Animal�̴�. ������ barkAnimal �޼ҵ带 ȣ���Ҷ���
		tiger�Ǵ� lion��ü�� ������ ���� �ִ�. �̰� ������ ������ Tiger, Lion Ŭ������ Animal�̶�� �θ� Ŭ������ ����� 
		�ڽ� Ŭ�����̱� �����̴�. �ڽ� Ŭ������ ���ؼ� ������� ��ü�� ������ �θ� Ŭ������ �ڷ������� ����� ���� �ִ�.
		(������ �����ߴ� IS-A ���踦 ���÷� ����.)
		��, ������ ���� �ڵ��� �����ϴ�.
		Animal tiger = new Tiger();/Tiger is a Animal
		Animal lion = new Lion();//Lion is a Animal
		���α׷��� �����ϸ� ������ ���� ������� ��µȴ�.
		����
		������
		�������� �� Bouncer Ŭ������ barkAnimal �޼ҵ尡 ������ ��°�? Crocodile, Leopard ���� Ŭ������ �߰��Ǹ� 
		barkAnimal �޼ҵ�� ����ó�� �����Ǿ�� �� ���̴�.
		�Ʒ��ڵ�� �����̴� �����θ� ���� ������ �ڵ������� ����.
		class Bouncer {
		    void barkAnimal(Animal animal) {
		      if (animal instanceof Tiger) {
		            System.out.println("����");
		        } else if (animal instanceof Lion) {
		            System.out.println("������");
		        } else if (animal instanceof Crocodile) {
		          System.out.println("����");
		        } else if (animal instanceof Leopard) {
		          System.out.println("ļ��");
		        }
		    }
		}
		���� ���� ����� ���� Ŭ������ �߰��� ������ �б⹮�� �߰��Ǿ�� �ϹǷ� ���� �ʴ�. ������ �츮�� �������̽��� ������Ƿ� �� �� ����
		�ع��� ã�� �� �ִ�.
		����ó�� Barkable �������̽��� �ۼ��ϰ� TigerŬ������ Lion Ŭ������ Barkable �������̽��� �����ϵ��� ������ ����.
		interface Predator {
		    (... ����)
		}
		interface Barkable {
		    void bark();
		}
		class Animal {
		    (... ����)
		}
		class Tiger extends Animal implements Predator, Barkable {
		    public String getFood() {
		        return "apple";
		    }
		
		    public void bark() {
		        System.out.println("����");
		    }
		}
		class Lion extends Animal implements Predator, Barkable {
		    public String getFood() {
		        return "banana";
		    }
		    public void bark() {
		        System.out.println("������");
		    }
		}
		class ZooKeeper {
		    (... ����)
		}
		class Bouncer {
		    void barkAnimal(Barkable animal) {  // Animal ��� Barkable�� ���
		        animal.bark();
		    }
		}
		public class Sample {
		    (... ����)
		}
		�������̽��� ������ ������ �޸�(,)�� �̿��Ͽ� �������� implements �� �� �ִ�. Tiger, Lion Ŭ������ Predator
		�������̽��� Barkable �������̽��� implements �Ͽ���. ���� Tiger, Lion Ŭ������ bark �޼ҵ带 ���� ���� �����ؾ� �Ѵ�.
		�̷��� Tiger, Lion Ŭ������ bark �޼ҵ带 �����ϸ� Bouncer Ŭ������ barkAnimal �޼ҵ带 ��ó�� ������ �� �ִ�.
		������ barkAnimal �޼ҵ��� �ٲ�� ���� �ٲ� ���� ����̴�.
		�ٲ�� ��
		void barkAnimal(Animal animal) {
		    if (animal instanceof Tiger) {
		        System.out.println("����");
		    } else if (animal instanceof Lion) {
		        System.out.println("������");
		    }
		}
		�ٲ� ��
		void barkAnimal(Barkable animal) {
		    animal.bark();
		}
		barkAnimal �޼ҵ��� �Է� �ڷ����� Animal���� Barkable �� ����Ǿ���. �׸��� animal�� ��ü Ÿ���� üũ�Ͽ�
		"����" �Ǵ� "������"�� ����ϴ� �κ��� �׳� bark �޼ҵ带 ȣ���ϵ��� �����ߴ�. �̷��� �����ߴ��� �����ϴ� ���Ǻб⹮�� ������� ��������
		��Ȯ�� �ڵ尡 �Ǿ���.
		������������ �̿��ϸ� ���� ������ ������ ������ ������ �б⹮�� �����ϰ� ó���� �� �ִ� ��찡 ����.
		�� �������� ����� tiger, lion ��ü�� ���� Tiger, Lion Ŭ������ ��ü�̸鼭 Animal Ŭ������ ��ü�̱⵵ �ϰ�
		Barkable, Predator �������̽��� ��ü�̱⵵ �ϴ�. �̷��� ������ barkAnimal �޼ҵ��� �Է� �ڷ����� Animal����
		Barkable �� �ٲپ� ����� �� �ִ� ���̴�.
		�̷��� �ϳ��� ��ü�� �������� �ڷ��� Ÿ���� ���� �� �ִ� ���� ��ü���� ���迡���� ������(Polymorphism)�̶�� �Ѵ�.
		��, Tiger Ŭ������ ��ü�� ������ ���� �������� �ڷ������� ǥ���� �� �ִ�.
		Tiger tiger = new Tiger();  // Tiger is a Tiger
		Animal animal = new Tiger();  // Tiger is a Animal
		Predator predator = new Tiger();  // Tiger is a Predator
		Barkable barkable = new Tiger();  // Tiger is a Barkable
		���⼭ �˾Ƶξ�� �� ������ Predator �� ����� predator ��ü�� Barkable �� ����� barkable ��ü�� ����� �� �ִ� �޼ҵ尡
		���� �ٸ��ٴ� ���̴�. predator ��ü�� getFood() �޼ҵ尡 ����� Predator �������̽��� ��ü�̹Ƿ� getFood �޼ҵ常 ȣ���� �����ϴ�.
		�̿� ���������� Barkable �� ����� barkable ��ü�� bark �޼ҵ常 ȣ���� �����ϴ�.
		���� getFood �޼ҵ�� bark �޼ҵ带 ��� ����ϰ� �ʹٸ� ��� �ؾ� �ұ�?
		Predator, Barkable �������̽��� ������ Tiger �� ����� tiger ��ü�� �״�� ����ϰų� ������ ���� getFood, bark �޼ҵ带
		��� �����ϴ� ���ο� �������̽��� ���� ����� ����ϸ� �ȴ�.
		
		interface Predator {
		(... ����)
		}
		interface Barkable {
		    void bark();
		}
		interface BarkablePredator extends Predator, Barkable {
		}
		(... ����)
		������ �������̽��� ����Ͽ� BarkablePredator�� �������. ���� ���� �ϸ� BarkablePredator�� Predator�� getFood �޼ҵ�, Barkable�� bark �޼ҵ带 �״�� ����� �� �ִ�. �������̽��� �Ϲ� Ŭ�����ʹ� �޸� extends �� �̿��Ͽ� �������� �������̽�(Predator, Barkable)�� ���ÿ� ����� �� �ִ�. ��, ���� ����� �����ȴ�.
		�Ϲ� Ŭ������ ���ϻ�Ӹ� �����ϴ�.
		Lion Ŭ������ ������ �ۼ��� BarkablePredator �������̽��� �����ϵ��� ���� �� ����.
		(... ���� )
		class Lion extends Animal implements BarkablePredator {
		    public String getFood() {
		        return "banana";
		    }
		    public void bark() {
		        System.out.println("������");
		    }
		}
		(... ����)
		�̷��� LionŬ������ �����ϰ� Bouncer Ŭ������ �����ϴ��� ���� ������ ���� ������ ������� ��µǴ� ���� Ȯ�� �� �� �ִ�.
		����
		������
		Bouncer Ŭ������ barkAnimal �޼ҵ��� �Է� �ڷ����� Barkable�̴��� BarkablePredator�� ������ lion��ü��
		���� �� �� �ִ�. �� ������ BarkablePredator�� Barkable �������̽��� ��ӹ��� �ڽ� �������̽��̱� �����̴�. �ڽ� �������̽���
		������ ��ü�� �ڷ����� �θ� �������̽��� ����ϴ� ���� �����ϴ�. �ڽ� Ŭ������ ��ü �ڷ����� �θ� Ŭ������ �ڷ������� ��밡���ϴٴ� ���� �����ϴ�.
		������ ���ݱ��� �����ߴ� ��ü �ҽ��ڵ��̴�.
		interface Predator {
		    String getFood();
		
		    default void printFood() {
		        System.out.printf("my food is %s\n", getFood());
		    }
		
		    int LEG_COUNT = 4;  // �������̽� ���
		
		    static int speed() {
		        return LEG_COUNT * 30;
		    }
		}
		interface Barkable {
		    void bark();
		}
		interface BarkablePredator extends Predator, Barkable {
		}
		class Animal {
		    String name;
		
		    void setName(String name) {
		        this.name = name;
		    }
		}
		class Tiger extends Animal implements Predator, Barkable {
		    public String getFood() {
		        return "apple";
		    }
		    public void bark() {
		        System.out.println("����");
		    }
		}
		class Lion extends Animal implements BarkablePredator {
		    public String getFood() {
		        return "banana";
		    }
		    public void bark() {
		        System.out.println("������");
		    }
		}
		class ZooKeeper {
		    void feed(Predator predator) {
		        System.out.println("feed " + predator.getFood());
		    }
		}
		class Bouncer {
		    void barkAnimal(Barkable animal) {
		        animal.bark();
		    }
		}
		public class Sample {
		    public static void main(String[] args) {
		        Tiger tiger = new Tiger();
		        Lion lion = new Lion();
		
		        Bouncer bouncer = new Bouncer();
		        bouncer.barkAnimal(tiger);
		        bouncer.barkAnimal(lion);
		    }
		}
		 */

	}

}
