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


package chosun.ciis.hd.dwnwrk.rec;

import java.sql.*;
import chosun.ciis.hd.dwnwrk.dm.*;
import chosun.ciis.hd.dwnwrk.ds.*;

/**
 * 
 */


public class HD_DWNWRK_1101_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String prsnt_tm;
	public String finish_dd_clsf;
	public String finish_dd_clsf_nm;
	public String finish_tm;

	public HD_DWNWRK_1101_LCURLISTRecord(){}

	public void setPrsnt_tm(String prsnt_tm){
		this.prsnt_tm = prsnt_tm;
	}

	public void setFinish_dd_clsf(String finish_dd_clsf){
		this.finish_dd_clsf = finish_dd_clsf;
	}

	public void setFinish_dd_clsf_nm(String finish_dd_clsf_nm){
		this.finish_dd_clsf_nm = finish_dd_clsf_nm;
	}

	public void setFinish_tm(String finish_tm){
		this.finish_tm = finish_tm;
	}

	public String getPrsnt_tm(){
		return this.prsnt_tm;
	}

	public String getFinish_dd_clsf(){
		return this.finish_dd_clsf;
	}

	public String getFinish_dd_clsf_nm(){
		return this.finish_dd_clsf_nm;
	}

	public String getFinish_tm(){
		return this.finish_tm;
	}
}

/* 작성시간 : Fri Apr 24 09:13:08 KST 2009 */