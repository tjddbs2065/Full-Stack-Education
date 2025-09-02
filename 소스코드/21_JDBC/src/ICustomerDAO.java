/** �輺�� */
public interface ICustomerDAO {
	/** 1. ������ ���忡�� �� ������ ��� */
	public boolean add(Customer customer); // �߻����� ���
	public boolean add(String name, String phoneNumber); // �߰� �� ���� ���� ��ȯ
	/** 2. �̹��� �� ��� - �⺻ ����Ʈ 100 */
	public boolean add(String name, String phoneNumber, int point); // ����Ʈ�� �Բ� �߰� �� ���� ���� ��ȯ
	/** 3. Ư�� ���� ����Ʈ�� Ȯ�� */
	public int getPoint(int customerId); // ��ȸ �� �� VO ��ȯ
	/** 4. Ư�� ���� ����Ʈ�� ���� */
	public boolean updatePoint(int customerId, int point); // ���� �� ���� ���� ��ȯ
	/** 5. Ư�� ���� ������ ���� */
	public boolean removeCustomer(int customerId); // ���� �� ���� ���� ��ȯ
	
	
	
	
	
}
