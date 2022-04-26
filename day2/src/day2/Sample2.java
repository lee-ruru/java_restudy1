package day2;
import java.util.ArrayList;
//public class Sample2 {

		//03-07 리스트(List)
		//1.ArrayList
			//1.add
			//2.get
			//3.size
			//4.contains
			//5.remove
		//2.제네릭스
		//3.다양한 방법으로 ArrayList만들기
		//4.String.join
		//5.리스트 정렬하기
		
		//리스트는 배열과 비슷한 자바의 자료형으로 배열보다 편리한 기능을 많이 가지고 있다.
		//리스트와 배열의 가장 큰 차이는 크기가 정해져 있지않고 동적으로 변한다는 점이다.
		//배열은 크기가 정해져았다.
		//예를 들어 배열의 크기를 10개로 정했다면 10개이상의 값을 담을 수는 없다.
		//하지만 리스트는 크기가 정해져 있지않아 원하는 만큼의 값을 담을 수 있다.
		//박찬호 선수의 투구 스피드를 저장해야한다고 가정해보자.
		//배열을 이용하여 투구수를 저잘할 수 있을까? 1회에 투구수가 3개도 될 수 있고 100개도 될 수 있지않으가?
		//프로그래밍 시 크기를 알 수 있는 상황도 있지만 명확히 크기를 알 수 없는 경우가 더 많다
		//이렇게 동적으로 자료형의 갯수가 가변하는 상황이라면 List를 사용하는 거싱 유리하다
		
		//ArrayList
		//List자료형중 가장 간단한 형태의 자료형인 ArrayList에 대해서 알아보자.
		//tip!
		//List 자료형
		//List자료형엔는 ArrayList, Vector, LinkedList등의 List 인터페이스를 구현한 자료형이 있다.
		//여기서 말하는 List자료형은 인터페이스인데 인터페이스에대해서는 뒤에서 자세히 다루도록한다.
		
		//add
		//박찬호 선수가 총 3번의 투구를 138, 129, 142(km)의 속도로 던졌다면 다음과 같이 코드를 작성할 수 있다,
			//public static void main(String[] args) {
				//java.util.ArrayList<> pitches = new ArrayList();
				//pitches.add("138");
				//pitches.add("129");
				//pitches.add("142");
			//}
		//}
		
		//ArrayList를 사용하기 위해서는 import java.util.ArrayList와 같이 ArrayList를 먼저 import해야 한다.
		//ArrayList 객체인 pitches에 add 라는 메소드를 이용하여 투구 스피드를 저장했다. 
		//만약 첫번째 위치에 "133"이라는 투구 스피드를 삽입하고 싶다면 아래와 같이 삽입할 위치를 파라미터로 넘겨주어야 한다.
		//pitches.add(0, "133");// 첫번째 위치에 133 삽입.
		//만약 2번 째 위치에 133을 삽일 할 경우에는 다음과 같이 코딩하면 된다.
		
		//pitches.add(1, "133");
		//점프 투 자바
		//제네릭스
		//자바는 J2SE 5.0 버전 이후부터 ArrayList<String> pitches = new ArrayList<>(); 처럼 객체를 포함하는 자료형도 
		//어떤 객체를 포함하는지에 대해서 명확하게 표현할 것을 권고하고 있다. 인텔리제이에서 위의 예제와 같이 제네릭스 없이 코딩하면 명확한 타입을 
		//명시하라는 warning이 표시될 것이다. 이 부분에 대한 자세한 내용은 잠시 후에 자세하게 설명한다.
		//get
		//박찬호 선수의 2번째 투구 스피드를 출력하고 싶다면 다음과 같이 한다.
		
		//System.out.println(pitches.get(1));
		//ArrayList의 get 메소드를 이용하면 특정 인덱스의 값을 추출할 수 있다.
		//size
		//size 메소드는 ArrayList의 갯수를 리턴한다.
		//System.out.println(pitches.size());
		//위 코드를 실행하면 pitches에 담긴 갯수가 출력된다.
		
		//contains
		//contains 메소드는 리스트 안에 해당 항목이 있는지를 판별하여 그 결과를 boolean으로 리턴한다.
		//System.out.println(pitches.contains("142"));
		//pitches 객체는 142 값을 포함하고 있으므로 true가 출력된다.
		
		//remove
		//remove 메소드에는 2가지 방식이 있다. (이름은 같지만 입력파라미터가 다르다)
		//remove(객체)
		//remove(인덱스)
		//첫번째 remove(객체)의 경우는 리스트에서 객체에 해당되는 항목을 삭제하고 삭제한 결과(true, false)를 리턴한다.
		//System.out.println(pitches.remove("129"));
		//수행결과는 다음과 같다
		//true
		//"129"라는 항목이 성공적으로 삭제되고 true를 리턴한다
		//두 번째 remove(인덱스)의 경우는 해당 인덱스의 항목을 삭제하고 삭제된 항목을 리턴한다.
		//System.out.println(pitches.remove(0));
		//수행결과는 다음과 같다.
		//138
		//pitches의 첫번째 항목은 "138"이므로 "138"이 삭제된 후 "138"을 리턴한다.
		
		//제네릭스(Generics)
		//제네릭스(Generics)는 자바 J2SE 5.0 이후에 도입된 개념이다.
		//여기서는 제네릭스를 사용하는 방법에 대해서만 다룬다. 제네릭스를 만드는 방법은 입문서에 어울리지 않는 고급 주제이므로 이 책에서는 생략한다.
		
		//다음과 같은 것이 제네릭스이다.
		//ArrayList<String> pitches = new ArrayList<String>();
		//하지만 보통 뒷 부분의 자료형은 굳이 적지 않아도 명확하기 때문에 다음의 표기법을 사용하는 것이 좋다.
		//ArrayList<String> pitches = new ArrayList<>();  // 선호되는 방식
		//만약 앞 뒤에 모두 자료형 타입을 적을 경우 인텔리제이와 같은 IDE에서는 경고메시지를 출력한다.
		
		//제네릭스가 도입되기 전인 J2SE 1.4 까지는 위의 코드를 다음과 같이 사용했다.
		//ArrayList pitches = new ArrayList();
		//두 개 코드의 차이점은 ArrayList 라는 자료형 타입 바로 옆에 <String> 과 같은 문구가 있느냐 없느냐의 차이이다.
		//JSSE 5.0 이후 버전에서 두번째 방법으로 코드를 작성해도 오류는 나지 않는다. 다만 제네릭스 타입을 명확하게 지정하라는 Warning 메시지가 출력된다.
		//위에서 사용한 첫번째 코드의 <String> 이라는 제네릭스 표현식은 "ArrayList 안에 담을 수 있는 자료형은 String 타입 뿐이다" 라는 것을 의미한다.
		//여기서는 제네릭스의 타입으로 String 자료형만을 예로 들었지만 <Integer>, <Animal>, <Dog> 등 어떤 자료형도 사용할 수 있다.
		//즉, 제네릭스를 이용하면 좀 더 명확한 타입체크가 가능해 진다. 이것은 코드를 작성할 때도 몇가지 이득을 준다.
		
		//우선 제네릭스를 사용하지 않은 경우를 생각해 보자.
		//ArrayList pitches = new ArrayList();
		//aList.add("138");
		//aList.add("129");
		
		//String one = (String) pitches.get(0);
		//String two = (String) pitches.get(1);
		//위처럼 제네릭스를 사용하지 않을 경우에는 ArrayList 안에 추가되는 객체는 Object 자료형으로 인식된다. Object 자료형은 모든 객체가 상속하고 있는 가장 기본적인 자료형이다. 따라서 ArrayList 객체인 pitches에 값을 넣을 때는 문제가 안되지만 값을 가져올 경우에는 항상 Object 자료형에서 String 자료형으로 다음과 같이 형변환(casting)을 해 주어야만 한다.
		
		//String one = (String) pitches.get(0); // Object 자료형을 String 자료형으로 캐스팅한다.
		//또 한가지 주의할 점은 pitches 안에는 String 객체 이외의 객체도 넣을 수 있기 때문에 형 변환 과정에서 잘못된 형변환으로 인한
		//오류가 발생할 가능성이 있다는 점이다. 바로 이러한 점이 제네릭스의 탄생 이유이기도 하다.
		//위 코드를 제네릭스를 사용하여 변경하면 다음과 같이 된다.
		
		//ArrayList<String> pitches = new ArrayList<>();
		//aList.add("138");
		//aList.add("129");
		//String one = pitches.get(0);  // 형 변환이 필요없다.
		//String two = pitches.get(1);  // 형 변환이 필요없다.
		//제네릭스로 자료형을 선언하기만 하면 그 이후로는 자료형에 대한 형변환 과정이 필요없다.
		//이미 컴파일러가 pitches에는 반드시 String 자료형만 추가 되어야 함을 알기 때문이다. 이렇게 제네릭스를 이용하면 형변환에 의한 불필요한 코딩과 잘못된 형변환에 의한 런타임 오류를 방지할 수 있다.
		
		//다양한 방법으로 ArrayList 만들기
		//ArrayList의 add 메소드를 사용하면 다음처럼 ArrayList 객체에 요소를 추가할 수 있다.
		//import java.util.ArrayList;
		
		//public class Sample {
		   // public static void main(String[] args) {
		        //ArrayList<String> pitches = new ArrayList<>();  // 제네릭스를 사용한 표현
		       // pitches.add("138");
		        //pitches.add("129");
		        //pitches.add("142");
		       // System.out.println(pitches);  // [138, 129, 142] 출력
		   // }
		//}
		//하지만 다음처럼 이미 데이터가 존재할 경우에는 보다 편하게 ArrayList를 생성할 수 있다.
		
		//import java.util.ArrayList;
		//import java.util.Arrays;
		
		//public class Sample {
		   //public static void main(String[] args) {
		      //String[] data = {"138", "129", "142"};  // 이미 투구수 데이터 배열이 있다.
		      //ArrayList<String> pitches = new ArrayList<>(Arrays.asList(data));
		      //System.out.println(pitches);  // [138, 129, 142] 출력
		    //}
		//}
		//java.util.Arrays 클래스의 asList 메소드를 사용하면 이미 존재하는 문자열 배열로 ArrayList를 생성할 수 있다.
		//또는 다음과 같이 String 배열 대신 String 자료형을 여러개 전달하여 생성할 수도 있다.
		
		//import java.util.ArrayList;
		//import java.util.Arrays;
		
		//public class Sample {
		   // public static void main(String[] args) {
		        //ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
		        //System.out.println(pitches);
		    //}
		//}
		//String.join
		//앞에서 "138", "129", "142" 의 요소로 이루어진 ArrayList를 만들어 보았다. 
		//그렇다면 이렇게 만들어진 ArrayList의 각 요소를 콤마(",")로 구분하여 다음과 같은 하나의 문자열로 만들 수 있는 방법이 있을까?
		//138,129,142
		//콤마를 각 요소 중간에 삽입하려면 다음과 같이 코드를 작성해야 한다.
		
		//import java.util.ArrayList;
		//import java.util.Arrays;
		//public class Sample {
		    //public static void main(String[] args) {
		        //ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
		        //String result = "";
		        //for (int i = 0; i < pitches.size(); i++) {
		            //result += pitches.get(i);
		            //result += ",";  // 콤마를 추가한다.
		        //}
		        //result = result.substring(0, result.length() - 1);  // 마지막 콤마는 제거한다.
		        //System.out.println(result);  // 138,129,142 출력
		    //}
		//}
		//위 예는 pitches를 갯수만큼 루프를 돌면서 뒤에 콤마를 더하고 최종적으로 마지막 콤마를 제거하는 방법이다. 
		//위 예에서도 볼 수 있듯이 리스트의 각각의 요소 사이에 구분자를 끼워넣어 하나의 문자열로 만드는 것은 꽤 까다로운 일이다.
		//하지만 String.join을 사용하면 다음처럼 매우 간단하게 처리할 수 있다.
		
		//import java.util.ArrayList;
		//import java.util.Arrays;
		
		//public class Sample {
		    //public static void main(String[] args) {
		       //ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
		       //String result = String.join(",", pitches);
		       //System.out.println(result);  // 138,129,142 출력
		    //}
		//}
		//String.join("구분자", 리스트객체)와 같이 사용하여 리스트의 각 요소에 "구분자"를 삽입하여 하나의 문자열로 만들 수 있다.
		//String.join은 다음처럼 문자열 배열에도 사용할 수 있다.
		
		//public class Sample {
		    //public static void main(String[] args) {
		        //String[] pitches = new String[]{"138", "129", "142"};
		        //String result = String.join(",", pitches);
		        //System.out.println(result);  // 138,129,142 출력
		    //}
		//}
		//String.join 메소드는 Java 8 버전부터 사용할 수 있다.
		
		//리스트 정렬하기
		//이번에는 "138", "129", "142"의 요소로 이루어진 ArrayList를 순서대로 정렬해 보자. 
		//순서대로 정렬하기 위해서는 다음처럼 리스트의 sort 메소드를 사용해야 한다.
		
		//import java.util.ArrayList;
		//import java.util.Arrays;
		//import java.util.Comparator;
		//public class Sample {
		   // public static void main(String[] args) {
		        //ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
		        //pitches.sort(Comparator.naturalOrder());  // 오름차순으로 정렬
		        //System.out.println(pitches);  // [129, 138, 142] 출력
		    //}
		//}
		//sort 메소드에는 정렬기준을 파라미터로 전달해야 한다. 정렬기준에는 다음처럼 오름차순, 내림차순이 있다.
		//오름차순(순방향) 정렬 - Comparator.naturalOrder()
		//내림차순(역방향) 정렬 - Comparator.reverseOrder()
		//sort 메소드로 정렬후에 pitches를 출력하면 [129, 138, 142] 처럼 오름차순으로 정렬되어 출력되는 것을 확인할수 있다.
		//리스트의 sort 메소드는 Java 8 버전부터 사용할 수 있다.
		
		

	//}
//}
