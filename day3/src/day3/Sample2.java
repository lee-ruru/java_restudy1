package day3;

public class Sample2 {

	public static void main(String[] args) {
		//04-05 for each�� 
		//for each�� J2SE 5.0���� �߰��Ǿ���. for each��� Ű���尡 ���� �ִ°���
		// �ƴϰ� ������ for�� �̿��Ѵ�. ������ ���ǽĺκ��� ������ ���� �ٸ���.
		//������ ������ �����ߴ� ����� for���̴�.
		String[] numbers = {"one", "tow", "three"};
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		//�� for���� ����ó�� for each������ ������ �� �ֵ�.
		String[] numbers2 = {"one", "two", "three"};
		for(String number : numbers2) {
			System.out.println(number);
		}
		//for each���� ���⿡ �ſ� �������̴�.
		//for each���� ������ ������ ����.
		//for (type var:iterate) {
			//body-of-loop
		//}
		// ������ iterate�� ������ ���� ��ü�̰� interate ��ü���� �Ѱ��� ����������
		// var�� ���ԵǾ� for���� ����ȴ�. iterate�� ����� �� �ִ� �ڷ����� ������ ����
		// �� �ִ� �ڷ���(�迭 �� ArrayList��)�� �����ϴ�.
		// ������ �� ������ ArrayList�� ������ �����̴� for���� ������ String[]�迭��
		// ����������� ������ �����ϴ�
		
		//import java.util.ArrayList;
		//import java.util.Arrays;

		//public class Sample {
		    //public static void main(String[] args) {
		        //ArrayList<String> numbers = new ArrayList<>(Arrays.asList("one", "two", "three"));
		        //for (String number : numbers) {
		            //System.out.println(number);
		        //}
		    //}
		//}
		//��, for each ���� ���� �ݺ�ȸ���� ��������� �ִ� ���� �Ұ����ϰ�, 1���Ǿ� ���������� �ݺ��ɶ��� ��밡���ϴٴ� ������ �ִ�.
	}

}
