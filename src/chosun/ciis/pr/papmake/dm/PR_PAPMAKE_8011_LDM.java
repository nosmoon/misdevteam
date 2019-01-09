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


package chosun.ciis.pr.papmake.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.papmake.ds.*;
import chosun.ciis.pr.papmake.rec.*;

/**
 * 
 */


public class PR_PAPMAKE_8011_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String requ_dt_fr;
	public String requ_dt_to;
	public String dcmt_nm;
	public String dcmt_clsf;
	public String fac_clsf;
	public String requ_pers;
	public String remk2;
	
	public PR_PAPMAKE_8011_LDM(){}
	public PR_PAPMAKE_8011_LDM(String cmpy_cd, String requ_dt_fr, String requ_dt_to, String dcmt_nm, String dcmt_clsf, String fac_clsf, String requ_pers, String remk2){
		this.cmpy_cd = cmpy_cd;
		this.requ_dt_fr = requ_dt_fr;
		this.requ_dt_to = requ_dt_to;
		this.dcmt_nm = dcmt_nm;
		this.dcmt_clsf = dcmt_clsf;
		this.fac_clsf = fac_clsf;
		this.requ_pers = requ_pers;
		this.remk2 = remk2;
	}
	
	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRequ_dt_fr(String requ_dt_fr){
		this.requ_dt_fr = requ_dt_fr;
	}

	public void setRequ_dt_to(String requ_dt_to){
		this.requ_dt_to = requ_dt_to;
	}

	public void setDcmt_nm(String dcmt_nm){
		this.dcmt_nm = dcmt_nm;
	}

	public void setDcmt_clsf(String dcmt_clsf) {
		this.dcmt_clsf = dcmt_clsf;
	}
	
	public void setFac_clsf(String fac_clsf) {
		this.fac_clsf = fac_clsf;
	}
	
	public void setRemk2(String remk2) {
		this.remk2 = remk2;
	}
	
	public void setRequ_pers(String requ_pers) {
		this.requ_pers = requ_pers;
	}
	
	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getRequ_dt_fr(){
		return this.requ_dt_fr;
	}

	public String getRequ_dt_to(){
		return this.requ_dt_to;
	}

	public String getDcmt_nm(){
		return this.dcmt_nm;
	}

	public String getDcmt_clsf() {
		return dcmt_clsf;
	}
	
	public String getFac_clsf() {
		return fac_clsf;
	}
	
	public String getRemk2() {
		return remk2;
	}
	
	public String getRequ_pers() {
		return requ_pers;
	}
	
	public String getSQL(){
		 return "{ call MISMAT.SP_PR_PAPMAKE_8011_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PR_PAPMAKE_8011_LDM dm = (PR_PAPMAKE_8011_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.requ_dt_fr);
		cstmt.setString(5, dm.requ_dt_to);
		cstmt.setString(6, dm.dcmt_nm);
		cstmt.setString(7, dm.dcmt_clsf);
		cstmt.setString(8, dm.fac_clsf);
		cstmt.setString(9, dm.requ_pers);
		cstmt.setString(10, dm.remk2);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pr.papmake.ds.PR_PAPMAKE_8011_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("requ_dt_fr = [" + getRequ_dt_fr() + "]");
		System.out.println("requ_dt_to = [" + getRequ_dt_to() + "]");
		System.out.println("dcmt_nm = [" + getDcmt_nm() + "]");
		System.out.println("dcmt_clsf = [" + getDcmt_clsf() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("requ_pers = [" + getRequ_pers() + "]");
		System.out.println("remk2 = [" + getRemk2() + "]");
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
String requ_dt_fr = req.getParameter("requ_dt_fr");
if( requ_dt_fr == null){
	System.out.println(this.toString+" : requ_dt_fr is null" );
}else{
	System.out.println(this.toString+" : requ_dt_fr is "+requ_dt_fr );
}
String requ_dt_to = req.getParameter("requ_dt_to");
if( requ_dt_to == null){
	System.out.println(this.toString+" : requ_dt_to is null" );
}else{
	System.out.println(this.toString+" : requ_dt_to is "+requ_dt_to );
}
String dcmt_nm = req.getParameter("dcmt_nm");
if( dcmt_nm == null){
	System.out.println(this.toString+" : dcmt_nm is null" );
}else{
	System.out.println(this.toString+" : dcmt_nm is "+dcmt_nm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String requ_dt_fr = Util.checkString(req.getParameter("requ_dt_fr"));
String requ_dt_to = Util.checkString(req.getParameter("requ_dt_to"));
String dcmt_nm = Util.checkString(req.getParameter("dcmt_nm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String requ_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("requ_dt_fr")));
String requ_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("requ_dt_to")));
String dcmt_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dcmt_nm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setRequ_dt_fr(requ_dt_fr);
dm.setRequ_dt_to(requ_dt_to);
dm.setDcmt_nm(dcmt_nm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 21 17:25:16 KST 2016 */