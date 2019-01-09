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


public class MC_BUDG_1006_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String min_max;
	public String sql;

	public MC_BUDG_1006_LDM(){}
	public MC_BUDG_1006_LDM(String cmpy_cd, String min_max, String sql){
		this.cmpy_cd = cmpy_cd;
		this.min_max = min_max;
		this.sql = sql;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMin_max(String min_max){
		this.min_max = min_max;
	}

	public void setSql(String sql){
		this.sql = sql;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMin_max(){
		return this.min_max;
	}

	public String getSql(){
		return this.sql;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_BUDG_1006_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_BUDG_1006_LDM dm = (MC_BUDG_1006_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.min_max);
		cstmt.setString(5, dm.sql);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.budg.ds.MC_BUDG_1006_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("min_max = " + getMin_max());
        System.out.println("sql = " + getSql());
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
String min_max = req.getParameter("min_max");
if( min_max == null){
	System.out.println(this.toString+" : min_max is null" );
}else{
	System.out.println(this.toString+" : min_max is "+min_max );
}
String sql = req.getParameter("sql");
if( sql == null){
	System.out.println(this.toString+" : sql is null" );
}else{
	System.out.println(this.toString+" : sql is "+sql );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String min_max = Util.checkString(req.getParameter("min_max"));
String sql = Util.checkString(req.getParameter("sql"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String min_max = Util.Uni2Ksc(Util.checkString(req.getParameter("min_max")));
String sql = Util.Uni2Ksc(Util.checkString(req.getParameter("sql")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMin_max(min_max);
dm.setSql(sql);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 18 17:03:58 KST 2009 */