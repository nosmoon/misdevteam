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


package chosun.ciis.mc.budg.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.budg.ds.*;
import chosun.ciis.mc.budg.rec.*;

/**
 * 
 */


public class MC_BUDG_5071_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String cls_len;
	public String cls_zero;
	public String dept_len;
	public String dept_zero;
	public String plan_bfr_yymm;
	public String plan_fr_yymm;
	public String plan_to_yymm;
	public String plan_bto_yymm;
	public String tms;
	public String plan_dept_cd;

	public MC_BUDG_5071_LDM(){}
	public MC_BUDG_5071_LDM(String cmpy_cd, String cls_len, String cls_zero, String dept_len, String dept_zero, String plan_bfr_yymm, String plan_fr_yymm, String plan_to_yymm, String plan_bto_yymm, String tms, String plan_dept_cd){
		this.cmpy_cd = cmpy_cd;
		this.cls_len = cls_len;
		this.cls_zero = cls_zero;
		this.dept_len = dept_len;
		this.dept_zero = dept_zero;
		this.plan_bfr_yymm = plan_bfr_yymm;
		this.plan_fr_yymm = plan_fr_yymm;
		this.plan_to_yymm = plan_to_yymm;
		this.plan_bto_yymm = plan_bto_yymm;
		this.tms = tms;
		this.plan_dept_cd = plan_dept_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setCls_len(String cls_len){
		this.cls_len = cls_len;
	}

	public void setCls_zero(String cls_zero){
		this.cls_zero = cls_zero;
	}

	public void setDept_len(String dept_len){
		this.dept_len = dept_len;
	}

	public void setDept_zero(String dept_zero){
		this.dept_zero = dept_zero;
	}

	public void setPlan_bfr_yymm(String plan_bfr_yymm){
		this.plan_bfr_yymm = plan_bfr_yymm;
	}

	public void setPlan_fr_yymm(String plan_fr_yymm){
		this.plan_fr_yymm = plan_fr_yymm;
	}

	public void setPlan_to_yymm(String plan_to_yymm){
		this.plan_to_yymm = plan_to_yymm;
	}

	public void setPlan_bto_yymm(String plan_bto_yymm){
		this.plan_bto_yymm = plan_bto_yymm;
	}

	public void setTms(String tms){
		this.tms = tms;
	}

	public void setPlan_dept_cd(String plan_dept_cd){
		this.plan_dept_cd = plan_dept_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getCls_len(){
		return this.cls_len;
	}

	public String getCls_zero(){
		return this.cls_zero;
	}

	public String getDept_len(){
		return this.dept_len;
	}

	public String getDept_zero(){
		return this.dept_zero;
	}

	public String getPlan_bfr_yymm(){
		return this.plan_bfr_yymm;
	}

	public String getPlan_fr_yymm(){
		return this.plan_fr_yymm;
	}

	public String getPlan_to_yymm(){
		return this.plan_to_yymm;
	}

	public String getPlan_bto_yymm(){
		return this.plan_bto_yymm;
	}

	public String getTms(){
		return this.tms;
	}

	public String getPlan_dept_cd(){
		return this.plan_dept_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_5071_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_5071_LDM dm = (MC_BUDG_5071_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.cls_len);
		cstmt.setString(5, dm.cls_zero);
		cstmt.setString(6, dm.dept_len);
		cstmt.setString(7, dm.dept_zero);
		cstmt.setString(8, dm.plan_bfr_yymm);
		cstmt.setString(9, dm.plan_fr_yymm);
		cstmt.setString(10, dm.plan_to_yymm);
		cstmt.setString(11, dm.plan_bto_yymm);
		cstmt.setString(12, dm.tms);
		cstmt.setString(13, dm.plan_dept_cd);
		cstmt.registerOutParameter(14, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_5071_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("cls_len = [" + getCls_len() + "]");
		System.out.println("cls_zero = [" + getCls_zero() + "]");
		System.out.println("dept_len = [" + getDept_len() + "]");
		System.out.println("dept_zero = [" + getDept_zero() + "]");
		System.out.println("plan_bfr_yymm = [" + getPlan_bfr_yymm() + "]");
		System.out.println("plan_fr_yymm = [" + getPlan_fr_yymm() + "]");
		System.out.println("plan_to_yymm = [" + getPlan_to_yymm() + "]");
		System.out.println("plan_bto_yymm = [" + getPlan_bto_yymm() + "]");
		System.out.println("tms = [" + getTms() + "]");
		System.out.println("plan_dept_cd = [" + getPlan_dept_cd() + "]");
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
String cls_len = req.getParameter("cls_len");
if( cls_len == null){
	System.out.println(this.toString+" : cls_len is null" );
}else{
	System.out.println(this.toString+" : cls_len is "+cls_len );
}
String cls_zero = req.getParameter("cls_zero");
if( cls_zero == null){
	System.out.println(this.toString+" : cls_zero is null" );
}else{
	System.out.println(this.toString+" : cls_zero is "+cls_zero );
}
String dept_len = req.getParameter("dept_len");
if( dept_len == null){
	System.out.println(this.toString+" : dept_len is null" );
}else{
	System.out.println(this.toString+" : dept_len is "+dept_len );
}
String dept_zero = req.getParameter("dept_zero");
if( dept_zero == null){
	System.out.println(this.toString+" : dept_zero is null" );
}else{
	System.out.println(this.toString+" : dept_zero is "+dept_zero );
}
String plan_bfr_yymm = req.getParameter("plan_bfr_yymm");
if( plan_bfr_yymm == null){
	System.out.println(this.toString+" : plan_bfr_yymm is null" );
}else{
	System.out.println(this.toString+" : plan_bfr_yymm is "+plan_bfr_yymm );
}
String plan_fr_yymm = req.getParameter("plan_fr_yymm");
if( plan_fr_yymm == null){
	System.out.println(this.toString+" : plan_fr_yymm is null" );
}else{
	System.out.println(this.toString+" : plan_fr_yymm is "+plan_fr_yymm );
}
String plan_to_yymm = req.getParameter("plan_to_yymm");
if( plan_to_yymm == null){
	System.out.println(this.toString+" : plan_to_yymm is null" );
}else{
	System.out.println(this.toString+" : plan_to_yymm is "+plan_to_yymm );
}
String plan_bto_yymm = req.getParameter("plan_bto_yymm");
if( plan_bto_yymm == null){
	System.out.println(this.toString+" : plan_bto_yymm is null" );
}else{
	System.out.println(this.toString+" : plan_bto_yymm is "+plan_bto_yymm );
}
String tms = req.getParameter("tms");
if( tms == null){
	System.out.println(this.toString+" : tms is null" );
}else{
	System.out.println(this.toString+" : tms is "+tms );
}
String plan_dept_cd = req.getParameter("plan_dept_cd");
if( plan_dept_cd == null){
	System.out.println(this.toString+" : plan_dept_cd is null" );
}else{
	System.out.println(this.toString+" : plan_dept_cd is "+plan_dept_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String cls_len = Util.checkString(req.getParameter("cls_len"));
String cls_zero = Util.checkString(req.getParameter("cls_zero"));
String dept_len = Util.checkString(req.getParameter("dept_len"));
String dept_zero = Util.checkString(req.getParameter("dept_zero"));
String plan_bfr_yymm = Util.checkString(req.getParameter("plan_bfr_yymm"));
String plan_fr_yymm = Util.checkString(req.getParameter("plan_fr_yymm"));
String plan_to_yymm = Util.checkString(req.getParameter("plan_to_yymm"));
String plan_bto_yymm = Util.checkString(req.getParameter("plan_bto_yymm"));
String tms = Util.checkString(req.getParameter("tms"));
String plan_dept_cd = Util.checkString(req.getParameter("plan_dept_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String cls_len = Util.Uni2Ksc(Util.checkString(req.getParameter("cls_len")));
String cls_zero = Util.Uni2Ksc(Util.checkString(req.getParameter("cls_zero")));
String dept_len = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_len")));
String dept_zero = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_zero")));
String plan_bfr_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("plan_bfr_yymm")));
String plan_fr_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("plan_fr_yymm")));
String plan_to_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("plan_to_yymm")));
String plan_bto_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("plan_bto_yymm")));
String tms = Util.Uni2Ksc(Util.checkString(req.getParameter("tms")));
String plan_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("plan_dept_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setCls_len(cls_len);
dm.setCls_zero(cls_zero);
dm.setDept_len(dept_len);
dm.setDept_zero(dept_zero);
dm.setPlan_bfr_yymm(plan_bfr_yymm);
dm.setPlan_fr_yymm(plan_fr_yymm);
dm.setPlan_to_yymm(plan_to_yymm);
dm.setPlan_bto_yymm(plan_bto_yymm);
dm.setTms(tms);
dm.setPlan_dept_cd(plan_dept_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 17 13:41:04 KST 2009 */