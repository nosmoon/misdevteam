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


package chosun.ciis.hd.evlu.rec;

import java.sql.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.ds.*;

/**
 * 
 */


public class HD_EVLU_5401_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rnum;
	public String evlu_subj_cd;
	public String evlu_clon_cd;
	public String evlu_subj_cd_nm;

	public HD_EVLU_5401_LCURLISTRecord(){}

	public void setRnum(String rnum){
		this.rnum = rnum;
	}

	public void setEvlu_subj_cd(String evlu_subj_cd){
		this.evlu_subj_cd = evlu_subj_cd;
	}

	public void setEvlu_clon_cd(String evlu_clon_cd){
		this.evlu_clon_cd = evlu_clon_cd;
	}

	public void setEvlu_subj_cd_nm(String evlu_subj_cd_nm){
		this.evlu_subj_cd_nm = evlu_subj_cd_nm;
	}

	public String getRnum(){
		return this.rnum;
	}

	public String getEvlu_subj_cd(){
		return this.evlu_subj_cd;
	}

	public String getEvlu_clon_cd(){
		return this.evlu_clon_cd;
	}

	public String getEvlu_subj_cd_nm(){
		return this.evlu_subj_cd_nm;
	}
}

/* �ۼ��ð� : Thu Jun 04 10:33:11 KST 2009 */