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


public class FC_FUNC_1401_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String now_note_stat_cd;
	public String fr_mtry_dt;
	public String to_mtry_dt;
	public String fr_stat_dt;
	public String to_stat_dt;
	public String stat_cd;
	public String bcomp;
	public String scomp;

	public FC_FUNC_1401_LDM(){}
	public FC_FUNC_1401_LDM(String cmpy_cd, String now_note_stat_cd, String fr_mtry_dt, String to_mtry_dt, String fr_stat_dt, String to_stat_dt, String stat_cd, String bcomp, String scomp){
		this.cmpy_cd = cmpy_cd;
		this.now_note_stat_cd = now_note_stat_cd;
		this.fr_mtry_dt = fr_mtry_dt;
		this.to_mtry_dt = to_mtry_dt;
		this.fr_stat_dt = fr_stat_dt;
		this.to_stat_dt = to_stat_dt;
		this.stat_cd = stat_cd;
		this.bcomp = bcomp;
		this.scomp = scomp;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setNow_note_stat_cd(String now_note_stat_cd){
		this.now_note_stat_cd = now_note_stat_cd;
	}

	public void setFr_mtry_dt(String fr_mtry_dt){
		this.fr_mtry_dt = fr_mtry_dt;
	}

	public void setTo_mtry_dt(String to_mtry_dt){
		this.to_mtry_dt = to_mtry_dt;
	}

	public void setFr_stat_dt(String fr_stat_dt){
		this.fr_stat_dt = fr_stat_dt;
	}

	public void setTo_stat_dt(String to_stat_dt){
		this.to_stat_dt = to_stat_dt;
	}

	public void setStat_cd(String stat_cd){
		this.stat_cd = stat_cd;
	}

	public void setBcomp(String bcomp){
		this.bcomp = bcomp;
	}

	public void setScomp(String scomp){
		this.scomp = scomp;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getNow_note_stat_cd(){
		return this.now_note_stat_cd;
	}

	public String getFr_mtry_dt(){
		return this.fr_mtry_dt;
	}

	public String getTo_mtry_dt(){
		return this.to_mtry_dt;
	}

	public String getFr_stat_dt(){
		return this.fr_stat_dt;
	}

	public String getTo_stat_dt(){
		return this.to_stat_dt;
	}

	public String getStat_cd(){
		return this.stat_cd;
	}

	public String getBcomp(){
		return this.bcomp;
	}

	public String getScomp(){
		return this.scomp;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_1401_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_1401_LDM dm = (FC_FUNC_1401_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.now_note_stat_cd);
		cstmt.setString(5, dm.fr_mtry_dt);
		cstmt.setString(6, dm.to_mtry_dt);
		cstmt.setString(7, dm.fr_stat_dt);
		cstmt.setString(8, dm.to_stat_dt);
		cstmt.setString(9, dm.stat_cd);
		cstmt.setString(10, dm.bcomp);
		cstmt.setString(11, dm.scomp);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_1401_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("now_note_stat_cd = " + getNow_note_stat_cd());
        System.out.println("fr_mtry_dt = " + getFr_mtry_dt());
        System.out.println("to_mtry_dt = " + getTo_mtry_dt());
        System.out.println("fr_stat_dt = " + getFr_stat_dt());
        System.out.println("to_stat_dt = " + getTo_stat_dt());
        System.out.println("stat_cd = " + getStat_cd());
        System.out.println("bcomp = " + getBcomp());
        System.out.println("scomp = " + getScomp());
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
String now_note_stat_cd = req.getParameter("now_note_stat_cd");
if( now_note_stat_cd == null){
	System.out.println(this.toString+" : now_note_stat_cd is null" );
}else{
	System.out.println(this.toString+" : now_note_stat_cd is "+now_note_stat_cd );
}
String fr_mtry_dt = req.getParameter("fr_mtry_dt");
if( fr_mtry_dt == null){
	System.out.println(this.toString+" : fr_mtry_dt is null" );
}else{
	System.out.println(this.toString+" : fr_mtry_dt is "+fr_mtry_dt );
}
String to_mtry_dt = req.getParameter("to_mtry_dt");
if( to_mtry_dt == null){
	System.out.println(this.toString+" : to_mtry_dt is null" );
}else{
	System.out.println(this.toString+" : to_mtry_dt is "+to_mtry_dt );
}
String fr_stat_dt = req.getParameter("fr_stat_dt");
if( fr_stat_dt == null){
	System.out.println(this.toString+" : fr_stat_dt is null" );
}else{
	System.out.println(this.toString+" : fr_stat_dt is "+fr_stat_dt );
}
String to_stat_dt = req.getParameter("to_stat_dt");
if( to_stat_dt == null){
	System.out.println(this.toString+" : to_stat_dt is null" );
}else{
	System.out.println(this.toString+" : to_stat_dt is "+to_stat_dt );
}
String stat_cd = req.getParameter("stat_cd");
if( stat_cd == null){
	System.out.println(this.toString+" : stat_cd is null" );
}else{
	System.out.println(this.toString+" : stat_cd is "+stat_cd );
}
String bcomp = req.getParameter("bcomp");
if( bcomp == null){
	System.out.println(this.toString+" : bcomp is null" );
}else{
	System.out.println(this.toString+" : bcomp is "+bcomp );
}
String scomp = req.getParameter("scomp");
if( scomp == null){
	System.out.println(this.toString+" : scomp is null" );
}else{
	System.out.println(this.toString+" : scomp is "+scomp );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String now_note_stat_cd = Util.checkString(req.getParameter("now_note_stat_cd"));
String fr_mtry_dt = Util.checkString(req.getParameter("fr_mtry_dt"));
String to_mtry_dt = Util.checkString(req.getParameter("to_mtry_dt"));
String fr_stat_dt = Util.checkString(req.getParameter("fr_stat_dt"));
String to_stat_dt = Util.checkString(req.getParameter("to_stat_dt"));
String stat_cd = Util.checkString(req.getParameter("stat_cd"));
String bcomp = Util.checkString(req.getParameter("bcomp"));
String scomp = Util.checkString(req.getParameter("scomp"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String now_note_stat_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("now_note_stat_cd")));
String fr_mtry_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_mtry_dt")));
String to_mtry_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("to_mtry_dt")));
String fr_stat_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_stat_dt")));
String to_stat_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("to_stat_dt")));
String stat_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("stat_cd")));
String bcomp = Util.Uni2Ksc(Util.checkString(req.getParameter("bcomp")));
String scomp = Util.Uni2Ksc(Util.checkString(req.getParameter("scomp")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setNow_note_stat_cd(now_note_stat_cd);
dm.setFr_mtry_dt(fr_mtry_dt);
dm.setTo_mtry_dt(to_mtry_dt);
dm.setFr_stat_dt(fr_stat_dt);
dm.setTo_stat_dt(to_stat_dt);
dm.setStat_cd(stat_cd);
dm.setBcomp(bcomp);
dm.setScomp(scomp);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 09 14:16:02 KST 2009 */