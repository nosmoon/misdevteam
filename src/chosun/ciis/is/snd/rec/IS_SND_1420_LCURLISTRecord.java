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


public class IS_SND_1420_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String asnt_dstc_cd_nm;
	public String advcs_cd_nm;
	public String std_cd_nm;
	public String qunt;

	public IS_SND_1420_LCURLISTRecord(){}

	public void setAsnt_dstc_cd_nm(String asnt_dstc_cd_nm){
		this.asnt_dstc_cd_nm = asnt_dstc_cd_nm;
	}

	public void setAdvcs_cd_nm(String advcs_cd_nm){
		this.advcs_cd_nm = advcs_cd_nm;
	}

	public void setStd_cd_nm(String std_cd_nm){
		this.std_cd_nm = std_cd_nm;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public String getAsnt_dstc_cd_nm(){
		return this.asnt_dstc_cd_nm;
	}

	public String getAdvcs_cd_nm(){
		return this.advcs_cd_nm;
	}

	public String getStd_cd_nm(){
		return this.std_cd_nm;
	}

	public String getQunt(){
		return this.qunt;
	}
}

/* �ۼ��ð� : Fri May 25 16:02:57 KST 2012 */