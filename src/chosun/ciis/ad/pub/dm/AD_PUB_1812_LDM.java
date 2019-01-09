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


package chosun.ciis.ad.pub.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.pub.ds.*;
import chosun.ciis.ad.pub.rec.*;

/**
 * 
 */


public class AD_PUB_1812_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String pubc_clsf;
	public String select_dt;
	public String frdt;
	public String todt;
	public String notaxrate_data_yn;
	public String sect_cd;
	public String sect_seq;
	public String chro_clsf;
	public String medi_cd;
	public String sect_clsf_cd;
	public String sect_nm_cd;
	public String grp_cmpy_cd;
	public String advt_cont;
	public String hndl_clsf;
	public String dlco_no;
	public String slcrg_pers;
	public String mchrg_pers;
	public String edt_clsf;
	public String pubc_clsf2;
	public String dlco_nm2;
	public String pubc_side2;
	public String fradvt_fee;
	public String toadvt_fee;
	public String fravt;
	public String toavt;
	public String frtot_rcpm_amt;
	public String totot_rcpm_amt;
	public String frtot_misu_amt;
	public String totot_misu_amt;
	public String frdn;
	public String todn;
	public String frcm;
	public String tocm;
	public String brdg_advt_yn;
	public String elec_tax_stmt_yn;
	public String sale_stmt_issu_yn;
	public String emp_no;
	public String indt_clsf_1;
	public String indt_clsf_2;
	public String type_clsf_1;
	public String type_clsf_2;
	public String line_advt_yn;
	public String nwsp_type_yn;
	public String self_advt_yn;
	public String ilbo_total;
	public String evnt_clsf;

	public AD_PUB_1812_LDM(){}
	public AD_PUB_1812_LDM(String cmpy_cd, String pubc_clsf, String select_dt, String frdt, String todt, String notaxrate_data_yn, String sect_cd, String sect_seq, String chro_clsf, String medi_cd, String sect_clsf_cd, String sect_nm_cd, String grp_cmpy_cd, String advt_cont, String hndl_clsf, String dlco_no, String slcrg_pers, String mchrg_pers, String edt_clsf, String pubc_clsf2, String dlco_nm2, String pubc_side2, String fradvt_fee, String toadvt_fee, String fravt, String toavt, String frtot_rcpm_amt, String totot_rcpm_amt, String frtot_misu_amt, String totot_misu_amt, String frdn, String todn, String frcm, String tocm, String brdg_advt_yn, String elec_tax_stmt_yn, String sale_stmt_issu_yn, String emp_no, String indt_clsf_1, String indt_clsf_2, String type_clsf_1, String type_clsf_2, String line_advt_yn, String nwsp_type_yn, String self_advt_yn, String ilbo_total, String evnt_clsf){
		this.cmpy_cd = cmpy_cd;
		this.pubc_clsf = pubc_clsf;
		this.select_dt = select_dt;
		this.frdt = frdt;
		this.todt = todt;
		this.notaxrate_data_yn = notaxrate_data_yn;
		this.sect_cd = sect_cd;
		this.sect_seq = sect_seq;
		this.chro_clsf = chro_clsf;
		this.medi_cd = medi_cd;
		this.sect_clsf_cd = sect_clsf_cd;
		this.sect_nm_cd = sect_nm_cd;
		this.grp_cmpy_cd = grp_cmpy_cd;
		this.advt_cont = advt_cont;
		this.hndl_clsf = hndl_clsf;
		this.dlco_no = dlco_no;
		this.slcrg_pers = slcrg_pers;
		this.mchrg_pers = mchrg_pers;
		this.edt_clsf = edt_clsf;
		this.pubc_clsf2 = pubc_clsf2;
		this.dlco_nm2 = dlco_nm2;
		this.pubc_side2 = pubc_side2;
		this.fradvt_fee = fradvt_fee;
		this.toadvt_fee = toadvt_fee;
		this.fravt = fravt;
		this.toavt = toavt;
		this.frtot_rcpm_amt = frtot_rcpm_amt;
		this.totot_rcpm_amt = totot_rcpm_amt;
		this.frtot_misu_amt = frtot_misu_amt;
		this.totot_misu_amt = totot_misu_amt;
		this.frdn = frdn;
		this.todn = todn;
		this.frcm = frcm;
		this.tocm = tocm;
		this.brdg_advt_yn = brdg_advt_yn;
		this.elec_tax_stmt_yn = elec_tax_stmt_yn;
		this.sale_stmt_issu_yn = sale_stmt_issu_yn;
		this.emp_no = emp_no;
		this.indt_clsf_1 = indt_clsf_1;
		this.indt_clsf_2 = indt_clsf_2;
		this.type_clsf_1 = type_clsf_1;
		this.type_clsf_2 = type_clsf_2;
		this.line_advt_yn = line_advt_yn;
		this.nwsp_type_yn = nwsp_type_yn;
		this.self_advt_yn = self_advt_yn;
		this.ilbo_total = ilbo_total;
		this.evnt_clsf = evnt_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPubc_clsf(String pubc_clsf){
		this.pubc_clsf = pubc_clsf;
	}

	public void setSelect_dt(String select_dt){
		this.select_dt = select_dt;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setNotaxrate_data_yn(String notaxrate_data_yn){
		this.notaxrate_data_yn = notaxrate_data_yn;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setSect_seq(String sect_seq){
		this.sect_seq = sect_seq;
	}

	public void setChro_clsf(String chro_clsf){
		this.chro_clsf = chro_clsf;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSect_clsf_cd(String sect_clsf_cd){
		this.sect_clsf_cd = sect_clsf_cd;
	}

	public void setSect_nm_cd(String sect_nm_cd){
		this.sect_nm_cd = sect_nm_cd;
	}

	public void setGrp_cmpy_cd(String grp_cmpy_cd){
		this.grp_cmpy_cd = grp_cmpy_cd;
	}

	public void setAdvt_cont(String advt_cont){
		this.advt_cont = advt_cont;
	}

	public void setHndl_clsf(String hndl_clsf){
		this.hndl_clsf = hndl_clsf;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setSlcrg_pers(String slcrg_pers){
		this.slcrg_pers = slcrg_pers;
	}

	public void setMchrg_pers(String mchrg_pers){
		this.mchrg_pers = mchrg_pers;
	}

	public void setEdt_clsf(String edt_clsf){
		this.edt_clsf = edt_clsf;
	}

	public void setPubc_clsf2(String pubc_clsf2){
		this.pubc_clsf2 = pubc_clsf2;
	}

	public void setDlco_nm2(String dlco_nm2){
		this.dlco_nm2 = dlco_nm2;
	}

	public void setPubc_side2(String pubc_side2){
		this.pubc_side2 = pubc_side2;
	}

	public void setFradvt_fee(String fradvt_fee){
		this.fradvt_fee = fradvt_fee;
	}

	public void setToadvt_fee(String toadvt_fee){
		this.toadvt_fee = toadvt_fee;
	}

	public void setFravt(String fravt){
		this.fravt = fravt;
	}

	public void setToavt(String toavt){
		this.toavt = toavt;
	}

	public void setFrtot_rcpm_amt(String frtot_rcpm_amt){
		this.frtot_rcpm_amt = frtot_rcpm_amt;
	}

	public void setTotot_rcpm_amt(String totot_rcpm_amt){
		this.totot_rcpm_amt = totot_rcpm_amt;
	}

	public void setFrtot_misu_amt(String frtot_misu_amt){
		this.frtot_misu_amt = frtot_misu_amt;
	}

	public void setTotot_misu_amt(String totot_misu_amt){
		this.totot_misu_amt = totot_misu_amt;
	}

	public void setFrdn(String frdn){
		this.frdn = frdn;
	}

	public void setTodn(String todn){
		this.todn = todn;
	}

	public void setFrcm(String frcm){
		this.frcm = frcm;
	}

	public void setTocm(String tocm){
		this.tocm = tocm;
	}

	public void setBrdg_advt_yn(String brdg_advt_yn){
		this.brdg_advt_yn = brdg_advt_yn;
	}

	public void setElec_tax_stmt_yn(String elec_tax_stmt_yn){
		this.elec_tax_stmt_yn = elec_tax_stmt_yn;
	}

	public void setSale_stmt_issu_yn(String sale_stmt_issu_yn){
		this.sale_stmt_issu_yn = sale_stmt_issu_yn;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setIndt_clsf_1(String indt_clsf_1){
		this.indt_clsf_1 = indt_clsf_1;
	}

	public void setIndt_clsf_2(String indt_clsf_2){
		this.indt_clsf_2 = indt_clsf_2;
	}

	public void setType_clsf_1(String type_clsf_1){
		this.type_clsf_1 = type_clsf_1;
	}

	public void setType_clsf_2(String type_clsf_2){
		this.type_clsf_2 = type_clsf_2;
	}

	public void setLine_advt_yn(String line_advt_yn){
		this.line_advt_yn = line_advt_yn;
	}

	public void setNwsp_type_yn(String nwsp_type_yn){
		this.nwsp_type_yn = nwsp_type_yn;
	}

	public void setSelf_advt_yn(String self_advt_yn){
		this.self_advt_yn = self_advt_yn;
	}

	public void setIlbo_total(String ilbo_total){
		this.ilbo_total = ilbo_total;
	}

	public void setEvnt_clsf(String evnt_clsf){
		this.evnt_clsf = evnt_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getPubc_clsf(){
		return this.pubc_clsf;
	}

	public String getSelect_dt(){
		return this.select_dt;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getNotaxrate_data_yn(){
		return this.notaxrate_data_yn;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getSect_seq(){
		return this.sect_seq;
	}

	public String getChro_clsf(){
		return this.chro_clsf;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSect_clsf_cd(){
		return this.sect_clsf_cd;
	}

	public String getSect_nm_cd(){
		return this.sect_nm_cd;
	}

	public String getGrp_cmpy_cd(){
		return this.grp_cmpy_cd;
	}

	public String getAdvt_cont(){
		return this.advt_cont;
	}

	public String getHndl_clsf(){
		return this.hndl_clsf;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getSlcrg_pers(){
		return this.slcrg_pers;
	}

	public String getMchrg_pers(){
		return this.mchrg_pers;
	}

	public String getEdt_clsf(){
		return this.edt_clsf;
	}

	public String getPubc_clsf2(){
		return this.pubc_clsf2;
	}

	public String getDlco_nm2(){
		return this.dlco_nm2;
	}

	public String getPubc_side2(){
		return this.pubc_side2;
	}

	public String getFradvt_fee(){
		return this.fradvt_fee;
	}

	public String getToadvt_fee(){
		return this.toadvt_fee;
	}

	public String getFravt(){
		return this.fravt;
	}

	public String getToavt(){
		return this.toavt;
	}

	public String getFrtot_rcpm_amt(){
		return this.frtot_rcpm_amt;
	}

	public String getTotot_rcpm_amt(){
		return this.totot_rcpm_amt;
	}

	public String getFrtot_misu_amt(){
		return this.frtot_misu_amt;
	}

	public String getTotot_misu_amt(){
		return this.totot_misu_amt;
	}

	public String getFrdn(){
		return this.frdn;
	}

	public String getTodn(){
		return this.todn;
	}

	public String getFrcm(){
		return this.frcm;
	}

	public String getTocm(){
		return this.tocm;
	}

	public String getBrdg_advt_yn(){
		return this.brdg_advt_yn;
	}

	public String getElec_tax_stmt_yn(){
		return this.elec_tax_stmt_yn;
	}

	public String getSale_stmt_issu_yn(){
		return this.sale_stmt_issu_yn;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getIndt_clsf_1(){
		return this.indt_clsf_1;
	}

	public String getIndt_clsf_2(){
		return this.indt_clsf_2;
	}

	public String getType_clsf_1(){
		return this.type_clsf_1;
	}

	public String getType_clsf_2(){
		return this.type_clsf_2;
	}

	public String getLine_advt_yn(){
		return this.line_advt_yn;
	}

	public String getNwsp_type_yn(){
		return this.nwsp_type_yn;
	}

	public String getSelf_advt_yn(){
		return this.self_advt_yn;
	}

	public String getIlbo_total(){
		return this.ilbo_total;
	}

	public String getEvnt_clsf(){
		return this.evnt_clsf;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_PUB_1812_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_PUB_1812_LDM dm = (AD_PUB_1812_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.pubc_clsf);
		cstmt.setString(5, dm.select_dt);
		cstmt.setString(6, dm.frdt);
		cstmt.setString(7, dm.todt);
		cstmt.setString(8, dm.notaxrate_data_yn);
		cstmt.setString(9, dm.sect_cd);
		cstmt.setString(10, dm.sect_seq);
		cstmt.setString(11, dm.chro_clsf);
		cstmt.setString(12, dm.medi_cd);
		cstmt.setString(13, dm.sect_clsf_cd);
		cstmt.setString(14, dm.sect_nm_cd);
		cstmt.setString(15, dm.grp_cmpy_cd);
		cstmt.setString(16, dm.advt_cont);
		cstmt.setString(17, dm.hndl_clsf);
		cstmt.setString(18, dm.dlco_no);
		cstmt.setString(19, dm.slcrg_pers);
		cstmt.setString(20, dm.mchrg_pers);
		cstmt.setString(21, dm.edt_clsf);
		cstmt.setString(22, dm.pubc_clsf2);
		cstmt.setString(23, dm.dlco_nm2);
		cstmt.setString(24, dm.pubc_side2);
		cstmt.setString(25, dm.fradvt_fee);
		cstmt.setString(26, dm.toadvt_fee);
		cstmt.setString(27, dm.fravt);
		cstmt.setString(28, dm.toavt);
		cstmt.setString(29, dm.frtot_rcpm_amt);
		cstmt.setString(30, dm.totot_rcpm_amt);
		cstmt.setString(31, dm.frtot_misu_amt);
		cstmt.setString(32, dm.totot_misu_amt);
		cstmt.setString(33, dm.frdn);
		cstmt.setString(34, dm.todn);
		cstmt.setString(35, dm.frcm);
		cstmt.setString(36, dm.tocm);
		cstmt.setString(37, dm.brdg_advt_yn);
		cstmt.setString(38, dm.elec_tax_stmt_yn);
		cstmt.setString(39, dm.sale_stmt_issu_yn);
		cstmt.setString(40, dm.emp_no);
		cstmt.setString(41, dm.indt_clsf_1);
		cstmt.setString(42, dm.indt_clsf_2);
		cstmt.setString(43, dm.type_clsf_1);
		cstmt.setString(44, dm.type_clsf_2);
		cstmt.setString(45, dm.line_advt_yn);
		cstmt.setString(46, dm.nwsp_type_yn);
		cstmt.setString(47, dm.self_advt_yn);
		cstmt.setString(48, dm.ilbo_total);
		cstmt.setString(49, dm.evnt_clsf);
		cstmt.registerOutParameter(50, Types.VARCHAR);
		cstmt.registerOutParameter(51, Types.VARCHAR);
		cstmt.registerOutParameter(52, Types.VARCHAR);
		cstmt.registerOutParameter(53, Types.VARCHAR);
		cstmt.registerOutParameter(54, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.pub.ds.AD_PUB_1812_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("pubc_clsf = [" + getPubc_clsf() + "]");
		System.out.println("select_dt = [" + getSelect_dt() + "]");
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("todt = [" + getTodt() + "]");
		System.out.println("notaxrate_data_yn = [" + getNotaxrate_data_yn() + "]");
		System.out.println("sect_cd = [" + getSect_cd() + "]");
		System.out.println("sect_seq = [" + getSect_seq() + "]");
		System.out.println("chro_clsf = [" + getChro_clsf() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("sect_clsf_cd = [" + getSect_clsf_cd() + "]");
		System.out.println("sect_nm_cd = [" + getSect_nm_cd() + "]");
		System.out.println("grp_cmpy_cd = [" + getGrp_cmpy_cd() + "]");
		System.out.println("advt_cont = [" + getAdvt_cont() + "]");
		System.out.println("hndl_clsf = [" + getHndl_clsf() + "]");
		System.out.println("dlco_no = [" + getDlco_no() + "]");
		System.out.println("slcrg_pers = [" + getSlcrg_pers() + "]");
		System.out.println("mchrg_pers = [" + getMchrg_pers() + "]");
		System.out.println("edt_clsf = [" + getEdt_clsf() + "]");
		System.out.println("pubc_clsf2 = [" + getPubc_clsf2() + "]");
		System.out.println("dlco_nm2 = [" + getDlco_nm2() + "]");
		System.out.println("pubc_side2 = [" + getPubc_side2() + "]");
		System.out.println("fradvt_fee = [" + getFradvt_fee() + "]");
		System.out.println("toadvt_fee = [" + getToadvt_fee() + "]");
		System.out.println("fravt = [" + getFravt() + "]");
		System.out.println("toavt = [" + getToavt() + "]");
		System.out.println("frtot_rcpm_amt = [" + getFrtot_rcpm_amt() + "]");
		System.out.println("totot_rcpm_amt = [" + getTotot_rcpm_amt() + "]");
		System.out.println("frtot_misu_amt = [" + getFrtot_misu_amt() + "]");
		System.out.println("totot_misu_amt = [" + getTotot_misu_amt() + "]");
		System.out.println("frdn = [" + getFrdn() + "]");
		System.out.println("todn = [" + getTodn() + "]");
		System.out.println("frcm = [" + getFrcm() + "]");
		System.out.println("tocm = [" + getTocm() + "]");
		System.out.println("brdg_advt_yn = [" + getBrdg_advt_yn() + "]");
		System.out.println("elec_tax_stmt_yn = [" + getElec_tax_stmt_yn() + "]");
		System.out.println("sale_stmt_issu_yn = [" + getSale_stmt_issu_yn() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("indt_clsf_1 = [" + getIndt_clsf_1() + "]");
		System.out.println("indt_clsf_2 = [" + getIndt_clsf_2() + "]");
		System.out.println("type_clsf_1 = [" + getType_clsf_1() + "]");
		System.out.println("type_clsf_2 = [" + getType_clsf_2() + "]");
		System.out.println("line_advt_yn = [" + getLine_advt_yn() + "]");
		System.out.println("nwsp_type_yn = [" + getNwsp_type_yn() + "]");
		System.out.println("self_advt_yn = [" + getSelf_advt_yn() + "]");
		System.out.println("ilbo_total = [" + getIlbo_total() + "]");
		System.out.println("evnt_clsf = [" + getEvnt_clsf() + "]");
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
String pubc_clsf = req.getParameter("pubc_clsf");
if( pubc_clsf == null){
	System.out.println(this.toString+" : pubc_clsf is null" );
}else{
	System.out.println(this.toString+" : pubc_clsf is "+pubc_clsf );
}
String select_dt = req.getParameter("select_dt");
if( select_dt == null){
	System.out.println(this.toString+" : select_dt is null" );
}else{
	System.out.println(this.toString+" : select_dt is "+select_dt );
}
String frdt = req.getParameter("frdt");
if( frdt == null){
	System.out.println(this.toString+" : frdt is null" );
}else{
	System.out.println(this.toString+" : frdt is "+frdt );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
}
String notaxrate_data_yn = req.getParameter("notaxrate_data_yn");
if( notaxrate_data_yn == null){
	System.out.println(this.toString+" : notaxrate_data_yn is null" );
}else{
	System.out.println(this.toString+" : notaxrate_data_yn is "+notaxrate_data_yn );
}
String sect_cd = req.getParameter("sect_cd");
if( sect_cd == null){
	System.out.println(this.toString+" : sect_cd is null" );
}else{
	System.out.println(this.toString+" : sect_cd is "+sect_cd );
}
String sect_seq = req.getParameter("sect_seq");
if( sect_seq == null){
	System.out.println(this.toString+" : sect_seq is null" );
}else{
	System.out.println(this.toString+" : sect_seq is "+sect_seq );
}
String chro_clsf = req.getParameter("chro_clsf");
if( chro_clsf == null){
	System.out.println(this.toString+" : chro_clsf is null" );
}else{
	System.out.println(this.toString+" : chro_clsf is "+chro_clsf );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String sect_clsf_cd = req.getParameter("sect_clsf_cd");
if( sect_clsf_cd == null){
	System.out.println(this.toString+" : sect_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : sect_clsf_cd is "+sect_clsf_cd );
}
String sect_nm_cd = req.getParameter("sect_nm_cd");
if( sect_nm_cd == null){
	System.out.println(this.toString+" : sect_nm_cd is null" );
}else{
	System.out.println(this.toString+" : sect_nm_cd is "+sect_nm_cd );
}
String grp_cmpy_cd = req.getParameter("grp_cmpy_cd");
if( grp_cmpy_cd == null){
	System.out.println(this.toString+" : grp_cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : grp_cmpy_cd is "+grp_cmpy_cd );
}
String advt_cont = req.getParameter("advt_cont");
if( advt_cont == null){
	System.out.println(this.toString+" : advt_cont is null" );
}else{
	System.out.println(this.toString+" : advt_cont is "+advt_cont );
}
String hndl_clsf = req.getParameter("hndl_clsf");
if( hndl_clsf == null){
	System.out.println(this.toString+" : hndl_clsf is null" );
}else{
	System.out.println(this.toString+" : hndl_clsf is "+hndl_clsf );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String slcrg_pers = req.getParameter("slcrg_pers");
if( slcrg_pers == null){
	System.out.println(this.toString+" : slcrg_pers is null" );
}else{
	System.out.println(this.toString+" : slcrg_pers is "+slcrg_pers );
}
String mchrg_pers = req.getParameter("mchrg_pers");
if( mchrg_pers == null){
	System.out.println(this.toString+" : mchrg_pers is null" );
}else{
	System.out.println(this.toString+" : mchrg_pers is "+mchrg_pers );
}
String edt_clsf = req.getParameter("edt_clsf");
if( edt_clsf == null){
	System.out.println(this.toString+" : edt_clsf is null" );
}else{
	System.out.println(this.toString+" : edt_clsf is "+edt_clsf );
}
String pubc_clsf2 = req.getParameter("pubc_clsf2");
if( pubc_clsf2 == null){
	System.out.println(this.toString+" : pubc_clsf2 is null" );
}else{
	System.out.println(this.toString+" : pubc_clsf2 is "+pubc_clsf2 );
}
String dlco_nm2 = req.getParameter("dlco_nm2");
if( dlco_nm2 == null){
	System.out.println(this.toString+" : dlco_nm2 is null" );
}else{
	System.out.println(this.toString+" : dlco_nm2 is "+dlco_nm2 );
}
String pubc_side2 = req.getParameter("pubc_side2");
if( pubc_side2 == null){
	System.out.println(this.toString+" : pubc_side2 is null" );
}else{
	System.out.println(this.toString+" : pubc_side2 is "+pubc_side2 );
}
String fradvt_fee = req.getParameter("fradvt_fee");
if( fradvt_fee == null){
	System.out.println(this.toString+" : fradvt_fee is null" );
}else{
	System.out.println(this.toString+" : fradvt_fee is "+fradvt_fee );
}
String toadvt_fee = req.getParameter("toadvt_fee");
if( toadvt_fee == null){
	System.out.println(this.toString+" : toadvt_fee is null" );
}else{
	System.out.println(this.toString+" : toadvt_fee is "+toadvt_fee );
}
String fravt = req.getParameter("fravt");
if( fravt == null){
	System.out.println(this.toString+" : fravt is null" );
}else{
	System.out.println(this.toString+" : fravt is "+fravt );
}
String toavt = req.getParameter("toavt");
if( toavt == null){
	System.out.println(this.toString+" : toavt is null" );
}else{
	System.out.println(this.toString+" : toavt is "+toavt );
}
String frtot_rcpm_amt = req.getParameter("frtot_rcpm_amt");
if( frtot_rcpm_amt == null){
	System.out.println(this.toString+" : frtot_rcpm_amt is null" );
}else{
	System.out.println(this.toString+" : frtot_rcpm_amt is "+frtot_rcpm_amt );
}
String totot_rcpm_amt = req.getParameter("totot_rcpm_amt");
if( totot_rcpm_amt == null){
	System.out.println(this.toString+" : totot_rcpm_amt is null" );
}else{
	System.out.println(this.toString+" : totot_rcpm_amt is "+totot_rcpm_amt );
}
String frtot_misu_amt = req.getParameter("frtot_misu_amt");
if( frtot_misu_amt == null){
	System.out.println(this.toString+" : frtot_misu_amt is null" );
}else{
	System.out.println(this.toString+" : frtot_misu_amt is "+frtot_misu_amt );
}
String totot_misu_amt = req.getParameter("totot_misu_amt");
if( totot_misu_amt == null){
	System.out.println(this.toString+" : totot_misu_amt is null" );
}else{
	System.out.println(this.toString+" : totot_misu_amt is "+totot_misu_amt );
}
String frdn = req.getParameter("frdn");
if( frdn == null){
	System.out.println(this.toString+" : frdn is null" );
}else{
	System.out.println(this.toString+" : frdn is "+frdn );
}
String todn = req.getParameter("todn");
if( todn == null){
	System.out.println(this.toString+" : todn is null" );
}else{
	System.out.println(this.toString+" : todn is "+todn );
}
String frcm = req.getParameter("frcm");
if( frcm == null){
	System.out.println(this.toString+" : frcm is null" );
}else{
	System.out.println(this.toString+" : frcm is "+frcm );
}
String tocm = req.getParameter("tocm");
if( tocm == null){
	System.out.println(this.toString+" : tocm is null" );
}else{
	System.out.println(this.toString+" : tocm is "+tocm );
}
String brdg_advt_yn = req.getParameter("brdg_advt_yn");
if( brdg_advt_yn == null){
	System.out.println(this.toString+" : brdg_advt_yn is null" );
}else{
	System.out.println(this.toString+" : brdg_advt_yn is "+brdg_advt_yn );
}
String elec_tax_stmt_yn = req.getParameter("elec_tax_stmt_yn");
if( elec_tax_stmt_yn == null){
	System.out.println(this.toString+" : elec_tax_stmt_yn is null" );
}else{
	System.out.println(this.toString+" : elec_tax_stmt_yn is "+elec_tax_stmt_yn );
}
String sale_stmt_issu_yn = req.getParameter("sale_stmt_issu_yn");
if( sale_stmt_issu_yn == null){
	System.out.println(this.toString+" : sale_stmt_issu_yn is null" );
}else{
	System.out.println(this.toString+" : sale_stmt_issu_yn is "+sale_stmt_issu_yn );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String indt_clsf_1 = req.getParameter("indt_clsf_1");
if( indt_clsf_1 == null){
	System.out.println(this.toString+" : indt_clsf_1 is null" );
}else{
	System.out.println(this.toString+" : indt_clsf_1 is "+indt_clsf_1 );
}
String indt_clsf_2 = req.getParameter("indt_clsf_2");
if( indt_clsf_2 == null){
	System.out.println(this.toString+" : indt_clsf_2 is null" );
}else{
	System.out.println(this.toString+" : indt_clsf_2 is "+indt_clsf_2 );
}
String type_clsf_1 = req.getParameter("type_clsf_1");
if( type_clsf_1 == null){
	System.out.println(this.toString+" : type_clsf_1 is null" );
}else{
	System.out.println(this.toString+" : type_clsf_1 is "+type_clsf_1 );
}
String type_clsf_2 = req.getParameter("type_clsf_2");
if( type_clsf_2 == null){
	System.out.println(this.toString+" : type_clsf_2 is null" );
}else{
	System.out.println(this.toString+" : type_clsf_2 is "+type_clsf_2 );
}
String line_advt_yn = req.getParameter("line_advt_yn");
if( line_advt_yn == null){
	System.out.println(this.toString+" : line_advt_yn is null" );
}else{
	System.out.println(this.toString+" : line_advt_yn is "+line_advt_yn );
}
String nwsp_type_yn = req.getParameter("nwsp_type_yn");
if( nwsp_type_yn == null){
	System.out.println(this.toString+" : nwsp_type_yn is null" );
}else{
	System.out.println(this.toString+" : nwsp_type_yn is "+nwsp_type_yn );
}
String self_advt_yn = req.getParameter("self_advt_yn");
if( self_advt_yn == null){
	System.out.println(this.toString+" : self_advt_yn is null" );
}else{
	System.out.println(this.toString+" : self_advt_yn is "+self_advt_yn );
}
String ilbo_total = req.getParameter("ilbo_total");
if( ilbo_total == null){
	System.out.println(this.toString+" : ilbo_total is null" );
}else{
	System.out.println(this.toString+" : ilbo_total is "+ilbo_total );
}
String evnt_clsf = req.getParameter("evnt_clsf");
if( evnt_clsf == null){
	System.out.println(this.toString+" : evnt_clsf is null" );
}else{
	System.out.println(this.toString+" : evnt_clsf is "+evnt_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String pubc_clsf = Util.checkString(req.getParameter("pubc_clsf"));
String select_dt = Util.checkString(req.getParameter("select_dt"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String notaxrate_data_yn = Util.checkString(req.getParameter("notaxrate_data_yn"));
String sect_cd = Util.checkString(req.getParameter("sect_cd"));
String sect_seq = Util.checkString(req.getParameter("sect_seq"));
String chro_clsf = Util.checkString(req.getParameter("chro_clsf"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String sect_clsf_cd = Util.checkString(req.getParameter("sect_clsf_cd"));
String sect_nm_cd = Util.checkString(req.getParameter("sect_nm_cd"));
String grp_cmpy_cd = Util.checkString(req.getParameter("grp_cmpy_cd"));
String advt_cont = Util.checkString(req.getParameter("advt_cont"));
String hndl_clsf = Util.checkString(req.getParameter("hndl_clsf"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String slcrg_pers = Util.checkString(req.getParameter("slcrg_pers"));
String mchrg_pers = Util.checkString(req.getParameter("mchrg_pers"));
String edt_clsf = Util.checkString(req.getParameter("edt_clsf"));
String pubc_clsf2 = Util.checkString(req.getParameter("pubc_clsf2"));
String dlco_nm2 = Util.checkString(req.getParameter("dlco_nm2"));
String pubc_side2 = Util.checkString(req.getParameter("pubc_side2"));
String fradvt_fee = Util.checkString(req.getParameter("fradvt_fee"));
String toadvt_fee = Util.checkString(req.getParameter("toadvt_fee"));
String fravt = Util.checkString(req.getParameter("fravt"));
String toavt = Util.checkString(req.getParameter("toavt"));
String frtot_rcpm_amt = Util.checkString(req.getParameter("frtot_rcpm_amt"));
String totot_rcpm_amt = Util.checkString(req.getParameter("totot_rcpm_amt"));
String frtot_misu_amt = Util.checkString(req.getParameter("frtot_misu_amt"));
String totot_misu_amt = Util.checkString(req.getParameter("totot_misu_amt"));
String frdn = Util.checkString(req.getParameter("frdn"));
String todn = Util.checkString(req.getParameter("todn"));
String frcm = Util.checkString(req.getParameter("frcm"));
String tocm = Util.checkString(req.getParameter("tocm"));
String brdg_advt_yn = Util.checkString(req.getParameter("brdg_advt_yn"));
String elec_tax_stmt_yn = Util.checkString(req.getParameter("elec_tax_stmt_yn"));
String sale_stmt_issu_yn = Util.checkString(req.getParameter("sale_stmt_issu_yn"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String indt_clsf_1 = Util.checkString(req.getParameter("indt_clsf_1"));
String indt_clsf_2 = Util.checkString(req.getParameter("indt_clsf_2"));
String type_clsf_1 = Util.checkString(req.getParameter("type_clsf_1"));
String type_clsf_2 = Util.checkString(req.getParameter("type_clsf_2"));
String line_advt_yn = Util.checkString(req.getParameter("line_advt_yn"));
String nwsp_type_yn = Util.checkString(req.getParameter("nwsp_type_yn"));
String self_advt_yn = Util.checkString(req.getParameter("self_advt_yn"));
String ilbo_total = Util.checkString(req.getParameter("ilbo_total"));
String evnt_clsf = Util.checkString(req.getParameter("evnt_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String pubc_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_clsf")));
String select_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("select_dt")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String notaxrate_data_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("notaxrate_data_yn")));
String sect_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd")));
String sect_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_seq")));
String chro_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("chro_clsf")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String sect_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_clsf_cd")));
String sect_nm_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_nm_cd")));
String grp_cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("grp_cmpy_cd")));
String advt_cont = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_cont")));
String hndl_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("hndl_clsf")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String slcrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("slcrg_pers")));
String mchrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("mchrg_pers")));
String edt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("edt_clsf")));
String pubc_clsf2 = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_clsf2")));
String dlco_nm2 = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_nm2")));
String pubc_side2 = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_side2")));
String fradvt_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("fradvt_fee")));
String toadvt_fee = Util.Uni2Ksc(Util.checkString(req.getParameter("toadvt_fee")));
String fravt = Util.Uni2Ksc(Util.checkString(req.getParameter("fravt")));
String toavt = Util.Uni2Ksc(Util.checkString(req.getParameter("toavt")));
String frtot_rcpm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("frtot_rcpm_amt")));
String totot_rcpm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("totot_rcpm_amt")));
String frtot_misu_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("frtot_misu_amt")));
String totot_misu_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("totot_misu_amt")));
String frdn = Util.Uni2Ksc(Util.checkString(req.getParameter("frdn")));
String todn = Util.Uni2Ksc(Util.checkString(req.getParameter("todn")));
String frcm = Util.Uni2Ksc(Util.checkString(req.getParameter("frcm")));
String tocm = Util.Uni2Ksc(Util.checkString(req.getParameter("tocm")));
String brdg_advt_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("brdg_advt_yn")));
String elec_tax_stmt_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("elec_tax_stmt_yn")));
String sale_stmt_issu_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_stmt_issu_yn")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String indt_clsf_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("indt_clsf_1")));
String indt_clsf_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("indt_clsf_2")));
String type_clsf_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("type_clsf_1")));
String type_clsf_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("type_clsf_2")));
String line_advt_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("line_advt_yn")));
String nwsp_type_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("nwsp_type_yn")));
String self_advt_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("self_advt_yn")));
String ilbo_total = Util.Uni2Ksc(Util.checkString(req.getParameter("ilbo_total")));
String evnt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setPubc_clsf(pubc_clsf);
dm.setSelect_dt(select_dt);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setNotaxrate_data_yn(notaxrate_data_yn);
dm.setSect_cd(sect_cd);
dm.setSect_seq(sect_seq);
dm.setChro_clsf(chro_clsf);
dm.setMedi_cd(medi_cd);
dm.setSect_clsf_cd(sect_clsf_cd);
dm.setSect_nm_cd(sect_nm_cd);
dm.setGrp_cmpy_cd(grp_cmpy_cd);
dm.setAdvt_cont(advt_cont);
dm.setHndl_clsf(hndl_clsf);
dm.setDlco_no(dlco_no);
dm.setSlcrg_pers(slcrg_pers);
dm.setMchrg_pers(mchrg_pers);
dm.setEdt_clsf(edt_clsf);
dm.setPubc_clsf2(pubc_clsf2);
dm.setDlco_nm2(dlco_nm2);
dm.setPubc_side2(pubc_side2);
dm.setFradvt_fee(fradvt_fee);
dm.setToadvt_fee(toadvt_fee);
dm.setFravt(fravt);
dm.setToavt(toavt);
dm.setFrtot_rcpm_amt(frtot_rcpm_amt);
dm.setTotot_rcpm_amt(totot_rcpm_amt);
dm.setFrtot_misu_amt(frtot_misu_amt);
dm.setTotot_misu_amt(totot_misu_amt);
dm.setFrdn(frdn);
dm.setTodn(todn);
dm.setFrcm(frcm);
dm.setTocm(tocm);
dm.setBrdg_advt_yn(brdg_advt_yn);
dm.setElec_tax_stmt_yn(elec_tax_stmt_yn);
dm.setSale_stmt_issu_yn(sale_stmt_issu_yn);
dm.setEmp_no(emp_no);
dm.setIndt_clsf_1(indt_clsf_1);
dm.setIndt_clsf_2(indt_clsf_2);
dm.setType_clsf_1(type_clsf_1);
dm.setType_clsf_2(type_clsf_2);
dm.setLine_advt_yn(line_advt_yn);
dm.setNwsp_type_yn(nwsp_type_yn);
dm.setSelf_advt_yn(self_advt_yn);
dm.setIlbo_total(ilbo_total);
dm.setEvnt_clsf(evnt_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 12 16:58:02 KST 2017 */