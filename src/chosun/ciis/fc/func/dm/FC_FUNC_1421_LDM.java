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


public class FC_FUNC_1421_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fr_befo_note_stat_dt;
	public String to_befo_note_stat_dt;
	public String note_clsf_cd;

	public FC_FUNC_1421_LDM(){}
	public FC_FUNC_1421_LDM(String cmpy_cd, String fr_befo_note_stat_dt, String to_befo_note_stat_dt, String note_clsf_cd){
		this.cmpy_cd = cmpy_cd;
		this.fr_befo_note_stat_dt = fr_befo_note_stat_dt;
		this.to_befo_note_stat_dt = to_befo_note_stat_dt;
		this.note_clsf_cd = note_clsf_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFr_befo_note_stat_dt(String fr_befo_note_stat_dt){
		this.fr_befo_note_stat_dt = fr_befo_note_stat_dt;
	}

	public void setTo_befo_note_stat_dt(String to_befo_note_stat_dt){
		this.to_befo_note_stat_dt = to_befo_note_stat_dt;
	}

	public void setNote_clsf_cd(String note_clsf_cd){
		this.note_clsf_cd = note_clsf_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFr_befo_note_stat_dt(){
		return this.fr_befo_note_stat_dt;
	}

	public String getTo_befo_note_stat_dt(){
		return this.to_befo_note_stat_dt;
	}

	public String getNote_clsf_cd(){
		return this.note_clsf_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_1421_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_1421_LDM dm = (FC_FUNC_1421_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fr_befo_note_stat_dt);
		cstmt.setString(5, dm.to_befo_note_stat_dt);
		cstmt.setString(6, dm.note_clsf_cd);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_1421_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("fr_befo_note_stat_dt = " + getFr_befo_note_stat_dt());
        System.out.println("to_befo_note_stat_dt = " + getTo_befo_note_stat_dt());
        System.out.println("note_clsf_cd = " + getNote_clsf_cd());
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
String fr_befo_note_stat_dt = req.getParameter("fr_befo_note_stat_dt");
if( fr_befo_note_stat_dt == null){
	System.out.println(this.toString+" : fr_befo_note_stat_dt is null" );
}else{
	System.out.println(this.toString+" : fr_befo_note_stat_dt is "+fr_befo_note_stat_dt );
}
String to_befo_note_stat_dt = req.getParameter("to_befo_note_stat_dt");
if( to_befo_note_stat_dt == null){
	System.out.println(this.toString+" : to_befo_note_stat_dt is null" );
}else{
	System.out.println(this.toString+" : to_befo_note_stat_dt is "+to_befo_note_stat_dt );
}
String note_clsf_cd = req.getParameter("note_clsf_cd");
if( note_clsf_cd == null){
	System.out.println(this.toString+" : note_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : note_clsf_cd is "+note_clsf_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String fr_befo_note_stat_dt = Util.checkString(req.getParameter("fr_befo_note_stat_dt"));
String to_befo_note_stat_dt = Util.checkString(req.getParameter("to_befo_note_stat_dt"));
String note_clsf_cd = Util.checkString(req.getParameter("note_clsf_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fr_befo_note_stat_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_befo_note_stat_dt")));
String to_befo_note_stat_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("to_befo_note_stat_dt")));
String note_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("note_clsf_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFr_befo_note_stat_dt(fr_befo_note_stat_dt);
dm.setTo_befo_note_stat_dt(to_befo_note_stat_dt);
dm.setNote_clsf_cd(note_clsf_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 05 15:44:06 KST 2009 */