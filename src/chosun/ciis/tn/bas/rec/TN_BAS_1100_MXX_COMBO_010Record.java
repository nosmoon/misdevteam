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


package chosun.ciis.tn.bas.rec;

import java.sql.*;
import chosun.ciis.tn.bas.dm.*;
import chosun.ciis.tn.bas.ds.*;

/**
 * 
 */


public class TN_BAS_1100_MXX_COMBO_010Record extends java.lang.Object implements java.io.Serializable{

	public String cd;
	public String cd_nm;

	public TN_BAS_1100_MXX_COMBO_010Record(){}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCd_nm(String cd_nm){
		this.cd_nm = cd_nm;
	}

	public String getCd(){
		return this.cd;
	}

	public String getCd_nm(){
		return this.cd_nm;
	}
}

/* 작성시간 : Wed Jun 22 18:08:39 KST 2016 */