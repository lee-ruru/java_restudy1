package day2;

public class Sample1 {
	// main ���ο� ������ �ۼ����ּž��ؿ�.
	public static void main(String[] args) {
		//03-06�迭(Array)
		
		//���ݱ��� �츮�� ���ڿ� ���ڿ��� ���ؼ� �˾ƺ��Ҵ�. ������ �̷��� �͵�� ���α׷����� �ϱ⿣ ������ ���� ����.
		//���� ��� 1���� 10������ ���ڵ��� Ȧ������ ������ 1,3,5,7,9,��� ������ ������ ����.
		//�̰͵��� ���ڳ� ���ڿ������� ǥ���ϱ�� ������ �ʴ�.
		String[] weeks = {"��", "ȭ", "��", "��", "��", "��", "��"};
		// �̷��� ������ �ذ��ϱ����� �迭�� �ִ�.
		//1���� 10������ ���ڵ��� Ȧ������ ������ ������ ���� int �迭�� ǥ�� �� �� �ִ�.
		int[] odds = {1, 3, 5, 7, 9};
		//�迭�� �ڷ��� Ÿ�� �ٷ� ����[]��ȣ�� ����Ͽ� ǥ���Ѵ�. �� ������ ���� int�ڷ����� �迭�� int[]�� ǥ���Ǿ���.
		//������ ������ ������ ���� String�迭�� ǥ�� �� �� �ִ�.

		//�� �迭�̶� �ڷ����� ������ �ƴ� �ڷ����� ������ �ǹ��Ѵ�.
		//������ �˾ƺ� �迭�� ��� 1���� �迭�̴�. 2����, 3���� ���� ������ �迭�� �����ѵ� 2���� �̻��� �迭�� �� ������� �ʴ´�.
		//1.�迭�� ���̴� �����Ǿ� �ִ�,
		//2.�迭�� ���� ��� ������ �� ������?
		//3.�迭�� ����
		//4.����� �迭�� ����
		
		//�迭�� ���̴� �����Ǿ� �ִ�
		// ������ ���캻 ������ ���� ������ ������ ���� ���� �����ִ�.
		//String[] weeks = new String[7];
		weeks[0] = "��";
		weeks[1] = "ȭ";
		weeks[2] = "��";
		weeks[3] = "��";
		weeks[4] = "��";
		weeks[5] = "��";
		weeks[6] = "��";
		
		//�迭�� ���̸� ���� �����Ͽ� �迭 ������ ���� ������ ���� �� ���� ���߿� �����ϴ� ����̴�.
		//��, ����ó�� �ʱⰪ ���� �迭������ ���鶧���� �ݵ�� ���̿� ���� ���ڰ��� �ʿ��ϴ�, �� ���������� �ڵ�� �Ұ��ϴ�.
		//String[] week = new String[]; // ���̿� ���� ���ڰ��� �����Ƿ� ������ ������ �߻��Ѵ�
		
		//�迭�� ���� ��� ������ �� ������?
		//������ ���� ������ �迭�� "��"�� �ش�Ǵ� ���� �������� ������ ���� �ε����� �̿��ؾ��Ѵ�.
		//String[] weeks = {"��", "ȭ", "��", "��", "��", "��", "��"};
		System.out.println(weeks[3]);
		//weeks[3]�� weeks�迭�� �׹�° �׸��� �ǹ��Ѵ�.(�ڹٴ� 0���� ���ڸ� ����.)
		
		//�迭�� ����
		//�迭�� ���� for���� �Բ� ���ȴ�. for���� �迭�� ���� ��� �迭�� ���̸�ŭ for���� ������ ���� �߿��ѵ� �迭�� ���̴�
		//������ ���� length�� �̿��Ͽ� ���Ѵ�.
		//String[] weeks = {"��", "ȭ", "��", "��", "��", "��", "��"};
		for (int i=0; i < weeks.length; i++) {
			System.out.println(weeks[i]);
		}
		//weeks�迭�� ������� ����ϴ� ���α׷��̴�. length�� ��� ����޴��� ������ ������ ����.
		//for���� ���ؼ��� "���"é�Ϳ��� �ڼ��ϰ� �˾� �� ���̴�.
		
		//����� �迭�� ����
		//�Ƹ� �������� �ڹ��ڵ带 �ۼ��ϸ鼭 ���Ե� ���帹�� �������� �ϳ��� �ٷ� ������ ������ ���̴�
		//ArrayIndexOutOfBoundsException
		// ������ ��ó�� ���� �迭�� ���̴� �� 7���ε� ���� 8��° ���� �������� �õ��ϸ� �̿� ���� ������ �߻��Ѵ�.
		System.out.println(weeks[7]); //8��° �迭���� �����Ƿ� ArrayIndexOutOfBoundsException������ �߻��Ѵ�.
		
	}

}
