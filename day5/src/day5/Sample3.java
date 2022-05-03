package day5;

public class Sample3 {

	public static void main(String[] args) {
		/*
		05-07 �������̽�
		�������̽�(Interface)�� �ʺ� �����ڸ� �������� �ܰ�մ��̴�.�������̽��� ���� ������� �ڵ�θ� �����Ϸ��� �ϸ� �� �̱ÿ� ������ �ȴ�.
		�̷��� �����ϱ� ���� �������̽��� ����ü �� �ʿ��ϰ� �� �ɱ�?
		�̹��忡���� �������̽��� ���ؼ� ������ ���� �������� �˾ƺ���.
		
		�������̽��� �� �ʿ��Ѱ�?
		�������̽� �ۼ��ϱ�
		�������̽��� �޼ҵ�
		�������̽��� �ٽɰ� ����
		����Ʈ �޼���
		����ƽ �޼���
		�������̽��� �� �ʿ��Ѱ�?
		������ � ������ �����簡 �ϴ� ���̴�.
		
		�� �������� �������̴�.
		���ĵ����� ������ �� ���̸� �����ش�.
		ȣ���̰� ���� ����� �����ش�.
		���ڰ� ���� �ٳ����� �����ش�.
		�̷� ���̽��� �ڵ�� ��ƺ���. ������ ���� Animal, Tiger, Lion, Zookeeper Ŭ������ �ۼ�����.
		
		class Animal {
		    String name;
		    void setName(String name) {
		        this.name = name;
		    }
		}
		class Tiger extends Animal {
		}
		class Lion extends Animal {
		}
		
		class ZooKeeper {
		    void feed(Tiger tiger) {/ȣ���̰� ���� ����� ���� �ش�.
		        System.out.println("feed apple");
		    }
		    void feed(Lion lion) {//���ڰ� ���� �ٳ����� �����ش�.
		        System.out.println("feed banana");
		    }
		}
		
		public class Sample {
		    public static void main(String[] args) {
		        ZooKeeper zooKeeper = new ZooKeeper();
		        Tiger tiger = new Tiger();
		        Lion lion = new Lion();
		        zooKeeper.feed(tiger);//feed apple ���
		        zooKeeper.feed(lion);//feed banana ���
		    }
		}
		���� é�Ϳ��� ���Ҵ� Dog Ŭ������ ���������� Animal�� ����� Tiger�� Lion�� �����ߴ�.
		�׸��� ������ Ŭ������ ZooKeeper Ŭ������ ��ó�� ���� �Ͽ���. ZooKeeper Ŭ������ ȣ���̰� ���� ��, ���ڰ� ���� ��
		���� �ٸ� feed �޼ҵ尡 ȣ��ȴ�.
		ZooKeeper Ŭ������ feed �޼ҵ�ó�� �Է°��� �ڷ��� Ÿ���� �ٸ� ���(�������� Tiger, Lion���� ���� �ٸ���) �޼ҵ� ����
		�����ϰ�(���⼭�� �޼ҵ���� feed�� �����ϴ�) ����� �� �ִ�. �̷����� �޼ҵ� �����ε�(Method overloading)�̶�� �Ѵ�.
		���α׷��� �����ϸ� ������ ���� ����� ��µ� ���̴�.
		feed apple
		feed banana
		��,���� ������ ���� �� ����.
		�������� ȣ���̿� ���ڻ��̶�� ZooKeeper Ŭ������ ���̻� ������ �������� �Ǿ�, ǥ������ ��� �߰��ȴٸ� ZooKeeper�� 
		���ĵ����� �߰��� ������ �Ź� ������ ���� feed �޼ҵ带 �߰��ؾ� �Ѵ�.
		�Ʒ� �߰��� �޼ҵ�� ������ �ڵ忡 �������� ���� �����θ� ����.
		(... ����)
		class ZooKeeper {
		    void feed(Tiger tiger) {
		        System.out.println("feed apple");
		    }
		    void feed(Lion lion) {
		        System.out.println("feed banana");
		    }
		    public void feed(Crocodile crocodile) {
		        System.out.println("feed strawberry");
		    }
		    public void feed(Leopard leopard) {
		        System.out.println("feed orange");
		    }
		}
		(... ����)
		�̷��� ���ĵ����� �߰� �� ������ feed �޼ҵ带 �߰��ؾ� �Ѵٸ� ������(ZooKeeper)�� �󸶳� �����ڴ°�?
		�̷� ������� �غ��ϱ� ���ؼ��� �������̽��� ������ �ʿ��ϴ�.
		
		�������̽� �ۼ��ϱ�
		������ ���� �ڵ� ��ܿ� ���ĵ���(Predator) �������̽��� �߰�����.
		interface Predator {
		}
		
		class Animal {
		    String name;
		
		    void setName(String name) {
		        this.name = name;
		    }
		}
		(... ����)
		�� �ڵ�� ���� �������̽��� class�� �ƴ� interface ��� Ű���带 �̿��Ͽ� �ۼ��Ѵ�.
		�������̽��� Ŭ������ ���������� Predator.java�� ���� �ܵ� ���Ϸ� �����ϴ� ���� �Ϲ����� ����̴�.
		���⼭�� ������ ���Ǹ� ���� Sample.java ������ �ֻ�ܿ� �ۼ��Ͽ���.
		�׸��� Tiger, Lion Ŭ������ �ۼ��� �������̽��� �����ϵ���(Implements) ��������.
		(... ����)
		class Tiger extends Animal implements Predator {
		}
		class Lion extends Animal implements Predator {    
		}
		(... ����)
		�������̽� ������ ���Ͱ��� implements ��� Ű���带 ����Ѵ�.
		�̷��� Tiger, Lion Ŭ������ Predator �������̽��� �����ϰ� �Ǹ� ZooKeeper Ŭ������ feed 
		�޼ҵ带 ������ ���� ���� �� �� �ִ�.
	
		������
		(... ����.)
		class ZooKeeper {
		    void feed(Tiger tiger) {
		        System.out.println("feed apple");
		    }
		
		    void feed(Lion lion) {
		        System.out.println("feed banana");
		    }
		}
		(... ����)
		������
		(... ����)
		
		class ZooKeeper {
		    void feed(Predator predator) {
		        System.out.println("feed apple");
		    }
		}
		(... ����)
		feed �޼ҵ��� �Է����� Tiger, Lion�� ���� �ʿ�� ������ ���� �̰��� Predator��� �������̽��� ��ü�� �� �ְ� �Ǿ���.
		tiger, lion�� ���� Tiger, Lion�� ��ü�̱⵵ ������ Predator �������̽��� ��ü�̱⵵ �ϱ� ������ ���Ͱ��� 
		Predator�� �ڷ����� Ÿ������ ����� �� �ִ� ���̴�. ��ӿ��� �����ߴ� IS-A ���谡 �������̽����� ���������� ����ȴ�.
		 "Tiger is a Predator", "Lion is a Predator"�� �����ȴ�.
		tiger  Tiger Ŭ������ ��ü, Predator �������̽��� ��ü
		lion - Lion Ŭ������ ��ü, Predator �������̽��� ��ü
		�̿Ͱ��� ��ü�� �� �� �̻��� �ڷ��� Ÿ���� ���ԵǴ� Ư���� ������(����������)�̶�� �ϴµ� �̰Ϳ� ���ؼ��� "������" é�Ϳ��� 
		�ڼ��� �ٷ絵�� �Ѵ�.
		���� � ���ĵ����� �߰��Ǵ��� ZooKeeper�� feed �޼ҵ带 �߰��� �ʿ䰡 ����. �ٸ� ���ĵ����� �߰� �� ������ ������
		 ���� Predator �������̽��� ������ Ŭ������ �ۼ��ϱ⸸ �ϸ� �Ǵ� ���̴�.
		class Crocodile extends Animal implements Predator {
		}
		Crocodile Ŭ������ ���� �ڵ忡 �������� ���� �����θ� ����.
		��ġ�� �����ٸ� ���� �� �������̽��� �ʿ����� ���� ����� ���̴�. ���� �߿� Ŭ������ �ۼ��ϴ� �����̶��
		(���⼭�� ZooKeeper�� �߿��� Ŭ�����̴�) Ŭ������ ����ü�� ������� �������̽��� �������� �߿� Ŭ������ �ۼ��ؾ߸� �Ѵ�.
		����ü(Tiger, Lion, Crocodile,...)�� �þ�� ������ �������̽�(Predator)�� �ϳ��̱� �����̴�.
	
		�������̽��� �޼ҵ�
		��, �׷��� �� ZooKeeper Ŭ������ �ణ�� ������ �߻��ߴ�. �Ʒ��� ZooKeeperŬ������ feed �޼ҵ带 ���� ȣ���̰� ������,
		���ڰ� ������ ������ "feed apple" �̶�� ���ڿ��� ����Ѵ�. ���ڰ� ���� "feed banana" �� ����ؾ� ���� �ʰڴ°�!
		(... ����)
		class ZooKeeper {
		    public void feed(Predator predator) {
		        System.out.println("feed apple");/�׻� feed apple ���� ����Ѵ�.
		    }
		}
		(... ����)
		�̹����� �������̽��� ������ �η�����.
		Predator �������̽��� ������ ���� �޼ҵ带 �߰� �� ����.
		interface Predator {
		    String getFood();
		}
		(... ����)
		getFood ��� �޼ҵ带 �߰��ߴ�. �׷��� �� �̻��ϴ�. �޼ҵ忡 ������ ����?
		�������̽��� �޼ҵ�� �޼ҵ��� �̸��� ����¿� ���� ���Ǹ� �ְ� �� ������ ����. �� ������ �������̽��� ��Ģ�̱� �����̴�.
		������ ������ getFood��� �޼ҵ�� �������̽��� implements�� Ŭ�������� �����ؾ߸� �ϴ� ���̴�.
		�������̽��� ��ó�� �޼ҵ带 �߰��ϸ� Tiger, Lion ���� Predator �������̽��� ������ Ŭ�����鿡�� ������ ������ �߻��� ���̴�.
		������ �ذ��Ϸ��� ����ó�� Tiger, Lion Ŭ������ getFood �޼ҵ带 �����ؾ� �Ѵ�.
		(... ����)
		class Tiger extends Animal implements Predator {
		    public String getFood() {
		        return "apple";
		    }
		}
		class Lion extends Animal implements Predator {
		    public String getFood() {
		        return "banana";
		    }
		}
		(... ����)
		�������̽��� �޼ҵ�� �׻� public���� �����ؾ� �Ѵ�.
		Tiger, Lion Ŭ������ getFood �޼ҵ忡 ���ĵ����� ������ "apple", "banana"�� ���� �����ϵ��� �ۼ��ߴ�.
		�̷��� getFood �޼ҵ带 �߰��ϸ� ������ ������ �ذ�� ���̴�.
		���� ZooKeeper Ŭ������ ������ ���� ������ �����ϴ�.
		(... ����)
		class ZooKeeper {
		    void feed(Predator predator) {
		        System.out.println("feed "+predator.getFood());
		    }
		}
		(... ����)
		feed �޼ҵ尡 "feed apple" �� ����ϴ� �Ϳ��� "feed "+predator.getFood()�� ����ϵ��� ����Ǿ���.
		predator.getFood()�� ȣ���ϸ� Predator �������̽��� ������ ����ü(Tiger, Lion)�� getFood() �޼ҵ尡 ȣ��ȴ�.
		�׸��� ���α׷��� ������ ����. ���ϴ� ���� ������ ���� ������� ��µǴ� ���� Ȯ���� �� ���� ���̴�.
		
		feed apple
		feed banana
		�������̽��� �ٽɰ� ����
		�̹� �忡�� ���� �߿��� �κ��� �� �������̽��� �ʿ������� ���ؼ� �����ϴ� ���̴�.
		���� �������� ������ŭ�� feed �޼ҵ尡 �ʿ��ߴ� ZooKeeper Ŭ������ Predator �������̽��� �̿��Ͽ� �����ߴ��� �� �Ѱ���
		feed �޼ҵ�� ������ ����������. ���⼭ �߿��� ���� �޼ҵ��� ������ �پ����ٴ� ���� �ƴ϶� ZooKeeper Ŭ������ �������� ������ 
		�������� Ŭ�������� �������� ������ ������� �������� Ŭ������ �Ǿ��ٴ� ���̴�. �ٷ� �� ���� �������̽��� �ٽ��̴�.
		�̹����� �� �� ���������� �������̽��� ������ ����. �Ƹ��� �������� ��ǻ���� USB ��Ʈ�� ���ؼ� �˰� ���� ���̴�. USB ��Ʈ�� ������ ��
		�ִ� ���� �ϵ��ũ, �޸𸮽�ƽ, ����Ʈ�� �� ��ô ����. �ٷ� �� USB��Ʈ�� ������ ������ �������̽���� �� �� �ִ� 
		USB��Ʈ�� �԰ݸ� �˸� � ��⵵ ���� �� �ִ�. �� ��ǻ�ʹ� USB ��Ʈ�� �����ϰ� � ��Ⱑ ��������� �� �Ű澵 �ʿ䰡 ����. �ٷ� 
		�� ���� �������̽��� �ſ� ����ϴ�. ������ ���� ������(ZooKeeper)�� � ���ĵ���(Tiger, Lion...)�̴��� ������� �ʰ� 
		���̸� �ִ� ��ó��
		������ ���ظ� ���� ���� �� ǥ�̴�.
	
		������ ����	�ڹ� ����
		��ǻ��	ZooKeeper
		USB ��Ʈ	Predator
		�ϵ��ũ, ������ī�޶�,...	Tiger, Lion, Crocodile,...
		���� �� �ڹ�
		��Ӱ� �������̽�
		������ �ۼ��� Predator �������̽� ��� Animal Ŭ������ getFood �޼ҵ带 �߰��ϰ� Tiger, Lion ���
		getFood �޼ҵ带 �������̵��� �� Zookeeper�� feed �޼ҵ尡 Predator ��� Animal�� �Է� �ڷ������� ����ص� ������ ȿ����
		�ŵ� �� �ִ�. ������ ����� �ڽ� Ŭ������ �θ� Ŭ������ �޼ҵ带 �������̵����� �ʰ� ����� �� �ֱ� ������ �ش� �޼ҵ带 �ݵ�� �����ؾ�
		�Ѵٴ� "������"�� ���� ���Ѵ�. ��Ȳ�� �°� ����� ����� ������ �������̽��� ����ؾ� �� ���� �����ؾ� ������ �������̽��� �������̽���
		�޼ҵ带 �ݵ�� �����ؾ� �ϴ� "������"�� ���´ٴ� ���� �ݵ�� �������.
		
		����Ʈ �޼���
		�ڹ�8 ���� ���ĺ��ʹ� ����Ʈ �޼���(default method)�� ����� �� �ִ�. �������̽��� �޼���� ����(����ü)�� ���� �� ������
		����Ʈ �޼��带 ����ϸ� ���� ������ ������ �޼��带 ���� �� �ִ�.
		������� Predator �������̽��� ������ ���� ����Ʈ �޼��带 �߰��� �� �ִ�.
		
		interface Predator {
		    String getFood();
		
		    default void printFood() {
		        System.out.printf("my food is %s\n", getFood());
		    }
		}
		����Ʈ �޼���� �޼ҵ�� ���� �տ� "default" ��� ǥ���ؾ� �Ѵ�. �̷��� Predator �������̽��� printFood ����Ʈ �޼��带
		�����ϸ� Predator �������̽��� ������ Tiger, Lion ���� ���� Ŭ������ printFood �޼��带 �������� �ʾƵ� ����� �� �ִ�.
		�׸��� ����Ʈ �޽���� �������̵��� �����ϴ�. ��, printFood �޼��带 ���� Ŭ�������� �ٸ��� �����Ͽ� ����Ҽ� �ִ�.
		
		����ƽ �޼���
		�ڹ�8 ���� ���ĺ��ʹ� �������̽��� ����ƽ �޼���(static method)�� ����� �� �ִ�. �������̽��� ����ƽ �޼��带 �����ϸ� 
		�������̽���.����ƽ�޼���� �� ���� ����Ͽ� �Ϲ� Ŭ������ ����ƽ �޼��带 ����ϴ� �Ͱ� �����ϰ� ����� �� �ִ�.
		������� Predator �������̽��� ������ ���� ����ƽ �޼��带 �߰��� �� �ִ�.
		interface Predator {
		    String getFood();
		
		    default void printFood() {
		        System.out.printf("my food is %s\n", getFood());
		    }
		
		    int LEG_COUNT = 4;//�������̽� ���
		
		    static int speed() {
		        return LEG_COUNT *30;
		    }
		}
		�̷��� ����ƽ �޼��带 �߰��ϸ� ������ ���� ����Ҽ� �ִ�.
		Predator.speed();
		�������̽� ���
		�� �ڵ忡�� ����� int LEG_COUNT = 4; ������ �������̽��� ������ ����̴�. �������̽��� ������ �����
		int LEG_COUNT=4; ó�� public static final�� �����ص� �ڵ����� public static final�� ����ȴ�.
		(�ٸ� ������ ��� ���Ǵ� �Ұ����ϴ�.)
		public, static, final Ű����� 7�忡�� �ڼ��� �˾ƺ���
		 */

	}

}
