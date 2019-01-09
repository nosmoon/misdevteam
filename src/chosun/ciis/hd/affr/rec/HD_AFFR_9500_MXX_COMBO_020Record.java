/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.affr.rec;

import java.sql.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.ds.*;

/**
 * 
 */


public class HD_AFFR_9500_MXX_COMBO_020Record extends java.lang.Object implements java.io.Serializable{

	public String cd_nm;
	public String cd;

	public HD_AFFR_9500_MXX_COMBO_020Record(){}

	public void setCd_nm(String cd_nm){
		this.cd_nm = cd_nm;
	}

	public void setCd(String cd){
		this.cd = cd;
	}

	public String getCd_nm(){
		return this.cd_nm;
	}

	public String getCd(){
		return this.cd;
	}
}

/* 작성시간 : Fri Aug 25 14:02:44 KST 2017 */