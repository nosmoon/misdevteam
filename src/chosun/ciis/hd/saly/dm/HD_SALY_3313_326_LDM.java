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


package chosun.ciis.hd.saly.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.saly.ds.*;
import chosun.ciis.hd.saly.rec.*;

/**
 * 
 */


public class HD_SALY_3313_326_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String saly_yy;
	public String saly_no;
	public String saly_pay_dt;

	public HD_SALY_3313_326_LDM(){}
	public HD_SALY_3313_326_LDM(String cmpy_cd, String saly_yy, String saly_no, String saly_pay_dt){
		this.cmpy_cd = cmpy_cd;
		this.saly_yy = saly_yy;
		this.saly_no = saly_no;
		this.saly_pay_dt = saly_pay_dt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSaly_yy(String saly_yy){
		this.saly_yy = saly_yy;
	}

	public void setSaly_no(String saly_no){
		this.saly_no = saly_no;
	}

	public void setSaly_pay_dt(String saly_pay_dt){
		this.saly_pay_dt = saly_pay_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSaly_yy(){
		return this.saly_yy;
	}

	public String getSaly_no(){
		return this.saly_no;
	}

	public String getSaly_pay_dt(){
		return this.saly_pay_dt;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_SALY_3313_326_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_SALY_3313_326_LDM dm = (HD_SALY_3313_326_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.saly_yy);
		cstmt.setString(5, dm.saly_no);
		cstmt.setString(6, dm.saly_pay_dt);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.saly.ds.HD_SALY_3313_326_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("saly_yy = [" + getSaly_yy() + "]");
		System.out.println("saly_no = [" + getSaly_no() + "]");
		System.out.println("saly_pay_dt = [" + getSaly_pay_dt() + "]");
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
String saly_yy = req.getParameter("saly_yy");
if( saly_yy == null){
	System.out.println(this.toString+" : saly_yy is null" );
}else{
	System.out.println(this.toString+" : saly_yy is "+saly_yy );
}
String saly_no = req.getParameter("saly_no");
if( saly_no == null){
	System.out.println(this.toString+" : saly_no is null" );
}else{
	System.out.println(this.toString+" : saly_no is "+saly_no );
}
String saly_pay_dt = req.getParameter("saly_pay_dt");
if( saly_pay_dt == null){
	System.out.println(this.toString+" : saly_pay_dt is null" );
}else{
	System.out.println(this.toString+" : saly_pay_dt is "+saly_pay_dt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String saly_yy = Util.checkString(req.getParameter("saly_yy"));
String saly_no = Util.checkString(req.getParameter("saly_no"));
String saly_pay_dt = Util.checkString(req.getParameter("saly_pay_dt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String saly_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("saly_yy")));
String saly_no = Util.Uni2Ksc(Util.checkString(req.getParameter("saly_no")));
String saly_pay_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("saly_pay_dt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSaly_yy(saly_yy);
dm.setSaly_no(saly_no);
dm.setSaly_pay_dt(saly_pay_dt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 28 16:36:55 KST 2015 */