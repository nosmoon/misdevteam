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


public class EN_INNEXP_1102_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt_fr;
	public String occr_dt_to;
	public String slip_clsf_cd;
	public String prof_type_cd;
	public String srch_clsf;

	public EN_INNEXP_1102_LDM(){}
	public EN_INNEXP_1102_LDM(String cmpy_cd, String occr_dt_fr, String occr_dt_to, String slip_clsf_cd, String prof_type_cd, String srch_clsf){
		this.cmpy_cd = cmpy_cd;
		this.occr_dt_fr = occr_dt_fr;
		this.occr_dt_to = occr_dt_to;
		this.slip_clsf_cd = slip_clsf_cd;
		this.prof_type_cd = prof_type_cd;
		this.srch_clsf = srch_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt_fr(String occr_dt_fr){
		this.occr_dt_fr = occr_dt_fr;
	}

	public void setOccr_dt_to(String occr_dt_to){
		this.occr_dt_to = occr_dt_to;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setProf_type_cd(String prof_type_cd){
		this.prof_type_cd = prof_type_cd;
	}

	public void setSrch_clsf(String srch_clsf){
		this.srch_clsf = srch_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt_fr(){
		return this.occr_dt_fr;
	}

	public String getOccr_dt_to(){
		return this.occr_dt_to;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getProf_type_cd(){
		return this.prof_type_cd;
	}

	public String getSrch_clsf(){
		return this.srch_clsf;
	}

	public String getSQL(){
		 return "{ call MISENP.SP_EN_INNEXP_1102_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		EN_INNEXP_1102_LDM dm = (EN_INNEXP_1102_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.occr_dt_fr);
		cstmt.setString(5, dm.occr_dt_to);
		cstmt.setString(6, dm.slip_clsf_cd);
		cstmt.setString(7, dm.prof_type_cd);
		cstmt.setString(8, dm.srch_clsf);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.en.innexp.ds.EN_INNEXP_1102_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("occr_dt_fr = " + getOccr_dt_fr());
        System.out.println("occr_dt_to = " + getOccr_dt_to());
        System.out.println("slip_clsf_cd = " + getSlip_clsf_cd());
        System.out.println("prof_type_cd = " + getProf_type_cd());
        System.out.println("srch_clsf = " + getSrch_clsf());
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
String slip_clsf_cd = req.getParameter("slip_clsf_cd");
if( slip_clsf_cd == null){
	System.out.println(this.toString+" : slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : slip_clsf_cd is "+slip_clsf_cd );
}
String prof_type_cd = req.getParameter("prof_type_cd");
if( prof_type_cd == null){
	System.out.println(this.toString+" : prof_type_cd is null" );
}else{
	System.out.println(this.toString+" : prof_type_cd is "+prof_type_cd );
}
String srch_clsf = req.getParameter("srch_clsf");
if( srch_clsf == null){
	System.out.println(this.toString+" : srch_clsf is null" );
}else{
	System.out.println(this.toString+" : srch_clsf is "+srch_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String occr_dt_fr = Util.checkString(req.getParameter("occr_dt_fr"));
String occr_dt_to = Util.checkString(req.getParameter("occr_dt_to"));
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
String srch_clsf = Util.checkString(req.getParameter("srch_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt_fr")));
String occr_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt_to")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String prof_type_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prof_type_cd")));
String srch_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setOccr_dt_fr(occr_dt_fr);
dm.setOccr_dt_to(occr_dt_to);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setProf_type_cd(prof_type_cd);
dm.setSrch_clsf(srch_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 21 13:38:17 KST 2009 */