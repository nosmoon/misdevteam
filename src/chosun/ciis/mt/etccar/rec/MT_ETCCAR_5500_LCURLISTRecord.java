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


package chosun.ciis.mt.etccar.rec;

import java.sql.*;
import chosun.ciis.mt.etccar.dm.*;
import chosun.ciis.mt.etccar.ds.*;

/**
 * 
 */


public class MT_ETCCAR_5500_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dept_nm;
	public String driv_tm;
	public String driv_dist;

	public MT_ETCCAR_5500_LCURLISTRecord(){}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setDriv_tm(String driv_tm){
		this.driv_tm = driv_tm;
	}

	public void setDriv_dist(String driv_dist){
		this.driv_dist = driv_dist;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getDriv_tm(){
		return this.driv_tm;
	}

	public String getDriv_dist(){
		return this.driv_dist;
	}
}

/* 작성시간 : Tue Sep 08 20:24:34 KST 2009 */