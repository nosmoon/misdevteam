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


public class FC_FUNC_7074_DDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String repay_slip_occr_dt;
	public String repay_slip_clsf_cd;
	public String repay_slip_seq;
	public String incmg_pers;
	public String incmg_pers_ipadd;

	public FC_FUNC_7074_DDM(){}
	public FC_FUNC_7074_DDM(String cmpy_cd, String repay_slip_occr_dt, String repay_slip_clsf_cd, String repay_slip_seq, String incmg_pers, String incmg_pers_ipadd){
		this.cmpy_cd = cmpy_cd;
		this.repay_slip_occr_dt = repay_slip_occr_dt;
		this.repay_slip_clsf_cd = repay_slip_clsf_cd;
		this.repay_slip_seq = repay_slip_seq;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRepay_slip_occr_dt(String repay_slip_occr_dt){
		this.repay_slip_occr_dt = repay_slip_occr_dt;
	}

	public void setRepay_slip_clsf_cd(String repay_slip_clsf_cd){
		this.repay_slip_clsf_cd = repay_slip_clsf_cd;
	}

	public void setRepay_slip_seq(String repay_slip_seq){
		this.repay_slip_seq = repay_slip_seq;
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

	public String getRepay_slip_occr_dt(){
		return this.repay_slip_occr_dt;
	}

	public String getRepay_slip_clsf_cd(){
		return this.repay_slip_clsf_cd;
	}

	public String getRepay_slip_seq(){
		return this.repay_slip_seq;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_7074_D(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_7074_DDM dm = (FC_FUNC_7074_DDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.repay_slip_occr_dt);
		cstmt.setString(5, dm.repay_slip_clsf_cd);
		cstmt.setString(6, dm.repay_slip_seq);
		cstmt.setString(7, dm.incmg_pers);
		cstmt.setString(8, dm.incmg_pers_ipadd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_7074_DDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("repay_slip_occr_dt = [" + getRepay_slip_occr_dt() + "]");
		System.out.println("repay_slip_clsf_cd = [" + getRepay_slip_clsf_cd() + "]");
		System.out.println("repay_slip_seq = [" + getRepay_slip_seq() + "]");
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
String repay_slip_occr_dt = req.getParameter("repay_slip_occr_dt");
if( repay_slip_occr_dt == null){
	System.out.println(this.toString+" : repay_slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : repay_slip_occr_dt is "+repay_slip_occr_dt );
}
String repay_slip_clsf_cd = req.getParameter("repay_slip_clsf_cd");
if( repay_slip_clsf_cd == null){
	System.out.println(this.toString+" : repay_slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : repay_slip_clsf_cd is "+repay_slip_clsf_cd );
}
String repay_slip_seq = req.getParameter("repay_slip_seq");
if( repay_slip_seq == null){
	System.out.println(this.toString+" : repay_slip_seq is null" );
}else{
	System.out.println(this.toString+" : repay_slip_seq is "+repay_slip_seq );
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
String repay_slip_occr_dt = Util.checkString(req.getParameter("repay_slip_occr_dt"));
String repay_slip_clsf_cd = Util.checkString(req.getParameter("repay_slip_clsf_cd"));
String repay_slip_seq = Util.checkString(req.getParameter("repay_slip_seq"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String repay_slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("repay_slip_occr_dt")));
String repay_slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("repay_slip_clsf_cd")));
String repay_slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("repay_slip_seq")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setRepay_slip_occr_dt(repay_slip_occr_dt);
dm.setRepay_slip_clsf_cd(repay_slip_clsf_cd);
dm.setRepay_slip_seq(repay_slip_seq);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 08 19:14:55 KST 2009 */