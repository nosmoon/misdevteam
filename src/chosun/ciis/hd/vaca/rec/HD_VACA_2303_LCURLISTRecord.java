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


package chosun.ciis.hd.vaca.rec;

import java.sql.*;
import chosun.ciis.hd.vaca.dm.*;
import chosun.ciis.hd.vaca.ds.*;

/**
 * 
 */


public class HD_VACA_2303_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String vaca_frdt;
	public String vaca_todt;
	public String vaca_dds;
	public String vaca_clsf_nm;
	public String vaca_dtls_clsf_nm;

	public HD_VACA_2303_LCURLISTRecord(){}

	public void setVaca_frdt(String vaca_frdt){
		this.vaca_frdt = vaca_frdt;
	}

	public void setVaca_todt(String vaca_todt){
		this.vaca_todt = vaca_todt;
	}

	public void setVaca_dds(String vaca_dds){
		this.vaca_dds = vaca_dds;
	}

	public void setVaca_clsf_nm(String vaca_clsf_nm){
		this.vaca_clsf_nm = vaca_clsf_nm;
	}

	public void setVaca_dtls_clsf_nm(String vaca_dtls_clsf_nm){
		this.vaca_dtls_clsf_nm = vaca_dtls_clsf_nm;
	}

	public String getVaca_frdt(){
		return this.vaca_frdt;
	}

	public String getVaca_todt(){
		return this.vaca_todt;
	}

	public String getVaca_dds(){
		return this.vaca_dds;
	}

	public String getVaca_clsf_nm(){
		return this.vaca_clsf_nm;
	}

	public String getVaca_dtls_clsf_nm(){
		return this.vaca_dtls_clsf_nm;
	}
}

/* 작성시간 : Wed Mar 18 09:57:15 KST 2015 */