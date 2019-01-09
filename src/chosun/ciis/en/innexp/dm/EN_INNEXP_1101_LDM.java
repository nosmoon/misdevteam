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


public class EN_INNEXP_1101_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String slip_occr_dt_fr;
	public String slip_occr_dt_to;
	public String make_dt_fr;
	public String make_dt_to;
	public String dlco_nm;

	public EN_INNEXP_1101_LDM(){}
	public EN_INNEXP_1101_LDM(String cmpy_cd, String slip_occr_dt_fr, String slip_occr_dt_to, String make_dt_fr, String make_dt_to, String dlco_nm){
		this.cmpy_cd = cmpy_cd;
		this.slip_occr_dt_fr = slip_occr_dt_fr;
		this.slip_occr_dt_to = slip_occr_dt_to;
		this.make_dt_fr = make_dt_fr;
		this.make_dt_to = make_dt_to;
		this.dlco_nm = dlco_nm;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSlip_occr_dt_fr(String slip_occr_dt_fr){
		this.slip_occr_dt_fr = slip_occr_dt_fr;
	}

	public void setSlip_occr_dt_to(String slip_occr_dt_to){
		this.slip_occr_dt_to = slip_occr_dt_to;
	}

	public void setMake_dt_fr(String make_dt_fr){
		this.make_dt_fr = make_dt_fr;
	}

	public void setMake_dt_to(String make_dt_to){
		this.make_dt_to = make_dt_to;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSlip_occr_dt_fr(){
		return this.slip_occr_dt_fr;
	}

	public String getSlip_occr_dt_to(){
		return this.slip_occr_dt_to;
	}

	public String getMake_dt_fr(){
		return this.make_dt_fr;
	}

	public String getMake_dt_to(){
		return this.make_dt_to;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getSQL(){
		 return "{ call MISENP.SP_EN_INNEXP_1101_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		EN_INNEXP_1101_LDM dm = (EN_INNEXP_1101_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.slip_occr_dt_fr);
		cstmt.setString(5, dm.slip_occr_dt_to);
		cstmt.setString(6, dm.make_dt_fr);
		cstmt.setString(7, dm.make_dt_to);
		cstmt.setString(8, dm.dlco_nm);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.en.innexp.ds.EN_INNEXP_1101_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("slip_occr_dt_fr = " + getSlip_occr_dt_fr());
        System.out.println("slip_occr_dt_to = " + getSlip_occr_dt_to());
        System.out.println("make_dt_fr = " + getMake_dt_fr());
        System.out.println("make_dt_to = " + getMake_dt_to());
        System.out.println("dlco_nm = " + getDlco_nm());
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
String slip_occr_dt_fr = req.getParameter("slip_occr_dt_fr");
if( slip_occr_dt_fr == null){
	System.out.println(this.toString+" : slip_occr_dt_fr is null" );
}else{
	System.out.println(this.toString+" : slip_occr_dt_fr is "+slip_occr_dt_fr );
}
String slip_occr_dt_to = req.getParameter("slip_occr_dt_to");
if( slip_occr_dt_to == null){
	System.out.println(this.toString+" : slip_occr_dt_to is null" );
}else{
	System.out.println(this.toString+" : slip_occr_dt_to is "+slip_occr_dt_to );
}
String make_dt_fr = req.getParameter("make_dt_fr");
if( make_dt_fr == null){
	System.out.println(this.toString+" : make_dt_fr is null" );
}else{
	System.out.println(this.toString+" : make_dt_fr is "+make_dt_fr );
}
String make_dt_to = req.getParameter("make_dt_to");
if( make_dt_to == null){
	System.out.println(this.toString+" : make_dt_to is null" );
}else{
	System.out.println(this.toString+" : make_dt_to is "+make_dt_to );
}
String dlco_nm = req.getParameter("dlco_nm");
if( dlco_nm == null){
	System.out.println(this.toString+" : dlco_nm is null" );
}else{
	System.out.println(this.toString+" : dlco_nm is "+dlco_nm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String slip_occr_dt_fr = Util.checkString(req.getParameter("slip_occr_dt_fr"));
String slip_occr_dt_to = Util.checkString(req.getParameter("slip_occr_dt_to"));
String make_dt_fr = Util.checkString(req.getParameter("make_dt_fr"));
String make_dt_to = Util.checkString(req.getParameter("make_dt_to"));
String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String slip_occr_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt_fr")));
String slip_occr_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt_to")));
String make_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("make_dt_fr")));
String make_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("make_dt_to")));
String dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_nm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSlip_occr_dt_fr(slip_occr_dt_fr);
dm.setSlip_occr_dt_to(slip_occr_dt_to);
dm.setMake_dt_fr(make_dt_fr);
dm.setMake_dt_to(make_dt_to);
dm.setDlco_nm(dlco_nm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 22 16:21:53 KST 2009 */