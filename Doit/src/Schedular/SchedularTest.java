package Schedular;

import java.io.IOException;

public class SchedularTest {

	// System.in.read() 사용 위해 IOException 에서 오류 처리
	public static void main(String[] args) throws IOException {
		System.out.println("전화 상담 할당 방식을 선택하세요.");
		System.out.println("R : 한명씩 차례로 할당");
		System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
		System.out.println("P : 우선순위가 높은 고객 먼저 할당");
		System.out.println("A : 상담원 필요에 의해 가져오는 정책");
		
		int ch = System.in.read();
		Schedular schedular = null;
		
		if(ch == 'R' || ch == 'r') {
			schedular = new RoundRobin();
		}else if(ch == 'L' || ch == 'l') {
			schedular = new LeastJob();
		}else if(ch == 'P' || ch == 'p') {
			schedular = new PriorityAllocation();
		}else if(ch == 'A' || ch == 'a') {
			schedular = new AgentGetCall();
		}else {
			System.out.println("지원되지 않는 기능입니다.");
			return;
		}
		
		schedular.getNextCall();
		schedular.sendCallToAgent();
	}

}
