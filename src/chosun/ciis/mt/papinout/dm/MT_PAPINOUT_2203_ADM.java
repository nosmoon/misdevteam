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


public class MT_PAPINOUT_2203_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String ewh_dt;
	public String ewh_clsf;
	public String fac_clsf;
	public String inout_fac_clsf;
	public String matr_cd;
	public String per_id;

	public MT_PAPINOUT_2203_ADM(){}
	public MT_PAPINOUT_2203_ADM(String cmpy_cd, String ewh_dt, String ewh_clsf, String fac_clsf, String inout_fac_clsf, String matr_cd, String per_id){
		this.cmpy_cd = cmpy_cd;
		this.ewh_dt = ewh_dt;
		this.ewh_clsf = ewh_clsf;
		this.fac_clsf = fac_clsf;
		this.inout_fac_clsf = inout_fac_clsf;
		this.matr_cd = matr_cd;
		this.per_id = per_id;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEwh_dt(String ewh_dt){
		this.ewh_dt = ewh_dt;
	}

	public void setEwh_clsf(String ewh_clsf){
		this.ewh_clsf = ewh_clsf;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setInout_fac_clsf(String inout_fac_clsf){
		this.inout_fac_clsf = inout_fac_clsf;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setPer_id(String per_id){
		this.per_id = per_id;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEwh_dt(){
		return this.ewh_dt;
	}

	public String getEwh_clsf(){
		return this.ewh_clsf;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getInout_fac_clsf(){
		return this.inout_fac_clsf;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getPer_id(){
		return this.per_id;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PAPINOUT_2203_A(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PAPINOUT_2203_ADM dm = (MT_PAPINOUT_2203_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.ewh_dt);
		cstmt.setString(5, dm.ewh_clsf);
		cstmt.setString(6, dm.fac_clsf);
		cstmt.setString(7, dm.inout_fac_clsf);
		cstmt.setString(8, dm.matr_cd);
		cstmt.setString(9, dm.per_id);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.papinout.ds.MT_PAPINOUT_2203_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("ewh_dt = [" + getEwh_dt() + "]");
		System.out.println("ewh_clsf = [" + getEwh_clsf() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("inout_fac_clsf = [" + getInout_fac_clsf() + "]");
		System.out.println("matr_cd = [" + getMatr_cd() + "]");
		System.out.println("per_id = [" + getPer_id() + "]");
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
String ewh_dt = req.getParameter("ewh_dt");
if( ewh_dt == null){
	System.out.println(this.toString+" : ewh_dt is null" );
}else{
	System.out.println(this.toString+" : ewh_dt is "+ewh_dt );
}
String ewh_clsf = req.getParameter("ewh_clsf");
if( ewh_clsf == null){
	System.out.println(this.toString+" : ewh_clsf is null" );
}else{
	System.out.println(this.toString+" : ewh_clsf is "+ewh_clsf );
}
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String inout_fac_clsf = req.getParameter("inout_fac_clsf");
if( inout_fac_clsf == null){
	System.out.println(this.toString+" : inout_fac_clsf is null" );
}else{
	System.out.println(this.toString+" : inout_fac_clsf is "+inout_fac_clsf );
}
String matr_cd = req.getParameter("matr_cd");
if( matr_cd == null){
	System.out.println(this.toString+" : matr_cd is null" );
}else{
	System.out.println(this.toString+" : matr_cd is "+matr_cd );
}
String per_id = req.getParameter("per_id");
if( per_id == null){
	System.out.println(this.toString+" : per_id is null" );
}else{
	System.out.println(this.toString+" : per_id is "+per_id );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String ewh_dt = Util.checkString(req.getParameter("ewh_dt"));
String ewh_clsf = Util.checkString(req.getParameter("ewh_clsf"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String inout_fac_clsf = Util.checkString(req.getParameter("inout_fac_clsf"));
String matr_cd = Util.checkString(req.getParameter("matr_cd"));
String per_id = Util.checkString(req.getParameter("per_id"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String ewh_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("ewh_dt")));
String ewh_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("ewh_clsf")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String inout_fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("inout_fac_clsf")));
String matr_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_cd")));
String per_id = Util.Uni2Ksc(Util.checkString(req.getParameter("per_id")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEwh_dt(ewh_dt);
dm.setEwh_clsf(ewh_clsf);
dm.setFac_clsf(fac_clsf);
dm.setInout_fac_clsf(inout_fac_clsf);
dm.setMatr_cd(matr_cd);
dm.setPer_id(per_id);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 23 09:56:57 KST 2009 */