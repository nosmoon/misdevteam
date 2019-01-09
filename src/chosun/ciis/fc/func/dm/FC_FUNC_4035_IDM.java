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


public class FC_FUNC_4035_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String curacct_clsf_cd;
	public String stat_dt;
	public String chg_pers;
	public String incmg_pers_ipadd;
	public String mtry_dt;
	public String pay_note_no;
	public String note_amt;
	public String comp_dt;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String rmks1;
	public String rmks2;
	public String use_dept_cd;

	public FC_FUNC_4035_IDM(){}
	public FC_FUNC_4035_IDM(String cmpy_cd, String curacct_clsf_cd, String stat_dt, String chg_pers, String incmg_pers_ipadd, String mtry_dt, String pay_note_no, String note_amt, String comp_dt, String dlco_clsf_cd, String dlco_cd, String rmks1, String rmks2, String use_dept_cd){
		this.cmpy_cd = cmpy_cd;
		this.curacct_clsf_cd = curacct_clsf_cd;
		this.stat_dt = stat_dt;
		this.chg_pers = chg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.mtry_dt = mtry_dt;
		this.pay_note_no = pay_note_no;
		this.note_amt = note_amt;
		this.comp_dt = comp_dt;
		this.dlco_clsf_cd = dlco_clsf_cd;
		this.dlco_cd = dlco_cd;
		this.rmks1 = rmks1;
		this.rmks2 = rmks2;
		this.use_dept_cd = use_dept_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setCuracct_clsf_cd(String curacct_clsf_cd){
		this.curacct_clsf_cd = curacct_clsf_cd;
	}

	public void setStat_dt(String stat_dt){
		this.stat_dt = stat_dt;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setPay_note_no(String pay_note_no){
		this.pay_note_no = pay_note_no;
	}

	public void setNote_amt(String note_amt){
		this.note_amt = note_amt;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
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

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getCuracct_clsf_cd(){
		return this.curacct_clsf_cd;
	}

	public String getStat_dt(){
		return this.stat_dt;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getPay_note_no(){
		return this.pay_note_no;
	}

	public String getNote_amt(){
		return this.note_amt;
	}

	public String getComp_dt(){
		return this.comp_dt;
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

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_4035_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_4035_IDM dm = (FC_FUNC_4035_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.curacct_clsf_cd);
		cstmt.setString(5, dm.stat_dt);
		cstmt.setString(6, dm.chg_pers);
		cstmt.setString(7, dm.incmg_pers_ipadd);
		cstmt.setString(8, dm.mtry_dt);
		cstmt.setString(9, dm.pay_note_no);
		cstmt.setString(10, dm.note_amt);
		cstmt.setString(11, dm.comp_dt);
		cstmt.setString(12, dm.dlco_clsf_cd);
		cstmt.setString(13, dm.dlco_cd);
		cstmt.setString(14, dm.rmks1);
		cstmt.setString(15, dm.rmks2);
		cstmt.setString(16, dm.use_dept_cd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_4035_IDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("curacct_clsf_cd = " + getCuracct_clsf_cd());
        System.out.println("stat_dt = " + getStat_dt());
        System.out.println("chg_pers = " + getChg_pers());
        System.out.println("incmg_pers_ipadd = " + getIncmg_pers_ipadd());
        System.out.println("mtry_dt = " + getMtry_dt());
        System.out.println("pay_note_no = " + getPay_note_no());
        System.out.println("note_amt = " + getNote_amt());
        System.out.println("comp_dt = " + getComp_dt());
        System.out.println("dlco_clsf_cd = " + getDlco_clsf_cd());
        System.out.println("dlco_cd = " + getDlco_cd());
        System.out.println("rmks1 = " + getRmks1());
        System.out.println("rmks2 = " + getRmks2());
        System.out.println("use_dept_cd = " + getUse_dept_cd());
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
String curacct_clsf_cd = req.getParameter("curacct_clsf_cd");
if( curacct_clsf_cd == null){
	System.out.println(this.toString+" : curacct_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : curacct_clsf_cd is "+curacct_clsf_cd );
}
String stat_dt = req.getParameter("stat_dt");
if( stat_dt == null){
	System.out.println(this.toString+" : stat_dt is null" );
}else{
	System.out.println(this.toString+" : stat_dt is "+stat_dt );
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
String mtry_dt = req.getParameter("mtry_dt");
if( mtry_dt == null){
	System.out.println(this.toString+" : mtry_dt is null" );
}else{
	System.out.println(this.toString+" : mtry_dt is "+mtry_dt );
}
String pay_note_no = req.getParameter("pay_note_no");
if( pay_note_no == null){
	System.out.println(this.toString+" : pay_note_no is null" );
}else{
	System.out.println(this.toString+" : pay_note_no is "+pay_note_no );
}
String note_amt = req.getParameter("note_amt");
if( note_amt == null){
	System.out.println(this.toString+" : note_amt is null" );
}else{
	System.out.println(this.toString+" : note_amt is "+note_amt );
}
String comp_dt = req.getParameter("comp_dt");
if( comp_dt == null){
	System.out.println(this.toString+" : comp_dt is null" );
}else{
	System.out.println(this.toString+" : comp_dt is "+comp_dt );
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
String use_dept_cd = req.getParameter("use_dept_cd");
if( use_dept_cd == null){
	System.out.println(this.toString+" : use_dept_cd is null" );
}else{
	System.out.println(this.toString+" : use_dept_cd is "+use_dept_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String curacct_clsf_cd = Util.checkString(req.getParameter("curacct_clsf_cd"));
String stat_dt = Util.checkString(req.getParameter("stat_dt"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
String pay_note_no = Util.checkString(req.getParameter("pay_note_no"));
String note_amt = Util.checkString(req.getParameter("note_amt"));
String comp_dt = Util.checkString(req.getParameter("comp_dt"));
String dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String rmks1 = Util.checkString(req.getParameter("rmks1"));
String rmks2 = Util.checkString(req.getParameter("rmks2"));
String use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String curacct_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("curacct_clsf_cd")));
String stat_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("stat_dt")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String mtry_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("mtry_dt")));
String pay_note_no = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_note_no")));
String note_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("note_amt")));
String comp_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("comp_dt")));
String dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String rmks1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rmks1")));
String rmks2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rmks2")));
String use_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dept_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setCuracct_clsf_cd(curacct_clsf_cd);
dm.setStat_dt(stat_dt);
dm.setChg_pers(chg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setMtry_dt(mtry_dt);
dm.setPay_note_no(pay_note_no);
dm.setNote_amt(note_amt);
dm.setComp_dt(comp_dt);
dm.setDlco_clsf_cd(dlco_clsf_cd);
dm.setDlco_cd(dlco_cd);
dm.setRmks1(rmks1);
dm.setRmks2(rmks2);
dm.setUse_dept_cd(use_dept_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Mar 07 14:52:46 KST 2009 */