package day2;
import java.util.ArrayList;
//public class Sample2 {

		//03-07 ����Ʈ(List)
		//1.ArrayList
			//1.add
			//2.get
			//3.size
			//4.contains
			//5.remove
		//2.���׸���
		//3.�پ��� ������� ArrayList�����
		//4.String.join
		//5.����Ʈ �����ϱ�
		
		//����Ʈ�� �迭�� ����� �ڹ��� �ڷ������� �迭���� ���� ����� ���� ������ �ִ�.
		//����Ʈ�� �迭�� ���� ū ���̴� ũ�Ⱑ ������ �����ʰ� �������� ���Ѵٴ� ���̴�.
		//�迭�� ũ�Ⱑ �������Ҵ�.
		//���� ��� �迭�� ũ�⸦ 10���� ���ߴٸ� 10���̻��� ���� ���� ���� ����.
		//������ ����Ʈ�� ũ�Ⱑ ������ �����ʾ� ���ϴ� ��ŭ�� ���� ���� �� �ִ�.
		//����ȣ ������ ���� ���ǵ带 �����ؾ��Ѵٰ� �����غ���.
		//�迭�� �̿��Ͽ� �������� ������ �� ������? 1ȸ�� �������� 3���� �� �� �ְ� 100���� �� �� ����������?
		//���α׷��� �� ũ�⸦ �� �� �ִ� ��Ȳ�� ������ ��Ȯ�� ũ�⸦ �� �� ���� ��찡 �� ����
		//�̷��� �������� �ڷ����� ������ �����ϴ� ��Ȳ�̶�� List�� ����ϴ� �Ž� �����ϴ�
		
		//ArrayList
		//List�ڷ����� ���� ������ ������ �ڷ����� ArrayList�� ���ؼ� �˾ƺ���.
		//tip!
		//List �ڷ���
		//List�ڷ������� ArrayList, Vector, LinkedList���� List �������̽��� ������ �ڷ����� �ִ�.
		//���⼭ ���ϴ� List�ڷ����� �������̽��ε� �������̽������ؼ��� �ڿ��� �ڼ��� �ٷ絵���Ѵ�.
		
		//add
		//����ȣ ������ �� 3���� ������ 138, 129, 142(km)�� �ӵ��� �����ٸ� ������ ���� �ڵ带 �ۼ��� �� �ִ�,
			//public static void main(String[] args) {
				//java.util.ArrayList<> pitches = new ArrayList();
				//pitches.add("138");
				//pitches.add("129");
				//pitches.add("142");
			//}
		//}
		
		//ArrayList�� ����ϱ� ���ؼ��� import java.util.ArrayList�� ���� ArrayList�� ���� import�ؾ� �Ѵ�.
		//ArrayList ��ü�� pitches�� add ��� �޼ҵ带 �̿��Ͽ� ���� ���ǵ带 �����ߴ�. 
		//���� ù��° ��ġ�� "133"�̶�� ���� ���ǵ带 �����ϰ� �ʹٸ� �Ʒ��� ���� ������ ��ġ�� �Ķ���ͷ� �Ѱ��־�� �Ѵ�.
		//pitches.add(0, "133");// ù��° ��ġ�� 133 ����.
		//���� 2�� ° ��ġ�� 133�� ���� �� ��쿡�� ������ ���� �ڵ��ϸ� �ȴ�.
		
		//pitches.add(1, "133");
		//���� �� �ڹ�
		//���׸���
		//�ڹٴ� J2SE 5.0 ���� ���ĺ��� ArrayList<String> pitches = new ArrayList<>(); ó�� ��ü�� �����ϴ� �ڷ����� 
		//� ��ü�� �����ϴ����� ���ؼ� ��Ȯ�ϰ� ǥ���� ���� �ǰ��ϰ� �ִ�. ���ڸ����̿��� ���� ������ ���� ���׸��� ���� �ڵ��ϸ� ��Ȯ�� Ÿ���� 
		//����϶�� warning�� ǥ�õ� ���̴�. �� �κп� ���� �ڼ��� ������ ��� �Ŀ� �ڼ��ϰ� �����Ѵ�.
		//get
		//����ȣ ������ 2��° ���� ���ǵ带 ����ϰ� �ʹٸ� ������ ���� �Ѵ�.
		
		//System.out.println(pitches.get(1));
		//ArrayList�� get �޼ҵ带 �̿��ϸ� Ư�� �ε����� ���� ������ �� �ִ�.
		//size
		//size �޼ҵ�� ArrayList�� ������ �����Ѵ�.
		//System.out.println(pitches.size());
		//�� �ڵ带 �����ϸ� pitches�� ��� ������ ��µȴ�.
		
		//contains
		//contains �޼ҵ�� ����Ʈ �ȿ� �ش� �׸��� �ִ����� �Ǻ��Ͽ� �� ����� boolean���� �����Ѵ�.
		//System.out.println(pitches.contains("142"));
		//pitches ��ü�� 142 ���� �����ϰ� �����Ƿ� true�� ��µȴ�.
		
		//remove
		//remove �޼ҵ忡�� 2���� ����� �ִ�. (�̸��� ������ �Է��Ķ���Ͱ� �ٸ���)
		//remove(��ü)
		//remove(�ε���)
		//ù��° remove(��ü)�� ���� ����Ʈ���� ��ü�� �ش�Ǵ� �׸��� �����ϰ� ������ ���(true, false)�� �����Ѵ�.
		//System.out.println(pitches.remove("129"));
		//�������� ������ ����
		//true
		//"129"��� �׸��� ���������� �����ǰ� true�� �����Ѵ�
		//�� ��° remove(�ε���)�� ���� �ش� �ε����� �׸��� �����ϰ� ������ �׸��� �����Ѵ�.
		//System.out.println(pitches.remove(0));
		//�������� ������ ����.
		//138
		//pitches�� ù��° �׸��� "138"�̹Ƿ� "138"�� ������ �� "138"�� �����Ѵ�.
		
		//���׸���(Generics)
		//���׸���(Generics)�� �ڹ� J2SE 5.0 ���Ŀ� ���Ե� �����̴�.
		//���⼭�� ���׸����� ����ϴ� ����� ���ؼ��� �ٷ��. ���׸����� ����� ����� �Թ����� ��︮�� �ʴ� ��� �����̹Ƿ� �� å������ �����Ѵ�.
		
		//������ ���� ���� ���׸����̴�.
		//ArrayList<String> pitches = new ArrayList<String>();
		//������ ���� �� �κ��� �ڷ����� ���� ���� �ʾƵ� ��Ȯ�ϱ� ������ ������ ǥ����� ����ϴ� ���� ����.
		//ArrayList<String> pitches = new ArrayList<>();  // ��ȣ�Ǵ� ���
		//���� �� �ڿ� ��� �ڷ��� Ÿ���� ���� ��� ���ڸ����̿� ���� IDE������ ���޽����� ����Ѵ�.
		
		//���׸����� ���ԵǱ� ���� J2SE 1.4 ������ ���� �ڵ带 ������ ���� ����ߴ�.
		//ArrayList pitches = new ArrayList();
		//�� �� �ڵ��� �������� ArrayList ��� �ڷ��� Ÿ�� �ٷ� ���� <String> �� ���� ������ �ִ��� �������� �����̴�.
		//JSSE 5.0 ���� �������� �ι�° ������� �ڵ带 �ۼ��ص� ������ ���� �ʴ´�. �ٸ� ���׸��� Ÿ���� ��Ȯ�ϰ� �����϶�� Warning �޽����� ��µȴ�.
		//������ ����� ù��° �ڵ��� <String> �̶�� ���׸��� ǥ������ "ArrayList �ȿ� ���� �� �ִ� �ڷ����� String Ÿ�� ���̴�" ��� ���� �ǹ��Ѵ�.
		//���⼭�� ���׸����� Ÿ������ String �ڷ������� ���� ������� <Integer>, <Animal>, <Dog> �� � �ڷ����� ����� �� �ִ�.
		//��, ���׸����� �̿��ϸ� �� �� ��Ȯ�� Ÿ��üũ�� ������ ����. �̰��� �ڵ带 �ۼ��� ���� ��� �̵��� �ش�.
		
		//�켱 ���׸����� ������� ���� ��츦 ������ ����.
		//ArrayList pitches = new ArrayList();
		//aList.add("138");
		//aList.add("129");
		
		//String one = (String) pitches.get(0);
		//String two = (String) pitches.get(1);
		//��ó�� ���׸����� ������� ���� ��쿡�� ArrayList �ȿ� �߰��Ǵ� ��ü�� Object �ڷ������� �νĵȴ�. Object �ڷ����� ��� ��ü�� ����ϰ� �ִ� ���� �⺻���� �ڷ����̴�. ���� ArrayList ��ü�� pitches�� ���� ���� ���� ������ �ȵ����� ���� ������ ��쿡�� �׻� Object �ڷ������� String �ڷ������� ������ ���� ����ȯ(casting)�� �� �־�߸� �Ѵ�.
		
		//String one = (String) pitches.get(0); // Object �ڷ����� String �ڷ������� ĳ�����Ѵ�.
		//�� �Ѱ��� ������ ���� pitches �ȿ��� String ��ü �̿��� ��ü�� ���� �� �ֱ� ������ �� ��ȯ �������� �߸��� ����ȯ���� ����
		//������ �߻��� ���ɼ��� �ִٴ� ���̴�. �ٷ� �̷��� ���� ���׸����� ź�� �����̱⵵ �ϴ�.
		//�� �ڵ带 ���׸����� ����Ͽ� �����ϸ� ������ ���� �ȴ�.
		
		//ArrayList<String> pitches = new ArrayList<>();
		//aList.add("138");
		//aList.add("129");
		//String one = pitches.get(0);  // �� ��ȯ�� �ʿ����.
		//String two = pitches.get(1);  // �� ��ȯ�� �ʿ����.
		//���׸����� �ڷ����� �����ϱ⸸ �ϸ� �� ���ķδ� �ڷ����� ���� ����ȯ ������ �ʿ����.
		//�̹� �����Ϸ��� pitches���� �ݵ�� String �ڷ����� �߰� �Ǿ�� ���� �˱� �����̴�. �̷��� ���׸����� �̿��ϸ� ����ȯ�� ���� ���ʿ��� �ڵ��� �߸��� ����ȯ�� ���� ��Ÿ�� ������ ������ �� �ִ�.
		
		//�پ��� ������� ArrayList �����
		//ArrayList�� add �޼ҵ带 ����ϸ� ����ó�� ArrayList ��ü�� ��Ҹ� �߰��� �� �ִ�.
		//import java.util.ArrayList;
		
		//public class Sample {
		   // public static void main(String[] args) {
		        //ArrayList<String> pitches = new ArrayList<>();  // ���׸����� ����� ǥ��
		       // pitches.add("138");
		        //pitches.add("129");
		        //pitches.add("142");
		       // System.out.println(pitches);  // [138, 129, 142] ���
		   // }
		//}
		//������ ����ó�� �̹� �����Ͱ� ������ ��쿡�� ���� ���ϰ� ArrayList�� ������ �� �ִ�.
		
		//import java.util.ArrayList;
		//import java.util.Arrays;
		
		//public class Sample {
		   //public static void main(String[] args) {
		      //String[] data = {"138", "129", "142"};  // �̹� ������ ������ �迭�� �ִ�.
		      //ArrayList<String> pitches = new ArrayList<>(Arrays.asList(data));
		      //System.out.println(pitches);  // [138, 129, 142] ���
		    //}
		//}
		//java.util.Arrays Ŭ������ asList �޼ҵ带 ����ϸ� �̹� �����ϴ� ���ڿ� �迭�� ArrayList�� ������ �� �ִ�.
		//�Ǵ� ������ ���� String �迭 ��� String �ڷ����� ������ �����Ͽ� ������ ���� �ִ�.
		
		//import java.util.ArrayList;
		//import java.util.Arrays;
		
		//public class Sample {
		   // public static void main(String[] args) {
		        //ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
		        //System.out.println(pitches);
		    //}
		//}
		//String.join
		//�տ��� "138", "129", "142" �� ��ҷ� �̷���� ArrayList�� ����� ���Ҵ�. 
		//�׷��ٸ� �̷��� ������� ArrayList�� �� ��Ҹ� �޸�(",")�� �����Ͽ� ������ ���� �ϳ��� ���ڿ��� ���� �� �ִ� ����� ������?
		//138,129,142
		//�޸��� �� ��� �߰��� �����Ϸ��� ������ ���� �ڵ带 �ۼ��ؾ� �Ѵ�.
		
		//import java.util.ArrayList;
		//import java.util.Arrays;
		//public class Sample {
		    //public static void main(String[] args) {
		        //ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
		        //String result = "";
		        //for (int i = 0; i < pitches.size(); i++) {
		            //result += pitches.get(i);
		            //result += ",";  // �޸��� �߰��Ѵ�.
		        //}
		        //result = result.substring(0, result.length() - 1);  // ������ �޸��� �����Ѵ�.
		        //System.out.println(result);  // 138,129,142 ���
		    //}
		//}
		//�� ���� pitches�� ������ŭ ������ ���鼭 �ڿ� �޸��� ���ϰ� ���������� ������ �޸��� �����ϴ� ����̴�. 
		//�� �������� �� �� �ֵ��� ����Ʈ�� ������ ��� ���̿� �����ڸ� �����־� �ϳ��� ���ڿ��� ����� ���� �� ��ٷο� ���̴�.
		//������ String.join�� ����ϸ� ����ó�� �ſ� �����ϰ� ó���� �� �ִ�.
		
		//import java.util.ArrayList;
		//import java.util.Arrays;
		
		//public class Sample {
		    //public static void main(String[] args) {
		       //ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
		       //String result = String.join(",", pitches);
		       //System.out.println(result);  // 138,129,142 ���
		    //}
		//}
		//String.join("������", ����Ʈ��ü)�� ���� ����Ͽ� ����Ʈ�� �� ��ҿ� "������"�� �����Ͽ� �ϳ��� ���ڿ��� ���� �� �ִ�.
		//String.join�� ����ó�� ���ڿ� �迭���� ����� �� �ִ�.
		
		//public class Sample {
		    //public static void main(String[] args) {
		        //String[] pitches = new String[]{"138", "129", "142"};
		        //String result = String.join(",", pitches);
		        //System.out.println(result);  // 138,129,142 ���
		    //}
		//}
		//String.join �޼ҵ�� Java 8 �������� ����� �� �ִ�.
		
		//����Ʈ �����ϱ�
		//�̹����� "138", "129", "142"�� ��ҷ� �̷���� ArrayList�� ������� ������ ����. 
		//������� �����ϱ� ���ؼ��� ����ó�� ����Ʈ�� sort �޼ҵ带 ����ؾ� �Ѵ�.
		
		//import java.util.ArrayList;
		//import java.util.Arrays;
		//import java.util.Comparator;
		//public class Sample {
		   // public static void main(String[] args) {
		        //ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
		        //pitches.sort(Comparator.naturalOrder());  // ������������ ����
		        //System.out.println(pitches);  // [129, 138, 142] ���
		    //}
		//}
		//sort �޼ҵ忡�� ���ı����� �Ķ���ͷ� �����ؾ� �Ѵ�. ���ı��ؿ��� ����ó�� ��������, ���������� �ִ�.
		//��������(������) ���� - Comparator.naturalOrder()
		//��������(������) ���� - Comparator.reverseOrder()
		//sort �޼ҵ�� �����Ŀ� pitches�� ����ϸ� [129, 138, 142] ó�� ������������ ���ĵǾ� ��µǴ� ���� Ȯ���Ҽ� �ִ�.
		//����Ʈ�� sort �޼ҵ�� Java 8 �������� ����� �� �ִ�.
		
		

	//}
//}
