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


package chosun.ciis.mt.papinout.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papinout.ds.*;
import chosun.ciis.mt.papinout.rec.*;

/**
 * 
 */


public class MT_PAPINOUT_5103_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String rcpm_dt;
	public String dlco_cd;

	public MT_PAPINOUT_5103_LDM(){}
	public MT_PAPINOUT_5103_LDM(String cmpy_cd, String rcpm_dt, String dlco_cd){
		this.cmpy_cd = cmpy_cd;
		this.rcpm_dt = rcpm_dt;
		this.dlco_cd = dlco_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRcpm_dt(String rcpm_dt){
		this.rcpm_dt = rcpm_dt;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getRcpm_dt(){
		return this.rcpm_dt;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PAPINOUT_5103_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PAPINOUT_5103_LDM dm = (MT_PAPINOUT_5103_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.rcpm_dt);
		cstmt.setString(5, dm.dlco_cd);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.papinout.ds.MT_PAPINOUT_5103_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("rcpm_dt = [" + getRcpm_dt() + "]");
		System.out.println("dlco_cd = [" + getDlco_cd() + "]");
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
String rcpm_dt = req.getParameter("rcpm_dt");
if( rcpm_dt == null){
	System.out.println(this.toString+" : rcpm_dt is null" );
}else{
	System.out.println(this.toString+" : rcpm_dt is "+rcpm_dt );
}
String dlco_cd = req.getParameter("dlco_cd");
if( dlco_cd == null){
	System.out.println(this.toString+" : dlco_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_cd is "+dlco_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String rcpm_dt = Util.checkString(req.getParameter("rcpm_dt"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String rcpm_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_dt")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setRcpm_dt(rcpm_dt);
dm.setDlco_cd(dlco_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Sep 18 12:20:57 KST 2009 */