/***************************************************************************************************
* 파일명 : CO_DECID_1001_UDM.java
* 기능 : 공통-전자결재
* 작성일자 : 2009-03-12
* 작성자 : 양정녕
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.co.decid.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.decid.ds.*;
import chosun.ciis.co.decid.rec.*;

/**
 * 
 */


public class CO_DECID_1001_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String decid_key;
	public String doc_stat_cd;
	public String chg_pers;
	public String incmg_pers_ipaddr;

	public CO_DECID_1001_UDM(){}
	public CO_DECID_1001_UDM(String cmpy_cd, String decid_key, String doc_stat_cd, String chg_pers, String incmg_pers_ipaddr){
		this.cmpy_cd = cmpy_cd;
		this.decid_key = decid_key;
		this.doc_stat_cd = doc_stat_cd;
		this.chg_pers = chg_pers;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDecid_key(String decid_key){
		this.decid_key = decid_key;
	}

	public void setDoc_stat_cd(String doc_stat_cd){
		this.doc_stat_cd = doc_stat_cd;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDecid_key(){
		return this.decid_key;
	}

	public String getDoc_stat_cd(){
		return this.doc_stat_cd;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getSQL(){
		 return "{ call SP_CO_DECID_1001_U( ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_DECID_1001_UDM dm = (CO_DECID_1001_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.decid_key);
		cstmt.setString(5, dm.doc_stat_cd);
		cstmt.setString(6, dm.chg_pers);
		cstmt.setString(7, dm.incmg_pers_ipaddr);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.co.decid.ds.CO_DECID_1001_UDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("decid_key = " + getDecid_key());
        System.out.println("doc_stat_cd = " + getDoc_stat_cd());
        System.out.println("chg_pers = " + getChg_pers());
        System.out.println("incmg_pers_ipaddr = " + getIncmg_pers_ipaddr());
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
String decid_key = req.getParameter("decid_key");
if( decid_key == null){
	System.out.println(this.toString+" : decid_key is null" );
}else{
	System.out.println(this.toString+" : decid_key is "+decid_key );
}
String doc_stat_cd = req.getParameter("doc_stat_cd");
if( doc_stat_cd == null){
	System.out.println(this.toString+" : doc_stat_cd is null" );
}else{
	System.out.println(this.toString+" : doc_stat_cd is "+doc_stat_cd );
}
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
String incmg_pers_ipaddr = req.getParameter("incmg_pers_ipaddr");
if( incmg_pers_ipaddr == null){
	System.out.println(this.toString+" : incmg_pers_ipaddr is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipaddr is "+incmg_pers_ipaddr );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String decid_key = Util.checkString(req.getParameter("decid_key"));
String doc_stat_cd = Util.checkString(req.getParameter("doc_stat_cd"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String decid_key = Util.Uni2Ksc(Util.checkString(req.getParameter("decid_key")));
String doc_stat_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("doc_stat_cd")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDecid_key(decid_key);
dm.setDoc_stat_cd(doc_stat_cd);
dm.setChg_pers(chg_pers);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 09 18:44:35 KST 2009 */