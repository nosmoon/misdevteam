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


package chosun.ciis.mt.submatrout.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.submatrout.ds.*;
import chosun.ciis.mt.submatrout.rec.*;

/**
 * 
 */


public class MT_SUBMATROUT_1500_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String owh_dt_fr;
	public String owh_dt_to;
	public String fac_clsf;
	public String matr_clas;

	public MT_SUBMATROUT_1500_LDM(){}
	public MT_SUBMATROUT_1500_LDM(String cmpy_cd, String owh_dt_fr, String owh_dt_to, String fac_clsf, String matr_clas){
		this.cmpy_cd = cmpy_cd;
		this.owh_dt_fr = owh_dt_fr;
		this.owh_dt_to = owh_dt_to;
		this.fac_clsf = fac_clsf;
		this.matr_clas = matr_clas;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOwh_dt_fr(String owh_dt_fr){
		this.owh_dt_fr = owh_dt_fr;
	}

	public void setOwh_dt_to(String owh_dt_to){
		this.owh_dt_to = owh_dt_to;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setMatr_clas(String matr_clas){
		this.matr_clas = matr_clas;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOwh_dt_fr(){
		return this.owh_dt_fr;
	}

	public String getOwh_dt_to(){
		return this.owh_dt_to;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getMatr_clas(){
		return this.matr_clas;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_SUBMATROUT_1500_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_SUBMATROUT_1500_LDM dm = (MT_SUBMATROUT_1500_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.owh_dt_fr);
		cstmt.setString(5, dm.owh_dt_to);
		cstmt.setString(6, dm.fac_clsf);
		cstmt.setString(7, dm.matr_clas);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.submatrout.ds.MT_SUBMATROUT_1500_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("owh_dt_fr = [" + getOwh_dt_fr() + "]");
		System.out.println("owh_dt_to = [" + getOwh_dt_to() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("matr_clas = [" + getMatr_clas() + "]");
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
String owh_dt_fr = req.getParameter("owh_dt_fr");
if( owh_dt_fr == null){
	System.out.println(this.toString+" : owh_dt_fr is null" );
}else{
	System.out.println(this.toString+" : owh_dt_fr is "+owh_dt_fr );
}
String owh_dt_to = req.getParameter("owh_dt_to");
if( owh_dt_to == null){
	System.out.println(this.toString+" : owh_dt_to is null" );
}else{
	System.out.println(this.toString+" : owh_dt_to is "+owh_dt_to );
}
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String matr_clas = req.getParameter("matr_clas");
if( matr_clas == null){
	System.out.println(this.toString+" : matr_clas is null" );
}else{
	System.out.println(this.toString+" : matr_clas is "+matr_clas );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String owh_dt_fr = Util.checkString(req.getParameter("owh_dt_fr"));
String owh_dt_to = Util.checkString(req.getParameter("owh_dt_to"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String matr_clas = Util.checkString(req.getParameter("matr_clas"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String owh_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("owh_dt_fr")));
String owh_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("owh_dt_to")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String matr_clas = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_clas")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setOwh_dt_fr(owh_dt_fr);
dm.setOwh_dt_to(owh_dt_to);
dm.setFac_clsf(fac_clsf);
dm.setMatr_clas(matr_clas);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Oct 06 18:33:37 KST 2009 */