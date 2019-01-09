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


package chosun.ciis.mt.papord.rec;

import java.sql.*;
import chosun.ciis.mt.papord.dm.*;
import chosun.ciis.mt.papord.ds.*;

/**
 * 
 */


public class MT_PAPORD_8101_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String fac_clsf;
	public String papcmpy_cd;
	public String papcmpy_clsf;
	public String fac_clsf_nm;
	public String papcmpy_nm;
	public String d1;
	public String d2;
	public String d3;
	public String d4;
	public String d5;
	public String d6;
	public String d7;

	public MT_PAPORD_8101_LCURLISTRecord(){}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setPapcmpy_cd(String papcmpy_cd){
		this.papcmpy_cd = papcmpy_cd;
	}

	public void setPapcmpy_clsf(String papcmpy_clsf){
		this.papcmpy_clsf = papcmpy_clsf;
	}

	public void setFac_clsf_nm(String fac_clsf_nm){
		this.fac_clsf_nm = fac_clsf_nm;
	}

	public void setPapcmpy_nm(String papcmpy_nm){
		this.papcmpy_nm = papcmpy_nm;
	}

	public void setD1(String d1){
		this.d1 = d1;
	}

	public void setD2(String d2){
		this.d2 = d2;
	}

	public void setD3(String d3){
		this.d3 = d3;
	}

	public void setD4(String d4){
		this.d4 = d4;
	}

	public void setD5(String d5){
		this.d5 = d5;
	}

	public void setD6(String d6){
		this.d6 = d6;
	}

	public void setD7(String d7){
		this.d7 = d7;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getPapcmpy_cd(){
		return this.papcmpy_cd;
	}

	public String getPapcmpy_clsf(){
		return this.papcmpy_clsf;
	}

	public String getFac_clsf_nm(){
		return this.fac_clsf_nm;
	}

	public String getPapcmpy_nm(){
		return this.papcmpy_nm;
	}

	public String getD1(){
		return this.d1;
	}

	public String getD2(){
		return this.d2;
	}

	public String getD3(){
		return this.d3;
	}

	public String getD4(){
		return this.d4;
	}

	public String getD5(){
		return this.d5;
	}

	public String getD6(){
		return this.d6;
	}

	public String getD7(){
		return this.d7;
	}
}

/* 작성시간 : Thu Jun 30 17:24:33 KST 2016 */