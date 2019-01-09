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


public class FC_ACCT_4002_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String adjm_occr_dt;
	public String adjm_slip_clsf;
	public String adjm_seq;
	public String adjm_sub_seq;

	public FC_ACCT_4002_LDM(){}
	public FC_ACCT_4002_LDM(String cmpy_cd, String adjm_occr_dt, String adjm_slip_clsf, String adjm_seq, String adjm_sub_seq){
		this.cmpy_cd = cmpy_cd;
		this.adjm_occr_dt = adjm_occr_dt;
		this.adjm_slip_clsf = adjm_slip_clsf;
		this.adjm_seq = adjm_seq;
		this.adjm_sub_seq = adjm_sub_seq;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAdjm_occr_dt(String adjm_occr_dt){
		this.adjm_occr_dt = adjm_occr_dt;
	}

	public void setAdjm_slip_clsf(String adjm_slip_clsf){
		this.adjm_slip_clsf = adjm_slip_clsf;
	}

	public void setAdjm_seq(String adjm_seq){
		this.adjm_seq = adjm_seq;
	}

	public void setAdjm_sub_seq(String adjm_sub_seq){
		this.adjm_sub_seq = adjm_sub_seq;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAdjm_occr_dt(){
		return this.adjm_occr_dt;
	}

	public String getAdjm_slip_clsf(){
		return this.adjm_slip_clsf;
	}

	public String getAdjm_seq(){
		return this.adjm_seq;
	}

	public String getAdjm_sub_seq(){
		return this.adjm_sub_seq;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_4002_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_4002_LDM dm = (FC_ACCT_4002_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.adjm_occr_dt);
		cstmt.setString(5, dm.adjm_slip_clsf);
		cstmt.setString(6, dm.adjm_seq);
		cstmt.setString(7, dm.adjm_sub_seq);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_4002_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("adjm_occr_dt = [" + getAdjm_occr_dt() + "]");
		System.out.println("adjm_slip_clsf = [" + getAdjm_slip_clsf() + "]");
		System.out.println("adjm_seq = [" + getAdjm_seq() + "]");
		System.out.println("adjm_sub_seq = [" + getAdjm_sub_seq() + "]");
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
String adjm_occr_dt = req.getParameter("adjm_occr_dt");
if( adjm_occr_dt == null){
	System.out.println(this.toString+" : adjm_occr_dt is null" );
}else{
	System.out.println(this.toString+" : adjm_occr_dt is "+adjm_occr_dt );
}
String adjm_slip_clsf = req.getParameter("adjm_slip_clsf");
if( adjm_slip_clsf == null){
	System.out.println(this.toString+" : adjm_slip_clsf is null" );
}else{
	System.out.println(this.toString+" : adjm_slip_clsf is "+adjm_slip_clsf );
}
String adjm_seq = req.getParameter("adjm_seq");
if( adjm_seq == null){
	System.out.println(this.toString+" : adjm_seq is null" );
}else{
	System.out.println(this.toString+" : adjm_seq is "+adjm_seq );
}
String adjm_sub_seq = req.getParameter("adjm_sub_seq");
if( adjm_sub_seq == null){
	System.out.println(this.toString+" : adjm_sub_seq is null" );
}else{
	System.out.println(this.toString+" : adjm_sub_seq is "+adjm_sub_seq );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String adjm_occr_dt = Util.checkString(req.getParameter("adjm_occr_dt"));
String adjm_slip_clsf = Util.checkString(req.getParameter("adjm_slip_clsf"));
String adjm_seq = Util.checkString(req.getParameter("adjm_seq"));
String adjm_sub_seq = Util.checkString(req.getParameter("adjm_sub_seq"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String adjm_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("adjm_occr_dt")));
String adjm_slip_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("adjm_slip_clsf")));
String adjm_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("adjm_seq")));
String adjm_sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("adjm_sub_seq")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAdjm_occr_dt(adjm_occr_dt);
dm.setAdjm_slip_clsf(adjm_slip_clsf);
dm.setAdjm_seq(adjm_seq);
dm.setAdjm_sub_seq(adjm_sub_seq);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 17 09:54:43 KST 2009 */