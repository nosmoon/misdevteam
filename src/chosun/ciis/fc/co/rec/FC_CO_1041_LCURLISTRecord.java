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


package chosun.ciis.fc.co.rec;

import java.sql.*;
import chosun.ciis.fc.co.dm.*;
import chosun.ciis.fc.co.ds.*;

/**
 * 
 */


public class FC_CO_1041_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String seci_clsf_cd;
	public String seci_no;
	public String comp_dt;
	public String mtry_dt;
	public String face_val_amt;
	public String seci_clsf_cd1;

	public FC_CO_1041_LCURLISTRecord(){}

	public void setSeci_clsf_cd(String seci_clsf_cd){
		this.seci_clsf_cd = seci_clsf_cd;
	}

	public void setSeci_no(String seci_no){
		this.seci_no = seci_no;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setFace_val_amt(String face_val_amt){
		this.face_val_amt = face_val_amt;
	}

	public void setSeci_clsf_cd1(String seci_clsf_cd1){
		this.seci_clsf_cd1 = seci_clsf_cd1;
	}

	public String getSeci_clsf_cd(){
		return this.seci_clsf_cd;
	}

	public String getSeci_no(){
		return this.seci_no;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getFace_val_amt(){
		return this.face_val_amt;
	}

	public String getSeci_clsf_cd1(){
		return this.seci_clsf_cd1;
	}
}

/* �ۼ��ð� : Sat Apr 11 18:11:36 KST 2009 */