/***************************************************************************************************
* ���ϸ� : PS_L_BOACCT.java
* ���   : ���Ǳ�-������°��� ����Ʈ
* �ۼ����� : 2006-11-09
* �ۼ��� : ����ǥ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/



package chosun.ciis.ps.pbs.code.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.code.dm.*;
import chosun.ciis.ps.pbs.code.ds.*;

/**
 * ��������-�����ڵ���� ����Ʈ
 *
 */

public class PS_L_BOACCTACCITMCURRecord extends java.lang.Object implements java.io.Serializable{

	public String cicodeval;
	public String cicdnm;

	public PS_L_BOACCTACCITMCURRecord(){}

	public void setCicodeval(String cicodeval){
		this.cicodeval = cicodeval;
	}

	public void setCicdnm(String cicdnm){
		this.cicdnm = cicdnm;
	}

	public String getCicodeval(){
		return this.cicodeval;
	}

	public String getCicdnm(){
		return this.cicdnm;
	}
}

/* �ۼ��ð� : Fri Nov 10 13:16:56 KST 2006 */