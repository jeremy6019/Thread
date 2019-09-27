package define;

public class API3 {
/*
 
  ** 데이터를 문자열로 만들어 주는 format관련 클래스 - java.text패키지 
  
  1. Date클래스의 데이터를 원하는 포맷의 문자열로 만들어 주는 클래스 
  =>java.text.SimpleDateFormat 
  객체를 생성할 때 new SimpleDateFormat("날짜 서식") 
  문자열로 만들 때는 Format(Date 객체) 
  문자열을 가지고 Date 객체를 만들 때는 parse(문자열)를 이용  
  
  =>서식에 이용하는 문자
  G:기원 
  M: 월 
  W:달에서의 주 
  y: 년도 
  E: 요일 
  d: 달에서의 일
  H: 시간(24시간)
  K: 시간(0-11)
  a: 오전/오후 
  m: 분 
  s: 초 
 
  2. java.text.DecimalFormat 
  => 숫자를 원하는 포맷의 문자열로 만들어주는 클래스 
  =>사용방법은 SimpleDateFormat과 유사 
  
  자릿수를 맞추기 위한 서식 
  0 : 없으면 0을 출력 
  # : 있으면 출력하지만 없으면 출력하지 않음 
  , : 천단위 구분 기호 
  % : 백분율 
  \u00A4 : 통화기호 - 운영체제의 설정에 따라 다르게 표시 
 
   3. java.text.ChoiceFormat
   => double배열과 String배열을 매핑시켜서 숫자 데이터를 주면 매핑되는 
      문자열을 리턴해주는 클래스 
  => double배열은 반드시 오름차순 정렬되어 있어야 합니다. 
  
  4. java.text.MessageFormat 
  => 삽입될 데이터 자리를 {}로 만들어 두고 나중에 데이터를 끼워 넣는 클래스 
  
** java.util.Scanner 
=> 스트림으로부터 입력받기 위한 클래스 
1. 생성자 
Scanner(Filw file): 파일로 부터 읽어오고자 할 때 사용  
Scanner(InputStream stream): 스트림으로부터 읽어오기 - System.in(표준 입력 스트림 - 키보드 )
Scanner(string source): 문자열에서 읽어오기 

2. 읽어오는 메소드 
String next(): 공백분자(엔터, 탭, 공백등) 까지 읽어서 문자열로 리턴 
String nextInt(): 엔터까지 읽어서 문자열로 리턴 
int nextInt()
double nextDouble()
boolean nextBoolean() 

3.컴퓨터가 키보드로부터 데이터를 읽어오는 방법 
=>키보드로 입력을 하면 컴퓨터는 입력한 내용을 버퍼에 저장하고 읽어오는 메소드에 따라 데이터를 
넘겨줍니다 . 
=> 숫자데이터를 입력받고 그 다음에 문자를 입력받고자 하는 경우 문제가 발생할  수 있습니다. 
숫자데이터를 입력할 때는 숫자를 입력하고 엔터를 치고 다음 문자열을 입력합니다. 
버퍼에는 숫자-> 엔터->다음입력한 문자열 순으로 저장이 됩니다. 
nextInt를 하면 숫자만 가져가고 엔터와 문자열이 남습니다. 
nextLine을 호출하면 엔터를 가져갑니다.    
숫자를 입력받고 다음에 문자열을 입력받고자 할 때는 nextInt -> nextLine -> nextLine 형태로 
호출해야 합니다. 

 
  
 
 */
}











