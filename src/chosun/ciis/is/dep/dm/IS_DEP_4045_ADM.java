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


package chosun.ciis.is.dep.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.dep.ds.*;
import chosun.ciis.is.dep.rec.*;

/**
 * 
 */


public class IS_DEP_4045_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String card_rcpm_reg_dt;
	public String card_rcpm_reg_seq;
	public String incmg_pers_ip;
	public String incmg_pers;

	public IS_DEP_4045_ADM(){}
	public IS_DEP_4045_ADM(String cmpy_cd, String card_rcpm_reg_dt, String card_rcpm_reg_seq, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.card_rcpm_reg_dt = card_rcpm_reg_dt;
		this.card_rcpm_reg_seq = card_rcpm_reg_seq;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setCard_rcpm_reg_dt(String card_rcpm_reg_dt){
		this.card_rcpm_reg_dt = card_rcpm_reg_dt;
	}

	public void setCard_rcpm_reg_seq(String card_rcpm_reg_seq){
		this.card_rcpm_reg_seq = card_rcpm_reg_seq;
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

	public String getCard_rcpm_reg_dt(){
		return this.card_rcpm_reg_dt;
	}

	public String getCard_rcpm_reg_seq(){
		return this.card_rcpm_reg_seq;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_DEP_4045_A(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_DEP_4045_ADM dm = (IS_DEP_4045_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.card_rcpm_reg_dt);
		cstmt.setString(5, dm.card_rcpm_reg_seq);
		cstmt.setString(6, dm.incmg_pers_ip);
		cstmt.setString(7, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.dep.ds.IS_DEP_4045_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("card_rcpm_reg_dt = [" + getCard_rcpm_reg_dt() + "]");
		System.out.println("card_rcpm_reg_seq = [" + getCard_rcpm_reg_seq() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String card_rcpm_reg_dt = req.getParameter("card_rcpm_reg_dt");
if( card_rcpm_reg_dt == null){
	System.out.println(this.toString+" : card_rcpm_reg_dt is null" );
}else{
	System.out.println(this.toString+" : card_rcpm_reg_dt is "+card_rcpm_reg_dt );
}
String card_rcpm_reg_seq = req.getParameter("card_rcpm_reg_seq");
if( card_rcpm_reg_seq == null){
	System.out.println(this.toString+" : card_rcpm_reg_seq is null" );
}else{
	System.out.println(this.toString+" : card_rcpm_reg_seq is "+card_rcpm_reg_seq );
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
String card_rcpm_reg_dt = Util.checkString(req.getParameter("card_rcpm_reg_dt"));
String card_rcpm_reg_seq = Util.checkString(req.getParameter("card_rcpm_reg_seq"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String card_rcpm_reg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("card_rcpm_reg_dt")));
String card_rcpm_reg_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("card_rcpm_reg_seq")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setCard_rcpm_reg_dt(card_rcpm_reg_dt);
dm.setCard_rcpm_reg_seq(card_rcpm_reg_seq);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 10 14:09:16 KST 2012 */