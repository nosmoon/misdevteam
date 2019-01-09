/***************************************************************************************************
* 파일명 : SP_CO_L_RDRCRTS_GRAD_APLC.java
* 기능 :  독자-독자인증요청 조회
* 작성일자 : 2004-05-17
* 작성자 : 전현표
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
 * 독자-독자인증요청 조회
 */

public class FC_FUNC_1170_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String now_note_stat_dt;
	public String now_note_stat_cd;

	public FC_FUNC_1170_LDM(){}
	public FC_FUNC_1170_LDM(String cmpy_cd, String now_note_stat_dt, String now_note_stat_cd){
		this.cmpy_cd = cmpy_cd;
		this.now_note_stat_dt = now_note_stat_dt;
		this.now_note_stat_cd = now_note_stat_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setNow_note_stat_dt(String now_note_stat_dt){
		this.now_note_stat_dt = now_note_stat_dt;
	}

	public void setNow_note_stat_cd(String now_note_stat_cd){
		this.now_note_stat_cd = now_note_stat_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getNow_note_stat_dt(){
		return this.now_note_stat_dt;
	}

	public String getNow_note_stat_cd(){
		return this.now_note_stat_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_1170_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_1170_LDM dm = (FC_FUNC_1170_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.now_note_stat_dt);
		cstmt.setString(5, dm.now_note_stat_cd);
		cstmt.registerOutParameter(6, Types.INTEGER);
		cstmt.registerOutParameter(7, Types.INTEGER);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_1170_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("now_note_stat_dt = " + getNow_note_stat_dt());
        System.out.println("now_note_stat_cd = " + getNow_note_stat_cd());
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
String now_note_stat_dt = req.getParameter("now_note_stat_dt");
if( now_note_stat_dt == null){
	System.out.println(this.toString+" : now_note_stat_dt is null" );
}else{
	System.out.println(this.toString+" : now_note_stat_dt is "+now_note_stat_dt );
}
String now_note_stat_cd = req.getParameter("now_note_stat_cd");
if( now_note_stat_cd == null){
	System.out.println(this.toString+" : now_note_stat_cd is null" );
}else{
	System.out.println(this.toString+" : now_note_stat_cd is "+now_note_stat_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String now_note_stat_dt = Util.checkString(req.getParameter("now_note_stat_dt"));
String now_note_stat_cd = Util.checkString(req.getParameter("now_note_stat_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String now_note_stat_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("now_note_stat_dt")));
String now_note_stat_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("now_note_stat_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setNow_note_stat_dt(now_note_stat_dt);
dm.setNow_note_stat_cd(now_note_stat_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Feb 05 14:42:56 KST 2009 */