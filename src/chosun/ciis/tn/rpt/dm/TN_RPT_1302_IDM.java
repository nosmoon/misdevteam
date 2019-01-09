/***************************************************************************************************
* 파일명 : .java
* 기능 :  모금보고 - 일일보고현황
* 작성일자 : 2015.10.01
* 작성자   : 노상현
***************************************************************************************************/


package chosun.ciis.tn.rpt.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.rpt.ds.*;
import chosun.ciis.tn.rpt.rec.*;

/**
 * 모금보고 - 일일보고현황
 */

public class TN_RPT_1302_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_pers;
	public String clos_dt;
	public String to_off;
	public String to_on;
	public String off_remk;
	public String on_remk;
	public String to_off_yet;
	public String to_on_yet;
	public String off_yet_remk;
	public String on_yet_remk;

	public TN_RPT_1302_IDM(){}
	public TN_RPT_1302_IDM(String cmpy_cd, String incmg_pers, String clos_dt, String to_off, String to_on, String off_remk, String on_remk, String to_off_yet, String to_on_yet, String off_yet_remk, String on_yet_remk){
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers = incmg_pers;
		this.clos_dt = clos_dt;
		this.to_off = to_off;
		this.to_on = to_on;
		this.off_remk = off_remk;
		this.on_remk = on_remk;
		this.to_off_yet = to_off_yet;
		this.to_on_yet = to_on_yet;
		this.off_yet_remk = off_yet_remk;
		this.on_yet_remk = on_yet_remk;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setClos_dt(String clos_dt){
		this.clos_dt = clos_dt;
	}

	public void setTo_off(String to_off){
		this.to_off = to_off;
	}

	public void setTo_on(String to_on){
		this.to_on = to_on;
	}

	public void setOff_remk(String off_remk){
		this.off_remk = off_remk;
	}

	public void setOn_remk(String on_remk){
		this.on_remk = on_remk;
	}

	public void setTo_off_yet(String to_off_yet){
		this.to_off_yet = to_off_yet;
	}

	public void setTo_on_yet(String to_on_yet){
		this.to_on_yet = to_on_yet;
	}

	public void setOff_yet_remk(String off_yet_remk){
		this.off_yet_remk = off_yet_remk;
	}

	public void setOn_yet_remk(String on_yet_remk){
		this.on_yet_remk = on_yet_remk;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getClos_dt(){
		return this.clos_dt;
	}

	public String getTo_off(){
		return this.to_off;
	}

	public String getTo_on(){
		return this.to_on;
	}

	public String getOff_remk(){
		return this.off_remk;
	}

	public String getOn_remk(){
		return this.on_remk;
	}

	public String getTo_off_yet(){
		return this.to_off_yet;
	}

	public String getTo_on_yet(){
		return this.to_on_yet;
	}

	public String getOff_yet_remk(){
		return this.off_yet_remk;
	}

	public String getOn_yet_remk(){
		return this.on_yet_remk;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_RPT_1302_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_RPT_1302_IDM dm = (TN_RPT_1302_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_pers);
		cstmt.setString(5, dm.clos_dt);
		cstmt.setString(6, dm.to_off);
		cstmt.setString(7, dm.to_on);
		cstmt.setString(8, dm.off_remk);
		cstmt.setString(9, dm.on_remk);
		cstmt.setString(10, dm.to_off_yet);
		cstmt.setString(11, dm.to_on_yet);
		cstmt.setString(12, dm.off_yet_remk);
		cstmt.setString(13, dm.on_yet_remk);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.rpt.ds.TN_RPT_1302_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("clos_dt = [" + getClos_dt() + "]");
		System.out.println("to_off = [" + getTo_off() + "]");
		System.out.println("to_on = [" + getTo_on() + "]");
		System.out.println("off_remk = [" + getOff_remk() + "]");
		System.out.println("on_remk = [" + getOn_remk() + "]");
		System.out.println("to_off_yet = [" + getTo_off_yet() + "]");
		System.out.println("to_on_yet = [" + getTo_on_yet() + "]");
		System.out.println("off_yet_remk = [" + getOff_yet_remk() + "]");
		System.out.println("on_yet_remk = [" + getOn_yet_remk() + "]");
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
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String clos_dt = req.getParameter("clos_dt");
if( clos_dt == null){
	System.out.println(this.toString+" : clos_dt is null" );
}else{
	System.out.println(this.toString+" : clos_dt is "+clos_dt );
}
String to_off = req.getParameter("to_off");
if( to_off == null){
	System.out.println(this.toString+" : to_off is null" );
}else{
	System.out.println(this.toString+" : to_off is "+to_off );
}
String to_on = req.getParameter("to_on");
if( to_on == null){
	System.out.println(this.toString+" : to_on is null" );
}else{
	System.out.println(this.toString+" : to_on is "+to_on );
}
String off_remk = req.getParameter("off_remk");
if( off_remk == null){
	System.out.println(this.toString+" : off_remk is null" );
}else{
	System.out.println(this.toString+" : off_remk is "+off_remk );
}
String on_remk = req.getParameter("on_remk");
if( on_remk == null){
	System.out.println(this.toString+" : on_remk is null" );
}else{
	System.out.println(this.toString+" : on_remk is "+on_remk );
}
String to_off_yet = req.getParameter("to_off_yet");
if( to_off_yet == null){
	System.out.println(this.toString+" : to_off_yet is null" );
}else{
	System.out.println(this.toString+" : to_off_yet is "+to_off_yet );
}
String to_on_yet = req.getParameter("to_on_yet");
if( to_on_yet == null){
	System.out.println(this.toString+" : to_on_yet is null" );
}else{
	System.out.println(this.toString+" : to_on_yet is "+to_on_yet );
}
String off_yet_remk = req.getParameter("off_yet_remk");
if( off_yet_remk == null){
	System.out.println(this.toString+" : off_yet_remk is null" );
}else{
	System.out.println(this.toString+" : off_yet_remk is "+off_yet_remk );
}
String on_yet_remk = req.getParameter("on_yet_remk");
if( on_yet_remk == null){
	System.out.println(this.toString+" : on_yet_remk is null" );
}else{
	System.out.println(this.toString+" : on_yet_remk is "+on_yet_remk );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String clos_dt = Util.checkString(req.getParameter("clos_dt"));
String to_off = Util.checkString(req.getParameter("to_off"));
String to_on = Util.checkString(req.getParameter("to_on"));
String off_remk = Util.checkString(req.getParameter("off_remk"));
String on_remk = Util.checkString(req.getParameter("on_remk"));
String to_off_yet = Util.checkString(req.getParameter("to_off_yet"));
String to_on_yet = Util.checkString(req.getParameter("to_on_yet"));
String off_yet_remk = Util.checkString(req.getParameter("off_yet_remk"));
String on_yet_remk = Util.checkString(req.getParameter("on_yet_remk"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String clos_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("clos_dt")));
String to_off = Util.Uni2Ksc(Util.checkString(req.getParameter("to_off")));
String to_on = Util.Uni2Ksc(Util.checkString(req.getParameter("to_on")));
String off_remk = Util.Uni2Ksc(Util.checkString(req.getParameter("off_remk")));
String on_remk = Util.Uni2Ksc(Util.checkString(req.getParameter("on_remk")));
String to_off_yet = Util.Uni2Ksc(Util.checkString(req.getParameter("to_off_yet")));
String to_on_yet = Util.Uni2Ksc(Util.checkString(req.getParameter("to_on_yet")));
String off_yet_remk = Util.Uni2Ksc(Util.checkString(req.getParameter("off_yet_remk")));
String on_yet_remk = Util.Uni2Ksc(Util.checkString(req.getParameter("on_yet_remk")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers(incmg_pers);
dm.setClos_dt(clos_dt);
dm.setTo_off(to_off);
dm.setTo_on(to_on);
dm.setOff_remk(off_remk);
dm.setOn_remk(on_remk);
dm.setTo_off_yet(to_off_yet);
dm.setTo_on_yet(to_on_yet);
dm.setOff_yet_remk(off_yet_remk);
dm.setOn_yet_remk(on_yet_remk);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Nov 15 09:49:09 KST 2016 */