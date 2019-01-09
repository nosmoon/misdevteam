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


public class FC_FUNC_7041_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String date;
	public String fund_mang_no;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String comp_dt_fr;
	public String comp_dt_to;
	public String mtry_dt_fr;
	public String mtry_dt_to;

	public FC_FUNC_7041_LDM(){}
	public FC_FUNC_7041_LDM(String cmpy_cd, String date, String fund_mang_no, String dlco_clsf_cd, String dlco_cd, String comp_dt_fr, String comp_dt_to, String mtry_dt_fr, String mtry_dt_to){
		this.cmpy_cd = cmpy_cd;
		this.date = date;
		this.fund_mang_no = fund_mang_no;
		this.dlco_clsf_cd = dlco_clsf_cd;
		this.dlco_cd = dlco_cd;
		this.comp_dt_fr = comp_dt_fr;
		this.comp_dt_to = comp_dt_to;
		this.mtry_dt_fr = mtry_dt_fr;
		this.mtry_dt_to = mtry_dt_to;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDate(String date){
		this.date = date;
	}

	public void setFund_mang_no(String fund_mang_no){
		this.fund_mang_no = fund_mang_no;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setComp_dt_fr(String comp_dt_fr){
		this.comp_dt_fr = comp_dt_fr;
	}

	public void setComp_dt_to(String comp_dt_to){
		this.comp_dt_to = comp_dt_to;
	}

	public void setMtry_dt_fr(String mtry_dt_fr){
		this.mtry_dt_fr = mtry_dt_fr;
	}

	public void setMtry_dt_to(String mtry_dt_to){
		this.mtry_dt_to = mtry_dt_to;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDate(){
		return this.date;
	}

	public String getFund_mang_no(){
		return this.fund_mang_no;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getComp_dt_fr(){
		return this.comp_dt_fr;
	}

	public String getComp_dt_to(){
		return this.comp_dt_to;
	}

	public String getMtry_dt_fr(){
		return this.mtry_dt_fr;
	}

	public String getMtry_dt_to(){
		return this.mtry_dt_to;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_7041_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_7041_LDM dm = (FC_FUNC_7041_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.date);
		cstmt.setString(5, dm.fund_mang_no);
		cstmt.setString(6, dm.dlco_clsf_cd);
		cstmt.setString(7, dm.dlco_cd);
		cstmt.setString(8, dm.comp_dt_fr);
		cstmt.setString(9, dm.comp_dt_to);
		cstmt.setString(10, dm.mtry_dt_fr);
		cstmt.setString(11, dm.mtry_dt_to);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_7041_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("date = [" + getDate() + "]");
		System.out.println("fund_mang_no = [" + getFund_mang_no() + "]");
		System.out.println("dlco_clsf_cd = [" + getDlco_clsf_cd() + "]");
		System.out.println("dlco_cd = [" + getDlco_cd() + "]");
		System.out.println("comp_dt_fr = [" + getComp_dt_fr() + "]");
		System.out.println("comp_dt_to = [" + getComp_dt_to() + "]");
		System.out.println("mtry_dt_fr = [" + getMtry_dt_fr() + "]");
		System.out.println("mtry_dt_to = [" + getMtry_dt_to() + "]");
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
String date = req.getParameter("date");
if( date == null){
	System.out.println(this.toString+" : date is null" );
}else{
	System.out.println(this.toString+" : date is "+date );
}
String fund_mang_no = req.getParameter("fund_mang_no");
if( fund_mang_no == null){
	System.out.println(this.toString+" : fund_mang_no is null" );
}else{
	System.out.println(this.toString+" : fund_mang_no is "+fund_mang_no );
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
String comp_dt_fr = req.getParameter("comp_dt_fr");
if( comp_dt_fr == null){
	System.out.println(this.toString+" : comp_dt_fr is null" );
}else{
	System.out.println(this.toString+" : comp_dt_fr is "+comp_dt_fr );
}
String comp_dt_to = req.getParameter("comp_dt_to");
if( comp_dt_to == null){
	System.out.println(this.toString+" : comp_dt_to is null" );
}else{
	System.out.println(this.toString+" : comp_dt_to is "+comp_dt_to );
}
String mtry_dt_fr = req.getParameter("mtry_dt_fr");
if( mtry_dt_fr == null){
	System.out.println(this.toString+" : mtry_dt_fr is null" );
}else{
	System.out.println(this.toString+" : mtry_dt_fr is "+mtry_dt_fr );
}
String mtry_dt_to = req.getParameter("mtry_dt_to");
if( mtry_dt_to == null){
	System.out.println(this.toString+" : mtry_dt_to is null" );
}else{
	System.out.println(this.toString+" : mtry_dt_to is "+mtry_dt_to );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String date = Util.checkString(req.getParameter("date"));
String fund_mang_no = Util.checkString(req.getParameter("fund_mang_no"));
String dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String comp_dt_fr = Util.checkString(req.getParameter("comp_dt_fr"));
String comp_dt_to = Util.checkString(req.getParameter("comp_dt_to"));
String mtry_dt_fr = Util.checkString(req.getParameter("mtry_dt_fr"));
String mtry_dt_to = Util.checkString(req.getParameter("mtry_dt_to"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String date = Util.Uni2Ksc(Util.checkString(req.getParameter("date")));
String fund_mang_no = Util.Uni2Ksc(Util.checkString(req.getParameter("fund_mang_no")));
String dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String comp_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("comp_dt_fr")));
String comp_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("comp_dt_to")));
String mtry_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("mtry_dt_fr")));
String mtry_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("mtry_dt_to")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDate(date);
dm.setFund_mang_no(fund_mang_no);
dm.setDlco_clsf_cd(dlco_clsf_cd);
dm.setDlco_cd(dlco_cd);
dm.setComp_dt_fr(comp_dt_fr);
dm.setComp_dt_to(comp_dt_to);
dm.setMtry_dt_fr(mtry_dt_fr);
dm.setMtry_dt_to(mtry_dt_to);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 02 10:37:12 KST 2009 */