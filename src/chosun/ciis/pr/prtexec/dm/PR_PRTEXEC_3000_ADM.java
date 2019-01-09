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


package chosun.ciis.pr.prtexec.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pr.prtexec.ds.*;
import chosun.ciis.pr.prtexec.rec.*;

/**
 * 
 */


public class PR_PRTEXEC_3000_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String sr_issu_dt_fr;
	public String sr_issu_dt_to;
	public String tg_issu_dt_fr;
	public String tg_issu_dt_to;
	public String incmg_pers_ipaddr;
	public String incmg_pers;

	public PR_PRTEXEC_3000_ADM(){}
	public PR_PRTEXEC_3000_ADM(String cmpy_cd, String sr_issu_dt_fr, String sr_issu_dt_to, String tg_issu_dt_fr, String tg_issu_dt_to, String incmg_pers_ipaddr, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.sr_issu_dt_fr = sr_issu_dt_fr;
		this.sr_issu_dt_to = sr_issu_dt_to;
		this.tg_issu_dt_fr = tg_issu_dt_fr;
		this.tg_issu_dt_to = tg_issu_dt_to;
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSr_issu_dt_fr(String sr_issu_dt_fr){
		this.sr_issu_dt_fr = sr_issu_dt_fr;
	}

	public void setSr_issu_dt_to(String sr_issu_dt_to){
		this.sr_issu_dt_to = sr_issu_dt_to;
	}

	public void setTg_issu_dt_fr(String tg_issu_dt_fr){
		this.tg_issu_dt_fr = tg_issu_dt_fr;
	}

	public void setTg_issu_dt_to(String tg_issu_dt_to){
		this.tg_issu_dt_to = tg_issu_dt_to;
	}

	public void setIncmg_pers_ipaddr(String incmg_pers_ipaddr){
		this.incmg_pers_ipaddr = incmg_pers_ipaddr;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSr_issu_dt_fr(){
		return this.sr_issu_dt_fr;
	}

	public String getSr_issu_dt_to(){
		return this.sr_issu_dt_to;
	}

	public String getTg_issu_dt_fr(){
		return this.tg_issu_dt_fr;
	}

	public String getTg_issu_dt_to(){
		return this.tg_issu_dt_to;
	}

	public String getIncmg_pers_ipaddr(){
		return this.incmg_pers_ipaddr;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call SP_PR_PRTEXEC_3000_A( ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PR_PRTEXEC_3000_ADM dm = (PR_PRTEXEC_3000_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.sr_issu_dt_fr);
		cstmt.setString(5, dm.sr_issu_dt_to);
		cstmt.setString(6, dm.tg_issu_dt_fr);
		cstmt.setString(7, dm.tg_issu_dt_to);
		cstmt.setString(8, dm.incmg_pers_ipaddr);
		cstmt.setString(9, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.pr.prtexec.ds.PR_PRTEXEC_3000_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("sr_issu_dt_fr = " + getSr_issu_dt_fr());
        System.out.println("sr_issu_dt_to = " + getSr_issu_dt_to());
        System.out.println("tg_issu_dt_fr = " + getTg_issu_dt_fr());
        System.out.println("tg_issu_dt_to = " + getTg_issu_dt_to());
        System.out.println("incmg_pers_ipaddr = " + getIncmg_pers_ipaddr());
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
String sr_issu_dt_fr = req.getParameter("sr_issu_dt_fr");
if( sr_issu_dt_fr == null){
	System.out.println(this.toString+" : sr_issu_dt_fr is null" );
}else{
	System.out.println(this.toString+" : sr_issu_dt_fr is "+sr_issu_dt_fr );
}
String sr_issu_dt_to = req.getParameter("sr_issu_dt_to");
if( sr_issu_dt_to == null){
	System.out.println(this.toString+" : sr_issu_dt_to is null" );
}else{
	System.out.println(this.toString+" : sr_issu_dt_to is "+sr_issu_dt_to );
}
String tg_issu_dt_fr = req.getParameter("tg_issu_dt_fr");
if( tg_issu_dt_fr == null){
	System.out.println(this.toString+" : tg_issu_dt_fr is null" );
}else{
	System.out.println(this.toString+" : tg_issu_dt_fr is "+tg_issu_dt_fr );
}
String tg_issu_dt_to = req.getParameter("tg_issu_dt_to");
if( tg_issu_dt_to == null){
	System.out.println(this.toString+" : tg_issu_dt_to is null" );
}else{
	System.out.println(this.toString+" : tg_issu_dt_to is "+tg_issu_dt_to );
}
String incmg_pers_ipaddr = req.getParameter("incmg_pers_ipaddr");
if( incmg_pers_ipaddr == null){
	System.out.println(this.toString+" : incmg_pers_ipaddr is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipaddr is "+incmg_pers_ipaddr );
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
String sr_issu_dt_fr = Util.checkString(req.getParameter("sr_issu_dt_fr"));
String sr_issu_dt_to = Util.checkString(req.getParameter("sr_issu_dt_to"));
String tg_issu_dt_fr = Util.checkString(req.getParameter("tg_issu_dt_fr"));
String tg_issu_dt_to = Util.checkString(req.getParameter("tg_issu_dt_to"));
String incmg_pers_ipaddr = Util.checkString(req.getParameter("incmg_pers_ipaddr"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String sr_issu_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("sr_issu_dt_fr")));
String sr_issu_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("sr_issu_dt_to")));
String tg_issu_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("tg_issu_dt_fr")));
String tg_issu_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("tg_issu_dt_to")));
String incmg_pers_ipaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipaddr")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSr_issu_dt_fr(sr_issu_dt_fr);
dm.setSr_issu_dt_to(sr_issu_dt_to);
dm.setTg_issu_dt_fr(tg_issu_dt_fr);
dm.setTg_issu_dt_to(tg_issu_dt_to);
dm.setIncmg_pers_ipaddr(incmg_pers_ipaddr);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 19 17:58:04 KST 2009 */