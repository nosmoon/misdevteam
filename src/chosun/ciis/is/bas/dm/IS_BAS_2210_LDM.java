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


package chosun.ciis.is.bas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.bas.ds.*;
import chosun.ciis.is.bas.rec.*;

/**
 * 
 */


public class IS_BAS_2210_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String dlco_clsf_cd_seq;
	public String adms_dstc_cd;
	public String asnt_dstc_cd;
	public String leaf_now_chrg_pers;
	public String dept_cd;
	public String sub_dept_cd;

	public IS_BAS_2210_LDM(){}
	public IS_BAS_2210_LDM(String cmpy_cd, String dlco_clsf_cd_seq, String adms_dstc_cd, String asnt_dstc_cd, String leaf_now_chrg_pers, String dept_cd, String sub_dept_cd){
		this.cmpy_cd = cmpy_cd;
		this.dlco_clsf_cd_seq = dlco_clsf_cd_seq;
		this.adms_dstc_cd = adms_dstc_cd;
		this.asnt_dstc_cd = asnt_dstc_cd;
		this.leaf_now_chrg_pers = leaf_now_chrg_pers;
		this.dept_cd = dept_cd;
		this.sub_dept_cd = sub_dept_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDlco_clsf_cd_seq(String dlco_clsf_cd_seq){
		this.dlco_clsf_cd_seq = dlco_clsf_cd_seq;
	}

	public void setAdms_dstc_cd(String adms_dstc_cd){
		this.adms_dstc_cd = adms_dstc_cd;
	}

	public void setAsnt_dstc_cd(String asnt_dstc_cd){
		this.asnt_dstc_cd = asnt_dstc_cd;
	}

	public void setLeaf_now_chrg_pers(String leaf_now_chrg_pers){
		this.leaf_now_chrg_pers = leaf_now_chrg_pers;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setSub_dept_cd(String sub_dept_cd){
		this.sub_dept_cd = sub_dept_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDlco_clsf_cd_seq(){
		return this.dlco_clsf_cd_seq;
	}

	public String getAdms_dstc_cd(){
		return this.adms_dstc_cd;
	}

	public String getAsnt_dstc_cd(){
		return this.asnt_dstc_cd;
	}

	public String getLeaf_now_chrg_pers(){
		return this.leaf_now_chrg_pers;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getSub_dept_cd(){
		return this.sub_dept_cd;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_BAS_2210_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_BAS_2210_LDM dm = (IS_BAS_2210_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.dlco_clsf_cd_seq);
		cstmt.setString(5, dm.adms_dstc_cd);
		cstmt.setString(6, dm.asnt_dstc_cd);
		cstmt.setString(7, dm.leaf_now_chrg_pers);
		cstmt.setString(8, dm.dept_cd);
		cstmt.setString(9, dm.sub_dept_cd);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.bas.ds.IS_BAS_2210_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("dlco_clsf_cd_seq = [" + getDlco_clsf_cd_seq() + "]");
		System.out.println("adms_dstc_cd = [" + getAdms_dstc_cd() + "]");
		System.out.println("asnt_dstc_cd = [" + getAsnt_dstc_cd() + "]");
		System.out.println("leaf_now_chrg_pers = [" + getLeaf_now_chrg_pers() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("sub_dept_cd = [" + getSub_dept_cd() + "]");
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
String dlco_clsf_cd_seq = req.getParameter("dlco_clsf_cd_seq");
if( dlco_clsf_cd_seq == null){
	System.out.println(this.toString+" : dlco_clsf_cd_seq is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf_cd_seq is "+dlco_clsf_cd_seq );
}
String adms_dstc_cd = req.getParameter("adms_dstc_cd");
if( adms_dstc_cd == null){
	System.out.println(this.toString+" : adms_dstc_cd is null" );
}else{
	System.out.println(this.toString+" : adms_dstc_cd is "+adms_dstc_cd );
}
String asnt_dstc_cd = req.getParameter("asnt_dstc_cd");
if( asnt_dstc_cd == null){
	System.out.println(this.toString+" : asnt_dstc_cd is null" );
}else{
	System.out.println(this.toString+" : asnt_dstc_cd is "+asnt_dstc_cd );
}
String leaf_now_chrg_pers = req.getParameter("leaf_now_chrg_pers");
if( leaf_now_chrg_pers == null){
	System.out.println(this.toString+" : leaf_now_chrg_pers is null" );
}else{
	System.out.println(this.toString+" : leaf_now_chrg_pers is "+leaf_now_chrg_pers );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String sub_dept_cd = req.getParameter("sub_dept_cd");
if( sub_dept_cd == null){
	System.out.println(this.toString+" : sub_dept_cd is null" );
}else{
	System.out.println(this.toString+" : sub_dept_cd is "+sub_dept_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
String adms_dstc_cd = Util.checkString(req.getParameter("adms_dstc_cd"));
String asnt_dstc_cd = Util.checkString(req.getParameter("asnt_dstc_cd"));
String leaf_now_chrg_pers = Util.checkString(req.getParameter("leaf_now_chrg_pers"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dlco_clsf_cd_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd_seq")));
String adms_dstc_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("adms_dstc_cd")));
String asnt_dstc_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("asnt_dstc_cd")));
String leaf_now_chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("leaf_now_chrg_pers")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String sub_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_dept_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDlco_clsf_cd_seq(dlco_clsf_cd_seq);
dm.setAdms_dstc_cd(adms_dstc_cd);
dm.setAsnt_dstc_cd(asnt_dstc_cd);
dm.setLeaf_now_chrg_pers(leaf_now_chrg_pers);
dm.setDept_cd(dept_cd);
dm.setSub_dept_cd(sub_dept_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 27 16:23:10 KST 2012 */