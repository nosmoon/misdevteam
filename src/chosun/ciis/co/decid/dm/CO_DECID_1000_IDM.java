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


public class CO_DECID_1000_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String decid_job_cd;
	public String doc_titl;
	public String doc_stat_cd;
	public String incmg_pers_ip;
	public String incmg_pers;

	public CO_DECID_1000_IDM(){}
	public CO_DECID_1000_IDM(String cmpy_cd, String decid_job_cd, String doc_titl, String doc_stat_cd, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.decid_job_cd = decid_job_cd;
		this.doc_titl = doc_titl;
		this.doc_stat_cd = doc_stat_cd;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDecid_job_cd(String decid_job_cd){
		this.decid_job_cd = decid_job_cd;
	}

	public void setDoc_titl(String doc_titl){
		this.doc_titl = doc_titl;
	}

	public void setDoc_stat_cd(String doc_stat_cd){
		this.doc_stat_cd = doc_stat_cd;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDecid_job_cd(){
		return this.decid_job_cd;
	}

	public String getDoc_titl(){
		return this.doc_titl;
	}

	public String getDoc_stat_cd(){
		return this.doc_stat_cd;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call SP_CO_DECID_1000_I( ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_DECID_1000_IDM dm = (CO_DECID_1000_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.decid_job_cd);
		cstmt.setString(5, dm.doc_titl);
		cstmt.setString(6, dm.doc_stat_cd);
		cstmt.setString(7, dm.incmg_pers_ip);
		cstmt.setString(8, dm.incmg_pers);
		cstmt.registerOutParameter(9, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.co.decid.ds.CO_DECID_1000_IDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("decid_job_cd = " + getDecid_job_cd());
        System.out.println("doc_titl = " + getDoc_titl());
        System.out.println("doc_stat_cd = " + getDoc_stat_cd());
        System.out.println("incmg_pers_ip = " + getIncmg_pers_ip());
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
String decid_job_cd = req.getParameter("decid_job_cd");
if( decid_job_cd == null){
	System.out.println(this.toString+" : decid_job_cd is null" );
}else{
	System.out.println(this.toString+" : decid_job_cd is "+decid_job_cd );
}
String doc_titl = req.getParameter("doc_titl");
if( doc_titl == null){
	System.out.println(this.toString+" : doc_titl is null" );
}else{
	System.out.println(this.toString+" : doc_titl is "+doc_titl );
}
String doc_stat_cd = req.getParameter("doc_stat_cd");
if( doc_stat_cd == null){
	System.out.println(this.toString+" : doc_stat_cd is null" );
}else{
	System.out.println(this.toString+" : doc_stat_cd is "+doc_stat_cd );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
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
String decid_job_cd = Util.checkString(req.getParameter("decid_job_cd"));
String doc_titl = Util.checkString(req.getParameter("doc_titl"));
String doc_stat_cd = Util.checkString(req.getParameter("doc_stat_cd"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String decid_job_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("decid_job_cd")));
String doc_titl = Util.Uni2Ksc(Util.checkString(req.getParameter("doc_titl")));
String doc_stat_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("doc_stat_cd")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDecid_job_cd(decid_job_cd);
dm.setDoc_titl(doc_titl);
dm.setDoc_stat_cd(doc_stat_cd);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 04 12:39:13 KST 2009 */