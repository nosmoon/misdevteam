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


package chosun.ciis.fc.func.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.ds.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_1002_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String rcpm_dt;
	public String rcpm_slip_clsf_cd;
	public String rcpm_seq;
	public String rcpm_sub_seq;
	public String bank_cd;
	public String note_no;
	public String note_seq;
	public String note_clsf_cd;
	public String comp_dt;
	public String mtry_dt;
	public String note_amt;
	public String pay_plac_cd;
	public String note_clehous_cd;
	public String issu_cmpy_clsf_cd;
	public String issu_pers_nm;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String rmks1;
	public String rmks2;
	public String chg_pers;
	public String incmg_pers_ipadd;
	public String intg_dlco_cd;
	public String dlco_nm;
	public String sale_dscn_amt;
	public String note_clsf_cd2;

	public FC_FUNC_1002_UDM(){}
	public FC_FUNC_1002_UDM(String cmpy_cd, String rcpm_dt, String rcpm_slip_clsf_cd, String rcpm_seq, String rcpm_sub_seq, String bank_cd, String note_no, String note_seq, String note_clsf_cd, String comp_dt, String mtry_dt, String note_amt, String pay_plac_cd, String note_clehous_cd, String issu_cmpy_clsf_cd, String issu_pers_nm, String dlco_clsf_cd, String dlco_cd, String rmks1, String rmks2, String chg_pers, String incmg_pers_ipadd, String intg_dlco_cd, String dlco_nm, String sale_dscn_amt, String note_clsf_cd2){
		this.cmpy_cd = cmpy_cd;
		this.rcpm_dt = rcpm_dt;
		this.rcpm_slip_clsf_cd = rcpm_slip_clsf_cd;
		this.rcpm_seq = rcpm_seq;
		this.rcpm_sub_seq = rcpm_sub_seq;
		this.bank_cd = bank_cd;
		this.note_no = note_no;
		this.note_seq = note_seq;
		this.note_clsf_cd = note_clsf_cd;
		this.comp_dt = comp_dt;
		this.mtry_dt = mtry_dt;
		this.note_amt = note_amt;
		this.pay_plac_cd = pay_plac_cd;
		this.note_clehous_cd = note_clehous_cd;
		this.issu_cmpy_clsf_cd = issu_cmpy_clsf_cd;
		this.issu_pers_nm = issu_pers_nm;
		this.dlco_clsf_cd = dlco_clsf_cd;
		this.dlco_cd = dlco_cd;
		this.rmks1 = rmks1;
		this.rmks2 = rmks2;
		this.chg_pers = chg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.intg_dlco_cd = intg_dlco_cd;
		this.dlco_nm = dlco_nm;
		this.sale_dscn_amt = sale_dscn_amt;
		this.note_clsf_cd2 = note_clsf_cd2;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRcpm_dt(String rcpm_dt){
		this.rcpm_dt = rcpm_dt;
	}

	public void setRcpm_slip_clsf_cd(String rcpm_slip_clsf_cd){
		this.rcpm_slip_clsf_cd = rcpm_slip_clsf_cd;
	}

	public void setRcpm_seq(String rcpm_seq){
		this.rcpm_seq = rcpm_seq;
	}

	public void setRcpm_sub_seq(String rcpm_sub_seq){
		this.rcpm_sub_seq = rcpm_sub_seq;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setNote_no(String note_no){
		this.note_no = note_no;
	}

	public void setNote_seq(String note_seq){
		this.note_seq = note_seq;
	}

	public void setNote_clsf_cd(String note_clsf_cd){
		this.note_clsf_cd = note_clsf_cd;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setNote_amt(String note_amt){
		this.note_amt = note_amt;
	}

	public void setPay_plac_cd(String pay_plac_cd){
		this.pay_plac_cd = pay_plac_cd;
	}

	public void setNote_clehous_cd(String note_clehous_cd){
		this.note_clehous_cd = note_clehous_cd;
	}

	public void setIssu_cmpy_clsf_cd(String issu_cmpy_clsf_cd){
		this.issu_cmpy_clsf_cd = issu_cmpy_clsf_cd;
	}

	public void setIssu_pers_nm(String issu_pers_nm){
		this.issu_pers_nm = issu_pers_nm;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setRmks1(String rmks1){
		this.rmks1 = rmks1;
	}

	public void setRmks2(String rmks2){
		this.rmks2 = rmks2;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIntg_dlco_cd(String intg_dlco_cd){
		this.intg_dlco_cd = intg_dlco_cd;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setSale_dscn_amt(String sale_dscn_amt){
		this.sale_dscn_amt = sale_dscn_amt;
	}

	public void setNote_clsf_cd2(String note_clsf_cd2){
		this.note_clsf_cd2 = note_clsf_cd2;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getRcpm_dt(){
		return this.rcpm_dt;
	}

	public String getRcpm_slip_clsf_cd(){
		return this.rcpm_slip_clsf_cd;
	}

	public String getRcpm_seq(){
		return this.rcpm_seq;
	}

	public String getRcpm_sub_seq(){
		return this.rcpm_sub_seq;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getNote_no(){
		return this.note_no;
	}

	public String getNote_seq(){
		return this.note_seq;
	}

	public String getNote_clsf_cd(){
		return this.note_clsf_cd;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getNote_amt(){
		return this.note_amt;
	}

	public String getPay_plac_cd(){
		return this.pay_plac_cd;
	}

	public String getNote_clehous_cd(){
		return this.note_clehous_cd;
	}

	public String getIssu_cmpy_clsf_cd(){
		return this.issu_cmpy_clsf_cd;
	}

	public String getIssu_pers_nm(){
		return this.issu_pers_nm;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getRmks1(){
		return this.rmks1;
	}

	public String getRmks2(){
		return this.rmks2;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIntg_dlco_cd(){
		return this.intg_dlco_cd;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getSale_dscn_amt(){
		return this.sale_dscn_amt;
	}

	public String getNote_clsf_cd2(){
		return this.note_clsf_cd2;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_1002_U(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_1002_UDM dm = (FC_FUNC_1002_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.rcpm_dt);
		cstmt.setString(5, dm.rcpm_slip_clsf_cd);
		cstmt.setString(6, dm.rcpm_seq);
		cstmt.setString(7, dm.rcpm_sub_seq);
		cstmt.setString(8, dm.bank_cd);
		cstmt.setString(9, dm.note_no);
		cstmt.setString(10, dm.note_seq);
		cstmt.setString(11, dm.note_clsf_cd);
		cstmt.setString(12, dm.comp_dt);
		cstmt.setString(13, dm.mtry_dt);
		cstmt.setString(14, dm.note_amt);
		cstmt.setString(15, dm.pay_plac_cd);
		cstmt.setString(16, dm.note_clehous_cd);
		cstmt.setString(17, dm.issu_cmpy_clsf_cd);
		cstmt.setString(18, dm.issu_pers_nm);
		cstmt.setString(19, dm.dlco_clsf_cd);
		cstmt.setString(20, dm.dlco_cd);
		cstmt.setString(21, dm.rmks1);
		cstmt.setString(22, dm.rmks2);
		cstmt.setString(23, dm.chg_pers);
		cstmt.setString(24, dm.incmg_pers_ipadd);
		cstmt.setString(25, dm.intg_dlco_cd);
		cstmt.setString(26, dm.dlco_nm);
		cstmt.setString(27, dm.sale_dscn_amt);
		cstmt.setString(28, dm.note_clsf_cd2);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_1002_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("rcpm_dt = [" + getRcpm_dt() + "]");
		System.out.println("rcpm_slip_clsf_cd = [" + getRcpm_slip_clsf_cd() + "]");
		System.out.println("rcpm_seq = [" + getRcpm_seq() + "]");
		System.out.println("rcpm_sub_seq = [" + getRcpm_sub_seq() + "]");
		System.out.println("bank_cd = [" + getBank_cd() + "]");
		System.out.println("note_no = [" + getNote_no() + "]");
		System.out.println("note_seq = [" + getNote_seq() + "]");
		System.out.println("note_clsf_cd = [" + getNote_clsf_cd() + "]");
		System.out.println("comp_dt = [" + getComp_dt() + "]");
		System.out.println("mtry_dt = [" + getMtry_dt() + "]");
		System.out.println("note_amt = [" + getNote_amt() + "]");
		System.out.println("pay_plac_cd = [" + getPay_plac_cd() + "]");
		System.out.println("note_clehous_cd = [" + getNote_clehous_cd() + "]");
		System.out.println("issu_cmpy_clsf_cd = [" + getIssu_cmpy_clsf_cd() + "]");
		System.out.println("issu_pers_nm = [" + getIssu_pers_nm() + "]");
		System.out.println("dlco_clsf_cd = [" + getDlco_clsf_cd() + "]");
		System.out.println("dlco_cd = [" + getDlco_cd() + "]");
		System.out.println("rmks1 = [" + getRmks1() + "]");
		System.out.println("rmks2 = [" + getRmks2() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("intg_dlco_cd = [" + getIntg_dlco_cd() + "]");
		System.out.println("dlco_nm = [" + getDlco_nm() + "]");
		System.out.println("sale_dscn_amt = [" + getSale_dscn_amt() + "]");
		System.out.println("note_clsf_cd2 = [" + getNote_clsf_cd2() + "]");
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
String rcpm_dt = req.getParameter("rcpm_dt");
if( rcpm_dt == null){
	System.out.println(this.toString+" : rcpm_dt is null" );
}else{
	System.out.println(this.toString+" : rcpm_dt is "+rcpm_dt );
}
String rcpm_slip_clsf_cd = req.getParameter("rcpm_slip_clsf_cd");
if( rcpm_slip_clsf_cd == null){
	System.out.println(this.toString+" : rcpm_slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : rcpm_slip_clsf_cd is "+rcpm_slip_clsf_cd );
}
String rcpm_seq = req.getParameter("rcpm_seq");
if( rcpm_seq == null){
	System.out.println(this.toString+" : rcpm_seq is null" );
}else{
	System.out.println(this.toString+" : rcpm_seq is "+rcpm_seq );
}
String rcpm_sub_seq = req.getParameter("rcpm_sub_seq");
if( rcpm_sub_seq == null){
	System.out.println(this.toString+" : rcpm_sub_seq is null" );
}else{
	System.out.println(this.toString+" : rcpm_sub_seq is "+rcpm_sub_seq );
}
String bank_cd = req.getParameter("bank_cd");
if( bank_cd == null){
	System.out.println(this.toString+" : bank_cd is null" );
}else{
	System.out.println(this.toString+" : bank_cd is "+bank_cd );
}
String note_no = req.getParameter("note_no");
if( note_no == null){
	System.out.println(this.toString+" : note_no is null" );
}else{
	System.out.println(this.toString+" : note_no is "+note_no );
}
String note_seq = req.getParameter("note_seq");
if( note_seq == null){
	System.out.println(this.toString+" : note_seq is null" );
}else{
	System.out.println(this.toString+" : note_seq is "+note_seq );
}
String note_clsf_cd = req.getParameter("note_clsf_cd");
if( note_clsf_cd == null){
	System.out.println(this.toString+" : note_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : note_clsf_cd is "+note_clsf_cd );
}
String comp_dt = req.getParameter("comp_dt");
if( comp_dt == null){
	System.out.println(this.toString+" : comp_dt is null" );
}else{
	System.out.println(this.toString+" : comp_dt is "+comp_dt );
}
String mtry_dt = req.getParameter("mtry_dt");
if( mtry_dt == null){
	System.out.println(this.toString+" : mtry_dt is null" );
}else{
	System.out.println(this.toString+" : mtry_dt is "+mtry_dt );
}
String note_amt = req.getParameter("note_amt");
if( note_amt == null){
	System.out.println(this.toString+" : note_amt is null" );
}else{
	System.out.println(this.toString+" : note_amt is "+note_amt );
}
String pay_plac_cd = req.getParameter("pay_plac_cd");
if( pay_plac_cd == null){
	System.out.println(this.toString+" : pay_plac_cd is null" );
}else{
	System.out.println(this.toString+" : pay_plac_cd is "+pay_plac_cd );
}
String note_clehous_cd = req.getParameter("note_clehous_cd");
if( note_clehous_cd == null){
	System.out.println(this.toString+" : note_clehous_cd is null" );
}else{
	System.out.println(this.toString+" : note_clehous_cd is "+note_clehous_cd );
}
String issu_cmpy_clsf_cd = req.getParameter("issu_cmpy_clsf_cd");
if( issu_cmpy_clsf_cd == null){
	System.out.println(this.toString+" : issu_cmpy_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : issu_cmpy_clsf_cd is "+issu_cmpy_clsf_cd );
}
String issu_pers_nm = req.getParameter("issu_pers_nm");
if( issu_pers_nm == null){
	System.out.println(this.toString+" : issu_pers_nm is null" );
}else{
	System.out.println(this.toString+" : issu_pers_nm is "+issu_pers_nm );
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
String rmks1 = req.getParameter("rmks1");
if( rmks1 == null){
	System.out.println(this.toString+" : rmks1 is null" );
}else{
	System.out.println(this.toString+" : rmks1 is "+rmks1 );
}
String rmks2 = req.getParameter("rmks2");
if( rmks2 == null){
	System.out.println(this.toString+" : rmks2 is null" );
}else{
	System.out.println(this.toString+" : rmks2 is "+rmks2 );
}
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String intg_dlco_cd = req.getParameter("intg_dlco_cd");
if( intg_dlco_cd == null){
	System.out.println(this.toString+" : intg_dlco_cd is null" );
}else{
	System.out.println(this.toString+" : intg_dlco_cd is "+intg_dlco_cd );
}
String dlco_nm = req.getParameter("dlco_nm");
if( dlco_nm == null){
	System.out.println(this.toString+" : dlco_nm is null" );
}else{
	System.out.println(this.toString+" : dlco_nm is "+dlco_nm );
}
String sale_dscn_amt = req.getParameter("sale_dscn_amt");
if( sale_dscn_amt == null){
	System.out.println(this.toString+" : sale_dscn_amt is null" );
}else{
	System.out.println(this.toString+" : sale_dscn_amt is "+sale_dscn_amt );
}
String note_clsf_cd2 = req.getParameter("note_clsf_cd2");
if( note_clsf_cd2 == null){
	System.out.println(this.toString+" : note_clsf_cd2 is null" );
}else{
	System.out.println(this.toString+" : note_clsf_cd2 is "+note_clsf_cd2 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String rcpm_dt = Util.checkString(req.getParameter("rcpm_dt"));
String rcpm_slip_clsf_cd = Util.checkString(req.getParameter("rcpm_slip_clsf_cd"));
String rcpm_seq = Util.checkString(req.getParameter("rcpm_seq"));
String rcpm_sub_seq = Util.checkString(req.getParameter("rcpm_sub_seq"));
String bank_cd = Util.checkString(req.getParameter("bank_cd"));
String note_no = Util.checkString(req.getParameter("note_no"));
String note_seq = Util.checkString(req.getParameter("note_seq"));
String note_clsf_cd = Util.checkString(req.getParameter("note_clsf_cd"));
String comp_dt = Util.checkString(req.getParameter("comp_dt"));
String mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
String note_amt = Util.checkString(req.getParameter("note_amt"));
String pay_plac_cd = Util.checkString(req.getParameter("pay_plac_cd"));
String note_clehous_cd = Util.checkString(req.getParameter("note_clehous_cd"));
String issu_cmpy_clsf_cd = Util.checkString(req.getParameter("issu_cmpy_clsf_cd"));
String issu_pers_nm = Util.checkString(req.getParameter("issu_pers_nm"));
String dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String rmks1 = Util.checkString(req.getParameter("rmks1"));
String rmks2 = Util.checkString(req.getParameter("rmks2"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String intg_dlco_cd = Util.checkString(req.getParameter("intg_dlco_cd"));
String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
String sale_dscn_amt = Util.checkString(req.getParameter("sale_dscn_amt"));
String note_clsf_cd2 = Util.checkString(req.getParameter("note_clsf_cd2"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String rcpm_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_dt")));
String rcpm_slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_slip_clsf_cd")));
String rcpm_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_seq")));
String rcpm_sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_sub_seq")));
String bank_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_cd")));
String note_no = Util.Uni2Ksc(Util.checkString(req.getParameter("note_no")));
String note_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("note_seq")));
String note_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("note_clsf_cd")));
String comp_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("comp_dt")));
String mtry_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("mtry_dt")));
String note_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("note_amt")));
String pay_plac_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_plac_cd")));
String note_clehous_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("note_clehous_cd")));
String issu_cmpy_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_cmpy_clsf_cd")));
String issu_pers_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_pers_nm")));
String dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String rmks1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rmks1")));
String rmks2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rmks2")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String intg_dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("intg_dlco_cd")));
String dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_nm")));
String sale_dscn_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_dscn_amt")));
String note_clsf_cd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("note_clsf_cd2")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setRcpm_dt(rcpm_dt);
dm.setRcpm_slip_clsf_cd(rcpm_slip_clsf_cd);
dm.setRcpm_seq(rcpm_seq);
dm.setRcpm_sub_seq(rcpm_sub_seq);
dm.setBank_cd(bank_cd);
dm.setNote_no(note_no);
dm.setNote_seq(note_seq);
dm.setNote_clsf_cd(note_clsf_cd);
dm.setComp_dt(comp_dt);
dm.setMtry_dt(mtry_dt);
dm.setNote_amt(note_amt);
dm.setPay_plac_cd(pay_plac_cd);
dm.setNote_clehous_cd(note_clehous_cd);
dm.setIssu_cmpy_clsf_cd(issu_cmpy_clsf_cd);
dm.setIssu_pers_nm(issu_pers_nm);
dm.setDlco_clsf_cd(dlco_clsf_cd);
dm.setDlco_cd(dlco_cd);
dm.setRmks1(rmks1);
dm.setRmks2(rmks2);
dm.setChg_pers(chg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIntg_dlco_cd(intg_dlco_cd);
dm.setDlco_nm(dlco_nm);
dm.setSale_dscn_amt(sale_dscn_amt);
dm.setNote_clsf_cd2(note_clsf_cd2);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 26 15:56:07 KST 2018 */