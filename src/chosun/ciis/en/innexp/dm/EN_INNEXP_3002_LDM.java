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


package chosun.ciis.en.innexp.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.en.innexp.ds.*;
import chosun.ciis.en.innexp.rec.*;

/**
 * 
 */


public class EN_INNEXP_3002_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String evnt_yy;
	public String evnt_cd;
	public String evnt_seq;
	public String dlco_no;
	public String chrg_pers_emp_no;
	public String occr_dt_fr;
	public String occr_dt_to;

	public EN_INNEXP_3002_LDM(){}
	public EN_INNEXP_3002_LDM(String cmpy_cd, String evnt_yy, String evnt_cd, String evnt_seq, String dlco_no, String chrg_pers_emp_no, String occr_dt_fr, String occr_dt_to){
		this.cmpy_cd = cmpy_cd;
		this.evnt_yy = evnt_yy;
		this.evnt_cd = evnt_cd;
		this.evnt_seq = evnt_seq;
		this.dlco_no = dlco_no;
		this.chrg_pers_emp_no = chrg_pers_emp_no;
		this.occr_dt_fr = occr_dt_fr;
		this.occr_dt_to = occr_dt_to;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEvnt_yy(String evnt_yy){
		this.evnt_yy = evnt_yy;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setEvnt_seq(String evnt_seq){
		this.evnt_seq = evnt_seq;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setChrg_pers_emp_no(String chrg_pers_emp_no){
		this.chrg_pers_emp_no = chrg_pers_emp_no;
	}

	public void setOccr_dt_fr(String occr_dt_fr){
		this.occr_dt_fr = occr_dt_fr;
	}

	public void setOccr_dt_to(String occr_dt_to){
		this.occr_dt_to = occr_dt_to;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEvnt_yy(){
		return this.evnt_yy;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getEvnt_seq(){
		return this.evnt_seq;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getChrg_pers_emp_no(){
		return this.chrg_pers_emp_no;
	}

	public String getOccr_dt_fr(){
		return this.occr_dt_fr;
	}

	public String getOccr_dt_to(){
		return this.occr_dt_to;
	}

	public String getSQL(){
		 return "{ call MISENP.SP_EN_INNEXP_3002_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		EN_INNEXP_3002_LDM dm = (EN_INNEXP_3002_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.evnt_yy);
		cstmt.setString(5, dm.evnt_cd);
		cstmt.setString(6, dm.evnt_seq);
		cstmt.setString(7, dm.dlco_no);
		cstmt.setString(8, dm.chrg_pers_emp_no);
		cstmt.setString(9, dm.occr_dt_fr);
		cstmt.setString(10, dm.occr_dt_to);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.en.innexp.ds.EN_INNEXP_3002_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("evnt_yy = " + getEvnt_yy());
        System.out.println("evnt_cd = " + getEvnt_cd());
        System.out.println("evnt_seq = " + getEvnt_seq());
        System.out.println("dlco_no = " + getDlco_no());
        System.out.println("chrg_pers_emp_no = " + getChrg_pers_emp_no());
        System.out.println("occr_dt_fr = " + getOccr_dt_fr());
        System.out.println("occr_dt_to = " + getOccr_dt_to());
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
String evnt_yy = req.getParameter("evnt_yy");
if( evnt_yy == null){
	System.out.println(this.toString+" : evnt_yy is null" );
}else{
	System.out.println(this.toString+" : evnt_yy is "+evnt_yy );
}
String evnt_cd = req.getParameter("evnt_cd");
if( evnt_cd == null){
	System.out.println(this.toString+" : evnt_cd is null" );
}else{
	System.out.println(this.toString+" : evnt_cd is "+evnt_cd );
}
String evnt_seq = req.getParameter("evnt_seq");
if( evnt_seq == null){
	System.out.println(this.toString+" : evnt_seq is null" );
}else{
	System.out.println(this.toString+" : evnt_seq is "+evnt_seq );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String chrg_pers_emp_no = req.getParameter("chrg_pers_emp_no");
if( chrg_pers_emp_no == null){
	System.out.println(this.toString+" : chrg_pers_emp_no is null" );
}else{
	System.out.println(this.toString+" : chrg_pers_emp_no is "+chrg_pers_emp_no );
}
String occr_dt_fr = req.getParameter("occr_dt_fr");
if( occr_dt_fr == null){
	System.out.println(this.toString+" : occr_dt_fr is null" );
}else{
	System.out.println(this.toString+" : occr_dt_fr is "+occr_dt_fr );
}
String occr_dt_to = req.getParameter("occr_dt_to");
if( occr_dt_to == null){
	System.out.println(this.toString+" : occr_dt_to is null" );
}else{
	System.out.println(this.toString+" : occr_dt_to is "+occr_dt_to );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String evnt_yy = Util.checkString(req.getParameter("evnt_yy"));
String evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
String evnt_seq = Util.checkString(req.getParameter("evnt_seq"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String chrg_pers_emp_no = Util.checkString(req.getParameter("chrg_pers_emp_no"));
String occr_dt_fr = Util.checkString(req.getParameter("occr_dt_fr"));
String occr_dt_to = Util.checkString(req.getParameter("occr_dt_to"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String evnt_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_yy")));
String evnt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_cd")));
String evnt_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_seq")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String chrg_pers_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers_emp_no")));
String occr_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt_fr")));
String occr_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt_to")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEvnt_yy(evnt_yy);
dm.setEvnt_cd(evnt_cd);
dm.setEvnt_seq(evnt_seq);
dm.setDlco_no(dlco_no);
dm.setChrg_pers_emp_no(chrg_pers_emp_no);
dm.setOccr_dt_fr(occr_dt_fr);
dm.setOccr_dt_to(occr_dt_to);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 15 13:57:02 KST 2009 */