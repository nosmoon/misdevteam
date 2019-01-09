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


public class MT_PAPINOUT_2601_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fac_clsf;
	public String mov_fac_clsf;
	public String owh_fr_dt;
	public String owh_to_dt;
	public String matr_cd;

	public MT_PAPINOUT_2601_LDM(){}
	public MT_PAPINOUT_2601_LDM(String cmpy_cd, String fac_clsf, String mov_fac_clsf, String owh_fr_dt, String owh_to_dt, String matr_cd){
		this.cmpy_cd = cmpy_cd;
		this.fac_clsf = fac_clsf;
		this.mov_fac_clsf = mov_fac_clsf;
		this.owh_fr_dt = owh_fr_dt;
		this.owh_to_dt = owh_to_dt;
		this.matr_cd = matr_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setMov_fac_clsf(String mov_fac_clsf){
		this.mov_fac_clsf = mov_fac_clsf;
	}

	public void setOwh_fr_dt(String owh_fr_dt){
		this.owh_fr_dt = owh_fr_dt;
	}

	public void setOwh_to_dt(String owh_to_dt){
		this.owh_to_dt = owh_to_dt;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getMov_fac_clsf(){
		return this.mov_fac_clsf;
	}

	public String getOwh_fr_dt(){
		return this.owh_fr_dt;
	}

	public String getOwh_to_dt(){
		return this.owh_to_dt;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PAPINOUT_2601_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PAPINOUT_2601_LDM dm = (MT_PAPINOUT_2601_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fac_clsf);
		cstmt.setString(5, dm.mov_fac_clsf);
		cstmt.setString(6, dm.owh_fr_dt);
		cstmt.setString(7, dm.owh_to_dt);
		cstmt.setString(8, dm.matr_cd);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.papinout.ds.MT_PAPINOUT_2601_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("mov_fac_clsf = [" + getMov_fac_clsf() + "]");
		System.out.println("owh_fr_dt = [" + getOwh_fr_dt() + "]");
		System.out.println("owh_to_dt = [" + getOwh_to_dt() + "]");
		System.out.println("matr_cd = [" + getMatr_cd() + "]");
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
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String mov_fac_clsf = req.getParameter("mov_fac_clsf");
if( mov_fac_clsf == null){
	System.out.println(this.toString+" : mov_fac_clsf is null" );
}else{
	System.out.println(this.toString+" : mov_fac_clsf is "+mov_fac_clsf );
}
String owh_fr_dt = req.getParameter("owh_fr_dt");
if( owh_fr_dt == null){
	System.out.println(this.toString+" : owh_fr_dt is null" );
}else{
	System.out.println(this.toString+" : owh_fr_dt is "+owh_fr_dt );
}
String owh_to_dt = req.getParameter("owh_to_dt");
if( owh_to_dt == null){
	System.out.println(this.toString+" : owh_to_dt is null" );
}else{
	System.out.println(this.toString+" : owh_to_dt is "+owh_to_dt );
}
String matr_cd = req.getParameter("matr_cd");
if( matr_cd == null){
	System.out.println(this.toString+" : matr_cd is null" );
}else{
	System.out.println(this.toString+" : matr_cd is "+matr_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String mov_fac_clsf = Util.checkString(req.getParameter("mov_fac_clsf"));
String owh_fr_dt = Util.checkString(req.getParameter("owh_fr_dt"));
String owh_to_dt = Util.checkString(req.getParameter("owh_to_dt"));
String matr_cd = Util.checkString(req.getParameter("matr_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String mov_fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("mov_fac_clsf")));
String owh_fr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("owh_fr_dt")));
String owh_to_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("owh_to_dt")));
String matr_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFac_clsf(fac_clsf);
dm.setMov_fac_clsf(mov_fac_clsf);
dm.setOwh_fr_dt(owh_fr_dt);
dm.setOwh_to_dt(owh_to_dt);
dm.setMatr_cd(matr_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Apr 25 12:31:53 KST 2009 */