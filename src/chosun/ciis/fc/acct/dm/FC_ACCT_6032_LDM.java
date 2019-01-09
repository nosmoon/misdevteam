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


public class FC_ACCT_6032_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String clsf_cd;
	public String erplace_cd;
	public String fr_slip_occr_dt;
	public String to_slip_occr_dt;
	public String std_dt;

	public FC_ACCT_6032_LDM(){}
	public FC_ACCT_6032_LDM(String cmpy_cd, String clsf_cd, String erplace_cd, String fr_slip_occr_dt, String to_slip_occr_dt, String std_dt){
		this.cmpy_cd = cmpy_cd;
		this.clsf_cd = clsf_cd;
		this.erplace_cd = erplace_cd;
		this.fr_slip_occr_dt = fr_slip_occr_dt;
		this.to_slip_occr_dt = to_slip_occr_dt;
		this.std_dt = std_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setClsf_cd(String clsf_cd){
		this.clsf_cd = clsf_cd;
	}

	public void setErplace_cd(String erplace_cd){
		this.erplace_cd = erplace_cd;
	}

	public void setFr_slip_occr_dt(String fr_slip_occr_dt){
		this.fr_slip_occr_dt = fr_slip_occr_dt;
	}

	public void setTo_slip_occr_dt(String to_slip_occr_dt){
		this.to_slip_occr_dt = to_slip_occr_dt;
	}

	public void setStd_dt(String std_dt){
		this.std_dt = std_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getClsf_cd(){
		return this.clsf_cd;
	}

	public String getErplace_cd(){
		return this.erplace_cd;
	}

	public String getFr_slip_occr_dt(){
		return this.fr_slip_occr_dt;
	}

	public String getTo_slip_occr_dt(){
		return this.to_slip_occr_dt;
	}

	public String getStd_dt(){
		return this.std_dt;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_6032_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_6032_LDM dm = (FC_ACCT_6032_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.clsf_cd);
		cstmt.setString(5, dm.erplace_cd);
		cstmt.setString(6, dm.fr_slip_occr_dt);
		cstmt.setString(7, dm.to_slip_occr_dt);
		cstmt.setString(8, dm.std_dt);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
		cstmt.registerOutParameter(14, OracleTypes.CURSOR);
		cstmt.registerOutParameter(15, OracleTypes.CURSOR);
		cstmt.registerOutParameter(16, OracleTypes.CURSOR);
		cstmt.registerOutParameter(17, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_6032_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("clsf_cd = [" + getClsf_cd() + "]");
		System.out.println("erplace_cd = [" + getErplace_cd() + "]");
		System.out.println("fr_slip_occr_dt = [" + getFr_slip_occr_dt() + "]");
		System.out.println("to_slip_occr_dt = [" + getTo_slip_occr_dt() + "]");
		System.out.println("std_dt = [" + getStd_dt() + "]");
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
String clsf_cd = req.getParameter("clsf_cd");
if( clsf_cd == null){
	System.out.println(this.toString+" : clsf_cd is null" );
}else{
	System.out.println(this.toString+" : clsf_cd is "+clsf_cd );
}
String erplace_cd = req.getParameter("erplace_cd");
if( erplace_cd == null){
	System.out.println(this.toString+" : erplace_cd is null" );
}else{
	System.out.println(this.toString+" : erplace_cd is "+erplace_cd );
}
String fr_slip_occr_dt = req.getParameter("fr_slip_occr_dt");
if( fr_slip_occr_dt == null){
	System.out.println(this.toString+" : fr_slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : fr_slip_occr_dt is "+fr_slip_occr_dt );
}
String to_slip_occr_dt = req.getParameter("to_slip_occr_dt");
if( to_slip_occr_dt == null){
	System.out.println(this.toString+" : to_slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : to_slip_occr_dt is "+to_slip_occr_dt );
}
String std_dt = req.getParameter("std_dt");
if( std_dt == null){
	System.out.println(this.toString+" : std_dt is null" );
}else{
	System.out.println(this.toString+" : std_dt is "+std_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String clsf_cd = Util.checkString(req.getParameter("clsf_cd"));
String erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
String fr_slip_occr_dt = Util.checkString(req.getParameter("fr_slip_occr_dt"));
String to_slip_occr_dt = Util.checkString(req.getParameter("to_slip_occr_dt"));
String std_dt = Util.checkString(req.getParameter("std_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("clsf_cd")));
String erplace_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("erplace_cd")));
String fr_slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_slip_occr_dt")));
String to_slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("to_slip_occr_dt")));
String std_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("std_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setClsf_cd(clsf_cd);
dm.setErplace_cd(erplace_cd);
dm.setFr_slip_occr_dt(fr_slip_occr_dt);
dm.setTo_slip_occr_dt(to_slip_occr_dt);
dm.setStd_dt(std_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 21 17:35:12 KST 2016 */