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


public class HD_EVLU_2452_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String evlu_yy;
	public String tms_clsf;
	public String emp_no;
	public String flnm;
	public String seq;
	public String evlu_grp_cd;
	public String busn_rslt_scor;

	public HD_EVLU_2452_LCURLISTRecord(){}

	public void setEvlu_yy(String evlu_yy){
		this.evlu_yy = evlu_yy;
	}

	public void setTms_clsf(String tms_clsf){
		this.tms_clsf = tms_clsf;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setEvlu_grp_cd(String evlu_grp_cd){
		this.evlu_grp_cd = evlu_grp_cd;
	}

	public void setBusn_rslt_scor(String busn_rslt_scor){
		this.busn_rslt_scor = busn_rslt_scor;
	}

	public String getEvlu_yy(){
		return this.evlu_yy;
	}

	public String getTms_clsf(){
		return this.tms_clsf;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getEvlu_grp_cd(){
		return this.evlu_grp_cd;
	}

	public String getBusn_rslt_scor(){
		return this.busn_rslt_scor;
	}
}

/* �ۼ��ð� : Fri Jul 25 18:22:44 KST 2014 */