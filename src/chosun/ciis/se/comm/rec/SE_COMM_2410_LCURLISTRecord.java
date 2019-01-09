/***************************************************************************************************
* 파일명 : SE_COMM_2410_MCURLISTRecord.java
* 기능 :  수송업자 팝업
* 작성일자 : 2009.06.09
* 작성자 :   김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.comm.rec;

import java.sql.*;
import chosun.ciis.se.comm.dm.*;
import chosun.ciis.se.comm.ds.*;

/**
 * 
 */


public class SE_COMM_2410_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String route_clsf            ;
	public String tran_cmpy_cd			;
	public String tran_cmpy_nm			;
	public String tran_uprc_clas        ;
	public String tran_uprc_cd          ;
	public String tran_uprc_route_nm    ;
	public String prt_plac_cd           ;
	public String medi_cd               ;
	public String sect_cd               ;
	public String sect_nm				;
	public String pay_tran_uprc         ;
	public String work_dds              ;
	public String pay_tran_cost         ;
	public String dlco_no               ;
	public String dlco_clsf             ;
	public String tran_uprc_qty_clsf    ;
	public String cntr_dt               ;
	public String cctr_dt               ;
	public String ern                   ;
	public String bank_cd               ;
	public String acct_no               ;
	public String zip                   ;
	public String addr                  ;
	public String dtls_addr             ;
	public String tel_no                ;
	public String car_no                ;

	public SE_COMM_2410_LCURLISTRecord(){}

	public String getAcct_no() {
		return acct_no;
	}

	public void setAcct_no(String acct_no) {
		this.acct_no = acct_no;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getCar_no() {
		return car_no;
	}

	public void setCar_no(String car_no) {
		this.car_no = car_no;
	}

	public String getCctr_dt() {
		return cctr_dt;
	}

	public void setCctr_dt(String cctr_dt) {
		this.cctr_dt = cctr_dt;
	}

	public String getCntr_dt() {
		return cntr_dt;
	}

	public void setCntr_dt(String cntr_dt) {
		this.cntr_dt = cntr_dt;
	}

	public String getDlco_clsf() {
		return dlco_clsf;
	}

	public void setDlco_clsf(String dlco_clsf) {
		this.dlco_clsf = dlco_clsf;
	}

	public String getDlco_no() {
		return dlco_no;
	}

	public void setDlco_no(String dlco_no) {
		this.dlco_no = dlco_no;
	}

	public String getDtls_addr() {
		return dtls_addr;
	}

	public void setDtls_addr(String dtls_addr) {
		this.dtls_addr = dtls_addr;
	}

	public String getErn() {
		return ern;
	}

	public void setErn(String ern) {
		this.ern = ern;
	}

	public String getWork_dds() {
		return work_dds;
	}

	public void setWork_dds(String work_dds) {
		this.work_dds = work_dds;
	}

	public String getMedi_cd() {
		return medi_cd;
	}

	public void setMedi_cd(String medi_cd) {
		this.medi_cd = medi_cd;
	}

	public String getPay_tran_cost() {
		return pay_tran_cost;
	}

	public void setPay_tran_cost(String pay_tran_cost) {
		this.pay_tran_cost = pay_tran_cost;
	}

	public String getPrt_plac_cd() {
		return prt_plac_cd;
	}

	public void setPrt_plac_cd(String prt_plac_cd) {
		this.prt_plac_cd = prt_plac_cd;
	}

	public String getRoute_clsf() {
		return route_clsf;
	}

	public void setRoute_clsf(String route_clsf) {
		this.route_clsf = route_clsf;
	}

	public String getSect_cd() {
		return sect_cd;
	}

	public void setSect_cd(String sect_cd) {
		this.sect_cd = sect_cd;
	}

	public String getBank_cd() {
		return bank_cd;
	}

	public void setBank_cd(String bank_cd) {
		this.bank_cd = bank_cd;
	}

	public String getTel_no() {
		return tel_no;
	}

	public void setTel_no(String tel_no) {
		this.tel_no = tel_no;
	}

	public String getPay_tran_uprc() {
		return pay_tran_uprc;
	}

	public void setPay_tran_uprc(String pay_tran_uprc) {
		this.pay_tran_uprc = pay_tran_uprc;
	}

	public String getTran_uprc_cd() {
		return tran_uprc_cd;
	}

	public void setTran_uprc_cd(String tran_uprc_cd) {
		this.tran_uprc_cd = tran_uprc_cd;
	}

	public String getTran_uprc_clas() {
		return tran_uprc_clas;
	}

	public void setTran_uprc_clas(String tran_uprc_clas) {
		this.tran_uprc_clas = tran_uprc_clas;
	}

	public String getTran_uprc_qty_clsf() {
		return tran_uprc_qty_clsf;
	}

	public void setTran_uprc_qty_clsf(String tran_uprc_qty_clsf) {
		this.tran_uprc_qty_clsf = tran_uprc_qty_clsf;
	}

	public String getTran_uprc_route_nm() {
		return tran_uprc_route_nm;
	}

	public void setTran_uprc_route_nm(String tran_uprc_route_nm) {
		this.tran_uprc_route_nm = tran_uprc_route_nm;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getTran_cmpy_cd() {
		return tran_cmpy_cd;
	}

	public void setTran_cmpy_cd(String tran_cmpy_cd) {
		this.tran_cmpy_cd = tran_cmpy_cd;
	}

	public String getTran_cmpy_nm() {
		return tran_cmpy_nm;
	}

	public void setTran_cmpy_nm(String tran_cmpy_nm) {
		this.tran_cmpy_nm = tran_cmpy_nm;
	}

	public String getSect_nm() {
		return sect_nm;
	}

	public void setSect_nm(String sect_nm) {
		this.sect_nm = sect_nm;
	}


}

/* 작성시간 : Wed Feb 18 09:12:20 KST 2009 */