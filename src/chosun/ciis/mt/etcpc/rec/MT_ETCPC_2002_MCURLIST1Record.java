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


package chosun.ciis.mt.etcpc.rec;

import java.sql.*;
import chosun.ciis.mt.etcpc.dm.*;
import chosun.ciis.mt.etcpc.ds.*;

/**
 * 
 */


public class MT_ETCPC_2002_MCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String modl_mang_no;
	public String modl_nm;
	public String modl_kind;

	public MT_ETCPC_2002_MCURLIST1Record(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setModl_mang_no(String modl_mang_no){
		this.modl_mang_no = modl_mang_no;
	}

	public void setModl_nm(String modl_nm){
		this.modl_nm = modl_nm;
	}

	public void setModl_kind(String modl_kind){
		this.modl_kind = modl_kind;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getModl_mang_no(){
		return this.modl_mang_no;
	}

	public String getModl_nm(){
		return this.modl_nm;
	}

	public String getModl_kind(){
		return this.modl_kind;
	}
}

/* �ۼ��ð� : Mon Mar 23 20:40:17 KST 2009 */