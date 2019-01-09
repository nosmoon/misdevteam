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


public class FC_FUNC_1064_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String pch_amt1;
	public String pch_amt2;
	public String pch_amt3;
	public String pch_sql;
	public String stat_dt;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String pch_compnm;
	public String rmks1;
	public String incmg_pers;
	public String incmg_pers_ipadd;
	public String bank_cd;
	public String note_no;
	public String note_seq;
	public String rcpay_amt;
	public String note_clsf_cd;
	public String mtry_dt;
	public String use_dept_cd;
	public String incm_clsf_cd;
	public String pch_amt4;
	public String pch_amt5;

	public FC_FUNC_1064_IDM(){}
	public FC_FUNC_1064_IDM(String cmpy_cd, String pch_amt1, String pch_amt2, String pch_amt3, String pch_sql, String stat_dt, String dlco_clsf_cd, String dlco_cd, String pch_compnm, String rmks1, String incmg_pers, String incmg_pers_ipadd, String bank_cd, String note_no, String note_seq, String rcpay_amt, String note_clsf_cd, String mtry_dt, String use_dept_cd, String incm_clsf_cd, String pch_amt4, String pch_amt5){
		this.cmpy_cd = cmpy_cd;
		this.pch_amt1 = pch_amt1;
		this.pch_amt2 = pch_amt2;
		this.pch_amt3 = pch_amt3;
		this.pch_sql = pch_sql;
		this.stat_dt = stat_dt;
		this.dlco_clsf_cd = dlco_clsf_cd;
		this.dlco_cd = dlco_cd;
		this.pch_compnm = pch_compnm;
		this.rmks1 = rmks1;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.bank_cd = bank_cd;
		this.note_no = note_no;
		this.note_seq = note_seq;
		this.rcpay_amt = rcpay_amt;
		this.note_clsf_cd = note_clsf_cd;
		this.mtry_dt = mtry_dt;
		this.use_dept_cd = use_dept_cd;
		this.incm_clsf_cd = incm_clsf_cd;
		this.pch_amt4 = pch_amt4;
		this.pch_amt5 = pch_amt5;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPch_amt1(String pch_amt1){
		this.pch_amt1 = pch_amt1;
	}

	public void setPch_amt2(String pch_amt2){
		this.pch_amt2 = pch_amt2;
	}

	public void setPch_amt3(String pch_amt3){
		this.pch_amt3 = pch_amt3;
	}

	public void setPch_sql(String pch_sql){
		this.pch_sql = pch_sql;
	}

	public void setStat_dt(String stat_dt){
		this.stat_dt = stat_dt;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setPch_compnm(String pch_compnm){
		this.pch_compnm = pch_compnm;
	}

	public void setRmks1(String rmks1){
		this.rmks1 = rmks1;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
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

	public void setRcpay_amt(String rcpay_amt){
		this.rcpay_amt = rcpay_amt;
	}

	public void setNote_clsf_cd(String note_clsf_cd){
		this.note_clsf_cd = note_clsf_cd;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setIncm_clsf_cd(String incm_clsf_cd){
		this.incm_clsf_cd = incm_clsf_cd;
	}

	public void setPch_amt4(String pch_amt4){
		this.pch_amt4 = pch_amt4;
	}

	public void setPch_amt5(String pch_amt5){
		this.pch_amt5 = pch_amt5;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getPch_amt1(){
		return this.pch_amt1;
	}

	public String getPch_amt2(){
		return this.pch_amt2;
	}

	public String getPch_amt3(){
		return this.pch_amt3;
	}

	public String getPch_sql(){
		return this.pch_sql;
	}

	public String getStat_dt(){
		return this.stat_dt;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getPch_compnm(){
		return this.pch_compnm;
	}

	public String getRmks1(){
		return this.rmks1;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
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

	public String getRcpay_amt(){
		return this.rcpay_amt;
	}

	public String getNote_clsf_cd(){
		return this.note_clsf_cd;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getIncm_clsf_cd(){
		return this.incm_clsf_cd;
	}

	public String getPch_amt4(){
		return this.pch_amt4;
	}

	public String getPch_amt5(){
		return this.pch_amt5;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_1064_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_1064_IDM dm = (FC_FUNC_1064_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.pch_amt1);
		cstmt.setString(5, dm.pch_amt2);
		cstmt.setString(6, dm.pch_amt3);
		cstmt.setString(7, dm.pch_sql);
		cstmt.setString(8, dm.stat_dt);
		cstmt.setString(9, dm.dlco_clsf_cd);
		cstmt.setString(10, dm.dlco_cd);
		cstmt.setString(11, dm.pch_compnm);
		cstmt.setString(12, dm.rmks1);
		cstmt.setString(13, dm.incmg_pers);
		cstmt.setString(14, dm.incmg_pers_ipadd);
		cstmt.setString(15, dm.bank_cd);
		cstmt.setString(16, dm.note_no);
		cstmt.setString(17, dm.note_seq);
		cstmt.setString(18, dm.rcpay_amt);
		cstmt.setString(19, dm.note_clsf_cd);
		cstmt.setString(20, dm.mtry_dt);
		cstmt.setString(21, dm.use_dept_cd);
		cstmt.setString(22, dm.incm_clsf_cd);
		cstmt.setString(23, dm.pch_amt4);
		cstmt.setString(24, dm.pch_amt5);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_1064_IDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("pch_amt1 = " + getPch_amt1());
        System.out.println("pch_amt2 = " + getPch_amt2());
        System.out.println("pch_amt3 = " + getPch_amt3());
        System.out.println("pch_sql = " + getPch_sql());
        System.out.println("stat_dt = " + getStat_dt());
        System.out.println("dlco_clsf_cd = " + getDlco_clsf_cd());
        System.out.println("dlco_cd = " + getDlco_cd());
        System.out.println("pch_compnm = " + getPch_compnm());
        System.out.println("rmks1 = " + getRmks1());
        System.out.println("incmg_pers = " + getIncmg_pers());
        System.out.println("incmg_pers_ipadd = " + getIncmg_pers_ipadd());
        System.out.println("bank_cd = " + getBank_cd());
        System.out.println("note_no = " + getNote_no());
        System.out.println("note_seq = " + getNote_seq());
        System.out.println("rcpay_amt = " + getRcpay_amt());
        System.out.println("note_clsf_cd = " + getNote_clsf_cd());
        System.out.println("mtry_dt = " + getMtry_dt());
        System.out.println("use_dept_cd = " + getUse_dept_cd());
        System.out.println("incm_clsf_cd = " + getIncm_clsf_cd());
        System.out.println("pch_amt4 = " + getPch_amt4());
        System.out.println("pch_amt5 = " + getPch_amt5());
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
String pch_amt1 = req.getParameter("pch_amt1");
if( pch_amt1 == null){
	System.out.println(this.toString+" : pch_amt1 is null" );
}else{
	System.out.println(this.toString+" : pch_amt1 is "+pch_amt1 );
}
String pch_amt2 = req.getParameter("pch_amt2");
if( pch_amt2 == null){
	System.out.println(this.toString+" : pch_amt2 is null" );
}else{
	System.out.println(this.toString+" : pch_amt2 is "+pch_amt2 );
}
String pch_amt3 = req.getParameter("pch_amt3");
if( pch_amt3 == null){
	System.out.println(this.toString+" : pch_amt3 is null" );
}else{
	System.out.println(this.toString+" : pch_amt3 is "+pch_amt3 );
}
String pch_sql = req.getParameter("pch_sql");
if( pch_sql == null){
	System.out.println(this.toString+" : pch_sql is null" );
}else{
	System.out.println(this.toString+" : pch_sql is "+pch_sql );
}
String stat_dt = req.getParameter("stat_dt");
if( stat_dt == null){
	System.out.println(this.toString+" : stat_dt is null" );
}else{
	System.out.println(this.toString+" : stat_dt is "+stat_dt );
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
String pch_compnm = req.getParameter("pch_compnm");
if( pch_compnm == null){
	System.out.println(this.toString+" : pch_compnm is null" );
}else{
	System.out.println(this.toString+" : pch_compnm is "+pch_compnm );
}
String rmks1 = req.getParameter("rmks1");
if( rmks1 == null){
	System.out.println(this.toString+" : rmks1 is null" );
}else{
	System.out.println(this.toString+" : rmks1 is "+rmks1 );
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
String rcpay_amt = req.getParameter("rcpay_amt");
if( rcpay_amt == null){
	System.out.println(this.toString+" : rcpay_amt is null" );
}else{
	System.out.println(this.toString+" : rcpay_amt is "+rcpay_amt );
}
String note_clsf_cd = req.getParameter("note_clsf_cd");
if( note_clsf_cd == null){
	System.out.println(this.toString+" : note_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : note_clsf_cd is "+note_clsf_cd );
}
String mtry_dt = req.getParameter("mtry_dt");
if( mtry_dt == null){
	System.out.println(this.toString+" : mtry_dt is null" );
}else{
	System.out.println(this.toString+" : mtry_dt is "+mtry_dt );
}
String use_dept_cd = req.getParameter("use_dept_cd");
if( use_dept_cd == null){
	System.out.println(this.toString+" : use_dept_cd is null" );
}else{
	System.out.println(this.toString+" : use_dept_cd is "+use_dept_cd );
}
String incm_clsf_cd = req.getParameter("incm_clsf_cd");
if( incm_clsf_cd == null){
	System.out.println(this.toString+" : incm_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : incm_clsf_cd is "+incm_clsf_cd );
}
String pch_amt4 = req.getParameter("pch_amt4");
if( pch_amt4 == null){
	System.out.println(this.toString+" : pch_amt4 is null" );
}else{
	System.out.println(this.toString+" : pch_amt4 is "+pch_amt4 );
}
String pch_amt5 = req.getParameter("pch_amt5");
if( pch_amt5 == null){
	System.out.println(this.toString+" : pch_amt5 is null" );
}else{
	System.out.println(this.toString+" : pch_amt5 is "+pch_amt5 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String pch_amt1 = Util.checkString(req.getParameter("pch_amt1"));
String pch_amt2 = Util.checkString(req.getParameter("pch_amt2"));
String pch_amt3 = Util.checkString(req.getParameter("pch_amt3"));
String pch_sql = Util.checkString(req.getParameter("pch_sql"));
String stat_dt = Util.checkString(req.getParameter("stat_dt"));
String dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String pch_compnm = Util.checkString(req.getParameter("pch_compnm"));
String rmks1 = Util.checkString(req.getParameter("rmks1"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String bank_cd = Util.checkString(req.getParameter("bank_cd"));
String note_no = Util.checkString(req.getParameter("note_no"));
String note_seq = Util.checkString(req.getParameter("note_seq"));
String rcpay_amt = Util.checkString(req.getParameter("rcpay_amt"));
String note_clsf_cd = Util.checkString(req.getParameter("note_clsf_cd"));
String mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
String use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
String incm_clsf_cd = Util.checkString(req.getParameter("incm_clsf_cd"));
String pch_amt4 = Util.checkString(req.getParameter("pch_amt4"));
String pch_amt5 = Util.checkString(req.getParameter("pch_amt5"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String pch_amt1 = Util.Uni2Ksc(Util.checkString(req.getParameter("pch_amt1")));
String pch_amt2 = Util.Uni2Ksc(Util.checkString(req.getParameter("pch_amt2")));
String pch_amt3 = Util.Uni2Ksc(Util.checkString(req.getParameter("pch_amt3")));
String pch_sql = Util.Uni2Ksc(Util.checkString(req.getParameter("pch_sql")));
String stat_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("stat_dt")));
String dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String pch_compnm = Util.Uni2Ksc(Util.checkString(req.getParameter("pch_compnm")));
String rmks1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rmks1")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String bank_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_cd")));
String note_no = Util.Uni2Ksc(Util.checkString(req.getParameter("note_no")));
String note_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("note_seq")));
String rcpay_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpay_amt")));
String note_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("note_clsf_cd")));
String mtry_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("mtry_dt")));
String use_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dept_cd")));
String incm_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("incm_clsf_cd")));
String pch_amt4 = Util.Uni2Ksc(Util.checkString(req.getParameter("pch_amt4")));
String pch_amt5 = Util.Uni2Ksc(Util.checkString(req.getParameter("pch_amt5")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setPch_amt1(pch_amt1);
dm.setPch_amt2(pch_amt2);
dm.setPch_amt3(pch_amt3);
dm.setPch_sql(pch_sql);
dm.setStat_dt(stat_dt);
dm.setDlco_clsf_cd(dlco_clsf_cd);
dm.setDlco_cd(dlco_cd);
dm.setPch_compnm(pch_compnm);
dm.setRmks1(rmks1);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setBank_cd(bank_cd);
dm.setNote_no(note_no);
dm.setNote_seq(note_seq);
dm.setRcpay_amt(rcpay_amt);
dm.setNote_clsf_cd(note_clsf_cd);
dm.setMtry_dt(mtry_dt);
dm.setUse_dept_cd(use_dept_cd);
dm.setIncm_clsf_cd(incm_clsf_cd);
dm.setPch_amt4(pch_amt4);
dm.setPch_amt5(pch_amt5);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 16 20:24:59 KST 2009 */