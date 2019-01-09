/***************************************************************************************************
* 파일명 :
* 기능 :
* 작성일자 : 2015-10-21
* 작성자 : 장 선 희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.ds.*;

/**
 *
 */


public class SL_MO_S_RDR_INFOREADERCURRecord extends java.lang.Object implements java.io.Serializable{

	public String rdr_no;
	public String dlvdstccd;
	public String dlvno;
	public String dlvintvno;
	public String dstcnm;
	public String dlvzip;
	public String dlvaddr;
	public String dlvdtlsaddr;
	public String dlvbnji;
	public String dlvcd;
	public String addrnm;
	public String dlvdong;
	public String dlvser_no;
	public int pyong;
	public String rdrnm;
	public String paty_clsfcd;
	public String rdrtel_no1;
	public String rdrtel_no2;
	public String rdrtel_no3;
	public String resitypecd;
	public String resiclsfcd;
	public String rdrptph_no1;
	public String rdrptph_no2;
	public String rdrptph_no3;
	public String dlvmthdcd;
	public String thrw_plac;
	public String bidt;
	public String lusoclsfcd;
	public String weddanvydt;
	public String email;
	public String prn;
	public String remk;
	public String etc_post;
	public String oldnewgb;
	public String bldmngnn;
	public String new_dlvaddr;
	public String new_jbdlvaddr_fst;
	public String new_jbdlvaddr_lst;
	public String temp_bldmngnn;
	public String temp_dlvzip;
	public String temp_dlvrdaddr;
	public String temp_dlvjbaddr;
	public String temp_dlvbnji;

	public SL_MO_S_RDR_INFOREADERCURRecord(){}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setDlvdstccd(String dlvdstccd){
		this.dlvdstccd = dlvdstccd;
	}

	public void setDlvno(String dlvno){
		this.dlvno = dlvno;
	}

	public void setDlvintvno(String dlvintvno){
		this.dlvintvno = dlvintvno;
	}

	public void setDstcnm(String dstcnm){
		this.dstcnm = dstcnm;
	}

	public void setDlvzip(String dlvzip){
		this.dlvzip = dlvzip;
	}

	public void setDlvaddr(String dlvaddr){
		this.dlvaddr = dlvaddr;
	}

	public void setDlvdtlsaddr(String dlvdtlsaddr){
		this.dlvdtlsaddr = dlvdtlsaddr;
	}

	public void setDlvbnji(String dlvbnji){
		this.dlvbnji = dlvbnji;
	}

	public void setDlvcd(String dlvcd){
		this.dlvcd = dlvcd;
	}

	public void setAddrnm(String addrnm){
		this.addrnm = addrnm;
	}

	public void setDlvdong(String dlvdong){
		this.dlvdong = dlvdong;
	}

	public void setDlvser_no(String dlvser_no){
		this.dlvser_no = dlvser_no;
	}

	public void setPyong(int pyong){
		this.pyong = pyong;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setPaty_clsfcd(String paty_clsfcd){
		this.paty_clsfcd = paty_clsfcd;
	}

	public void setRdrtel_no1(String rdrtel_no1){
		this.rdrtel_no1 = rdrtel_no1;
	}

	public void setRdrtel_no2(String rdrtel_no2){
		this.rdrtel_no2 = rdrtel_no2;
	}

	public void setRdrtel_no3(String rdrtel_no3){
		this.rdrtel_no3 = rdrtel_no3;
	}

	public void setResitypecd(String resitypecd){
		this.resitypecd = resitypecd;
	}

	public void setResiclsfcd(String resiclsfcd){
		this.resiclsfcd = resiclsfcd;
	}

	public void setRdrptph_no1(String rdrptph_no1){
		this.rdrptph_no1 = rdrptph_no1;
	}

	public void setRdrptph_no2(String rdrptph_no2){
		this.rdrptph_no2 = rdrptph_no2;
	}

	public void setRdrptph_no3(String rdrptph_no3){
		this.rdrptph_no3 = rdrptph_no3;
	}

	public void setDlvmthdcd(String dlvmthdcd){
		this.dlvmthdcd = dlvmthdcd;
	}

	public void setThrw_plac(String thrw_plac){
		this.thrw_plac = thrw_plac;
	}

	public void setBidt(String bidt){
		this.bidt = bidt;
	}

	public void setLusoclsfcd(String lusoclsfcd){
		this.lusoclsfcd = lusoclsfcd;
	}

	public void setWeddanvydt(String weddanvydt){
		this.weddanvydt = weddanvydt;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setEtc_post(String etc_post){
		this.etc_post = etc_post;
	}

	public void setOldnewgb(String oldnewgb){
		this.oldnewgb = oldnewgb;
	}

	public void setBldmngnn(String bldmngnn){
		this.bldmngnn = bldmngnn;
	}

	public void setNew_dlvaddr(String new_dlvaddr){
		this.new_dlvaddr = new_dlvaddr;
	}

	public void setNew_jbdlvaddr_fst(String new_jbdlvaddr_fst){
		this.new_jbdlvaddr_fst = new_jbdlvaddr_fst;
	}

	public void setNew_jbdlvaddr_lst(String new_jbdlvaddr_lst){
		this.new_jbdlvaddr_lst = new_jbdlvaddr_lst;
	}

	public void setTemp_bldmngnn(String temp_bldmngnn){
		this.temp_bldmngnn = temp_bldmngnn;
	}

	public void setTemp_dlvzip(String temp_dlvzip){
		this.temp_dlvzip = temp_dlvzip;
	}

	public void setTemp_dlvrdaddr(String temp_dlvrdaddr){
		this.temp_dlvrdaddr = temp_dlvrdaddr;
	}

	public void setTemp_dlvjbaddr(String temp_dlvjbaddr){
		this.temp_dlvjbaddr = temp_dlvjbaddr;
	}

	public void setTemp_dlvbnji(String temp_dlvbnji){
		this.temp_dlvbnji = temp_dlvbnji;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getDlvdstccd(){
		return this.dlvdstccd;
	}

	public String getDlvno(){
		return this.dlvno;
	}

	public String getDlvintvno(){
		return this.dlvintvno;
	}

	public String getDstcnm(){
		return this.dstcnm;
	}

	public String getDlvzip(){
		return this.dlvzip;
	}

	public String getDlvaddr(){
		return this.dlvaddr;
	}

	public String getDlvdtlsaddr(){
		return this.dlvdtlsaddr;
	}

	public String getDlvbnji(){
		return this.dlvbnji;
	}

	public String getDlvcd(){
		return this.dlvcd;
	}

	public String getAddrnm(){
		return this.addrnm;
	}

	public String getDlvdong(){
		return this.dlvdong;
	}

	public String getDlvser_no(){
		return this.dlvser_no;
	}

	public int getPyong(){
		return this.pyong;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getPaty_clsfcd(){
		return this.paty_clsfcd;
	}

	public String getRdrtel_no1(){
		return this.rdrtel_no1;
	}

	public String getRdrtel_no2(){
		return this.rdrtel_no2;
	}

	public String getRdrtel_no3(){
		return this.rdrtel_no3;
	}

	public String getResitypecd(){
		return this.resitypecd;
	}

	public String getResiclsfcd(){
		return this.resiclsfcd;
	}

	public String getRdrptph_no1(){
		return this.rdrptph_no1;
	}

	public String getRdrptph_no2(){
		return this.rdrptph_no2;
	}

	public String getRdrptph_no3(){
		return this.rdrptph_no3;
	}

	public String getDlvmthdcd(){
		return this.dlvmthdcd;
	}

	public String getThrw_plac(){
		return this.thrw_plac;
	}

	public String getBidt(){
		return this.bidt;
	}

	public String getLusoclsfcd(){
		return this.lusoclsfcd;
	}

	public String getWeddanvydt(){
		return this.weddanvydt;
	}

	public String getEmail(){
		return this.email;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getEtc_post(){
		return this.etc_post;
	}

	public String getOldnewgb(){
		return this.oldnewgb;
	}

	public String getBldmngnn(){
		return this.bldmngnn;
	}

	public String getNew_dlvaddr(){
		return this.new_dlvaddr;
	}

	public String getNew_jbdlvaddr_fst(){
		return this.new_jbdlvaddr_fst;
	}

	public String getNew_jbdlvaddr_lst(){
		return this.new_jbdlvaddr_lst;
	}

	public String getTemp_bldmngnn(){
		return this.temp_bldmngnn;
	}

	public String getTemp_dlvzip(){
		return this.temp_dlvzip;
	}

	public String getTemp_dlvrdaddr(){
		return this.temp_dlvrdaddr;
	}

	public String getTemp_dlvjbaddr(){
		return this.temp_dlvjbaddr;
	}

	public String getTemp_dlvbnji(){
		return this.temp_dlvbnji;
	}
}

/* 작성시간 : Mon Dec 05 11:41:10 KST 2016 */