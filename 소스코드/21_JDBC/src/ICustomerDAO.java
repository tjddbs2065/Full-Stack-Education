/** 배성윤 */
public interface ICustomerDAO {
	/** 1. 관리자 입장에서 고객 정보를 등록 */
	public boolean add(Customer customer); // 추상적인 경우
	public boolean add(String name, String phoneNumber); // 추가 후 성공 여부 반환
	/** 2. 이번에 고객 등록 - 기본 포인트 100 */
	public boolean add(String name, String phoneNumber, int point); // 포인트와 함께 추가 후 성공 여부 반환
	/** 3. 특정 고객의 포인트를 확인 */
	public int getPoint(int customerId); // 조회 시 고객 VO 반환
	/** 4. 특정 고객의 포인트를 수정 */
	public boolean updatePoint(int customerId, int point); // 수정 후 성공 여부 반환
	/** 5. 특정 고객의 정보를 삭제 */
	public boolean removeCustomer(int customerId); // 삭제 후 성공 여부 반환
	
	
	
	
	
}
