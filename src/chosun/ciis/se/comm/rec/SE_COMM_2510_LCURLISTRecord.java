/***************************************************************************************************
* ���ϸ� : SE_COMM_2510_LCURLISTRecord.java
* ��� :  ���� �˾�
* �ۼ����� : 2009.06.10
* �ۼ��� :   �����
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.se.comm.rec;

import java.sql.*;
import chosun.ciis.se.comm.dm.*;
import chosun.ciis.se.comm.ds.*;

/**
 * 
 */


public class SE_COMM_2510_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String sect_cd		;
	public String sect_nm		;
	public String cd_abrv_nm	;
	
	public SE_COMM_2510_LCURLISTRecord(){}
	
	public String getCd_abrv_nm() {
		return cd_abrv_nm;
	}

	public void setCd_abrv_nm(String cd_abrv_nm) {
		this.cd_abrv_nm = cd_abrv_nm;
	}

	public String getSect_cd() {
		return sect_cd;
	}

	public void setSect_cd(String sect_cd) {
		this.sect_cd = sect_cd;
	}

	public String getSect_nm() {
		return sect_nm;
	}

	public void setSect_nm(String sect_nm) {
		this.sect_nm = sect_nm;
	}

	

	
}

/* �ۼ��ð� : Wed Feb 18 09:12:20 KST 2009 */