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


package chosun.ciis.co.dlco.rec;

import java.sql.*;
import chosun.ciis.co.dlco.dm.*;
import chosun.ciis.co.dlco.ds.*;

/**
 * 
 */


public class CO_DLCO_1004_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String sys_clsf_1;
	public String sys_clsf_2;
	public String sys_clsf_3;
	public String sys_clsf_4;

	public CO_DLCO_1004_LCURLISTRecord(){}

	public void setSys_clsf_1(String sys_clsf_1){
		this.sys_clsf_1 = sys_clsf_1;
	}

	public void setSys_clsf_2(String sys_clsf_2){
		this.sys_clsf_2 = sys_clsf_2;
	}

	public void setSys_clsf_3(String sys_clsf_3){
		this.sys_clsf_3 = sys_clsf_3;
	}

	public void setSys_clsf_4(String sys_clsf_4){
		this.sys_clsf_4 = sys_clsf_4;
	}

	public String getSys_clsf_1(){
		return this.sys_clsf_1;
	}

	public String getSys_clsf_2(){
		return this.sys_clsf_2;
	}

	public String getSys_clsf_3(){
		return this.sys_clsf_3;
	}

	public String getSys_clsf_4(){
		return this.sys_clsf_4;
	}
}

/* 작성시간 : Mon Apr 06 16:46:20 KST 2009 */