package day2;

public class Sample6 {

	public static void main(String[] args) {
		// 04-03 while ��
		//while�� ������ �ݺ��ؼ� �����ؾ� �� ��쿡 ����Ѵ�.
		//while���� �⺻ ����
		//���ѷ���(Loop)
		//while�� ���� ������(break)
		//while�� ���ǹ����� ���ư���(continue)
		//while���� �⺻ ����
		//������ while���� �⺻ �����̴�.
		//while (���ǹ�) {
		    //<������ ����1>;
		    //<������ ����2>;
		    //<������ ����3>;
		    //...
		//}
		//���ǹ��� ���� ���� while���� ������ ������� �ݺ��Ͽ� �����Ѵ�.
		//���� �� ��� �� �Ѿ� ���� ���� ���١� ��� �Ӵ��� �ڹٷ� �ڵ��ϸ� ������ ���� �� ���̴�.
		int treeHit = 0;
		while (treeHit < 10) {
		    treeHit++;
		    System.out.println("������  " + treeHit + "�� ������ϴ�.");
		    if (treeHit == 10) {
		        System.out.println("���� �Ѿ�ϴ�.");
		    }
		}
		//����� ������ ����.
		//������  1�� ������ϴ�.
		//������  2�� ������ϴ�.
		//������  3�� ������ϴ�.
		//������  4�� ������ϴ�.
		//������  5�� ������ϴ�.
		//������  6�� ������ϴ�.
		//������  7�� ������ϴ�.
		//������  8�� ������ϴ�.
		//������  9�� ������ϴ�.
		//������  10�� ������ϴ�.
		//���� �Ѿ�ϴ�.
		//���� ������ while���� ���ǹ��� treeHit < 10�̴�. ��, treeHit�� 10���� ���� ���ȿ� while �� ���� ������� ��� �����Ѵ�.
		//whlie�� ���� ������ ���� ���� ���� treeHit++�� treeHit���� ��� 1�� �����Ѵ�.
		//�׸��� ������ treeHit�� ��ŭ ������� �˸��� ������ ����ϰ� treeHit�� 10�� �Ǹ� ������ �Ѿ�ϴ١���� ������ 
		//����ϰ� treeHit < 10��� ���ǹ��� ������ �Ǿ� while���� ���� ������ �ȴ�.
		//���⼭ treeHit++ �� ���α׷����� �� �� �ſ� ���� ����ϴ� ������� treeHit�� ���� 1��ŭ�� ������ų �������� ���̴� ���̴�.
		//treeHit++�� treeHit += 1ó�� ���⵵ �Ѵ�.

		//���ѷ���(Loop)
		//�̹����� ���ѷ����� ���ؼ� �˾ƺ���� ����. ���� ������ ������ �ݺ��Ѵٴ� �ǹ��̴�. �ڹٿ��� ���ѷ����� while������ ���� �Ҽ� �ִ�. 
		//�츮�� ����ϴ� ���α׷��� �߿��� ���ѷ����� ������ ������� �ʴ� ���α׷��� �ϳ��� ���� ������ ���ѷ����� ���� ���ȴ�. ������ ���ѷ����� �⺻���� �����̴�.
		//while (true) {    
		    //<������ ����1>;
		    //<������ ����2>;
		    //...
		//}
		//while�� ���ǹ��� true �̹Ƿ� ���ǹ��� �׻� ���� �ȴ�. while�� ���ǹ��� ���� ���ȿ� while�� ���� �ִ� 
		//������� ����ؼ� �����ϹǷ� ���� ���� �����ϰ� while�� ���� ������� ������ ���̴�.
		//������ ���� ����.
		while (true) {
		    System.out.println("Ctrl-C�� ������ while���� ���� ���� �� �ֽ��ϴ�.");
		}
		//������ ���� ������ ��µȴ�.
		//Ctrl-C�� ������ while���� ���� ���� �� �ֽ��ϴ�.
		//Ctrl-C�� ������ while���� ���� ���� �� �ֽ��ϴ�.
		//(... ���� )
		//���� ������� ������ ��µ� ���̴�. Ctrl-C�� ������ ���� �������� ����.
		//���ڸ����̿� ���� IDE�� ����� ��쿡�� ������ư("������ ��ư")�� ���� ���μ����� ��������.

		//while�� ���� ������(break)
		//while ���� ���ǹ��� ���� ���� ����ؼ� while�� ���� ������ �ݺ��Ͽ� �����Ѵ�. ������ ������ while ���� ���������� �� ���� �ִ�.
		//Ŀ�� ���Ǳ⸦ ������ ����. Ŀ�ǰ� ���Ǳ� �ȿ� ����ϰ� ���� ���� �׻� "���� ������ Ŀ�Ǹ� ���" ��� 
		//���ǹ��� ���� while���� ����ȴ�. ���ǱⰡ �� ������ �Ϸ��� Ŀ���� ���� ������ �˻縦 �ؼ� Ŀ�ǰ� 
		//�� �������� while���� ���߰� �ϰ� "�Ǹ�����"�� ������ ���Ǳ⿡ ������ �� ���̴�. �̷��� while ���� ������ ����� �� �� ����ϴ� ����
		//�ٷ� break�̴�.
		//������ ���� ���� ������ �ڹٷ� ǥ���� �� ���̴�.
		//��) break�� ���

		//int coffee = 10;
		//int money = 300;

		//while (money > 0) {
		    //System.out.println("���� �޾����� Ŀ�Ǹ� �ݴϴ�.");
		    //coffee--;
		    //System.out.println("���� Ŀ���� ���� " + coffee + "�Դϴ�.");
		    //if (coffee == 0) {
		        //System.out.println("Ŀ�ǰ� �� ���������ϴ�. �ǸŸ� �����մϴ�.");
		        //break;
		    //}
		//}
		//money�� 300���� �����Ǿ� �����ϱ� while (money > 0)���� money�� 0���� ũ�� ������ �׻� ���̴�.
		//���� ���� ������ ���� �ȴ�. �׸��� while���� ����Ǹ� coffee--�� ���ؼ� coffee�� ������ �� ���� �پ��� �ȴ�.
		//���� coffee�� 0�� �Ǹ� if (coffee == 0) ������ ���� �ǹǷ� break�� ȣ��Ǿ� while���� ���� ������.

		//while�� ���ǹ����� ���ư���(continue)
		//while�� ���� ������ ������ �� � ������ �˻��ؼ� ���ǿ� ���� �ʴ� ��� while���� ���������� ��� while����
		//�� ó��(���ǹ�)���� ���ư��� �ϰ� ���� ��쵵 �ִ�.
		//���� 1���� 10������ ���߿��� Ȧ������ ����ϴ� ���� while���� �̿��ؼ� �ۼ��Ѵٰ� ������ ����. � ����� ������?
		//��) continue�� ���
		//int a = 0;
		//while (a < 10) {
		    //a++;
		    //if (a % 2 == 0) {
		        //continue;  // ¦���� ��� ���ǹ����� ���ư���.
		    //}
		    //System.out.println(a);  // Ȧ���� ��µȴ�.
		//}
		//���� ���� 1���� 10������ �� �� Ȧ������ ����ϴ� ���̴�. a�� 10���� ���� ���� a�� 1��ŭ�� ��� �����Ѵ�.
		//if (a % 2 == 0) (2�� �������� �� �������� 0�� ���)�� ���� �Ǵ� ���� a�� ¦���� ���̴�. ��, a�� ¦���̸� continue ������ ����ȴ�.
		//�� continue���� while���� �� ó��(���ǹ�: a<10)���� ���ư��� �ϴ� ���ɾ��̴�.
		//���� ���� ������ a�� ¦���̸� System.out.println(a)�� ������� �ʱ� ������ Ȧ���� ��µ� ���̴�.

	}

}