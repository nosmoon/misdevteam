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


public class FC_FUNC_1021_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String stat_cd;
	public String stat_dt;

	public FC_FUNC_1021_LDM(){}
	public FC_FUNC_1021_LDM(String cmpy_cd, String stat_cd, String stat_dt){
		this.cmpy_cd = cmpy_cd;
		this.stat_cd = stat_cd;
		this.stat_dt = stat_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setStat_cd(String stat_cd){
		this.stat_cd = stat_cd;
	}

	public void setStat_dt(String stat_dt){
		this.stat_dt = stat_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getStat_cd(){
		return this.stat_cd;
	}

	public String getStat_dt(){
		return this.stat_dt;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_1021_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_1021_LDM dm = (FC_FUNC_1021_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.stat_cd);
		cstmt.setString(5, dm.stat_dt);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_1021_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("stat_cd = " + getStat_cd());
        System.out.println("stat_dt = " + getStat_dt());
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
String stat_cd = req.getParameter("stat_cd");
if( stat_cd == null){
	System.out.println(this.toString+" : stat_cd is null" );
}else{
	System.out.println(this.toString+" : stat_cd is "+stat_cd );
}
String stat_dt = req.getParameter("stat_dt");
if( stat_dt == null){
	System.out.println(this.toString+" : stat_dt is null" );
}else{
	System.out.println(this.toString+" : stat_dt is "+stat_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String stat_cd = Util.checkString(req.getParameter("stat_cd"));
String stat_dt = Util.checkString(req.getParameter("stat_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String stat_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("stat_cd")));
String stat_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("stat_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setStat_cd(stat_cd);
dm.setStat_dt(stat_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 09 15:54:47 KST 2009 */