/***************************************************************************************************
* ���ϸ� : SL_L_APLC_NEWBANKCURRecord.java
* ��� : ������������(��ü��û�˾�-�űԽ�û �ʱ�ȭ)
* �ۼ����� : 2004-07-29
* �ۼ��� : �迵��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.ds.*;

/**
 * ������������(��ü��û�˾�-�űԽ�û �ʱ�ȭ)
 *
 */

public class SL_L_APLC_NEWBANKCURRecord extends java.lang.Object implements java.io.Serializable{

	public String cicodeval;
	public String cicdnm;

	public SL_L_APLC_NEWBANKCURRecord(){}

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

/* �ۼ��ð� : Fri Aug 06 20:41:47 KST 2004 */