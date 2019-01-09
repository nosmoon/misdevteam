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


public class FC_ACCT_2931_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String from_dt;
	public String to_dt;
	public String dt_clsf;
	public String jbjp_clsf;

	public FC_ACCT_2931_LDM(){}
	public FC_ACCT_2931_LDM(String cmpy_cd, String from_dt, String to_dt, String dt_clsf, String jbjp_clsf){
		this.cmpy_cd = cmpy_cd;
		this.from_dt = from_dt;
		this.to_dt = to_dt;
		this.dt_clsf = dt_clsf;
		this.jbjp_clsf = jbjp_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFrom_dt(String from_dt){
		this.from_dt = from_dt;
	}

	public void setTo_dt(String to_dt){
		this.to_dt = to_dt;
	}

	public void setDt_clsf(String dt_clsf){
		this.dt_clsf = dt_clsf;
	}

	public void setJbjp_clsf(String jbjp_clsf){
		this.jbjp_clsf = jbjp_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFrom_dt(){
		return this.from_dt;
	}

	public String getTo_dt(){
		return this.to_dt;
	}

	public String getDt_clsf(){
		return this.dt_clsf;
	}

	public String getJbjp_clsf(){
		return this.jbjp_clsf;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2931_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2931_LDM dm = (FC_ACCT_2931_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.from_dt);
		cstmt.setString(5, dm.to_dt);
		cstmt.setString(6, dm.dt_clsf);
		cstmt.setString(7, dm.jbjp_clsf);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2931_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("from_dt = [" + getFrom_dt() + "]");
		System.out.println("to_dt = [" + getTo_dt() + "]");
		System.out.println("dt_clsf = [" + getDt_clsf() + "]");
		System.out.println("jbjp_clsf = [" + getJbjp_clsf() + "]");
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
String from_dt = req.getParameter("from_dt");
if( from_dt == null){
	System.out.println(this.toString+" : from_dt is null" );
}else{
	System.out.println(this.toString+" : from_dt is "+from_dt );
}
String to_dt = req.getParameter("to_dt");
if( to_dt == null){
	System.out.println(this.toString+" : to_dt is null" );
}else{
	System.out.println(this.toString+" : to_dt is "+to_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String from_dt = Util.checkString(req.getParameter("from_dt"));
String to_dt = Util.checkString(req.getParameter("to_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String from_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("from_dt")));
String to_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("to_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFrom_dt(from_dt);
dm.setTo_dt(to_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 24 13:50:37 KST 2009 */