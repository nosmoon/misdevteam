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


package chosun.ciis.co.job.rec;

import java.sql.*;
import chosun.ciis.co.job.dm.*;
import chosun.ciis.co.job.ds.*;

/**
 * 
 */


public class CO_JOB_1080_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rmsg_pers;
	public String cd_list;
	public String nm_list;
	public String ptph_no;

	public CO_JOB_1080_LCURLISTRecord(){}

	public void setRmsg_pers(String rmsg_pers){
		this.rmsg_pers = rmsg_pers;
	}

	public void setCd_list(String cd_list){
		this.cd_list = cd_list;
	}

	public void setNm_list(String nm_list){
		this.nm_list = nm_list;
	}

	public void setPtph_no(String ptph_no){
		this.ptph_no = ptph_no;
	}

	public String getRmsg_pers(){
		return this.rmsg_pers;
	}

	public String getCd_list(){
		return this.cd_list;
	}

	public String getNm_list(){
		return this.nm_list;
	}

	public String getPtph_no(){
		return this.ptph_no;
	}
}

/* �ۼ��ð� : Fri May 22 14:00:51 KST 2009 */