/***************************************************************************************************
* ���ϸ� : .java
* ��� : �ǸŽý���
* �ۼ����� : 2009-02-18
* �ۼ��� : ��â��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.co.work.rec;

import java.sql.*;
import chosun.ciis.co.work.dm.*;
import chosun.ciis.co.work.ds.*;

/**
 * 
 */


public class CO_WORK_1000_MJOBCLSFLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String job_clsf;
	public String job_clsf_nm;

	public CO_WORK_1000_MJOBCLSFLISTRecord(){}

	public void setJob_clsf(String job_clsf){
		this.job_clsf = job_clsf;
	}

	public void setJob_clsf_nm(String job_clsf_nm){
		this.job_clsf_nm = job_clsf_nm;
	}

	public String getJob_clsf(){
		return this.job_clsf;
	}

	public String getJob_clsf_nm(){
		return this.job_clsf_nm;
	}
}

/* �ۼ��ð� : Thu Jun 04 17:51:12 KST 2009 */