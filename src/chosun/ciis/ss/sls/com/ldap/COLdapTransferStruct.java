/***************************************************************
* ���ϸ�		: COLdapTransferStruct.java
* ���			:
* �ۼ�����		: 2005.03.08
* �ۼ���		: ������
***************************************************************/

package chosun.ciis.ss.sls.com.ldap;

import java.util.*;

public class COLdapTransferStruct {

	public String csprn	 		= null;		// �ֹι�ȣ(xxxxxxyyyyyyy ����)
	public String sn			= null; 	// *����
	public String givenname			= null; 	// *����
	public String cn			= null; 	// *����
	public String cshanjanm			= null;		// ����(����, �������)
	public String csenglnm			= null;		// ����(����, ��������)
	public String uid			= null; 	// ���̵�
	public String employeenumber 		= null;		// ���
	public String userPassword		= null; 	// *��ȣ(SHA)
	public String departmentnumber		= null;		// ����ٹ��μ��ڵ�
	public String ou			= null;		// ���� �ٹ� �μ���
	public String employeetype 		= null;		// ��������ڵ�
	public String cscmpycd			= null; 	// ȸ���ڵ�
	public String o				= null; 	// ȸ���
	public String csjikryl			= null; 	// ������
	public String csjikgun			= null; 	// ������
	public String csjikmu			= null; 	// ������
	public String csoctgr			= null; 	// ������
	public String csposicd1			= null;		// ��å�ڵ�1
	public String csposinm1			= null;		// ��å��1
	public String csposicd2			= null;		// ��å�ڵ�2
	public String csposinm2			= null;		// ��å��2
	public String csdutycd			= null;		// �ٹ����ڵ�
	public String csdutynm			= null;		// �ٹ�����
	public String csincmpydt		= null;		// �Ի�����(yyyymmdd ����)
	public String csdealbankcd		= null;		// �ŷ������ڵ�
	public String csdealbanknm		= null;		// �ŷ������
	public String csacctno			= null;		// ���¹�ȣ(000-0000-0000-0000 ����)
	public String mobile			= null;		// �޴���(011-2222-3333  ����)
	public String mail			= null; 	// �̸����ּ�
	public String cshomeaddr		= null;		// �ּ�
	public String cshomeaddr2		= null;		// ���ּ�
	public String homephone			= null;		// �������� ��ȭ��ȣ(111-2222-3333  ����)
	public Vector csmangareacd		= new Vector();		// ���������ڵ� (multi-value)
	public Vector csmangareanm		= new Vector();		// ���������� (multi-value)
	public String csselldeptcd		= null;		// �Ǹźμ��ڵ�
	public String csselldeptnm		= null;		// �Ǹźμ���
	public String csbocd			= null;		// �����ڵ�
	public String csbonm			= null;		// ������
	public String csareacd			= null;		// �����ڵ�
	public String csareanm			= null;		// ������
	public String cshrdeptcd		= null;		// �λ�μ��ڵ�
	public String cshrdeptnm		= null;		// �λ�μ���
	public String csboclsfcd		= null;		// ���������ڵ�
	public String csboclsfnm		= null;		// �������и�
	public String csbillgroupid		= null;		// �����׷�ID
	public String csbillgrouptype		= null;		// �����׷�����
	public String csbillincode		= null;		// �����Ҽ��ڵ�
	public Vector csjobcd			= new Vector();		// �����ڵ� (multi-value)
	public Vector csjobnm			= new Vector();		// �����ڵ�/�� (multi-value, �����ڵ�|�� ǥ��  ��) 000|���ϸ��������� ����)
	public String csmanageryn		= null;		// �μ��忩��
	public String csusertype		= null;		//���������
	public String description		= null;		//���������
	public String csofficd			= null;		// ���ڵ�
	public String csoffinm			= null;		// ����
	public String csbokscd			= null;		// ���ڵ�
	public String csboksnm			= null;		// �θ�
	public Vector csdealdeptcd		= new Vector();		// �����μ��ڵ� (multi-value)
	public Vector csdealdeptnm		= new Vector();		// �����μ��� (multi-value, �����μ��ڵ�|�����μ��� ǥ��  ��) 3105|����2�� ����)
	public String cshomezipcode		= null;		// ���� �����ȣ(111-222 ����)
	public String csoutcmpydt		= null;		// �������(yyyymmdd ����)
	public String csacctnm			= null;		// ������
	public String cslastinfologin		= null;		// ����������
	public String csempcmpycd		= null;		// �ٹ���ȸ���ڵ�
	public String csempcmpynm		= null;		// �ٹ���ȸ���
	public String csbrchofficd		= null;		// �����ڵ�
	public String csbrchoffinm		= null;		// �����
	public String carlicense		= null;		// ���ʷα��� �� �Ǵ� pwd ���� �� (16777216 : �α������� �ʾҽ�)
}
