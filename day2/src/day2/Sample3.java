package day2;

public class Sample3 {

	public static void main(String[] args) {
		// 03-08 �� (Map)
		//"���"�� ���� ��� �������� "�̸�" = "ȫ�浿", "����" = "�� �� ��ĥ" ������ ������ �� �ִ�. �ڹ��� ��(Map)�� �̷��� �������踦 ���� ǥ���� �� �ְ� �� �ִ� �ڷ����̴�. 
		//�̰��� ���� ������ ��κ��� ���鵵 ���� �ִ� �ڷ������� Associative array, Hash��� �Ҹ���.
		//��(Map)�� ����(dictionary)�� ����ϴ�. ��, people �̶� �ܾ "���", baseball �̶�� �ܾ "�߱�"��� ����
		//���յǵ��� Map�� Key�� Value�� �� ������ ���� �ڷ����̴�.

		//key			value
		//people		���
		//baseball		�߱�
		//Map�� ����Ʈ�� �迭ó�� ����������(sequential) �ش� ��� ���� ������ �ʰ� key�� ���� value�� ��´�.
		//��(Map)�� ���� ū Ư¡�̶�� key�� value�� ���ٴ� ���̴�.
		//baseball�̶� �ܾ��� ���� ã�� ���ؼ� ������ ������ ���������� ��� �˻��ϴ� ���� �ƴ϶� baseball�̶�� �ܾ �ִ� ������ ���ĺ��� ���̴�.

			//HashMap
			//put
			//get
			//containsKey
			//remove
			//size
			//keySet
			//HashMap
			//�ڹ��� ��(Map)�� ���� ������ HashMap�� ���ؼ� �˾ƺ���.

			//���� �� �ڹ�
			//Map ���� List�� ���������� �������̽��̴�. Map �������̽��� ������ Map�ڷ�������
			//HashMap, LinkedHashMap, TreeMap���� �ִ�. �������̽��� ���ؼ��� ��ü���� é�Ϳ��� �ڼ��ϰ� �ٷ� ���̴�.
			//put
			//key�� value�� String ������ HashMap�� ����� ������ ���Ҵ� ������ �׸񰪵��� �Է��� ����.

			//import java.util.HashMap;

			//public class Sample {
				 //public static void main(String[] args) {
				  //HashMap<String, String> map = new HashMap<>();
				  //map.put("people", "���");
				  //map.put("baseball", "�߱�");
				    //}
				//}
			//key�� value�� �� �������� ������ put�޼ҵ带 �̿��Ͽ� �Է��ߴ�.

			//HashMap ���� ���׸����� �̿��Ѵ�. ���� HashMap �� ���׸����� Key, Value ��� String Ÿ���̴�.
				//get
				//key�� �ش�Ǵ� value���� ��� ���ؼ��� ������ ���� �Ѵ�.
				//System.out.println(map.get("people")); //"���" ���
				//���Ͱ��� get �޼ҵ带 �̿��ϸ� value���� ���� �� �ִ�. �� ������ "people" Key�� �����Ǵ� Value ������ "���"�̶�� ���ڿ��� ����� ���̴�.

				//getOrDefault
				//���� key�� �ش��ϴ� value�� ���� ��쿡 get �޼ҵ带 ����ϸ� ����ó�� null�� ���ϵȴ�.

				//System.out.println(map.get("java"));  // null ���
				//�̶� null ��� ����Ʈ ���� ��� ���� ��쿡�� getOrDefault �޼ҵ带 ����Ѵ�.
				//System.out.println(map.getOrDefault("java", "�ڹ�"));  // "�ڹ�" ���
				//containsKey
				//containsKey �޼ҵ�� ��(Map)�� �ش� Ű(key)�� �ִ����� �����Ͽ� �� ������� �����Ѵ�.
				//System.out.println(map.containsKey("people"));//true ���
				//"people"�̶�� Ű�� �����ϹǷ� true�� ��µ� ���̴�.

				//remove
				//remove �޼ҵ�� ��(Map)�� �׸��� �����ϴ� �޼ҵ�� key���� �ش�Ǵ� ������(key, value)�� ������ �� �� value ���� �����Ѵ�.
				//System.out.println(map.remove("people"));  // "���" ���
				//"people"�� �ش�Ǵ� ������(people:���)�� ������ �� "���"�� ��µ� ���̴�.

				//size
				//size �޼ҵ�� Map�� ������ �����Ѵ�.
				//System.out.println(map.size());  // 1 ���
				//"people", "baseball" �� ���� ������ �ִٰ� "people"�׸��� �����Ǿ����Ƿ� 1�� ��µ� ���̴�.

				//keySet
				//keySet�� ��(Map)�� ��� Key�� ��Ƽ� �����Ѵ�.
				//import java.util.HashMap;

				//public class Sample {
				    //public static void main(String[] args) {
				        //HashMap<String, String> map = new HashMap<>();
				        //map.put("people", "���");
				        //map.put("baseball", "�߱�");
				        //System.out.println(map.keySet());  // [baseball, people] ���
				    //}
				//}
				//keySet() �޼ҵ�� Map�� ��� Key�� ��Ƽ� Set �ڷ������� �����Ѵ�.
				//Set �ڷ����� ����Ŀ� �˾ƺ���. Set �ڷ����� ������ ���� List �ڷ������� �ٲپ� ����Ҽ��� �ִ�.
				//List<String> keyList = new ArrayList<>(map.keySet());
				//LinkedHashMap�� TreeMap
				//Map�� ���� ū Ư¡�� ������ �������� �ʰ� key�� value�� �������µ� �ִ�. ������ ������ Map�� �Էµ� ������� �����͸� �������� ���� ��쵵 �ְ� ���δ� �Էµ� key�� ���� ��Ʈ�� �����͸� �������� ���� ���� ���� ���̴�. 
				//�̷���쿡�� LinkedHashMap�� TreeMap�� ����ϴ� ���� �����ϴ�.
				//LinkedHashMap�� �Էµ� ������� �����͸� �����ϴ� Ư¡�� ������ �ִ�.
				//TreeMap�� �Էµ� key�� �������� ������ �����͸� �����ϴ� Ư¡�� ������ �ִ�.

	}

}
