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


public class MT_PAPINOUT_6103_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fac_clsf;
	public String eps_no;
	public String matr_cd;
	public String yyyymm;
	public String dd_fr;
	public String dd_to;

	public MT_PAPINOUT_6103_LDM(){}
	public MT_PAPINOUT_6103_LDM(String cmpy_cd, String fac_clsf, String eps_no, String matr_cd, String yyyymm, String dd_fr, String dd_to){
		this.cmpy_cd = cmpy_cd;
		this.fac_clsf = fac_clsf;
		this.eps_no = eps_no;
		this.matr_cd = matr_cd;
		this.yyyymm = yyyymm;
		this.dd_fr = dd_fr;
		this.dd_to = dd_to;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setEps_no(String eps_no){
		this.eps_no = eps_no;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setYyyymm(String yyyymm){
		this.yyyymm = yyyymm;
	}

	public void setDd_fr(String dd_fr){
		this.dd_fr = dd_fr;
	}

	public void setDd_to(String dd_to){
		this.dd_to = dd_to;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getEps_no(){
		return this.eps_no;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getYyyymm(){
		return this.yyyymm;
	}

	public String getDd_fr(){
		return this.dd_fr;
	}

	public String getDd_to(){
		return this.dd_to;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PAPINOUT_6103_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PAPINOUT_6103_LDM dm = (MT_PAPINOUT_6103_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fac_clsf);
		cstmt.setString(5, dm.eps_no);
		cstmt.setString(6, dm.matr_cd);
		cstmt.setString(7, dm.yyyymm);
		cstmt.setString(8, dm.dd_fr);
		cstmt.setString(9, dm.dd_to);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.papinout.ds.MT_PAPINOUT_6103_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("eps_no = [" + getEps_no() + "]");
		System.out.println("matr_cd = [" + getMatr_cd() + "]");
		System.out.println("yyyymm = [" + getYyyymm() + "]");
		System.out.println("dd_fr = [" + getDd_fr() + "]");
		System.out.println("dd_to = [" + getDd_to() + "]");
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
String eps_no = req.getParameter("eps_no");
if( eps_no == null){
	System.out.println(this.toString+" : eps_no is null" );
}else{
	System.out.println(this.toString+" : eps_no is "+eps_no );
}
String matr_cd = req.getParameter("matr_cd");
if( matr_cd == null){
	System.out.println(this.toString+" : matr_cd is null" );
}else{
	System.out.println(this.toString+" : matr_cd is "+matr_cd );
}
String yyyymm = req.getParameter("yyyymm");
if( yyyymm == null){
	System.out.println(this.toString+" : yyyymm is null" );
}else{
	System.out.println(this.toString+" : yyyymm is "+yyyymm );
}
String dd_fr = req.getParameter("dd_fr");
if( dd_fr == null){
	System.out.println(this.toString+" : dd_fr is null" );
}else{
	System.out.println(this.toString+" : dd_fr is "+dd_fr );
}
String dd_to = req.getParameter("dd_to");
if( dd_to == null){
	System.out.println(this.toString+" : dd_to is null" );
}else{
	System.out.println(this.toString+" : dd_to is "+dd_to );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String eps_no = Util.checkString(req.getParameter("eps_no"));
String matr_cd = Util.checkString(req.getParameter("matr_cd"));
String yyyymm = Util.checkString(req.getParameter("yyyymm"));
String dd_fr = Util.checkString(req.getParameter("dd_fr"));
String dd_to = Util.checkString(req.getParameter("dd_to"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String eps_no = Util.Uni2Ksc(Util.checkString(req.getParameter("eps_no")));
String matr_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_cd")));
String yyyymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yyyymm")));
String dd_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("dd_fr")));
String dd_to = Util.Uni2Ksc(Util.checkString(req.getParameter("dd_to")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFac_clsf(fac_clsf);
dm.setEps_no(eps_no);
dm.setMatr_cd(matr_cd);
dm.setYyyymm(yyyymm);
dm.setDd_fr(dd_fr);
dm.setDd_to(dd_to);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 21 18:04:36 KST 2009 */