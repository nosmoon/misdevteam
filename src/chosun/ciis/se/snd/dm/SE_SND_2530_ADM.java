/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.snd.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.snd.ds.*;
import chosun.ciis.se.snd.rec.*;

/**
 * 
 */


public class SE_SND_2530_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String reg_dt;
	public String reg_seq;
	public String tran_uprc_clas;
	public String pay_dt;
	public String send_yymm;
	public String send_frdt;
	public String send_todt;
	public String tot_amt;
	public String clos_yn;
	public String remk1;
	public String mode_sub;
	public String reg_dt_sub;
	public String reg_seq_sub;
	public String ptcr_seq;
	public String tran_cmpy_cd;
	public String tran_uprc_cd;
	public String tran_uprc_route_nm;
	public String route_clsf;
	public String route_cd;
	public String prt_plac_cd;
	public String medi_cd;
	public String sect_cd;
	public String tran_cmpy_nm;
	public String dlco_clsf;
	public String pay_mthd_clsf;
	public String stmt_clsf;
	public String stmt_no;
	public String elec_stmt_yn;
	public String elec_stmt_id;
	public String rcpt_clsf;
	public String stmt_dt;
	public String acct_no;
	public String std_tran_uprc;
	public String pay_tran_uprc;
	public String work_dds;
	public String pay_tran_cost;
	public String vat;
	public String car_no;
	public String eps_no;
	public String zip;
	public String addr;
	public String dtls_addr;
	public String tel_no;
	public String tran_uprc_clas_sub;
	public String bank_cd;
	public String remk2;
	public String grp_assctn_yn;
	public String incmg_pers_ip;
	public String incmg_pers;

	public SE_SND_2530_ADM(){}
	public SE_SND_2530_ADM(String cmpy_cd, String mode, String reg_dt, String reg_seq, String tran_uprc_clas, String pay_dt, String send_yymm, String send_frdt, String send_todt, String tot_amt, String clos_yn, String remk1, String mode_sub, String reg_dt_sub, String reg_seq_sub, String ptcr_seq, String tran_cmpy_cd, String tran_uprc_cd, String tran_uprc_route_nm, String route_clsf, String route_cd, String prt_plac_cd, String medi_cd, String sect_cd, String tran_cmpy_nm, String dlco_clsf, String pay_mthd_clsf, String stmt_clsf, String stmt_no, String elec_stmt_yn, String elec_stmt_id, String rcpt_clsf, String stmt_dt, String acct_no, String std_tran_uprc, String pay_tran_uprc, String work_dds, String pay_tran_cost, String vat, String car_no, String eps_no, String zip, String addr, String dtls_addr, String tel_no, String tran_uprc_clas_sub, String bank_cd, String remk2, String grp_assctn_yn, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.reg_dt = reg_dt;
		this.reg_seq = reg_seq;
		this.tran_uprc_clas = tran_uprc_clas;
		this.pay_dt = pay_dt;
		this.send_yymm = send_yymm;
		this.send_frdt = send_frdt;
		this.send_todt = send_todt;
		this.tot_amt = tot_amt;
		this.clos_yn = clos_yn;
		this.remk1 = remk1;
		this.mode_sub = mode_sub;
		this.reg_dt_sub = reg_dt_sub;
		this.reg_seq_sub = reg_seq_sub;
		this.ptcr_seq = ptcr_seq;
		this.tran_cmpy_cd = tran_cmpy_cd;
		this.tran_uprc_cd = tran_uprc_cd;
		this.tran_uprc_route_nm = tran_uprc_route_nm;
		this.route_clsf = route_clsf;
		this.route_cd = route_cd;
		this.prt_plac_cd = prt_plac_cd;
		this.medi_cd = medi_cd;
		this.sect_cd = sect_cd;
		this.tran_cmpy_nm = tran_cmpy_nm;
		this.dlco_clsf = dlco_clsf;
		this.pay_mthd_clsf = pay_mthd_clsf;
		this.stmt_clsf = stmt_clsf;
		this.stmt_no = stmt_no;
		this.elec_stmt_yn = elec_stmt_yn;
		this.elec_stmt_id = elec_stmt_id;
		this.rcpt_clsf = rcpt_clsf;
		this.stmt_dt = stmt_dt;
		this.acct_no = acct_no;
		this.std_tran_uprc = std_tran_uprc;
		this.pay_tran_uprc = pay_tran_uprc;
		this.work_dds = work_dds;
		this.pay_tran_cost = pay_tran_cost;
		this.vat = vat;
		this.car_no = car_no;
		this.eps_no = eps_no;
		this.zip = zip;
		this.addr = addr;
		this.dtls_addr = dtls_addr;
		this.tel_no = tel_no;
		this.tran_uprc_clas_sub = tran_uprc_clas_sub;
		this.bank_cd = bank_cd;
		this.remk2 = remk2;
		this.grp_assctn_yn = grp_assctn_yn;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setReg_dt(String reg_dt){
		this.reg_dt = reg_dt;
	}

	public void setReg_seq(String reg_seq){
		this.reg_seq = reg_seq;
	}

	public void setTran_uprc_clas(String tran_uprc_clas){
		this.tran_uprc_clas = tran_uprc_clas;
	}

	public void setPay_dt(String pay_dt){
		this.pay_dt = pay_dt;
	}

	public void setSend_yymm(String send_yymm){
		this.send_yymm = send_yymm;
	}

	public void setSend_frdt(String send_frdt){
		this.send_frdt = send_frdt;
	}

	public void setSend_todt(String send_todt){
		this.send_todt = send_todt;
	}

	public void setTot_amt(String tot_amt){
		this.tot_amt = tot_amt;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setRemk1(String remk1){
		this.remk1 = remk1;
	}

	public void setMode_sub(String mode_sub){
		this.mode_sub = mode_sub;
	}

	public void setReg_dt_sub(String reg_dt_sub){
		this.reg_dt_sub = reg_dt_sub;
	}

	public void setReg_seq_sub(String reg_seq_sub){
		this.reg_seq_sub = reg_seq_sub;
	}

	public void setPtcr_seq(String ptcr_seq){
		this.ptcr_seq = ptcr_seq;
	}

	public void setTran_cmpy_cd(String tran_cmpy_cd){
		this.tran_cmpy_cd = tran_cmpy_cd;
	}

	public void setTran_uprc_cd(String tran_uprc_cd){
		this.tran_uprc_cd = tran_uprc_cd;
	}

	public void setTran_uprc_route_nm(String tran_uprc_route_nm){
		this.tran_uprc_route_nm = tran_uprc_route_nm;
	}

	public void setRoute_clsf(String route_clsf){
		this.route_clsf = route_clsf;
	}

	public void setRoute_cd(String route_cd){
		this.route_cd = route_cd;
	}

	public void setPrt_plac_cd(String prt_plac_cd){
		this.prt_plac_cd = prt_plac_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setTran_cmpy_nm(String tran_cmpy_nm){
		this.tran_cmpy_nm = tran_cmpy_nm;
	}

	public void setDlco_clsf(String dlco_clsf){
		this.dlco_clsf = dlco_clsf;
	}

	public void setPay_mthd_clsf(String pay_mthd_clsf){
		this.pay_mthd_clsf = pay_mthd_clsf;
	}

	public void setStmt_clsf(String stmt_clsf){
		this.stmt_clsf = stmt_clsf;
	}

	public void setStmt_no(String stmt_no){
		this.stmt_no = stmt_no;
	}

	public void setElec_stmt_yn(String elec_stmt_yn){
		this.elec_stmt_yn = elec_stmt_yn;
	}

	public void setElec_stmt_id(String elec_stmt_id){
		this.elec_stmt_id = elec_stmt_id;
	}

	public void setRcpt_clsf(String rcpt_clsf){
		this.rcpt_clsf = rcpt_clsf;
	}

	public void setStmt_dt(String stmt_dt){
		this.stmt_dt = stmt_dt;
	}

	public void setAcct_no(String acct_no){
		this.acct_no = acct_no;
	}

	public void setStd_tran_uprc(String std_tran_uprc){
		this.std_tran_uprc = std_tran_uprc;
	}

	public void setPay_tran_uprc(String pay_tran_uprc){
		this.pay_tran_uprc = pay_tran_uprc;
	}

	public void setWork_dds(String work_dds){
		this.work_dds = work_dds;
	}

	public void setPay_tran_cost(String pay_tran_cost){
		this.pay_tran_cost = pay_tran_cost;
	}

	public void setVat(String vat){
		this.vat = vat;
	}

	public void setCar_no(String car_no){
		this.car_no = car_no;
	}

	public void setEps_no(String eps_no){
		this.eps_no = eps_no;
	}

	public void setZip(String zip){
		this.zip = zip;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setDtls_addr(String dtls_addr){
		this.dtls_addr = dtls_addr;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setTran_uprc_clas_sub(String tran_uprc_clas_sub){
		this.tran_uprc_clas_sub = tran_uprc_clas_sub;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setRemk2(String remk2){
		this.remk2 = remk2;
	}
	
	public void setGrp_assctn_yn(String grp_assctn_yn){
		this.grp_assctn_yn = grp_assctn_yn;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMode(){
		return this.mode;
	}

	public String getReg_dt(){
		return this.reg_dt;
	}

	public String getReg_seq(){
		return this.reg_seq;
	}

	public String getTran_uprc_clas(){
		return this.tran_uprc_clas;
	}

	public String getPay_dt(){
		return this.pay_dt;
	}

	public String getSend_yymm(){
		return this.send_yymm;
	}

	public String getSend_frdt(){
		return this.send_frdt;
	}

	public String getSend_todt(){
		return this.send_todt;
	}

	public String getTot_amt(){
		return this.tot_amt;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getRemk1(){
		return this.remk1;
	}

	public String getMode_sub(){
		return this.mode_sub;
	}

	public String getReg_dt_sub(){
		return this.reg_dt_sub;
	}

	public String getReg_seq_sub(){
		return this.reg_seq_sub;
	}

	public String getPtcr_seq(){
		return this.ptcr_seq;
	}

	public String getTran_cmpy_cd(){
		return this.tran_cmpy_cd;
	}

	public String getTran_uprc_cd(){
		return this.tran_uprc_cd;
	}

	public String getTran_uprc_route_nm(){
		return this.tran_uprc_route_nm;
	}

	public String getRoute_clsf(){
		return this.route_clsf;
	}

	public String getRoute_cd(){
		return this.route_cd;
	}

	public String getPrt_plac_cd(){
		return this.prt_plac_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getTran_cmpy_nm(){
		return this.tran_cmpy_nm;
	}

	public String getDlco_clsf(){
		return this.dlco_clsf;
	}

	public String getPay_mthd_clsf(){
		return this.pay_mthd_clsf;
	}

	public String getStmt_clsf(){
		return this.stmt_clsf;
	}

	public String getStmt_no(){
		return this.stmt_no;
	}

	public String getElec_stmt_yn(){
		return this.elec_stmt_yn;
	}

	public String getElec_stmt_id(){
		return this.elec_stmt_id;
	}

	public String getRcpt_clsf(){
		return this.rcpt_clsf;
	}

	public String getStmt_dt(){
		return this.stmt_dt;
	}

	public String getAcct_no(){
		return this.acct_no;
	}

	public String getStd_tran_uprc(){
		return this.std_tran_uprc;
	}

	public String getPay_tran_uprc(){
		return this.pay_tran_uprc;
	}

	public String getWork_dds(){
		return this.work_dds;
	}

	public String getPay_tran_cost(){
		return this.pay_tran_cost;
	}

	public String getVat(){
		return this.vat;
	}

	public String getCar_no(){
		return this.car_no;
	}

	public String getEps_no(){
		return this.eps_no;
	}

	public String getZip(){
		return this.zip;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getDtls_addr(){
		return this.dtls_addr;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getTran_uprc_clas_sub(){
		return this.tran_uprc_clas_sub;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getRemk2(){
		return this.remk2;
	}

	public String getGrp_assctn_yn(){
		return this.grp_assctn_yn;
	}
	
	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_SND_2530_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_SND_2530_ADM dm = (SE_SND_2530_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.reg_dt);
		cstmt.setString(6, dm.reg_seq);
		cstmt.setString(7, dm.tran_uprc_clas);
		cstmt.setString(8, dm.pay_dt);
		cstmt.setString(9, dm.send_yymm);
		cstmt.setString(10, dm.send_frdt);
		cstmt.setString(11, dm.send_todt);
		cstmt.setString(12, dm.tot_amt);
		cstmt.setString(13, dm.clos_yn);
		cstmt.setString(14, dm.remk1);
		cstmt.setString(15, dm.mode_sub);
		cstmt.setString(16, dm.reg_dt_sub);
		cstmt.setString(17, dm.reg_seq_sub);
		cstmt.setString(18, dm.ptcr_seq);
		cstmt.setString(19, dm.tran_cmpy_cd);
		cstmt.setString(20, dm.tran_uprc_cd);
		cstmt.setString(21, dm.tran_uprc_route_nm);
		cstmt.setString(22, dm.route_clsf);
		cstmt.setString(23, dm.route_cd);
		cstmt.setString(24, dm.prt_plac_cd);
		cstmt.setString(25, dm.medi_cd);
		cstmt.setString(26, dm.sect_cd);
		cstmt.setString(27, dm.tran_cmpy_nm);
		cstmt.setString(28, dm.dlco_clsf);
		cstmt.setString(29, dm.pay_mthd_clsf);
		cstmt.setString(30, dm.stmt_clsf);
		cstmt.setString(31, dm.stmt_no);
		cstmt.setString(32, dm.elec_stmt_yn);
		cstmt.setString(33, dm.elec_stmt_id);
		cstmt.setString(34, dm.rcpt_clsf);
		cstmt.setString(35, dm.stmt_dt);
		cstmt.setString(36, dm.acct_no);
		cstmt.setString(37, dm.std_tran_uprc);
		cstmt.setString(38, dm.pay_tran_uprc);
		cstmt.setString(39, dm.work_dds);
		cstmt.setString(40, dm.pay_tran_cost);
		cstmt.setString(41, dm.vat);
		cstmt.setString(42, dm.car_no);
		cstmt.setString(43, dm.eps_no);
		cstmt.setString(44, dm.zip);
		cstmt.setString(45, dm.addr);
		cstmt.setString(46, dm.dtls_addr);
		cstmt.setString(47, dm.tel_no);
		cstmt.setString(48, dm.tran_uprc_clas_sub);
		cstmt.setString(49, dm.bank_cd);
		cstmt.setString(50, dm.remk2);
		cstmt.setString(51, dm.grp_assctn_yn);
		cstmt.setString(52, dm.incmg_pers_ip);
		cstmt.setString(53, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.snd.ds.SE_SND_2530_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("reg_dt = [" + getReg_dt() + "]");
		System.out.println("reg_seq = [" + getReg_seq() + "]");
		System.out.println("tran_uprc_clas = [" + getTran_uprc_clas() + "]");
		System.out.println("pay_dt = [" + getPay_dt() + "]");
		System.out.println("send_yymm = [" + getSend_yymm() + "]");
		System.out.println("send_frdt = [" + getSend_frdt() + "]");
		System.out.println("send_todt = [" + getSend_todt() + "]");
		System.out.println("tot_amt = [" + getTot_amt() + "]");
		System.out.println("clos_yn = [" + getClos_yn() + "]");
		System.out.println("remk1 = [" + getRemk1() + "]");
		System.out.println("mode_sub = [" + getMode_sub() + "]");
		System.out.println("reg_dt_sub = [" + getReg_dt_sub() + "]");
		System.out.println("reg_seq_sub = [" + getReg_seq_sub() + "]");
		System.out.println("ptcr_seq = [" + getPtcr_seq() + "]");
		System.out.println("tran_cmpy_cd = [" + getTran_cmpy_cd() + "]");
		System.out.println("tran_uprc_cd = [" + getTran_uprc_cd() + "]");
		System.out.println("tran_uprc_route_nm = [" + getTran_uprc_route_nm() + "]");
		System.out.println("route_clsf = [" + getRoute_clsf() + "]");
		System.out.println("route_cd = [" + getRoute_cd() + "]");
		System.out.println("prt_plac_cd = [" + getPrt_plac_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("sect_cd = [" + getSect_cd() + "]");
		System.out.println("tran_cmpy_nm = [" + getTran_cmpy_nm() + "]");
		System.out.println("dlco_clsf = [" + getDlco_clsf() + "]");
		System.out.println("pay_mthd_clsf = [" + getPay_mthd_clsf() + "]");
		System.out.println("stmt_clsf = [" + getStmt_clsf() + "]");
		System.out.println("stmt_no = [" + getStmt_no() + "]");
		System.out.println("elec_stmt_yn = [" + getElec_stmt_yn() + "]");
		System.out.println("elec_stmt_id = [" + getElec_stmt_id() + "]");
		System.out.println("rcpt_clsf = [" + getRcpt_clsf() + "]");
		System.out.println("stmt_dt = [" + getStmt_dt() + "]");
		System.out.println("acct_no = [" + getAcct_no() + "]");
		System.out.println("std_tran_uprc = [" + getStd_tran_uprc() + "]");
		System.out.println("pay_tran_uprc = [" + getPay_tran_uprc() + "]");
		System.out.println("work_dds = [" + getWork_dds() + "]");
		System.out.println("pay_tran_cost = [" + getPay_tran_cost() + "]");
		System.out.println("vat = [" + getVat() + "]");
		System.out.println("car_no = [" + getCar_no() + "]");
		System.out.println("eps_no = [" + getEps_no() + "]");
		System.out.println("zip = [" + getZip() + "]");
		System.out.println("addr = [" + getAddr() + "]");
		System.out.println("dtls_addr = [" + getDtls_addr() + "]");
		System.out.println("tel_no = [" + getTel_no() + "]");
		System.out.println("tran_uprc_clas_sub = [" + getTran_uprc_clas_sub() + "]");
		System.out.println("bank_cd = [" + getBank_cd() + "]");
		System.out.println("remk2 = [" + getRemk2() + "]");
		System.out.println("grp_assctn_yn = [" + getGrp_assctn_yn() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String reg_dt = req.getParameter("reg_dt");
if( reg_dt == null){
	System.out.println(this.toString+" : reg_dt is null" );
}else{
	System.out.println(this.toString+" : reg_dt is "+reg_dt );
}
String reg_seq = req.getParameter("reg_seq");
if( reg_seq == null){
	System.out.println(this.toString+" : reg_seq is null" );
}else{
	System.out.println(this.toString+" : reg_seq is "+reg_seq );
}
String tran_uprc_clas = req.getParameter("tran_uprc_clas");
if( tran_uprc_clas == null){
	System.out.println(this.toString+" : tran_uprc_clas is null" );
}else{
	System.out.println(this.toString+" : tran_uprc_clas is "+tran_uprc_clas );
}
String pay_dt = req.getParameter("pay_dt");
if( pay_dt == null){
	System.out.println(this.toString+" : pay_dt is null" );
}else{
	System.out.println(this.toString+" : pay_dt is "+pay_dt );
}
String send_yymm = req.getParameter("send_yymm");
if( send_yymm == null){
	System.out.println(this.toString+" : send_yymm is null" );
}else{
	System.out.println(this.toString+" : send_yymm is "+send_yymm );
}
String send_frdt = req.getParameter("send_frdt");
if( send_frdt == null){
	System.out.println(this.toString+" : send_frdt is null" );
}else{
	System.out.println(this.toString+" : send_frdt is "+send_frdt );
}
String send_todt = req.getParameter("send_todt");
if( send_todt == null){
	System.out.println(this.toString+" : send_todt is null" );
}else{
	System.out.println(this.toString+" : send_todt is "+send_todt );
}
String tot_amt = req.getParameter("tot_amt");
if( tot_amt == null){
	System.out.println(this.toString+" : tot_amt is null" );
}else{
	System.out.println(this.toString+" : tot_amt is "+tot_amt );
}
String clos_yn = req.getParameter("clos_yn");
if( clos_yn == null){
	System.out.println(this.toString+" : clos_yn is null" );
}else{
	System.out.println(this.toString+" : clos_yn is "+clos_yn );
}
String remk1 = req.getParameter("remk1");
if( remk1 == null){
	System.out.println(this.toString+" : remk1 is null" );
}else{
	System.out.println(this.toString+" : remk1 is "+remk1 );
}
String mode_sub = req.getParameter("mode_sub");
if( mode_sub == null){
	System.out.println(this.toString+" : mode_sub is null" );
}else{
	System.out.println(this.toString+" : mode_sub is "+mode_sub );
}
String reg_dt_sub = req.getParameter("reg_dt_sub");
if( reg_dt_sub == null){
	System.out.println(this.toString+" : reg_dt_sub is null" );
}else{
	System.out.println(this.toString+" : reg_dt_sub is "+reg_dt_sub );
}
String reg_seq_sub = req.getParameter("reg_seq_sub");
if( reg_seq_sub == null){
	System.out.println(this.toString+" : reg_seq_sub is null" );
}else{
	System.out.println(this.toString+" : reg_seq_sub is "+reg_seq_sub );
}
String ptcr_seq = req.getParameter("ptcr_seq");
if( ptcr_seq == null){
	System.out.println(this.toString+" : ptcr_seq is null" );
}else{
	System.out.println(this.toString+" : ptcr_seq is "+ptcr_seq );
}
String tran_cmpy_cd = req.getParameter("tran_cmpy_cd");
if( tran_cmpy_cd == null){
	System.out.println(this.toString+" : tran_cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : tran_cmpy_cd is "+tran_cmpy_cd );
}
String tran_uprc_cd = req.getParameter("tran_uprc_cd");
if( tran_uprc_cd == null){
	System.out.println(this.toString+" : tran_uprc_cd is null" );
}else{
	System.out.println(this.toString+" : tran_uprc_cd is "+tran_uprc_cd );
}
String tran_uprc_route_nm = req.getParameter("tran_uprc_route_nm");
if( tran_uprc_route_nm == null){
	System.out.println(this.toString+" : tran_uprc_route_nm is null" );
}else{
	System.out.println(this.toString+" : tran_uprc_route_nm is "+tran_uprc_route_nm );
}
String route_clsf = req.getParameter("route_clsf");
if( route_clsf == null){
	System.out.println(this.toString+" : route_clsf is null" );
}else{
	System.out.println(this.toString+" : route_clsf is "+route_clsf );
}
String route_cd = req.getParameter("route_cd");
if( route_cd == null){
	System.out.println(this.toString+" : route_cd is null" );
}else{
	System.out.println(this.toString+" : route_cd is "+route_cd );
}
String prt_plac_cd = req.getParameter("prt_plac_cd");
if( prt_plac_cd == null){
	System.out.println(this.toString+" : prt_plac_cd is null" );
}else{
	System.out.println(this.toString+" : prt_plac_cd is "+prt_plac_cd );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String sect_cd = req.getParameter("sect_cd");
if( sect_cd == null){
	System.out.println(this.toString+" : sect_cd is null" );
}else{
	System.out.println(this.toString+" : sect_cd is "+sect_cd );
}
String tran_cmpy_nm = req.getParameter("tran_cmpy_nm");
if( tran_cmpy_nm == null){
	System.out.println(this.toString+" : tran_cmpy_nm is null" );
}else{
	System.out.println(this.toString+" : tran_cmpy_nm is "+tran_cmpy_nm );
}
String dlco_clsf = req.getParameter("dlco_clsf");
if( dlco_clsf == null){
	System.out.println(this.toString+" : dlco_clsf is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf is "+dlco_clsf );
}
String pay_mthd_clsf = req.getParameter("pay_mthd_clsf");
if( pay_mthd_clsf == null){
	System.out.println(this.toString+" : pay_mthd_clsf is null" );
}else{
	System.out.println(this.toString+" : pay_mthd_clsf is "+pay_mthd_clsf );
}
String stmt_clsf = req.getParameter("stmt_clsf");
if( stmt_clsf == null){
	System.out.println(this.toString+" : stmt_clsf is null" );
}else{
	System.out.println(this.toString+" : stmt_clsf is "+stmt_clsf );
}
String stmt_no = req.getParameter("stmt_no");
if( stmt_no == null){
	System.out.println(this.toString+" : stmt_no is null" );
}else{
	System.out.println(this.toString+" : stmt_no is "+stmt_no );
}
String elec_stmt_yn = req.getParameter("elec_stmt_yn");
if( elec_stmt_yn == null){
	System.out.println(this.toString+" : elec_stmt_yn is null" );
}else{
	System.out.println(this.toString+" : elec_stmt_yn is "+elec_stmt_yn );
}
String elec_stmt_id = req.getParameter("elec_stmt_id");
if( elec_stmt_id == null){
	System.out.println(this.toString+" : elec_stmt_id is null" );
}else{
	System.out.println(this.toString+" : elec_stmt_id is "+elec_stmt_id );
}
String rcpt_clsf = req.getParameter("rcpt_clsf");
if( rcpt_clsf == null){
	System.out.println(this.toString+" : rcpt_clsf is null" );
}else{
	System.out.println(this.toString+" : rcpt_clsf is "+rcpt_clsf );
}
String stmt_dt = req.getParameter("stmt_dt");
if( stmt_dt == null){
	System.out.println(this.toString+" : stmt_dt is null" );
}else{
	System.out.println(this.toString+" : stmt_dt is "+stmt_dt );
}
String acct_no = req.getParameter("acct_no");
if( acct_no == null){
	System.out.println(this.toString+" : acct_no is null" );
}else{
	System.out.println(this.toString+" : acct_no is "+acct_no );
}
String std_tran_uprc = req.getParameter("std_tran_uprc");
if( std_tran_uprc == null){
	System.out.println(this.toString+" : std_tran_uprc is null" );
}else{
	System.out.println(this.toString+" : std_tran_uprc is "+std_tran_uprc );
}
String pay_tran_uprc = req.getParameter("pay_tran_uprc");
if( pay_tran_uprc == null){
	System.out.println(this.toString+" : pay_tran_uprc is null" );
}else{
	System.out.println(this.toString+" : pay_tran_uprc is "+pay_tran_uprc );
}
String work_dds = req.getParameter("work_dds");
if( work_dds == null){
	System.out.println(this.toString+" : work_dds is null" );
}else{
	System.out.println(this.toString+" : work_dds is "+work_dds );
}
String pay_tran_cost = req.getParameter("pay_tran_cost");
if( pay_tran_cost == null){
	System.out.println(this.toString+" : pay_tran_cost is null" );
}else{
	System.out.println(this.toString+" : pay_tran_cost is "+pay_tran_cost );
}
String vat = req.getParameter("vat");
if( vat == null){
	System.out.println(this.toString+" : vat is null" );
}else{
	System.out.println(this.toString+" : vat is "+vat );
}
String car_no = req.getParameter("car_no");
if( car_no == null){
	System.out.println(this.toString+" : car_no is null" );
}else{
	System.out.println(this.toString+" : car_no is "+car_no );
}
String eps_no = req.getParameter("eps_no");
if( eps_no == null){
	System.out.println(this.toString+" : eps_no is null" );
}else{
	System.out.println(this.toString+" : eps_no is "+eps_no );
}
String zip = req.getParameter("zip");
if( zip == null){
	System.out.println(this.toString+" : zip is null" );
}else{
	System.out.println(this.toString+" : zip is "+zip );
}
String addr = req.getParameter("addr");
if( addr == null){
	System.out.println(this.toString+" : addr is null" );
}else{
	System.out.println(this.toString+" : addr is "+addr );
}
String dtls_addr = req.getParameter("dtls_addr");
if( dtls_addr == null){
	System.out.println(this.toString+" : dtls_addr is null" );
}else{
	System.out.println(this.toString+" : dtls_addr is "+dtls_addr );
}
String tel_no = req.getParameter("tel_no");
if( tel_no == null){
	System.out.println(this.toString+" : tel_no is null" );
}else{
	System.out.println(this.toString+" : tel_no is "+tel_no );
}
String tran_uprc_clas_sub = req.getParameter("tran_uprc_clas_sub");
if( tran_uprc_clas_sub == null){
	System.out.println(this.toString+" : tran_uprc_clas_sub is null" );
}else{
	System.out.println(this.toString+" : tran_uprc_clas_sub is "+tran_uprc_clas_sub );
}
String bank_cd = req.getParameter("bank_cd");
if( bank_cd == null){
	System.out.println(this.toString+" : bank_cd is null" );
}else{
	System.out.println(this.toString+" : bank_cd is "+bank_cd );
}
String remk2 = req.getParameter("remk2");
if( remk2 == null){
	System.out.println(this.toString+" : remk2 is null" );
}else{
	System.out.println(this.toString+" : remk2 is "+remk2 );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mode = Util.checkString(req.getParameter("mode"));
String reg_dt = Util.checkString(req.getParameter("reg_dt"));
String reg_seq = Util.checkString(req.getParameter("reg_seq"));
String tran_uprc_clas = Util.checkString(req.getParameter("tran_uprc_clas"));
String pay_dt = Util.checkString(req.getParameter("pay_dt"));
String send_yymm = Util.checkString(req.getParameter("send_yymm"));
String send_frdt = Util.checkString(req.getParameter("send_frdt"));
String send_todt = Util.checkString(req.getParameter("send_todt"));
String tot_amt = Util.checkString(req.getParameter("tot_amt"));
String clos_yn = Util.checkString(req.getParameter("clos_yn"));
String remk1 = Util.checkString(req.getParameter("remk1"));
String mode_sub = Util.checkString(req.getParameter("mode_sub"));
String reg_dt_sub = Util.checkString(req.getParameter("reg_dt_sub"));
String reg_seq_sub = Util.checkString(req.getParameter("reg_seq_sub"));
String ptcr_seq = Util.checkString(req.getParameter("ptcr_seq"));
String tran_cmpy_cd = Util.checkString(req.getParameter("tran_cmpy_cd"));
String tran_uprc_cd = Util.checkString(req.getParameter("tran_uprc_cd"));
String tran_uprc_route_nm = Util.checkString(req.getParameter("tran_uprc_route_nm"));
String route_clsf = Util.checkString(req.getParameter("route_clsf"));
String route_cd = Util.checkString(req.getParameter("route_cd"));
String prt_plac_cd = Util.checkString(req.getParameter("prt_plac_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String sect_cd = Util.checkString(req.getParameter("sect_cd"));
String tran_cmpy_nm = Util.checkString(req.getParameter("tran_cmpy_nm"));
String dlco_clsf = Util.checkString(req.getParameter("dlco_clsf"));
String pay_mthd_clsf = Util.checkString(req.getParameter("pay_mthd_clsf"));
String stmt_clsf = Util.checkString(req.getParameter("stmt_clsf"));
String stmt_no = Util.checkString(req.getParameter("stmt_no"));
String elec_stmt_yn = Util.checkString(req.getParameter("elec_stmt_yn"));
String elec_stmt_id = Util.checkString(req.getParameter("elec_stmt_id"));
String rcpt_clsf = Util.checkString(req.getParameter("rcpt_clsf"));
String stmt_dt = Util.checkString(req.getParameter("stmt_dt"));
String acct_no = Util.checkString(req.getParameter("acct_no"));
String std_tran_uprc = Util.checkString(req.getParameter("std_tran_uprc"));
String pay_tran_uprc = Util.checkString(req.getParameter("pay_tran_uprc"));
String work_dds = Util.checkString(req.getParameter("work_dds"));
String pay_tran_cost = Util.checkString(req.getParameter("pay_tran_cost"));
String vat = Util.checkString(req.getParameter("vat"));
String car_no = Util.checkString(req.getParameter("car_no"));
String eps_no = Util.checkString(req.getParameter("eps_no"));
String zip = Util.checkString(req.getParameter("zip"));
String addr = Util.checkString(req.getParameter("addr"));
String dtls_addr = Util.checkString(req.getParameter("dtls_addr"));
String tel_no = Util.checkString(req.getParameter("tel_no"));
String tran_uprc_clas_sub = Util.checkString(req.getParameter("tran_uprc_clas_sub"));
String bank_cd = Util.checkString(req.getParameter("bank_cd"));
String remk2 = Util.checkString(req.getParameter("remk2"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String reg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("reg_dt")));
String reg_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("reg_seq")));
String tran_uprc_clas = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_uprc_clas")));
String pay_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_dt")));
String send_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("send_yymm")));
String send_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("send_frdt")));
String send_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("send_todt")));
String tot_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("tot_amt")));
String clos_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("clos_yn")));
String remk1 = Util.Uni2Ksc(Util.checkString(req.getParameter("remk1")));
String mode_sub = Util.Uni2Ksc(Util.checkString(req.getParameter("mode_sub")));
String reg_dt_sub = Util.Uni2Ksc(Util.checkString(req.getParameter("reg_dt_sub")));
String reg_seq_sub = Util.Uni2Ksc(Util.checkString(req.getParameter("reg_seq_sub")));
String ptcr_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("ptcr_seq")));
String tran_cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_cmpy_cd")));
String tran_uprc_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_uprc_cd")));
String tran_uprc_route_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_uprc_route_nm")));
String route_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("route_clsf")));
String route_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("route_cd")));
String prt_plac_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_plac_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String sect_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd")));
String tran_cmpy_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_cmpy_nm")));
String dlco_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf")));
String pay_mthd_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_mthd_clsf")));
String stmt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("stmt_clsf")));
String stmt_no = Util.Uni2Ksc(Util.checkString(req.getParameter("stmt_no")));
String elec_stmt_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("elec_stmt_yn")));
String elec_stmt_id = Util.Uni2Ksc(Util.checkString(req.getParameter("elec_stmt_id")));
String rcpt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpt_clsf")));
String stmt_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("stmt_dt")));
String acct_no = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_no")));
String std_tran_uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("std_tran_uprc")));
String pay_tran_uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_tran_uprc")));
String work_dds = Util.Uni2Ksc(Util.checkString(req.getParameter("work_dds")));
String pay_tran_cost = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_tran_cost")));
String vat = Util.Uni2Ksc(Util.checkString(req.getParameter("vat")));
String car_no = Util.Uni2Ksc(Util.checkString(req.getParameter("car_no")));
String eps_no = Util.Uni2Ksc(Util.checkString(req.getParameter("eps_no")));
String zip = Util.Uni2Ksc(Util.checkString(req.getParameter("zip")));
String addr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr")));
String dtls_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_addr")));
String tel_no = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no")));
String tran_uprc_clas_sub = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_uprc_clas_sub")));
String bank_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_cd")));
String remk2 = Util.Uni2Ksc(Util.checkString(req.getParameter("remk2")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setReg_dt(reg_dt);
dm.setReg_seq(reg_seq);
dm.setTran_uprc_clas(tran_uprc_clas);
dm.setPay_dt(pay_dt);
dm.setSend_yymm(send_yymm);
dm.setSend_frdt(send_frdt);
dm.setSend_todt(send_todt);
dm.setTot_amt(tot_amt);
dm.setClos_yn(clos_yn);
dm.setRemk1(remk1);
dm.setMode_sub(mode_sub);
dm.setReg_dt_sub(reg_dt_sub);
dm.setReg_seq_sub(reg_seq_sub);
dm.setPtcr_seq(ptcr_seq);
dm.setTran_cmpy_cd(tran_cmpy_cd);
dm.setTran_uprc_cd(tran_uprc_cd);
dm.setTran_uprc_route_nm(tran_uprc_route_nm);
dm.setRoute_clsf(route_clsf);
dm.setRoute_cd(route_cd);
dm.setPrt_plac_cd(prt_plac_cd);
dm.setMedi_cd(medi_cd);
dm.setSect_cd(sect_cd);
dm.setTran_cmpy_nm(tran_cmpy_nm);
dm.setDlco_clsf(dlco_clsf);
dm.setPay_mthd_clsf(pay_mthd_clsf);
dm.setStmt_clsf(stmt_clsf);
dm.setStmt_no(stmt_no);
dm.setElec_stmt_yn(elec_stmt_yn);
dm.setElec_stmt_id(elec_stmt_id);
dm.setRcpt_clsf(rcpt_clsf);
dm.setStmt_dt(stmt_dt);
dm.setAcct_no(acct_no);
dm.setStd_tran_uprc(std_tran_uprc);
dm.setPay_tran_uprc(pay_tran_uprc);
dm.setWork_dds(work_dds);
dm.setPay_tran_cost(pay_tran_cost);
dm.setVat(vat);
dm.setCar_no(car_no);
dm.setEps_no(eps_no);
dm.setZip(zip);
dm.setAddr(addr);
dm.setDtls_addr(dtls_addr);
dm.setTel_no(tel_no);
dm.setTran_uprc_clas_sub(tran_uprc_clas_sub);
dm.setBank_cd(bank_cd);
dm.setRemk2(remk2);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 04 21:22:15 KST 2009 */