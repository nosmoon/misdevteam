/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 
 */


public class SS_SLS_EXTN_4730_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String slip_clsf_cd;
	public String slip_occr_dt;
	public String slip_seq;
	public String exp_slip_clsf_cd;
	public String exp_slip_occr_dt;
	public String exp_slip_seq;
	public String exp_slip_no;

	public SS_SLS_EXTN_4730_UDM(){}
	public SS_SLS_EXTN_4730_UDM(String incmgpers, String slip_clsf_cd, String slip_occr_dt, String slip_seq, String exp_slip_clsf_cd, String exp_slip_occr_dt, String exp_slip_seq, String exp_slip_no){
		this.incmgpers = incmgpers;
		this.slip_clsf_cd = slip_clsf_cd;
		this.slip_occr_dt = slip_occr_dt;
		this.slip_seq = slip_seq;
		this.exp_slip_clsf_cd = exp_slip_clsf_cd;
		this.exp_slip_occr_dt = exp_slip_occr_dt;
		this.exp_slip_seq = exp_slip_seq;
		this.exp_slip_no = exp_slip_no;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setExp_slip_clsf_cd(String exp_slip_clsf_cd){
		this.exp_slip_clsf_cd = exp_slip_clsf_cd;
	}

	public void setExp_slip_occr_dt(String exp_slip_occr_dt){
		this.exp_slip_occr_dt = exp_slip_occr_dt;
	}

	public void setExp_slip_seq(String exp_slip_seq){
		this.exp_slip_seq = exp_slip_seq;
	}

	public void setExp_slip_no(String exp_slip_no){
		this.exp_slip_no = exp_slip_no;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getExp_slip_clsf_cd(){
		return this.exp_slip_clsf_cd;
	}

	public String getExp_slip_occr_dt(){
		return this.exp_slip_occr_dt;
	}

	public String getExp_slip_seq(){
		return this.exp_slip_seq;
	}

	public String getExp_slip_no(){
		return this.exp_slip_no;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_SLS_EXTN_4730_U(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_SLS_EXTN_4730_UDM dm = (SS_SLS_EXTN_4730_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.slip_clsf_cd);
		cstmt.setString(5, dm.slip_occr_dt);
		cstmt.setString(6, dm.slip_seq);
		cstmt.setString(7, dm.exp_slip_clsf_cd);
		cstmt.setString(8, dm.exp_slip_occr_dt);
		cstmt.setString(9, dm.exp_slip_seq);
		cstmt.setString(10, dm.exp_slip_no);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_SLS_EXTN_4730_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("incmgpers = [" + getIncmgpers() + "]");
		System.out.println("slip_clsf_cd = [" + getSlip_clsf_cd() + "]");
		System.out.println("slip_occr_dt = [" + getSlip_occr_dt() + "]");
		System.out.println("slip_seq = [" + getSlip_seq() + "]");
		System.out.println("exp_slip_clsf_cd = [" + getExp_slip_clsf_cd() + "]");
		System.out.println("exp_slip_occr_dt = [" + getExp_slip_occr_dt() + "]");
		System.out.println("exp_slip_seq = [" + getExp_slip_seq() + "]");
		System.out.println("exp_slip_no = [" + getExp_slip_no() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String slip_clsf_cd = req.getParameter("slip_clsf_cd");
if( slip_clsf_cd == null){
	System.out.println(this.toString+" : slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : slip_clsf_cd is "+slip_clsf_cd );
}
String slip_occr_dt = req.getParameter("slip_occr_dt");
if( slip_occr_dt == null){
	System.out.println(this.toString+" : slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : slip_occr_dt is "+slip_occr_dt );
}
String slip_seq = req.getParameter("slip_seq");
if( slip_seq == null){
	System.out.println(this.toString+" : slip_seq is null" );
}else{
	System.out.println(this.toString+" : slip_seq is "+slip_seq );
}
String exp_slip_clsf_cd = req.getParameter("exp_slip_clsf_cd");
if( exp_slip_clsf_cd == null){
	System.out.println(this.toString+" : exp_slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : exp_slip_clsf_cd is "+exp_slip_clsf_cd );
}
String exp_slip_occr_dt = req.getParameter("exp_slip_occr_dt");
if( exp_slip_occr_dt == null){
	System.out.println(this.toString+" : exp_slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : exp_slip_occr_dt is "+exp_slip_occr_dt );
}
String exp_slip_seq = req.getParameter("exp_slip_seq");
if( exp_slip_seq == null){
	System.out.println(this.toString+" : exp_slip_seq is null" );
}else{
	System.out.println(this.toString+" : exp_slip_seq is "+exp_slip_seq );
}
String exp_slip_no = req.getParameter("exp_slip_no");
if( exp_slip_no == null){
	System.out.println(this.toString+" : exp_slip_no is null" );
}else{
	System.out.println(this.toString+" : exp_slip_no is "+exp_slip_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
String slip_seq = Util.checkString(req.getParameter("slip_seq"));
String exp_slip_clsf_cd = Util.checkString(req.getParameter("exp_slip_clsf_cd"));
String exp_slip_occr_dt = Util.checkString(req.getParameter("exp_slip_occr_dt"));
String exp_slip_seq = Util.checkString(req.getParameter("exp_slip_seq"));
String exp_slip_no = Util.checkString(req.getParameter("exp_slip_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt")));
String slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_seq")));
String exp_slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("exp_slip_clsf_cd")));
String exp_slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("exp_slip_occr_dt")));
String exp_slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("exp_slip_seq")));
String exp_slip_no = Util.Uni2Ksc(Util.checkString(req.getParameter("exp_slip_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setIncmgpers(incmgpers);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setSlip_occr_dt(slip_occr_dt);
dm.setSlip_seq(slip_seq);
dm.setExp_slip_clsf_cd(exp_slip_clsf_cd);
dm.setExp_slip_occr_dt(exp_slip_occr_dt);
dm.setExp_slip_seq(exp_slip_seq);
dm.setExp_slip_no(exp_slip_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 21 11:27:08 KST 2016 */