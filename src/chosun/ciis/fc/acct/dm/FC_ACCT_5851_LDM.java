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


public class FC_ACCT_5851_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fisc_dt;
	public String slip_clsf_cd;

	public FC_ACCT_5851_LDM(){}
	public FC_ACCT_5851_LDM(String cmpy_cd, String fisc_dt, String slip_clsf_cd){
		this.cmpy_cd = cmpy_cd;
		this.fisc_dt = fisc_dt;
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFisc_dt(String fisc_dt){
		this.fisc_dt = fisc_dt;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFisc_dt(){
		return this.fisc_dt;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_5851_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_5851_LDM dm = (FC_ACCT_5851_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fisc_dt);
		cstmt.setString(5, dm.slip_clsf_cd);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_5851_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fisc_dt = [" + getFisc_dt() + "]");
		System.out.println("slip_clsf_cd = [" + getSlip_clsf_cd() + "]");
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
String fisc_dt = req.getParameter("fisc_dt");
if( fisc_dt == null){
	System.out.println(this.toString+" : fisc_dt is null" );
}else{
	System.out.println(this.toString+" : fisc_dt is "+fisc_dt );
}
String slip_clsf_cd = req.getParameter("slip_clsf_cd");
if( slip_clsf_cd == null){
	System.out.println(this.toString+" : slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : slip_clsf_cd is "+slip_clsf_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String fisc_dt = Util.checkString(req.getParameter("fisc_dt"));
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fisc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fisc_dt")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFisc_dt(fisc_dt);
dm.setSlip_clsf_cd(slip_clsf_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jan 06 13:54:33 KST 2012 */