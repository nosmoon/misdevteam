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


package chosun.ciis.pr.papmake.rec;

import java.sql.*;
import chosun.ciis.pr.papmake.dm.*;
import chosun.ciis.pr.papmake.ds.*;

/**
 * 
 */


public class PR_PAPMAKE_1031_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String duty_dt;
	public String fac_clsf;
	public String ref_clsf;
	public String ref_clsf_nm;
	public String seq;
	public String ref_matt;

	public PR_PAPMAKE_1031_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDuty_dt(String duty_dt){
		this.duty_dt = duty_dt;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setRef_clsf(String ref_clsf){
		this.ref_clsf = ref_clsf;
	}

	public void setRef_clsf_nm(String ref_clsf_nm){
		this.ref_clsf_nm = ref_clsf_nm;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setRef_matt(String ref_matt){
		this.ref_matt = ref_matt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDuty_dt(){
		return this.duty_dt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getRef_clsf(){
		return this.ref_clsf;
	}

	public String getRef_clsf_nm(){
		return this.ref_clsf_nm;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getRef_matt(){
		return this.ref_matt;
	}
}

/* �ۼ��ð� : Fri Jul 10 11:51:04 KST 2009 */