/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.dtbas.rec;

import java.sql.*;
import chosun.ciis.hd.dtbas.dm.*;
import chosun.ciis.hd.dtbas.ds.*;

/**
 * 
 */


public class HD_DTBAS_1101_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String job_clsf;
	public String cd_clsf;
	public String cd;
	public String cdnm;
	public String cd_abrv_nm;

	public HD_DTBAS_1101_LCURLISTRecord(){}

	public void setJob_clsf(String job_clsf){
		this.job_clsf = job_clsf;
	}

	public void setCd_clsf(String cd_clsf){
		this.cd_clsf = cd_clsf;
	}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	public void setCd_abrv_nm(String cd_abrv_nm){
		this.cd_abrv_nm = cd_abrv_nm;
	}

	public String getJob_clsf(){
		return this.job_clsf;
	}

	public String getCd_clsf(){
		return this.cd_clsf;
	}

	public String getCd(){
		return this.cd;
	}

	public String getCdnm(){
		return this.cdnm;
	}

	public String getCd_abrv_nm(){
		return this.cd_abrv_nm;
	}
}

/* 작성시간 : Sat Feb 14 19:13:33 KST 2009 */