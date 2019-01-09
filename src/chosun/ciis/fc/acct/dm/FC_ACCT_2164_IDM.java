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


package chosun.ciis.fc.acct.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.ds.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_2164_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String pch_flag;
	public String incmg_dt;
	public String impt_dept;
	public String incmg_seq;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String dlco_nm;
	public String obj_amt;
	public String incm_clsf_cd;
	public String incm_tax;
	public String res_tax;
	public String rmks2;
	public String budg_cd;
	public String rcpm_amt;
	public String mang_clsf_cd;
	public String comp_dt;
	public String incmg_pers;
	public String incmg_pers_ipadd;
	public String biz_reg_no;
	public String bank_id;
	public String acct_num;
	public String tran_date_seq;
	public String chnl_clsf_cd;

	public FC_ACCT_2164_IDM(){}
	public FC_ACCT_2164_IDM(String cmpy_cd, String pch_flag, String incmg_dt, String impt_dept, String incmg_seq, String dlco_clsf_cd, String dlco_cd, String dlco_nm, String obj_amt, String incm_clsf_cd, String incm_tax, String res_tax, String rmks2, String budg_cd, String rcpm_amt, String mang_clsf_cd, String comp_dt, String incmg_pers, String incmg_pers_ipadd, String biz_reg_no, String bank_id, String acct_num, String tran_date_seq, String chnl_clsf_cd){
		this.cmpy_cd = cmpy_cd;
		this.pch_flag = pch_flag;
		this.incmg_dt = incmg_dt;
		this.impt_dept = impt_dept;
		this.incmg_seq = incmg_seq;
		this.dlco_clsf_cd = dlco_clsf_cd;
		this.dlco_cd = dlco_cd;
		this.dlco_nm = dlco_nm;
		this.obj_amt = obj_amt;
		this.incm_clsf_cd = incm_clsf_cd;
		this.incm_tax = incm_tax;
		this.res_tax = res_tax;
		this.rmks2 = rmks2;
		this.budg_cd = budg_cd;
		this.rcpm_amt = rcpm_amt;
		this.mang_clsf_cd = mang_clsf_cd;
		this.comp_dt = comp_dt;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.biz_reg_no = biz_reg_no;
		this.bank_id = bank_id;
		this.acct_num = acct_num;
		this.tran_date_seq = tran_date_seq;
		this.chnl_clsf_cd = chnl_clsf_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPch_flag(String pch_flag){
		this.pch_flag = pch_flag;
	}

	public void setIncmg_dt(String incmg_dt){
		this.incmg_dt = incmg_dt;
	}

	public void setImpt_dept(String impt_dept){
		this.impt_dept = impt_dept;
	}

	public void setIncmg_seq(String incmg_seq){
		this.incmg_seq = incmg_seq;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setObj_amt(String obj_amt){
		this.obj_amt = obj_amt;
	}

	public void setIncm_clsf_cd(String incm_clsf_cd){
		this.incm_clsf_cd = incm_clsf_cd;
	}

	public void setIncm_tax(String incm_tax){
		this.incm_tax = incm_tax;
	}

	public void setRes_tax(String res_tax){
		this.res_tax = res_tax;
	}

	public void setRmks2(String rmks2){
		this.rmks2 = rmks2;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setRcpm_amt(String rcpm_amt){
		this.rcpm_amt = rcpm_amt;
	}

	public void setMang_clsf_cd(String mang_clsf_cd){
		this.mang_clsf_cd = mang_clsf_cd;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setBiz_reg_no(String biz_reg_no){
		this.biz_reg_no = biz_reg_no;
	}

	public void setBank_id(String bank_id){
		this.bank_id = bank_id;
	}

	public void setAcct_num(String acct_num){
		this.acct_num = acct_num;
	}

	public void setTran_date_seq(String tran_date_seq){
		this.tran_date_seq = tran_date_seq;
	}

	public void setChnl_clsf_cd(String chnl_clsf_cd){
		this.chnl_clsf_cd = chnl_clsf_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getPch_flag(){
		return this.pch_flag;
	}

	public String getIncmg_dt(){
		return this.incmg_dt;
	}

	public String getImpt_dept(){
		return this.impt_dept;
	}

	public String getIncmg_seq(){
		return this.incmg_seq;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getObj_amt(){
		return this.obj_amt;
	}

	public String getIncm_clsf_cd(){
		return this.incm_clsf_cd;
	}

	public String getIncm_tax(){
		return this.incm_tax;
	}

	public String getRes_tax(){
		return this.res_tax;
	}

	public String getRmks2(){
		return this.rmks2;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getRcpm_amt(){
		return this.rcpm_amt;
	}

	public String getMang_clsf_cd(){
		return this.mang_clsf_cd;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getBiz_reg_no(){
		return this.biz_reg_no;
	}

	public String getBank_id(){
		return this.bank_id;
	}

	public String getAcct_num(){
		return this.acct_num;
	}

	public String getTran_date_seq(){
		return this.tran_date_seq;
	}

	public String getChnl_clsf_cd(){
		return this.chnl_clsf_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2164_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2164_IDM dm = (FC_ACCT_2164_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.pch_flag);
		cstmt.setString(5, dm.incmg_dt);
		cstmt.setString(6, dm.impt_dept);
		cstmt.setString(7, dm.incmg_seq);
		cstmt.setString(8, dm.dlco_clsf_cd);
		cstmt.setString(9, dm.dlco_cd);
		cstmt.setString(10, dm.dlco_nm);
		cstmt.setString(11, dm.obj_amt);
		cstmt.setString(12, dm.incm_clsf_cd);
		cstmt.setString(13, dm.incm_tax);
		cstmt.setString(14, dm.res_tax);
		cstmt.setString(15, dm.rmks2);
		cstmt.setString(16, dm.budg_cd);
		cstmt.setString(17, dm.rcpm_amt);
		cstmt.setString(18, dm.mang_clsf_cd);
		cstmt.setString(19, dm.comp_dt);
		cstmt.setString(20, dm.incmg_pers);
		cstmt.setString(21, dm.incmg_pers_ipadd);
		cstmt.setString(22, dm.biz_reg_no);
		cstmt.setString(23, dm.bank_id);
		cstmt.setString(24, dm.acct_num);
		cstmt.setString(25, dm.tran_date_seq);
		cstmt.setString(26, dm.chnl_clsf_cd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2164_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("pch_flag = [" + getPch_flag() + "]");
		System.out.println("incmg_dt = [" + getIncmg_dt() + "]");
		System.out.println("impt_dept = [" + getImpt_dept() + "]");
		System.out.println("incmg_seq = [" + getIncmg_seq() + "]");
		System.out.println("dlco_clsf_cd = [" + getDlco_clsf_cd() + "]");
		System.out.println("dlco_cd = [" + getDlco_cd() + "]");
		System.out.println("dlco_nm = [" + getDlco_nm() + "]");
		System.out.println("obj_amt = [" + getObj_amt() + "]");
		System.out.println("incm_clsf_cd = [" + getIncm_clsf_cd() + "]");
		System.out.println("incm_tax = [" + getIncm_tax() + "]");
		System.out.println("res_tax = [" + getRes_tax() + "]");
		System.out.println("rmks2 = [" + getRmks2() + "]");
		System.out.println("budg_cd = [" + getBudg_cd() + "]");
		System.out.println("rcpm_amt = [" + getRcpm_amt() + "]");
		System.out.println("mang_clsf_cd = [" + getMang_clsf_cd() + "]");
		System.out.println("comp_dt = [" + getComp_dt() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("biz_reg_no = [" + getBiz_reg_no() + "]");
		System.out.println("bank_id = [" + getBank_id() + "]");
		System.out.println("acct_num = [" + getAcct_num() + "]");
		System.out.println("tran_date_seq = [" + getTran_date_seq() + "]");
		System.out.println("chnl_clsf_cd = [" + getChnl_clsf_cd() + "]");
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
String pch_flag = req.getParameter("pch_flag");
if( pch_flag == null){
	System.out.println(this.toString+" : pch_flag is null" );
}else{
	System.out.println(this.toString+" : pch_flag is "+pch_flag );
}
String incmg_dt = req.getParameter("incmg_dt");
if( incmg_dt == null){
	System.out.println(this.toString+" : incmg_dt is null" );
}else{
	System.out.println(this.toString+" : incmg_dt is "+incmg_dt );
}
String impt_dept = req.getParameter("impt_dept");
if( impt_dept == null){
	System.out.println(this.toString+" : impt_dept is null" );
}else{
	System.out.println(this.toString+" : impt_dept is "+impt_dept );
}
String incmg_seq = req.getParameter("incmg_seq");
if( incmg_seq == null){
	System.out.println(this.toString+" : incmg_seq is null" );
}else{
	System.out.println(this.toString+" : incmg_seq is "+incmg_seq );
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
String dlco_nm = req.getParameter("dlco_nm");
if( dlco_nm == null){
	System.out.println(this.toString+" : dlco_nm is null" );
}else{
	System.out.println(this.toString+" : dlco_nm is "+dlco_nm );
}
String obj_amt = req.getParameter("obj_amt");
if( obj_amt == null){
	System.out.println(this.toString+" : obj_amt is null" );
}else{
	System.out.println(this.toString+" : obj_amt is "+obj_amt );
}
String incm_clsf_cd = req.getParameter("incm_clsf_cd");
if( incm_clsf_cd == null){
	System.out.println(this.toString+" : incm_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : incm_clsf_cd is "+incm_clsf_cd );
}
String incm_tax = req.getParameter("incm_tax");
if( incm_tax == null){
	System.out.println(this.toString+" : incm_tax is null" );
}else{
	System.out.println(this.toString+" : incm_tax is "+incm_tax );
}
String res_tax = req.getParameter("res_tax");
if( res_tax == null){
	System.out.println(this.toString+" : res_tax is null" );
}else{
	System.out.println(this.toString+" : res_tax is "+res_tax );
}
String rmks2 = req.getParameter("rmks2");
if( rmks2 == null){
	System.out.println(this.toString+" : rmks2 is null" );
}else{
	System.out.println(this.toString+" : rmks2 is "+rmks2 );
}
String budg_cd = req.getParameter("budg_cd");
if( budg_cd == null){
	System.out.println(this.toString+" : budg_cd is null" );
}else{
	System.out.println(this.toString+" : budg_cd is "+budg_cd );
}
String rcpm_amt = req.getParameter("rcpm_amt");
if( rcpm_amt == null){
	System.out.println(this.toString+" : rcpm_amt is null" );
}else{
	System.out.println(this.toString+" : rcpm_amt is "+rcpm_amt );
}
String mang_clsf_cd = req.getParameter("mang_clsf_cd");
if( mang_clsf_cd == null){
	System.out.println(this.toString+" : mang_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : mang_clsf_cd is "+mang_clsf_cd );
}
String comp_dt = req.getParameter("comp_dt");
if( comp_dt == null){
	System.out.println(this.toString+" : comp_dt is null" );
}else{
	System.out.println(this.toString+" : comp_dt is "+comp_dt );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String biz_reg_no = req.getParameter("biz_reg_no");
if( biz_reg_no == null){
	System.out.println(this.toString+" : biz_reg_no is null" );
}else{
	System.out.println(this.toString+" : biz_reg_no is "+biz_reg_no );
}
String bank_id = req.getParameter("bank_id");
if( bank_id == null){
	System.out.println(this.toString+" : bank_id is null" );
}else{
	System.out.println(this.toString+" : bank_id is "+bank_id );
}
String acct_num = req.getParameter("acct_num");
if( acct_num == null){
	System.out.println(this.toString+" : acct_num is null" );
}else{
	System.out.println(this.toString+" : acct_num is "+acct_num );
}
String tran_date_seq = req.getParameter("tran_date_seq");
if( tran_date_seq == null){
	System.out.println(this.toString+" : tran_date_seq is null" );
}else{
	System.out.println(this.toString+" : tran_date_seq is "+tran_date_seq );
}
String chnl_clsf_cd = req.getParameter("chnl_clsf_cd");
if( chnl_clsf_cd == null){
	System.out.println(this.toString+" : chnl_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : chnl_clsf_cd is "+chnl_clsf_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String pch_flag = Util.checkString(req.getParameter("pch_flag"));
String incmg_dt = Util.checkString(req.getParameter("incmg_dt"));
String impt_dept = Util.checkString(req.getParameter("impt_dept"));
String incmg_seq = Util.checkString(req.getParameter("incmg_seq"));
String dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
String obj_amt = Util.checkString(req.getParameter("obj_amt"));
String incm_clsf_cd = Util.checkString(req.getParameter("incm_clsf_cd"));
String incm_tax = Util.checkString(req.getParameter("incm_tax"));
String res_tax = Util.checkString(req.getParameter("res_tax"));
String rmks2 = Util.checkString(req.getParameter("rmks2"));
String budg_cd = Util.checkString(req.getParameter("budg_cd"));
String rcpm_amt = Util.checkString(req.getParameter("rcpm_amt"));
String mang_clsf_cd = Util.checkString(req.getParameter("mang_clsf_cd"));
String comp_dt = Util.checkString(req.getParameter("comp_dt"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String biz_reg_no = Util.checkString(req.getParameter("biz_reg_no"));
String bank_id = Util.checkString(req.getParameter("bank_id"));
String acct_num = Util.checkString(req.getParameter("acct_num"));
String tran_date_seq = Util.checkString(req.getParameter("tran_date_seq"));
String chnl_clsf_cd = Util.checkString(req.getParameter("chnl_clsf_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String pch_flag = Util.Uni2Ksc(Util.checkString(req.getParameter("pch_flag")));
String incmg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_dt")));
String impt_dept = Util.Uni2Ksc(Util.checkString(req.getParameter("impt_dept")));
String incmg_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_seq")));
String dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_nm")));
String obj_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("obj_amt")));
String incm_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("incm_clsf_cd")));
String incm_tax = Util.Uni2Ksc(Util.checkString(req.getParameter("incm_tax")));
String res_tax = Util.Uni2Ksc(Util.checkString(req.getParameter("res_tax")));
String rmks2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rmks2")));
String budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd")));
String rcpm_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_amt")));
String mang_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_clsf_cd")));
String comp_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("comp_dt")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String biz_reg_no = Util.Uni2Ksc(Util.checkString(req.getParameter("biz_reg_no")));
String bank_id = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_id")));
String acct_num = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_num")));
String tran_date_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_date_seq")));
String chnl_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("chnl_clsf_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setPch_flag(pch_flag);
dm.setIncmg_dt(incmg_dt);
dm.setImpt_dept(impt_dept);
dm.setIncmg_seq(incmg_seq);
dm.setDlco_clsf_cd(dlco_clsf_cd);
dm.setDlco_cd(dlco_cd);
dm.setDlco_nm(dlco_nm);
dm.setObj_amt(obj_amt);
dm.setIncm_clsf_cd(incm_clsf_cd);
dm.setIncm_tax(incm_tax);
dm.setRes_tax(res_tax);
dm.setRmks2(rmks2);
dm.setBudg_cd(budg_cd);
dm.setRcpm_amt(rcpm_amt);
dm.setMang_clsf_cd(mang_clsf_cd);
dm.setComp_dt(comp_dt);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setBiz_reg_no(biz_reg_no);
dm.setBank_id(bank_id);
dm.setAcct_num(acct_num);
dm.setTran_date_seq(tran_date_seq);
dm.setChnl_clsf_cd(chnl_clsf_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jun 02 18:55:24 KST 2015 */