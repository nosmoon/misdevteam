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


public class MT_PAPINOUT_2704_DDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String save_yymm;
	public String save_fac_clsf;
	public String matr_cd;

	public MT_PAPINOUT_2704_DDM(){}
	public MT_PAPINOUT_2704_DDM(String cmpy_cd, String save_yymm, String save_fac_clsf, String matr_cd){
		this.cmpy_cd = cmpy_cd;
		this.save_yymm = save_yymm;
		this.save_fac_clsf = save_fac_clsf;
		this.matr_cd = matr_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSave_yymm(String save_yymm){
		this.save_yymm = save_yymm;
	}

	public void setSave_fac_clsf(String save_fac_clsf){
		this.save_fac_clsf = save_fac_clsf;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSave_yymm(){
		return this.save_yymm;
	}

	public String getSave_fac_clsf(){
		return this.save_fac_clsf;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PAPINOUT_2704_D(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PAPINOUT_2704_DDM dm = (MT_PAPINOUT_2704_DDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.save_yymm);
		cstmt.setString(5, dm.save_fac_clsf);
		cstmt.setString(6, dm.matr_cd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.papinout.ds.MT_PAPINOUT_2704_DDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("save_yymm = [" + getSave_yymm() + "]");
		System.out.println("save_fac_clsf = [" + getSave_fac_clsf() + "]");
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
String save_yymm = req.getParameter("save_yymm");
if( save_yymm == null){
	System.out.println(this.toString+" : save_yymm is null" );
}else{
	System.out.println(this.toString+" : save_yymm is "+save_yymm );
}
String save_fac_clsf = req.getParameter("save_fac_clsf");
if( save_fac_clsf == null){
	System.out.println(this.toString+" : save_fac_clsf is null" );
}else{
	System.out.println(this.toString+" : save_fac_clsf is "+save_fac_clsf );
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
String save_yymm = Util.checkString(req.getParameter("save_yymm"));
String save_fac_clsf = Util.checkString(req.getParameter("save_fac_clsf"));
String matr_cd = Util.checkString(req.getParameter("matr_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String save_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("save_yymm")));
String save_fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("save_fac_clsf")));
String matr_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSave_yymm(save_yymm);
dm.setSave_fac_clsf(save_fac_clsf);
dm.setMatr_cd(matr_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 04 13:37:45 KST 2009 */