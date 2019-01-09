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


package chosun.ciis.tn.rpt.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.rpt.ds.*;
import chosun.ciis.tn.rpt.rec.*;

/**
 * 
 */


public class TN_RPT_1102_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String bank_cd;
	public String bank_gb;
	public String bank_nm;
	public String bank_acct_no;
	public String use_yn;
	public String remk;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public TN_RPT_1102_ADM(){}
	public TN_RPT_1102_ADM(String mode, String cmpy_cd, String bank_cd, String bank_gb, String bank_nm, String bank_acct_no, String use_yn, String remk, String incmg_pers_ipadd, String incmg_pers){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.bank_cd = bank_cd;
		this.bank_gb = bank_gb;
		this.bank_nm = bank_nm;
		this.bank_acct_no = bank_acct_no;
		this.use_yn = use_yn;
		this.remk = remk;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setBank_gb(String bank_gb){
		this.bank_gb = bank_gb;
	}

	public void setBank_nm(String bank_nm){
		this.bank_nm = bank_nm;
	}

	public void setBank_acct_no(String bank_acct_no){
		this.bank_acct_no = bank_acct_no;
	}

	public void setUse_yn(String use_yn){
		this.use_yn = use_yn;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getBank_gb(){
		return this.bank_gb;
	}

	public String getBank_nm(){
		return this.bank_nm;
	}

	public String getBank_acct_no(){
		return this.bank_acct_no;
	}

	public String getUse_yn(){
		return this.use_yn;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_RPT_1102_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_RPT_1102_ADM dm = (TN_RPT_1102_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.bank_cd);
		cstmt.setString(6, dm.bank_gb);
		cstmt.setString(7, dm.bank_nm);
		cstmt.setString(8, dm.bank_acct_no);
		cstmt.setString(9, dm.use_yn);
		cstmt.setString(10, dm.remk);
		cstmt.setString(11, dm.incmg_pers_ipadd);
		cstmt.setString(12, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.rpt.ds.TN_RPT_1102_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("bank_cd = [" + getBank_cd() + "]");
		System.out.println("bank_gb = [" + getBank_gb() + "]");
		System.out.println("bank_nm = [" + getBank_nm() + "]");
		System.out.println("bank_acct_no = [" + getBank_acct_no() + "]");
		System.out.println("use_yn = [" + getUse_yn() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String bank_cd = req.getParameter("bank_cd");
if( bank_cd == null){
	System.out.println(this.toString+" : bank_cd is null" );
}else{
	System.out.println(this.toString+" : bank_cd is "+bank_cd );
}
String bank_gb = req.getParameter("bank_gb");
if( bank_gb == null){
	System.out.println(this.toString+" : bank_gb is null" );
}else{
	System.out.println(this.toString+" : bank_gb is "+bank_gb );
}
String bank_nm = req.getParameter("bank_nm");
if( bank_nm == null){
	System.out.println(this.toString+" : bank_nm is null" );
}else{
	System.out.println(this.toString+" : bank_nm is "+bank_nm );
}
String bank_acct_no = req.getParameter("bank_acct_no");
if( bank_acct_no == null){
	System.out.println(this.toString+" : bank_acct_no is null" );
}else{
	System.out.println(this.toString+" : bank_acct_no is "+bank_acct_no );
}
String use_yn = req.getParameter("use_yn");
if( use_yn == null){
	System.out.println(this.toString+" : use_yn is null" );
}else{
	System.out.println(this.toString+" : use_yn is "+use_yn );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
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

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String bank_cd = Util.checkString(req.getParameter("bank_cd"));
String bank_gb = Util.checkString(req.getParameter("bank_gb"));
String bank_nm = Util.checkString(req.getParameter("bank_nm"));
String bank_acct_no = Util.checkString(req.getParameter("bank_acct_no"));
String use_yn = Util.checkString(req.getParameter("use_yn"));
String remk = Util.checkString(req.getParameter("remk"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String bank_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_cd")));
String bank_gb = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_gb")));
String bank_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_nm")));
String bank_acct_no = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_acct_no")));
String use_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("use_yn")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setBank_cd(bank_cd);
dm.setBank_gb(bank_gb);
dm.setBank_nm(bank_nm);
dm.setBank_acct_no(bank_acct_no);
dm.setUse_yn(use_yn);
dm.setRemk(remk);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Aug 24 16:44:52 KST 2016 */