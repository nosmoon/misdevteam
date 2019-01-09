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


public class MT_PAPINOUT_2501_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String base_yymm;
	public String base_dt;
	public String fac_clsf;
	public String matr_cd;

	public MT_PAPINOUT_2501_LDM(){}
	public MT_PAPINOUT_2501_LDM(String cmpy_cd, String base_yymm, String base_dt, String fac_clsf, String matr_cd){
		this.cmpy_cd = cmpy_cd;
		this.base_yymm = base_yymm;
		this.base_dt = base_dt;
		this.fac_clsf = fac_clsf;
		this.matr_cd = matr_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBase_yymm(String base_yymm){
		this.base_yymm = base_yymm;
	}

	public void setBase_dt(String base_dt){
		this.base_dt = base_dt;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBase_yymm(){
		return this.base_yymm;
	}

	public String getBase_dt(){
		return this.base_dt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PAPINOUT_2501_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PAPINOUT_2501_LDM dm = (MT_PAPINOUT_2501_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.base_yymm);
		cstmt.setString(5, dm.base_dt);
		cstmt.setString(6, dm.fac_clsf);
		cstmt.setString(7, dm.matr_cd);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.papinout.ds.MT_PAPINOUT_2501_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("base_yymm = [" + getBase_yymm() + "]");
		System.out.println("base_dt = [" + getBase_dt() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
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
String base_yymm = req.getParameter("base_yymm");
if( base_yymm == null){
	System.out.println(this.toString+" : base_yymm is null" );
}else{
	System.out.println(this.toString+" : base_yymm is "+base_yymm );
}
String base_dt = req.getParameter("base_dt");
if( base_dt == null){
	System.out.println(this.toString+" : base_dt is null" );
}else{
	System.out.println(this.toString+" : base_dt is "+base_dt );
}
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
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
String base_yymm = Util.checkString(req.getParameter("base_yymm"));
String base_dt = Util.checkString(req.getParameter("base_dt"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String matr_cd = Util.checkString(req.getParameter("matr_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String base_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("base_yymm")));
String base_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("base_dt")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String matr_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setBase_yymm(base_yymm);
dm.setBase_dt(base_dt);
dm.setFac_clsf(fac_clsf);
dm.setMatr_cd(matr_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Apr 25 09:20:29 KST 2009 */