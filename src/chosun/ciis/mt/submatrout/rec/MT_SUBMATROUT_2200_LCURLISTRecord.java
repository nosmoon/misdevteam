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


package chosun.ciis.mt.submatrout.rec;

import java.sql.*;
import chosun.ciis.mt.submatrout.dm.*;
import chosun.ciis.mt.submatrout.ds.*;

/**
 * 
 */


public class MT_SUBMATROUT_2200_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String gb;
	public String bjcidat;
	public String jcjjcdnm;
	public String factcdnm;
	public String mov_qunt;
	public String mov_unit;
	public String mov_uprc;
	public String mov_amt;
	public String remk;

	public MT_SUBMATROUT_2200_LCURLISTRecord(){}

	public void setGb(String gb){
		this.gb = gb;
	}

	public void setBjcidat(String bjcidat){
		this.bjcidat = bjcidat;
	}

	public void setJcjjcdnm(String jcjjcdnm){
		this.jcjjcdnm = jcjjcdnm;
	}

	public void setFactcdnm(String factcdnm){
		this.factcdnm = factcdnm;
	}

	public void setMov_qunt(String mov_qunt){
		this.mov_qunt = mov_qunt;
	}

	public void setMov_unit(String mov_unit){
		this.mov_unit = mov_unit;
	}

	public void setMov_uprc(String mov_uprc){
		this.mov_uprc = mov_uprc;
	}

	public void setMov_amt(String mov_amt){
		this.mov_amt = mov_amt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getGb(){
		return this.gb;
	}

	public String getBjcidat(){
		return this.bjcidat;
	}

	public String getJcjjcdnm(){
		return this.jcjjcdnm;
	}

	public String getFactcdnm(){
		return this.factcdnm;
	}

	public String getMov_qunt(){
		return this.mov_qunt;
	}

	public String getMov_unit(){
		return this.mov_unit;
	}

	public String getMov_uprc(){
		return this.mov_uprc;
	}

	public String getMov_amt(){
		return this.mov_amt;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Sat Mar 28 16:50:29 KST 2009 */