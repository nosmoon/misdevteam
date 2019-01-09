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


public class FC_FUNC_7013_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fund_mang_no;
	public String loan_no;
	public String int_rate_chg_dt;
	public String int_rate;
	public String incmg_pers;
	public String incmg_pers_ipadd;

	public FC_FUNC_7013_UDM(){}
	public FC_FUNC_7013_UDM(String cmpy_cd, String fund_mang_no, String loan_no, String int_rate_chg_dt, String int_rate, String incmg_pers, String incmg_pers_ipadd){
		this.cmpy_cd = cmpy_cd;
		this.fund_mang_no = fund_mang_no;
		this.loan_no = loan_no;
		this.int_rate_chg_dt = int_rate_chg_dt;
		this.int_rate = int_rate;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFund_mang_no(String fund_mang_no){
		this.fund_mang_no = fund_mang_no;
	}

	public void setLoan_no(String loan_no){
		this.loan_no = loan_no;
	}

	public void setInt_rate_chg_dt(String int_rate_chg_dt){
		this.int_rate_chg_dt = int_rate_chg_dt;
	}

	public void setInt_rate(String int_rate){
		this.int_rate = int_rate;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFund_mang_no(){
		return this.fund_mang_no;
	}

	public String getLoan_no(){
		return this.loan_no;
	}

	public String getInt_rate_chg_dt(){
		return this.int_rate_chg_dt;
	}

	public String getInt_rate(){
		return this.int_rate;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_7013_U(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_7013_UDM dm = (FC_FUNC_7013_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fund_mang_no);
		cstmt.setString(5, dm.loan_no);
		cstmt.setString(6, dm.int_rate_chg_dt);
		cstmt.setString(7, dm.int_rate);
		cstmt.setString(8, dm.incmg_pers);
		cstmt.setString(9, dm.incmg_pers_ipadd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_7013_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fund_mang_no = [" + getFund_mang_no() + "]");
		System.out.println("loan_no = [" + getLoan_no() + "]");
		System.out.println("int_rate_chg_dt = [" + getInt_rate_chg_dt() + "]");
		System.out.println("int_rate = [" + getInt_rate() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
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
String fund_mang_no = req.getParameter("fund_mang_no");
if( fund_mang_no == null){
	System.out.println(this.toString+" : fund_mang_no is null" );
}else{
	System.out.println(this.toString+" : fund_mang_no is "+fund_mang_no );
}
String loan_no = req.getParameter("loan_no");
if( loan_no == null){
	System.out.println(this.toString+" : loan_no is null" );
}else{
	System.out.println(this.toString+" : loan_no is "+loan_no );
}
String int_rate_chg_dt = req.getParameter("int_rate_chg_dt");
if( int_rate_chg_dt == null){
	System.out.println(this.toString+" : int_rate_chg_dt is null" );
}else{
	System.out.println(this.toString+" : int_rate_chg_dt is "+int_rate_chg_dt );
}
String int_rate = req.getParameter("int_rate");
if( int_rate == null){
	System.out.println(this.toString+" : int_rate is null" );
}else{
	System.out.println(this.toString+" : int_rate is "+int_rate );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String fund_mang_no = Util.checkString(req.getParameter("fund_mang_no"));
String loan_no = Util.checkString(req.getParameter("loan_no"));
String int_rate_chg_dt = Util.checkString(req.getParameter("int_rate_chg_dt"));
String int_rate = Util.checkString(req.getParameter("int_rate"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fund_mang_no = Util.Uni2Ksc(Util.checkString(req.getParameter("fund_mang_no")));
String loan_no = Util.Uni2Ksc(Util.checkString(req.getParameter("loan_no")));
String int_rate_chg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("int_rate_chg_dt")));
String int_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("int_rate")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFund_mang_no(fund_mang_no);
dm.setLoan_no(loan_no);
dm.setInt_rate_chg_dt(int_rate_chg_dt);
dm.setInt_rate(int_rate);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 01 19:42:51 KST 2009 */