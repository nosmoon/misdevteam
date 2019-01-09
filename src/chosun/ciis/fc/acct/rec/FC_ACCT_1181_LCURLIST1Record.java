/***************************************************************************************************
* 파일명 : .java
* 기능 :  거래처조회
* 작성일자 : 2010-01-22
* 작성자 : 노상현
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.fc.acct.rec;

import java.sql.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

/**
 *  거래처조회
 */


public class FC_ACCT_1181_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String clsf_cd;
	public String cd;
	public String cdnm;
	public String cd_abrv_nm;
	public String cdnm_cd;
	public String cdabrvnm_cd;
	public String intg_cd;
	public String intg_nm;
	public String presi_nm;
	public String bizcond;
	public String item;
	public String zip1;
	public String zip2;
	public String addr1;
	public String addr2;
	public String addr3;
	public String addr4;
	public String email;

	public FC_ACCT_1181_LCURLIST1Record(){}

	public void setClsf_cd(String clsf_cd){
		this.clsf_cd = clsf_cd;
	}

	public void setCd(String cd){
		this.cd = cd;
	}

	public void setCdnm(String cdnm){
		this.cdnm = cdnm;
	}

	public void setCd_abrv_nm(String cd_abrv_nm){
		this.cd_abrv_nm = cd_abrv_nm;
	}

	public void setCdnm_cd(String cdnm_cd){
		this.cdnm_cd = cdnm_cd;
	}

	public void setCdabrvnm_cd(String cdabrvnm_cd){
		this.cdabrvnm_cd = cdabrvnm_cd;
	}

	public void setIntg_cd(String intg_cd){
		this.intg_cd = intg_cd;
	}

	public void setIntg_nm(String intg_nm){
		this.intg_nm = intg_nm;
	}

	public void setPresi_nm(String presi_nm){
		this.presi_nm = presi_nm;
	}

	public void setBizcond(String bizcond){
		this.bizcond = bizcond;
	}

	public void setItem(String item){
		this.item = item;
	}

	public void setZip1(String zip1){
		this.zip1 = zip1;
	}

	public void setZip2(String zip2){
		this.zip2 = zip2;
	}

	public void setAddr1(String addr1){
		this.addr1 = addr1;
	}

	public void setAddr2(String addr2){
		this.addr2 = addr2;
	}

	public void setAddr3(String addr3){
		this.addr3 = addr3;
	}

	public void setAddr4(String addr4){
		this.addr4 = addr4;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getClsf_cd(){
		return this.clsf_cd;
	}

	public String getCd(){
		return this.cd;
	}

	public String getCdnm(){
		return this.cdnm;
	}

	public String getCd_abrv_nm(){
		return this.cd_abrv_nm;
	}

	public String getCdnm_cd(){
		return this.cdnm_cd;
	}

	public String getCdabrvnm_cd(){
		return this.cdabrvnm_cd;
	}

	public String getIntg_cd(){
		return this.intg_cd;
	}

	public String getIntg_nm(){
		return this.intg_nm;
	}

	public String getPresi_nm(){
		return this.presi_nm;
	}

	public String getBizcond(){
		return this.bizcond;
	}

	public String getItem(){
		return this.item;
	}

	public String getZip1(){
		return this.zip1;
	}

	public String getZip2(){
		return this.zip2;
	}

	public String getAddr1(){
		return this.addr1;
	}

	public String getAddr2(){
		return this.addr2;
	}

	public String getAddr3(){
		return this.addr3;
	}

	public String getAddr4(){
		return this.addr4;
	}

	public String getEmail(){
		return this.email;
	}
}

/* 작성시간 : Fri Jan 22 17:26:11 KST 2010 */