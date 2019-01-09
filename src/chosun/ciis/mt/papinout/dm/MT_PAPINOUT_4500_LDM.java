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


package chosun.ciis.mt.papinout.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papinout.ds.*;
import chosun.ciis.mt.papinout.rec.*;

/**
 * 
 */


public class MT_PAPINOUT_4500_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String cut_err_occr_dt_fr;
	public String cut_err_occr_dt_to;
	public String fac_clsf;
	public String papcmpy_cd;
	public String cut_err_point;
	public String cut_err_caus_prd;
	public String order_cd;
	public String occr_dt_gubun;

	public MT_PAPINOUT_4500_LDM(){}
	public MT_PAPINOUT_4500_LDM(String cmpy_cd, String cut_err_occr_dt_fr, String cut_err_occr_dt_to, String fac_clsf, String papcmpy_cd, String cut_err_point, String cut_err_caus_prd, String order_cd, String occr_dt_gubun){
		this.cmpy_cd = cmpy_cd;
		this.cut_err_occr_dt_fr = cut_err_occr_dt_fr;
		this.cut_err_occr_dt_to = cut_err_occr_dt_to;
		this.fac_clsf = fac_clsf;
		this.papcmpy_cd = papcmpy_cd;
		this.cut_err_point = cut_err_point;
		this.cut_err_caus_prd = cut_err_caus_prd;
		this.order_cd = order_cd;
		this.occr_dt_gubun = occr_dt_gubun;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setCut_err_occr_dt_fr(String cut_err_occr_dt_fr){
		this.cut_err_occr_dt_fr = cut_err_occr_dt_fr;
	}

	public void setCut_err_occr_dt_to(String cut_err_occr_dt_to){
		this.cut_err_occr_dt_to = cut_err_occr_dt_to;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setPapcmpy_cd(String papcmpy_cd){
		this.papcmpy_cd = papcmpy_cd;
	}

	public void setCut_err_point(String cut_err_point){
		this.cut_err_point = cut_err_point;
	}

	public void setCut_err_caus_prd(String cut_err_caus_prd){
		this.cut_err_caus_prd = cut_err_caus_prd;
	}

	public void setOrder_cd(String order_cd){
		this.order_cd = order_cd;
	}

	public void setOccr_dt_gubun(String occr_dt_gubun){
		this.occr_dt_gubun = occr_dt_gubun;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getCut_err_occr_dt_fr(){
		return this.cut_err_occr_dt_fr;
	}

	public String getCut_err_occr_dt_to(){
		return this.cut_err_occr_dt_to;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getPapcmpy_cd(){
		return this.papcmpy_cd;
	}

	public String getCut_err_point(){
		return this.cut_err_point;
	}

	public String getCut_err_caus_prd(){
		return this.cut_err_caus_prd;
	}

	public String getOrder_cd(){
		return this.order_cd;
	}

	public String getOccr_dt_gubun(){
		return this.occr_dt_gubun;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PAPINOUT_4500_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PAPINOUT_4500_LDM dm = (MT_PAPINOUT_4500_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.cut_err_occr_dt_fr);
		cstmt.setString(5, dm.cut_err_occr_dt_to);
		cstmt.setString(6, dm.fac_clsf);
		cstmt.setString(7, dm.papcmpy_cd);
		cstmt.setString(8, dm.cut_err_point);
		cstmt.setString(9, dm.cut_err_caus_prd);
		cstmt.setString(10, dm.order_cd);
		cstmt.setString(11, dm.occr_dt_gubun);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.papinout.ds.MT_PAPINOUT_4500_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("cut_err_occr_dt_fr = [" + getCut_err_occr_dt_fr() + "]");
		System.out.println("cut_err_occr_dt_to = [" + getCut_err_occr_dt_to() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("papcmpy_cd = [" + getPapcmpy_cd() + "]");
		System.out.println("cut_err_point = [" + getCut_err_point() + "]");
		System.out.println("cut_err_caus_prd = [" + getCut_err_caus_prd() + "]");
		System.out.println("order_cd = [" + getOrder_cd() + "]");
		System.out.println("occr_dt_gubun = [" + getOccr_dt_gubun() + "]");
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
String cut_err_occr_dt_fr = req.getParameter("cut_err_occr_dt_fr");
if( cut_err_occr_dt_fr == null){
	System.out.println(this.toString+" : cut_err_occr_dt_fr is null" );
}else{
	System.out.println(this.toString+" : cut_err_occr_dt_fr is "+cut_err_occr_dt_fr );
}
String cut_err_occr_dt_to = req.getParameter("cut_err_occr_dt_to");
if( cut_err_occr_dt_to == null){
	System.out.println(this.toString+" : cut_err_occr_dt_to is null" );
}else{
	System.out.println(this.toString+" : cut_err_occr_dt_to is "+cut_err_occr_dt_to );
}
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String papcmpy_cd = req.getParameter("papcmpy_cd");
if( papcmpy_cd == null){
	System.out.println(this.toString+" : papcmpy_cd is null" );
}else{
	System.out.println(this.toString+" : papcmpy_cd is "+papcmpy_cd );
}
String cut_err_point = req.getParameter("cut_err_point");
if( cut_err_point == null){
	System.out.println(this.toString+" : cut_err_point is null" );
}else{
	System.out.println(this.toString+" : cut_err_point is "+cut_err_point );
}
String cut_err_caus_prd = req.getParameter("cut_err_caus_prd");
if( cut_err_caus_prd == null){
	System.out.println(this.toString+" : cut_err_caus_prd is null" );
}else{
	System.out.println(this.toString+" : cut_err_caus_prd is "+cut_err_caus_prd );
}
String order_cd = req.getParameter("order_cd");
if( order_cd == null){
	System.out.println(this.toString+" : order_cd is null" );
}else{
	System.out.println(this.toString+" : order_cd is "+order_cd );
}
String occr_dt_gubun = req.getParameter("occr_dt_gubun");
if( occr_dt_gubun == null){
	System.out.println(this.toString+" : occr_dt_gubun is null" );
}else{
	System.out.println(this.toString+" : occr_dt_gubun is "+occr_dt_gubun );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String cut_err_occr_dt_fr = Util.checkString(req.getParameter("cut_err_occr_dt_fr"));
String cut_err_occr_dt_to = Util.checkString(req.getParameter("cut_err_occr_dt_to"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String papcmpy_cd = Util.checkString(req.getParameter("papcmpy_cd"));
String cut_err_point = Util.checkString(req.getParameter("cut_err_point"));
String cut_err_caus_prd = Util.checkString(req.getParameter("cut_err_caus_prd"));
String order_cd = Util.checkString(req.getParameter("order_cd"));
String occr_dt_gubun = Util.checkString(req.getParameter("occr_dt_gubun"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String cut_err_occr_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("cut_err_occr_dt_fr")));
String cut_err_occr_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("cut_err_occr_dt_to")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String papcmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("papcmpy_cd")));
String cut_err_point = Util.Uni2Ksc(Util.checkString(req.getParameter("cut_err_point")));
String cut_err_caus_prd = Util.Uni2Ksc(Util.checkString(req.getParameter("cut_err_caus_prd")));
String order_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("order_cd")));
String occr_dt_gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt_gubun")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setCut_err_occr_dt_fr(cut_err_occr_dt_fr);
dm.setCut_err_occr_dt_to(cut_err_occr_dt_to);
dm.setFac_clsf(fac_clsf);
dm.setPapcmpy_cd(papcmpy_cd);
dm.setCut_err_point(cut_err_point);
dm.setCut_err_caus_prd(cut_err_caus_prd);
dm.setOrder_cd(order_cd);
dm.setOccr_dt_gubun(occr_dt_gubun);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 29 16:15:56 KST 2009 */