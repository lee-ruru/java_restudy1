package day3;

public class Sample4 {

	public static void main(String[] args) {
		// 05-01 ��ü���� ���α׷����̶�?
		//������ ��� ���⸦ ����� ������ ���̴�. ���⿡ ���� 3�� �Է��ϰ� + ��ȣ�� �Է��� ��
		//4�� �Է��ϸ� �ᱣ������ 7�� ���� �ش�. �ٽ� �� �� + ��ȣ�� �Է��� �� 3�� �Է��ϸ� ����
		//�ᱣ�� 7�� 3�� ���� 10�� ���� �ش�. �� ����� ������ ����� �ᱣ���� �׻� �޸� ��򰡿� �����ϰ��־�� �Ѵ�.

		//����� ������ ����� �ᱣ���� ����ϰ� �־�� �Ѵ�.
		//�̷� ������ �ڹ� �ڵ�� ������ ����. ������ "���ϱ�" ����� ������ �ڵ�� ������ ����.
		//���⼭ �ٷ�� �ڵ���� ������ �������� ���ص� ����. �� �ڼ��ϰ� ��� ���̴�.
		//���⿡���� ��ü���⿡ ���� ���丸 �����ϸ� �ȴ�.

		//class Calculator {
		    //static int result = 0;

		    //static int add(int num) {
		        //result += num;
		        //return result;
		    //}
		//}


		//public class Sample {
		    //public static void main(String[] args) {
		        //System.out.println(Calculator.add(3));
		        //System.out.println(Calculator.add(4));
		    //}
		//}
		//add �޼ҵ�� �Ű����� num���� ���� ���� ������ ����� �ᱣ���� ���� �� �����ִ� �޼ҵ��̴�.
		//������ ����� �ᱣ���� �����ϱ� ���ؼ� result ���� ����(static)�� ����ߴ�.

		//static Ű����� ���� �Ŀ� �ڼ��ϰ� �����Ѵ�. ���⼭�� ������ ����� ���� ��� �����ϱ� ���� ���Ǿ���.
		//���α׷��� �����ϸ� ������ ��� ������ ���� �ᱣ���� ��µȴ�.
		//3 
		//7
		//�׷��� ���� Sample Ŭ�������� 2���� ���Ⱑ �ʿ��� ��Ȳ�� �߻��ϸ� ��� �ؾ� �ұ�? �� ����� ������ �ᱣ���� �����ؾ� �ϱ� 
		//������ ���� ���� Calculator Ŭ���� �ϳ������δ� �ᱣ���� ���� ������ �� ����.
		//�̷� ��Ȳ�� �ذ��Ϸ��� ������ ���� Ŭ������ ���� ���� ������ �Ѵ�.

		//class Calculator1 {
		    //static int result = 0;
		    //static int add(int num) {
		        //result += num;
		        //return result;
		    //}
		//}

		//class Calculator2 {
		    //static int result = 0;
		    //static int add(int num) {
		        //result += num;
		        //return result;
		    //}
		//}

		//public class Sample {
		    //public static void main(String[] args) {
		        //System.out.println(Calculator1.add(3));
		        //System.out.println(Calculator1.add(4));

		        //System.out.println(Calculator2.add(3));
		        //System.out.println(Calculator2.add(7));
		    //}
		//}

		//�Ȱ��� ���� �ϴ� Calculator1�� Calculator2 Ŭ������ �������.
		//�ᱣ���� ������ ���� �ǵ��� ��� ��µȴ�.

		//3
		//7
		//3
		//10
		//���� 1�� �ᱣ���� ���� 2�� �ƹ� ������ ��ġ�� ������ Ȯ���� �� �ִ�.
		//������ ���Ⱑ 3��, 5��, 10���� ���� �� ���� �ʿ������ٸ� ��� �ؾ� �ұ�? �׶�����
		//Ŭ������ �߰��� ���ΰ�? ���⿡ ���⳪ ���ϱ� ���� ����� �߰��ؾ� �Ѵٸ� ��Ȳ�� ���� �� ������� ���̴�.
		//���� ��ü�� ���� ����� �ʾ�����, ���� ���� ��� ��ü�� ����ϸ� ������ ���� �����ϰ� �ذ��� �� �ִ�.

		//class Calculator {
		    //int result = 0;
		    //int add(int num) {
		        //result += num;
		        //return result;
		    //}
		//}


		//public class Sample {
		    //public static void main(String[] args) {
		        //Calculator cal1 = new Calculator();  // ����1 ��ü�� �����Ѵ�.
		        //Calculator cal2 = new Calculator();  // ����2 ��ü�� �����Ѵ�.

		        //System.out.println(cal1.add(3));
		        //System.out.println(cal1.add(4));
		        //System.out.println(cal2.add(3));
		        //System.out.println(cal2.add(7));
		    //}
		//}
		//Calculator Ŭ������ static Ű���带 ��� �����ߴ�.
		//���α׷��� �����ϸ� Ŭ���� 2���� ������� ���� ������ ����� ��µȴ�.
		//3
		//7
		//3
		//10
		//Calculator Ŭ������ ���� ������ ���� cal1, cal2(�̰��� ��ü��� �θ���)�� ������ ������ �����Ѵ�.
		//�׸��� ����(cal1, cal2)�� �ᱣ�� ���� �ٸ� ������ �ᱣ���� ������� �������� ���� �����Ѵ�.
		//��ü�� ����ϸ� ���� ����� �þ���� ��ü�� ������ �ϸ� �Ǳ� ������ Ŭ�������� ����ϴ� ���� �޸� �ſ� ����������.

		//���� ���� ����� �߰��Ϸ��� Calculator Ŭ������ ����ó�� sub �޼ҵ带 �߰��ϸ� �ȴ�.
		//class Calculator {
		    //int result = 0;

		    //int add(int num) {
		        //result += num;
		        //return result;
		    //}

		    //int sub(int num) {
		        //result -= num;
		        //return result;
		    //}
		//}
		//��ü���� ���α׷����� ������ �ܼ��� �̰͸��� �ƴϴ�. ������ �̰� �ϳ������ε� "����ü �� ��ü�� �ʿ��� ���ϱ�?"��� �ٺ����� ������ ���� �ش��� �Ǿ��� ���̴�.

	}

}
