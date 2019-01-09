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


package chosun.ciis.hd.evlu.rec;

import java.sql.*;
import chosun.ciis.hd.evlu.dm.*;
import chosun.ciis.hd.evlu.ds.*;

/**
 * 
 */


public class HD_EVLU_2801_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String prz_pnsh_nm;
	public String case_nm;
	public String point;

	public HD_EVLU_2801_LCURLISTRecord(){}

	public void setPrz_pnsh_nm(String prz_pnsh_nm){
		this.prz_pnsh_nm = prz_pnsh_nm;
	}

	public void setCase_nm(String case_nm){
		this.case_nm = case_nm;
	}

	public void setPoint(String point){
		this.point = point;
	}

	public String getPrz_pnsh_nm(){
		return this.prz_pnsh_nm;
	}

	public String getCase_nm(){
		return this.case_nm;
	}

	public String getPoint(){
		return this.point;
	}
}

/* 작성시간 : Wed Mar 26 13:48:47 KST 2014 */