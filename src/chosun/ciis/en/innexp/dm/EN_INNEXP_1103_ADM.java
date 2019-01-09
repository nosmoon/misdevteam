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


package chosun.ciis.en.innexp.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.en.innexp.ds.*;
import chosun.ciis.en.innexp.rec.*;

/**
 * 
 */


public class EN_INNEXP_1103_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mst_mode;
	public String cmpy_cd;
	public String incmg_pers_ip;
	public String incmg_pers;
	public String chg_pers;
	public String occr_dt;
	public String occr_seq;
	public String titl;
	public String reven_amt;
	public String vat_amt;
	public String slip_occr_dt;
	public String slip_seq;
	public String prof_type_cd;
	public String slip_clsf_cd;
	public String make_dt;
	public String erplace_cd;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String deal_clsf;
	public String ern;
	public String dlco_nm;
	public String presi_nm;
	public String addr;
	public String bizcond;
	public String item;
	public String tax_suply_amt;
	public String tax_vat_amt;
	public String vexc_cmpy_cd;
	public String evnt_cd;
	public String ask_emp_no;
	public String ask_dept_cd;
	public String remk;

	public EN_INNEXP_1103_ADM(){}
	public EN_INNEXP_1103_ADM(String mst_mode, String cmpy_cd, String incmg_pers_ip, String incmg_pers, String chg_pers, String occr_dt, String occr_seq, String titl, String reven_amt, String vat_amt, String slip_occr_dt, String slip_seq, String prof_type_cd, String slip_clsf_cd, String make_dt, String erplace_cd, String dlco_clsf_cd, String dlco_cd, String deal_clsf, String ern, String dlco_nm, String presi_nm, String addr, String bizcond, String item, String tax_suply_amt, String tax_vat_amt, String vexc_cmpy_cd, String evnt_cd, String ask_emp_no, String ask_dept_cd, String remk){
		this.mst_mode = mst_mode;
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
		this.chg_pers = chg_pers;
		this.occr_dt = occr_dt;
		this.occr_seq = occr_seq;
		this.titl = titl;
		this.reven_amt = reven_amt;
		this.vat_amt = vat_amt;
		this.slip_occr_dt = slip_occr_dt;
		this.slip_seq = slip_seq;
		this.prof_type_cd = prof_type_cd;
		this.slip_clsf_cd = slip_clsf_cd;
		this.make_dt = make_dt;
		this.erplace_cd = erplace_cd;
		this.dlco_clsf_cd = dlco_clsf_cd;
		this.dlco_cd = dlco_cd;
		this.deal_clsf = deal_clsf;
		this.ern = ern;
		this.dlco_nm = dlco_nm;
		this.presi_nm = presi_nm;
		this.addr = addr;
		this.bizcond = bizcond;
		this.item = item;
		this.tax_suply_amt = tax_suply_amt;
		this.tax_vat_amt = tax_vat_amt;
		this.vexc_cmpy_cd = vexc_cmpy_cd;
		this.evnt_cd = evnt_cd;
		this.ask_emp_no = ask_emp_no;
		this.ask_dept_cd = ask_dept_cd;
		this.remk = remk;
	}

	public void setMst_mode(String mst_mode){
		this.mst_mode = mst_mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setOccr_seq(String occr_seq){
		this.occr_seq = occr_seq;
	}

	public void setTitl(String titl){
		this.titl = titl;
	}

	public void setReven_amt(String reven_amt){
		this.reven_amt = reven_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setProf_type_cd(String prof_type_cd){
		this.prof_type_cd = prof_type_cd;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setErplace_cd(String erplace_cd){
		this.erplace_cd = erplace_cd;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDeal_clsf(String deal_clsf){
		this.deal_clsf = deal_clsf;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setPresi_nm(String presi_nm){
		this.presi_nm = presi_nm;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setBizcond(String bizcond){
		this.bizcond = bizcond;
	}

	public void setItem(String item){
		this.item = item;
	}

	public void setTax_suply_amt(String tax_suply_amt){
		this.tax_suply_amt = tax_suply_amt;
	}

	public void setTax_vat_amt(String tax_vat_amt){
		this.tax_vat_amt = tax_vat_amt;
	}

	public void setVexc_cmpy_cd(String vexc_cmpy_cd){
		this.vexc_cmpy_cd = vexc_cmpy_cd;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setAsk_emp_no(String ask_emp_no){
		this.ask_emp_no = ask_emp_no;
	}

	public void setAsk_dept_cd(String ask_dept_cd){
		this.ask_dept_cd = ask_dept_cd;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getMst_mode(){
		return this.mst_mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getOccr_seq(){
		return this.occr_seq;
	}

	public String getTitl(){
		return this.titl;
	}

	public String getReven_amt(){
		return this.reven_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getProf_type_cd(){
		return this.prof_type_cd;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getErplace_cd(){
		return this.erplace_cd;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDeal_clsf(){
		return this.deal_clsf;
	}

	public String getErn(){
		return this.ern;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getPresi_nm(){
		return this.presi_nm;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getBizcond(){
		return this.bizcond;
	}

	public String getItem(){
		return this.item;
	}

	public String getTax_suply_amt(){
		return this.tax_suply_amt;
	}

	public String getTax_vat_amt(){
		return this.tax_vat_amt;
	}

	public String getVexc_cmpy_cd(){
		return this.vexc_cmpy_cd;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getAsk_emp_no(){
		return this.ask_emp_no;
	}

	public String getAsk_dept_cd(){
		return this.ask_dept_cd;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getSQL(){
		 return "{ call MISENP.SP_EN_INNEXP_1103_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		EN_INNEXP_1103_ADM dm = (EN_INNEXP_1103_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mst_mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.incmg_pers_ip);
		cstmt.setString(6, dm.incmg_pers);
		cstmt.setString(7, dm.chg_pers);
		cstmt.setString(8, dm.occr_dt);
		cstmt.setString(9, dm.occr_seq);
		cstmt.setString(10, dm.titl);
		cstmt.setString(11, dm.reven_amt);
		cstmt.setString(12, dm.vat_amt);
		cstmt.setString(13, dm.slip_occr_dt);
		cstmt.setString(14, dm.slip_seq);
		cstmt.setString(15, dm.prof_type_cd);
		cstmt.setString(16, dm.slip_clsf_cd);
		cstmt.setString(17, dm.make_dt);
		cstmt.setString(18, dm.erplace_cd);
		cstmt.setString(19, dm.dlco_clsf_cd);
		cstmt.setString(20, dm.dlco_cd);
		cstmt.setString(21, dm.deal_clsf);
		cstmt.setString(22, dm.ern);
		cstmt.setString(23, dm.dlco_nm);
		cstmt.setString(24, dm.presi_nm);
		cstmt.setString(25, dm.addr);
		cstmt.setString(26, dm.bizcond);
		cstmt.setString(27, dm.item);
		cstmt.setString(28, dm.tax_suply_amt);
		cstmt.setString(29, dm.tax_vat_amt);
		cstmt.setString(30, dm.vexc_cmpy_cd);
		cstmt.setString(31, dm.evnt_cd);
		cstmt.setString(32, dm.ask_emp_no);
		cstmt.setString(33, dm.ask_dept_cd);
		cstmt.setString(34, dm.remk);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.en.innexp.ds.EN_INNEXP_1103_ADataSet();
	}



    public void print(){
        System.out.println("mst_mode = " + getMst_mode());
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("incmg_pers_ip = " + getIncmg_pers_ip());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("chg_pers = " + getChg_pers());
        System.out.println("occr_dt = " + getOccr_dt());
        System.out.println("occr_seq = " + getOccr_seq());
        System.out.println("titl = " + getTitl());
        System.out.println("reven_amt = " + getReven_amt());
        System.out.println("vat_amt = " + getVat_amt());
        System.out.println("slip_occr_dt = " + getSlip_occr_dt());
        System.out.println("slip_seq = " + getSlip_seq());
        System.out.println("prof_type_cd = " + getProf_type_cd());
        System.out.println("slip_clsf_cd = " + getSlip_clsf_cd());
        System.out.println("make_dt = " + getMake_dt());
        System.out.println("erplace_cd = " + getErplace_cd());
        System.out.println("dlco_clsf_cd = " + getDlco_clsf_cd());
        System.out.println("dlco_cd = " + getDlco_cd());
        System.out.println("deal_clsf = " + getDeal_clsf());
        System.out.println("ern = " + getErn());
        System.out.println("dlco_nm = " + getDlco_nm());
        System.out.println("presi_nm = " + getPresi_nm());
        System.out.println("addr = " + getAddr());
        System.out.println("bizcond = " + getBizcond());
        System.out.println("item = " + getItem());
        System.out.println("tax_suply_amt = " + getTax_suply_amt());
        System.out.println("tax_vat_amt = " + getTax_vat_amt());
        System.out.println("vexc_cmpy_cd = " + getVexc_cmpy_cd());
        System.out.println("evnt_cd = " + getEvnt_cd());
        System.out.println("ask_emp_no = " + getAsk_emp_no());
        System.out.println("ask_dept_cd = " + getAsk_dept_cd());
        System.out.println("remk = " + getRemk());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String mst_mode = req.getParameter("mst_mode");
if( mst_mode == null){
	System.out.println(this.toString+" : mst_mode is null" );
}else{
	System.out.println(this.toString+" : mst_mode is "+mst_mode );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
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
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String occr_seq = req.getParameter("occr_seq");
if( occr_seq == null){
	System.out.println(this.toString+" : occr_seq is null" );
}else{
	System.out.println(this.toString+" : occr_seq is "+occr_seq );
}
String titl = req.getParameter("titl");
if( titl == null){
	System.out.println(this.toString+" : titl is null" );
}else{
	System.out.println(this.toString+" : titl is "+titl );
}
String reven_amt = req.getParameter("reven_amt");
if( reven_amt == null){
	System.out.println(this.toString+" : reven_amt is null" );
}else{
	System.out.println(this.toString+" : reven_amt is "+reven_amt );
}
String vat_amt = req.getParameter("vat_amt");
if( vat_amt == null){
	System.out.println(this.toString+" : vat_amt is null" );
}else{
	System.out.println(this.toString+" : vat_amt is "+vat_amt );
}
String slip_occr_dt = req.getParameter("slip_occr_dt");
if( slip_occr_dt == null){
	System.out.println(this.toString+" : slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : slip_occr_dt is "+slip_occr_dt );
}
String slip_seq = req.getParameter("slip_seq");
if( slip_seq == null){
	System.out.println(this.toString+" : slip_seq is null" );
}else{
	System.out.println(this.toString+" : slip_seq is "+slip_seq );
}
String prof_type_cd = req.getParameter("prof_type_cd");
if( prof_type_cd == null){
	System.out.println(this.toString+" : prof_type_cd is null" );
}else{
	System.out.println(this.toString+" : prof_type_cd is "+prof_type_cd );
}
String slip_clsf_cd = req.getParameter("slip_clsf_cd");
if( slip_clsf_cd == null){
	System.out.println(this.toString+" : slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : slip_clsf_cd is "+slip_clsf_cd );
}
String make_dt = req.getParameter("make_dt");
if( make_dt == null){
	System.out.println(this.toString+" : make_dt is null" );
}else{
	System.out.println(this.toString+" : make_dt is "+make_dt );
}
String erplace_cd = req.getParameter("erplace_cd");
if( erplace_cd == null){
	System.out.println(this.toString+" : erplace_cd is null" );
}else{
	System.out.println(this.toString+" : erplace_cd is "+erplace_cd );
}
String dlco_clsf_cd = req.getParameter("dlco_clsf_cd");
if( dlco_clsf_cd == null){
	System.out.println(this.toString+" : dlco_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf_cd is "+dlco_clsf_cd );
}
String dlco_cd = req.getParameter("dlco_cd");
if( dlco_cd == null){
	System.out.println(this.toString+" : dlco_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_cd is "+dlco_cd );
}
String deal_clsf = req.getParameter("deal_clsf");
if( deal_clsf == null){
	System.out.println(this.toString+" : deal_clsf is null" );
}else{
	System.out.println(this.toString+" : deal_clsf is "+deal_clsf );
}
String ern = req.getParameter("ern");
if( ern == null){
	System.out.println(this.toString+" : ern is null" );
}else{
	System.out.println(this.toString+" : ern is "+ern );
}
String dlco_nm = req.getParameter("dlco_nm");
if( dlco_nm == null){
	System.out.println(this.toString+" : dlco_nm is null" );
}else{
	System.out.println(this.toString+" : dlco_nm is "+dlco_nm );
}
String presi_nm = req.getParameter("presi_nm");
if( presi_nm == null){
	System.out.println(this.toString+" : presi_nm is null" );
}else{
	System.out.println(this.toString+" : presi_nm is "+presi_nm );
}
String addr = req.getParameter("addr");
if( addr == null){
	System.out.println(this.toString+" : addr is null" );
}else{
	System.out.println(this.toString+" : addr is "+addr );
}
String bizcond = req.getParameter("bizcond");
if( bizcond == null){
	System.out.println(this.toString+" : bizcond is null" );
}else{
	System.out.println(this.toString+" : bizcond is "+bizcond );
}
String item = req.getParameter("item");
if( item == null){
	System.out.println(this.toString+" : item is null" );
}else{
	System.out.println(this.toString+" : item is "+item );
}
String tax_suply_amt = req.getParameter("tax_suply_amt");
if( tax_suply_amt == null){
	System.out.println(this.toString+" : tax_suply_amt is null" );
}else{
	System.out.println(this.toString+" : tax_suply_amt is "+tax_suply_amt );
}
String tax_vat_amt = req.getParameter("tax_vat_amt");
if( tax_vat_amt == null){
	System.out.println(this.toString+" : tax_vat_amt is null" );
}else{
	System.out.println(this.toString+" : tax_vat_amt is "+tax_vat_amt );
}
String vexc_cmpy_cd = req.getParameter("vexc_cmpy_cd");
if( vexc_cmpy_cd == null){
	System.out.println(this.toString+" : vexc_cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : vexc_cmpy_cd is "+vexc_cmpy_cd );
}
String evnt_cd = req.getParameter("evnt_cd");
if( evnt_cd == null){
	System.out.println(this.toString+" : evnt_cd is null" );
}else{
	System.out.println(this.toString+" : evnt_cd is "+evnt_cd );
}
String ask_emp_no = req.getParameter("ask_emp_no");
if( ask_emp_no == null){
	System.out.println(this.toString+" : ask_emp_no is null" );
}else{
	System.out.println(this.toString+" : ask_emp_no is "+ask_emp_no );
}
String ask_dept_cd = req.getParameter("ask_dept_cd");
if( ask_dept_cd == null){
	System.out.println(this.toString+" : ask_dept_cd is null" );
}else{
	System.out.println(this.toString+" : ask_dept_cd is "+ask_dept_cd );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mst_mode = Util.checkString(req.getParameter("mst_mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String occr_seq = Util.checkString(req.getParameter("occr_seq"));
String titl = Util.checkString(req.getParameter("titl"));
String reven_amt = Util.checkString(req.getParameter("reven_amt"));
String vat_amt = Util.checkString(req.getParameter("vat_amt"));
String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
String slip_seq = Util.checkString(req.getParameter("slip_seq"));
String prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String make_dt = Util.checkString(req.getParameter("make_dt"));
String erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
String dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String deal_clsf = Util.checkString(req.getParameter("deal_clsf"));
String ern = Util.checkString(req.getParameter("ern"));
String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
String presi_nm = Util.checkString(req.getParameter("presi_nm"));
String addr = Util.checkString(req.getParameter("addr"));
String bizcond = Util.checkString(req.getParameter("bizcond"));
String item = Util.checkString(req.getParameter("item"));
String tax_suply_amt = Util.checkString(req.getParameter("tax_suply_amt"));
String tax_vat_amt = Util.checkString(req.getParameter("tax_vat_amt"));
String vexc_cmpy_cd = Util.checkString(req.getParameter("vexc_cmpy_cd"));
String evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
String ask_emp_no = Util.checkString(req.getParameter("ask_emp_no"));
String ask_dept_cd = Util.checkString(req.getParameter("ask_dept_cd"));
String remk = Util.checkString(req.getParameter("remk"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mst_mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mst_mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String occr_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_seq")));
String titl = Util.Uni2Ksc(Util.checkString(req.getParameter("titl")));
String reven_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("reven_amt")));
String vat_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_amt")));
String slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt")));
String slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_seq")));
String prof_type_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prof_type_cd")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String make_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("make_dt")));
String erplace_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("erplace_cd")));
String dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String deal_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("deal_clsf")));
String ern = Util.Uni2Ksc(Util.checkString(req.getParameter("ern")));
String dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_nm")));
String presi_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("presi_nm")));
String addr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr")));
String bizcond = Util.Uni2Ksc(Util.checkString(req.getParameter("bizcond")));
String item = Util.Uni2Ksc(Util.checkString(req.getParameter("item")));
String tax_suply_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_suply_amt")));
String tax_vat_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_vat_amt")));
String vexc_cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("vexc_cmpy_cd")));
String evnt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_cd")));
String ask_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("ask_emp_no")));
String ask_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("ask_dept_cd")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMst_mode(mst_mode);
dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
dm.setOccr_dt(occr_dt);
dm.setOccr_seq(occr_seq);
dm.setTitl(titl);
dm.setReven_amt(reven_amt);
dm.setVat_amt(vat_amt);
dm.setSlip_occr_dt(slip_occr_dt);
dm.setSlip_seq(slip_seq);
dm.setProf_type_cd(prof_type_cd);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setMake_dt(make_dt);
dm.setErplace_cd(erplace_cd);
dm.setDlco_clsf_cd(dlco_clsf_cd);
dm.setDlco_cd(dlco_cd);
dm.setDeal_clsf(deal_clsf);
dm.setErn(ern);
dm.setDlco_nm(dlco_nm);
dm.setPresi_nm(presi_nm);
dm.setAddr(addr);
dm.setBizcond(bizcond);
dm.setItem(item);
dm.setTax_suply_amt(tax_suply_amt);
dm.setTax_vat_amt(tax_vat_amt);
dm.setVexc_cmpy_cd(vexc_cmpy_cd);
dm.setEvnt_cd(evnt_cd);
dm.setAsk_emp_no(ask_emp_no);
dm.setAsk_dept_cd(ask_dept_cd);
dm.setRemk(remk);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 22 19:01:25 KST 2009 */