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


package chosun.ciis.is.snd.rec;

import java.sql.*;
import chosun.ciis.is.snd.dm.*;
import chosun.ciis.is.snd.ds.*;

/**
 * 
 */


public class IS_SND_1220_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String cmpy_cd_nm;
	public String asnt_dstc_cd;
	public String asnt_dstc_cd_nm;

	public IS_SND_1220_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setCmpy_cd_nm(String cmpy_cd_nm){
		this.cmpy_cd_nm = cmpy_cd_nm;
	}

	public void setAsnt_dstc_cd(String asnt_dstc_cd){
		this.asnt_dstc_cd = asnt_dstc_cd;
	}

	public void setAsnt_dstc_cd_nm(String asnt_dstc_cd_nm){
		this.asnt_dstc_cd_nm = asnt_dstc_cd_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getCmpy_cd_nm(){
		return this.cmpy_cd_nm;
	}

	public String getAsnt_dstc_cd(){
		return this.asnt_dstc_cd;
	}

	public String getAsnt_dstc_cd_nm(){
		return this.asnt_dstc_cd_nm;
	}
}

/* �ۼ��ð� : Tue May 29 14:49:29 KST 2012 */