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


package chosun.ciis.is.sal.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.sal.ds.*;
import chosun.ciis.is.sal.rec.*;

/**
 * 
 */


public class IS_SAL_1610_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String adjm_dt;
	public String erplace_cd;
	public String asnt_dstc_cd;
	public String slip_no;
	public String dlco_clsf_cd_seq;
	public String incmg_pers;

	public IS_SAL_1610_LDM(){}
	public IS_SAL_1610_LDM(String cmpy_cd, String adjm_dt, String erplace_cd, String asnt_dstc_cd, String slip_no, String dlco_clsf_cd_seq, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.adjm_dt = adjm_dt;
		this.erplace_cd = erplace_cd;
		this.asnt_dstc_cd = asnt_dstc_cd;
		this.slip_no = slip_no;
		this.dlco_clsf_cd_seq = dlco_clsf_cd_seq;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAdjm_dt(String adjm_dt){
		this.adjm_dt = adjm_dt;
	}

	public void setErplace_cd(String erplace_cd){
		this.erplace_cd = erplace_cd;
	}

	public void setAsnt_dstc_cd(String asnt_dstc_cd){
		this.asnt_dstc_cd = asnt_dstc_cd;
	}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public void setDlco_clsf_cd_seq(String dlco_clsf_cd_seq){
		this.dlco_clsf_cd_seq = dlco_clsf_cd_seq;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAdjm_dt(){
		return this.adjm_dt;
	}

	public String getErplace_cd(){
		return this.erplace_cd;
	}

	public String getAsnt_dstc_cd(){
		return this.asnt_dstc_cd;
	}

	public String getSlip_no(){
		return this.slip_no;
	}

	public String getDlco_clsf_cd_seq(){
		return this.dlco_clsf_cd_seq;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_SAL_1610_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_SAL_1610_LDM dm = (IS_SAL_1610_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.adjm_dt);
		cstmt.setString(5, dm.erplace_cd);
		cstmt.setString(6, dm.asnt_dstc_cd);
		cstmt.setString(7, dm.slip_no);
		cstmt.setString(8, dm.dlco_clsf_cd_seq);
		cstmt.setString(9, dm.incmg_pers);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.sal.ds.IS_SAL_1610_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("adjm_dt = [" + getAdjm_dt() + "]");
		System.out.println("erplace_cd = [" + getErplace_cd() + "]");
		System.out.println("asnt_dstc_cd = [" + getAsnt_dstc_cd() + "]");
		System.out.println("slip_no = [" + getSlip_no() + "]");
		System.out.println("dlco_clsf_cd_seq = [" + getDlco_clsf_cd_seq() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String adjm_dt = req.getParameter("adjm_dt");
if( adjm_dt == null){
	System.out.println(this.toString+" : adjm_dt is null" );
}else{
	System.out.println(this.toString+" : adjm_dt is "+adjm_dt );
}
String erplace_cd = req.getParameter("erplace_cd");
if( erplace_cd == null){
	System.out.println(this.toString+" : erplace_cd is null" );
}else{
	System.out.println(this.toString+" : erplace_cd is "+erplace_cd );
}
String asnt_dstc_cd = req.getParameter("asnt_dstc_cd");
if( asnt_dstc_cd == null){
	System.out.println(this.toString+" : asnt_dstc_cd is null" );
}else{
	System.out.println(this.toString+" : asnt_dstc_cd is "+asnt_dstc_cd );
}
String slip_no = req.getParameter("slip_no");
if( slip_no == null){
	System.out.println(this.toString+" : slip_no is null" );
}else{
	System.out.println(this.toString+" : slip_no is "+slip_no );
}
String dlco_clsf_cd_seq = req.getParameter("dlco_clsf_cd_seq");
if( dlco_clsf_cd_seq == null){
	System.out.println(this.toString+" : dlco_clsf_cd_seq is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf_cd_seq is "+dlco_clsf_cd_seq );
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

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String adjm_dt = Util.checkString(req.getParameter("adjm_dt"));
String erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
String asnt_dstc_cd = Util.checkString(req.getParameter("asnt_dstc_cd"));
String slip_no = Util.checkString(req.getParameter("slip_no"));
String dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String adjm_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("adjm_dt")));
String erplace_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("erplace_cd")));
String asnt_dstc_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("asnt_dstc_cd")));
String slip_no = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_no")));
String dlco_clsf_cd_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd_seq")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAdjm_dt(adjm_dt);
dm.setErplace_cd(erplace_cd);
dm.setAsnt_dstc_cd(asnt_dstc_cd);
dm.setSlip_no(slip_no);
dm.setDlco_clsf_cd_seq(dlco_clsf_cd_seq);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 21 13:56:29 KST 2012 */