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


public class EN_INNEXP_1001_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt_fr;
	public String occr_dt_to;
	public String srch_dlco_no;
	public String srch_titl;

	public EN_INNEXP_1001_LDM(){}
	public EN_INNEXP_1001_LDM(String cmpy_cd, String occr_dt_fr, String occr_dt_to, String srch_dlco_no, String srch_titl){
		this.cmpy_cd = cmpy_cd;
		this.occr_dt_fr = occr_dt_fr;
		this.occr_dt_to = occr_dt_to;
		this.srch_dlco_no = srch_dlco_no;
		this.srch_titl = srch_titl;
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

	public void setSrch_dlco_no(String srch_dlco_no){
		this.srch_dlco_no = srch_dlco_no;
	}

	public void setSrch_titl(String srch_titl){
		this.srch_titl = srch_titl;
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

	public String getSrch_dlco_no(){
		return this.srch_dlco_no;
	}

	public String getSrch_titl(){
		return this.srch_titl;
	}

	public String getSQL(){
		 return "{ call MISENP.SP_EN_INNEXP_1001_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		EN_INNEXP_1001_LDM dm = (EN_INNEXP_1001_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.occr_dt_fr);
		cstmt.setString(5, dm.occr_dt_to);
		cstmt.setString(6, dm.srch_dlco_no);
		cstmt.setString(7, dm.srch_titl);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.en.innexp.ds.EN_INNEXP_1001_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("occr_dt_fr = " + getOccr_dt_fr());
        System.out.println("occr_dt_to = " + getOccr_dt_to());
        System.out.println("srch_dlco_no = " + getSrch_dlco_no());
        System.out.println("srch_titl = " + getSrch_titl());
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
String srch_dlco_no = req.getParameter("srch_dlco_no");
if( srch_dlco_no == null){
	System.out.println(this.toString+" : srch_dlco_no is null" );
}else{
	System.out.println(this.toString+" : srch_dlco_no is "+srch_dlco_no );
}
String srch_titl = req.getParameter("srch_titl");
if( srch_titl == null){
	System.out.println(this.toString+" : srch_titl is null" );
}else{
	System.out.println(this.toString+" : srch_titl is "+srch_titl );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String occr_dt_fr = Util.checkString(req.getParameter("occr_dt_fr"));
String occr_dt_to = Util.checkString(req.getParameter("occr_dt_to"));
String srch_dlco_no = Util.checkString(req.getParameter("srch_dlco_no"));
String srch_titl = Util.checkString(req.getParameter("srch_titl"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt_fr")));
String occr_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt_to")));
String srch_dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_dlco_no")));
String srch_titl = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_titl")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setOccr_dt_fr(occr_dt_fr);
dm.setOccr_dt_to(occr_dt_to);
dm.setSrch_dlco_no(srch_dlco_no);
dm.setSrch_titl(srch_titl);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 19 21:31:31 KST 2009 */