/***************************************************************************************************
 * ���ϸ�   : SP_SS_L_CAMP_EXTN_INIT.java
 * ���     : ķ����Ȯ��
 * �ۼ����� : 2005/05/26
 * �ۼ���   : ����
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.camp.rec;

import java.sql.*;
import chosun.ciis.ss.sls.camp.dm.*;
import chosun.ciis.ss.sls.camp.ds.*;

/**
 * ķ����Ȯ��
 */

public class SS_L_CAMP_EXTN_INITCURDEPTCDRecord extends java.lang.Object implements java.io.Serializable{

	public String deptcd;
	public String boksnm;

	public SS_L_CAMP_EXTN_INITCURDEPTCDRecord(){}

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

/* �ۼ��ð� : Fri May 27 15:53:51 KST 2005 */