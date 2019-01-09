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


package chosun.ciis.sp.sup.rec;

import java.sql.*;
import chosun.ciis.sp.sup.dm.*;
import chosun.ciis.sp.sup.ds.*;

/**
 * 
 */


public class SP_SUP_1110_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String sort;
	public String chrg_pers_nm;
	public String chrg_pers;
	public String rslt_110;
	public String rslt_111;
	public String rslt_120;
	public String rslt_121;
	public String rslt_122;
	public String rslt_130;
	public String rslt_131;
	public String rslt_132;
	public String rslt_133;
	public String rslt_134;
	public String rslt_140;
	public String rslt_141;
	public String rslt_142;

	public SP_SUP_1110_LCURLISTRecord(){}

	public void setSort(String sort){
		this.sort = sort;
	}

	public void setChrg_pers_nm(String chrg_pers_nm){
		this.chrg_pers_nm = chrg_pers_nm;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setRslt_110(String rslt_110){
		this.rslt_110 = rslt_110;
	}

	public void setRslt_111(String rslt_111){
		this.rslt_111 = rslt_111;
	}

	public void setRslt_120(String rslt_120){
		this.rslt_120 = rslt_120;
	}

	public void setRslt_121(String rslt_121){
		this.rslt_121 = rslt_121;
	}

	public void setRslt_122(String rslt_122){
		this.rslt_122 = rslt_122;
	}

	public void setRslt_130(String rslt_130){
		this.rslt_130 = rslt_130;
	}

	public void setRslt_131(String rslt_131){
		this.rslt_131 = rslt_131;
	}

	public void setRslt_132(String rslt_132){
		this.rslt_132 = rslt_132;
	}

	public void setRslt_133(String rslt_133){
		this.rslt_133 = rslt_133;
	}

	public void setRslt_134(String rslt_134){
		this.rslt_134 = rslt_134;
	}

	public void setRslt_140(String rslt_140){
		this.rslt_140 = rslt_140;
	}

	public void setRslt_141(String rslt_141){
		this.rslt_141 = rslt_141;
	}

	public void setRslt_142(String rslt_142){
		this.rslt_142 = rslt_142;
	}

	public String getSort(){
		return this.sort;
	}

	public String getChrg_pers_nm(){
		return this.chrg_pers_nm;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getRslt_110(){
		return this.rslt_110;
	}

	public String getRslt_111(){
		return this.rslt_111;
	}

	public String getRslt_120(){
		return this.rslt_120;
	}

	public String getRslt_121(){
		return this.rslt_121;
	}

	public String getRslt_122(){
		return this.rslt_122;
	}

	public String getRslt_130(){
		return this.rslt_130;
	}

	public String getRslt_131(){
		return this.rslt_131;
	}

	public String getRslt_132(){
		return this.rslt_132;
	}

	public String getRslt_133(){
		return this.rslt_133;
	}

	public String getRslt_134(){
		return this.rslt_134;
	}

	public String getRslt_140(){
		return this.rslt_140;
	}

	public String getRslt_141(){
		return this.rslt_141;
	}

	public String getRslt_142(){
		return this.rslt_142;
	}
}

/* 작성시간 : Thu Jul 05 13:11:19 KST 2012 */