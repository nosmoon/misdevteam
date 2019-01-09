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


public class FC_ACCT_2171_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String uid;
	public String prof_type_cd;
	public String slip_clsf_cd;
	public String tax_stmt_aprv_yn;
	public String slip_occr_dt_fr;
	public String slip_occr_dt_to;
	public String dlco_nm;

	public FC_ACCT_2171_LDM(){}
	public FC_ACCT_2171_LDM(String cmpy_cd, String uid, String prof_type_cd, String slip_clsf_cd, String tax_stmt_aprv_yn, String slip_occr_dt_fr, String slip_occr_dt_to, String dlco_nm){
		this.cmpy_cd = cmpy_cd;
		this.uid = uid;
		this.prof_type_cd = prof_type_cd;
		this.slip_clsf_cd = slip_clsf_cd;
		this.tax_stmt_aprv_yn = tax_stmt_aprv_yn;
		this.slip_occr_dt_fr = slip_occr_dt_fr;
		this.slip_occr_dt_to = slip_occr_dt_to;
		this.dlco_nm = dlco_nm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setUid(String uid){
		this.uid = uid;
	}

	public void setProf_type_cd(String prof_type_cd){
		this.prof_type_cd = prof_type_cd;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setTax_stmt_aprv_yn(String tax_stmt_aprv_yn){
		this.tax_stmt_aprv_yn = tax_stmt_aprv_yn;
	}

	public void setSlip_occr_dt_fr(String slip_occr_dt_fr){
		this.slip_occr_dt_fr = slip_occr_dt_fr;
	}

	public void setSlip_occr_dt_to(String slip_occr_dt_to){
		this.slip_occr_dt_to = slip_occr_dt_to;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getUid(){
		return this.uid;
	}

	public String getProf_type_cd(){
		return this.prof_type_cd;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getTax_stmt_aprv_yn(){
		return this.tax_stmt_aprv_yn;
	}

	public String getSlip_occr_dt_fr(){
		return this.slip_occr_dt_fr;
	}

	public String getSlip_occr_dt_to(){
		return this.slip_occr_dt_to;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2171_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2171_LDM dm = (FC_ACCT_2171_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.uid);
		cstmt.setString(5, dm.prof_type_cd);
		cstmt.setString(6, dm.slip_clsf_cd);
		cstmt.setString(7, dm.tax_stmt_aprv_yn);
		cstmt.setString(8, dm.slip_occr_dt_fr);
		cstmt.setString(9, dm.slip_occr_dt_to);
		cstmt.setString(10, dm.dlco_nm);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2171_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("uid = [" + getUid() + "]");
		System.out.println("prof_type_cd = [" + getProf_type_cd() + "]");
		System.out.println("slip_clsf_cd = [" + getSlip_clsf_cd() + "]");
		System.out.println("tax_stmt_aprv_yn = [" + getTax_stmt_aprv_yn() + "]");
		System.out.println("slip_occr_dt_fr = [" + getSlip_occr_dt_fr() + "]");
		System.out.println("slip_occr_dt_to = [" + getSlip_occr_dt_to() + "]");
		System.out.println("dlco_nm = [" + getDlco_nm() + "]");
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
String uid = req.getParameter("uid");
if( uid == null){
	System.out.println(this.toString+" : uid is null" );
}else{
	System.out.println(this.toString+" : uid is "+uid );
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
String tax_stmt_aprv_yn = req.getParameter("tax_stmt_aprv_yn");
if( tax_stmt_aprv_yn == null){
	System.out.println(this.toString+" : tax_stmt_aprv_yn is null" );
}else{
	System.out.println(this.toString+" : tax_stmt_aprv_yn is "+tax_stmt_aprv_yn );
}
String slip_occr_dt_fr = req.getParameter("slip_occr_dt_fr");
if( slip_occr_dt_fr == null){
	System.out.println(this.toString+" : slip_occr_dt_fr is null" );
}else{
	System.out.println(this.toString+" : slip_occr_dt_fr is "+slip_occr_dt_fr );
}
String slip_occr_dt_to = req.getParameter("slip_occr_dt_to");
if( slip_occr_dt_to == null){
	System.out.println(this.toString+" : slip_occr_dt_to is null" );
}else{
	System.out.println(this.toString+" : slip_occr_dt_to is "+slip_occr_dt_to );
}
String dlco_nm = req.getParameter("dlco_nm");
if( dlco_nm == null){
	System.out.println(this.toString+" : dlco_nm is null" );
}else{
	System.out.println(this.toString+" : dlco_nm is "+dlco_nm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String uid = Util.checkString(req.getParameter("uid"));
String prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String tax_stmt_aprv_yn = Util.checkString(req.getParameter("tax_stmt_aprv_yn"));
String slip_occr_dt_fr = Util.checkString(req.getParameter("slip_occr_dt_fr"));
String slip_occr_dt_to = Util.checkString(req.getParameter("slip_occr_dt_to"));
String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String uid = Util.Uni2Ksc(Util.checkString(req.getParameter("uid")));
String prof_type_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prof_type_cd")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String tax_stmt_aprv_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_stmt_aprv_yn")));
String slip_occr_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt_fr")));
String slip_occr_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt_to")));
String dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_nm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setUid(uid);
dm.setProf_type_cd(prof_type_cd);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setTax_stmt_aprv_yn(tax_stmt_aprv_yn);
dm.setSlip_occr_dt_fr(slip_occr_dt_fr);
dm.setSlip_occr_dt_to(slip_occr_dt_to);
dm.setDlco_nm(dlco_nm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 11 14:12:17 KST 2015 */