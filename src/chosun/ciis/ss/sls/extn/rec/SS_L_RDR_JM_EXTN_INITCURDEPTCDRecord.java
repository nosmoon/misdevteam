/***************************************************************************************************
 * ���ϸ�   : SP_SS_L_RDR_JM_EXTN_INIT
 * ���     : Ȯ����Ȳ-����Ȯ�� ��û��Ȳ
 * �ۼ����� : 2007/11/17
 * �ۼ���   : ����
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
**  SP_SS_L_RDR_JM_EXTN_INIT
**/

public class SS_L_RDR_JM_EXTN_INITCURDEPTCDRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String boksnm;

	public SS_L_RDR_JM_EXTN_INITCURDEPTCDRecord(){}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setBoksnm(String boksnm){
		this.boksnm = boksnm;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getBoksnm(){
		return this.boksnm;
	}
}

/* �ۼ��ð� : Fri Nov 16 14:26:43 KST 2007 */