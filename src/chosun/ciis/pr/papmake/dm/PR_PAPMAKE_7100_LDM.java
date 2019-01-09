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


public class PR_PAPMAKE_7100_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String ispt_dt;
	public String fac_clsf;
	public String ispt_clsf;
	public String ispt_clas1;
	public String ispt_clas2;
	public String rslt_yn;
	 
	public PR_PAPMAKE_7100_LDM(){}
	public PR_PAPMAKE_7100_LDM(String cmpy_cd, String ispt_dt, String fac_clsf, String ispt_clsf, String ispt_clas1, String ispt_clas2, String rslt_yn){
		this.cmpy_cd = cmpy_cd;
		this.ispt_dt = ispt_dt;
		this.fac_clsf = fac_clsf;
		this.ispt_clsf = ispt_clsf;
		this.ispt_clas1 = ispt_clas1;
		this.ispt_clas2 = ispt_clas2;
		this.rslt_yn = rslt_yn;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIspt_dt(String ispt_dt){
		this.ispt_dt = ispt_dt;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setIspt_clsf(String ispt_clsf){
		this.ispt_clsf = ispt_clsf;
	}
	
	public void setIspt_clas1(String ispt_clas1) {
		this.ispt_clas1 = ispt_clas1;
	}
	
	public void setIspt_clas2(String ispt_clas2) {
		this.ispt_clas2 = ispt_clas2;
	}

	public void setRslt_yn(String rslt_yn){
		this.rslt_yn = rslt_yn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIspt_dt(){
		return this.ispt_dt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getIspt_clsf(){
		return this.ispt_clsf;
	}

	public String getIspt_clas1() {
		return ispt_clas1;
	}
	public String getIspt_clas2() {
		return ispt_clas2;
	}

	public String getRslt_yn(){
		return this.rslt_yn;
	}
	
	public String getSQL(){
		 return "{ call MISMAT.SP_PR_PAPMAKE_7100_L(? ,? ,? ,? ,? ,? ,? ,?, ? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PR_PAPMAKE_7100_LDM dm = (PR_PAPMAKE_7100_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.ispt_dt);
		cstmt.setString(5, dm.fac_clsf);
		cstmt.setString(6, dm.ispt_clsf);
		cstmt.setString(7, dm.ispt_clas1);
		cstmt.setString(8, dm.ispt_clas2);
		cstmt.setString(9, dm.rslt_yn);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pr.papmake.ds.PR_PAPMAKE_7100_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("ispt_dt = [" + getIspt_dt() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("ispt_clsf = [" + getIspt_clsf() + "]");
		System.out.println("rslt_yn = [" + getRslt_yn() + "]");
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
String ispt_dt = req.getParameter("ispt_dt");
if( ispt_dt == null){
	System.out.println(this.toString+" : ispt_dt is null" );
}else{
	System.out.println(this.toString+" : ispt_dt is "+ispt_dt );
}
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String ispt_clsf = req.getParameter("ispt_clsf");
if( ispt_clsf == null){
	System.out.println(this.toString+" : ispt_clsf is null" );
}else{
	System.out.println(this.toString+" : ispt_clsf is "+ispt_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String ispt_dt = Util.checkString(req.getParameter("ispt_dt"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String ispt_clsf = Util.checkString(req.getParameter("ispt_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String ispt_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("ispt_dt")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String ispt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("ispt_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIspt_dt(ispt_dt);
dm.setFac_clsf(fac_clsf);
dm.setIspt_clsf(ispt_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jan 06 17:58:39 KST 2016 */