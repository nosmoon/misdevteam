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


package chosun.ciis.hd.srch.rec;

import java.sql.*;
import chosun.ciis.hd.srch.dm.*;
import chosun.ciis.hd.srch.ds.*;

/**
 * 
 */


public class HD_SRCH_1601_LCURLIST4Record extends java.lang.Object implements java.io.Serializable{

	public String prz_pnsh_nm;
	public String main_insp_dt;
	public String prz_resn_nm;
	public String prv_insp_resn;

	public HD_SRCH_1601_LCURLIST4Record(){}

	public void setPrz_pnsh_nm(String prz_pnsh_nm){
		this.prz_pnsh_nm = prz_pnsh_nm;
	}

	public void setMain_insp_dt(String main_insp_dt){
		this.main_insp_dt = main_insp_dt;
	}

	public void setPrz_resn_nm(String prz_resn_nm){
		this.prz_resn_nm = prz_resn_nm;
	}

	public void setPrv_insp_resn(String prv_insp_resn){
		this.prv_insp_resn = prv_insp_resn;
	}

	public String getPrz_pnsh_nm(){
		return this.prz_pnsh_nm;
	}

	public String getMain_insp_dt(){
		return this.main_insp_dt;
	}

	public String getPrz_resn_nm(){
		return this.prz_resn_nm;
	}

	public String getPrv_insp_resn(){
		return this.prv_insp_resn;
	}
}

/* 작성시간 : Thu Oct 08 18:16:01 KST 2009 */