/***************************************************************************************************
* 파일명 : SE_BAS_1110_LCURLISTRecord.java
* 기능 :  판매 - 기준정보 - 지역관리 
 * 작성일자 : 2009.01.15
 * 작성자 :   김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.bas.rec;

import java.sql.*;
import chosun.ciis.se.bas.dm.*;
import chosun.ciis.se.bas.ds.*;

/**
 * 
 */


public class SE_BAS_1110_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd		;
	public String area_cd		;
	public String area_nm		;
	public String sido_cd		;
	public String sido_nm		;
	public String chrg_pers		;
	public String flnm			;
	public String dept_nm		;
	public String dept_cd		;
	public String use_yn		;
	public String acct_sido_cd	;
	public String acct_sido_nm	;
	public String sell_sido_cd	;
	public String sell_sido_nm	;
	public String sell_srt_col	;
	public String area_cd_key	;
	
	public String getArea_cd_key() {
		return area_cd_key;
	}

	public void setArea_cd_key(String area_cd_key) {
		this.area_cd_key = area_cd_key;
	}

	public String getUse_yn() {
		return use_yn;
	}

	public void setUse_yn(String use_yn) {
		this.use_yn = use_yn;
	}

	public SE_BAS_1110_LCURLISTRecord(){}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setSido_cd(String sido_cd){
		this.sido_cd = sido_cd;
	}

	public void setSido_nm(String sido_nm){
		this.sido_nm = sido_nm;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getSido_cd(){
		return this.sido_cd;
	}

	public String getSido_nm(){
		return this.sido_nm;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getCmpy_cd() {
		return cmpy_cd;
	}

	public void setCmpy_cd(String cmpy_cd) {
		this.cmpy_cd = cmpy_cd;
	}

	public String getDept_cd() {
		return dept_cd;
	}

	public void setDept_cd(String dept_cd) {
		this.dept_cd = dept_cd;
	}

	public String getAcct_sido_cd() {
		return acct_sido_cd;
	}

	public void setAcct_sido_cd(String acct_sido_cd) {
		this.acct_sido_cd = acct_sido_cd;
	}

	public String getAcct_sido_nm() {
		return acct_sido_nm;
	}

	public void setAcct_sido_nm(String acct_sido_nm) {
		this.acct_sido_nm = acct_sido_nm;
	}

	public String getSell_sido_cd() {
		return sell_sido_cd;
	}

	public void setSell_sido_cd(String sell_sido_cd) {
		this.sell_sido_cd = sell_sido_cd;
	}

	public String getSell_sido_nm() {
		return sell_sido_nm;
	}

	public void setSell_sido_nm(String sell_sido_nm) {
		this.sell_sido_nm = sell_sido_nm;
	}

	public String getSell_srt_col() {
		return sell_srt_col;
	}

	public void setSell_srt_col(String sell_srt_col) {
		this.sell_srt_col = sell_srt_col;
	}
}

/* 작성시간 : Tue Jan 13 18:16:18 KST 2009 */