

package chosun.ciis.hd.info.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.info.ds.*;
import chosun.ciis.hd.info.rec.*;

/**
 * 
 */


public class HD_INFO_2500_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String st_dt;
	public String et_dt;

	public HD_INFO_2500_LDM(){}
	public HD_INFO_2500_LDM(String cmpy_cd, String st_dt, String et_dt){
		this.cmpy_cd = cmpy_cd;
		this.st_dt = st_dt;
		this.et_dt = et_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSt_dt(String st_dt){
		this.st_dt = st_dt;
	}

	public void setEt_dt(String et_dt){
		this.et_dt = et_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSt_dt(){
		return this.st_dt;
	}

	public String getEt_dt(){
		return this.et_dt;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_INFO_2500_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_INFO_2500_LDM dm = (HD_INFO_2500_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.st_dt);
		cstmt.setString(5, dm.et_dt);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new HD_INFO_2500_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("st_dt = [" + getSt_dt() + "]");
		System.out.println("et_dt = [" + getEt_dt() + "]");
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
String st_dt = req.getParameter("st_dt");
if( st_dt == null){
	System.out.println(this.toString+" : st_dt is null" );
}else{
	System.out.println(this.toString+" : st_dt is "+st_dt );
}
String et_dt = req.getParameter("et_dt");
if( et_dt == null){
	System.out.println(this.toString+" : et_dt is null" );
}else{
	System.out.println(this.toString+" : et_dt is "+et_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String st_dt = Util.checkString(req.getParameter("st_dt"));
String et_dt = Util.checkString(req.getParameter("et_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String st_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("st_dt")));
String et_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("et_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSt_dt(st_dt);
dm.setEt_dt(et_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jan 05 16:17:17 KST 2011 */