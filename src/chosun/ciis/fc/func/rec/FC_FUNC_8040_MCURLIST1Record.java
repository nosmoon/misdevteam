/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.fc.func.rec;

import java.sql.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.ds.*;

/**
 * 
 */


public class FC_FUNC_8040_MCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String cd_abrv_nm;
	public String cd;

	public FC_FUNC_8040_MCURLIST1Record(){}

	public void setCd_abrv_nm(String cd_abrv_nm){
		this.cd_abrv_nm = cd_abrv_nm;
	}

	public void setCd(String cd){
		this.cd = cd;
	}

	public String getCd_abrv_nm(){
		return this.cd_abrv_nm;
	}

	public String getCd(){
		return this.cd;
	}
}

/* �ۼ��ð� : Thu Apr 09 15:11:08 KST 2009 */