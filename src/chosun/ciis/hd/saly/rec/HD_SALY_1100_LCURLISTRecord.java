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


package chosun.ciis.hd.saly.rec;

import java.sql.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.ds.*;

/**
 * 
 */


public class HD_SALY_1100_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String job_clsf_nm;
	public String proc_stat_nm;
	public String end_dt_tm;

	public HD_SALY_1100_LCURLISTRecord(){}

	public void setJob_clsf_nm(String job_clsf_nm){
		this.job_clsf_nm = job_clsf_nm;
	}

	public void setProc_stat_nm(String proc_stat_nm){
		this.proc_stat_nm = proc_stat_nm;
	}

	public void setEnd_dt_tm(String end_dt_tm){
		this.end_dt_tm = end_dt_tm;
	}

	public String getJob_clsf_nm(){
		return this.job_clsf_nm;
	}

	public String getProc_stat_nm(){
		return this.proc_stat_nm;
	}

	public String getEnd_dt_tm(){
		return this.end_dt_tm;
	}
}

/* �ۼ��ð� : Wed Apr 22 19:21:05 KST 2009 */