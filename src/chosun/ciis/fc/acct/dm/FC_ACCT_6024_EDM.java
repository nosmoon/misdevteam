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


public class FC_ACCT_6024_EDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String from_dt;
	public String to_dt;
	public String ndduc_rate;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public FC_ACCT_6024_EDM(){}
	public FC_ACCT_6024_EDM(String cmpy_cd, String from_dt, String to_dt, String ndduc_rate, String incmg_pers_ipadd, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.from_dt = from_dt;
		this.to_dt = to_dt;
		this.ndduc_rate = ndduc_rate;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
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

	public void setNdduc_rate(String ndduc_rate){
		this.ndduc_rate = ndduc_rate;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
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

	public String getNdduc_rate(){
		return this.ndduc_rate;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_6024_E(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_6024_EDM dm = (FC_ACCT_6024_EDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.from_dt);
		cstmt.setString(5, dm.to_dt);
		cstmt.setString(6, dm.ndduc_rate);
		cstmt.setString(7, dm.incmg_pers_ipadd);
		cstmt.setString(8, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_6024_EDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("from_dt = " + getFrom_dt());
        System.out.println("to_dt = " + getTo_dt());
        System.out.println("ndduc_rate = " + getNdduc_rate());
        System.out.println("incmg_pers_ipadd = " + getIncmg_pers_ipadd());
        System.out.println("incmg_pers = " + getIncmg_pers());
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
String ndduc_rate = req.getParameter("ndduc_rate");
if( ndduc_rate == null){
	System.out.println(this.toString+" : ndduc_rate is null" );
}else{
	System.out.println(this.toString+" : ndduc_rate is "+ndduc_rate );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String from_dt = Util.checkString(req.getParameter("from_dt"));
String to_dt = Util.checkString(req.getParameter("to_dt"));
String ndduc_rate = Util.checkString(req.getParameter("ndduc_rate"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String from_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("from_dt")));
String to_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("to_dt")));
String ndduc_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("ndduc_rate")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFrom_dt(from_dt);
dm.setTo_dt(to_dt);
dm.setNdduc_rate(ndduc_rate);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 06 09:44:30 KST 2009 */