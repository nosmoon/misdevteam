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


public class MT_SUBMATROUT_1521_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String matr_cd2;
	public String medi_cd2;
	public String sect_cd2;
	public String qunt2;
	public String issu_dt2;
	public String fac_clsf2;

	public MT_SUBMATROUT_1521_ADM(){}
	public MT_SUBMATROUT_1521_ADM(String cmpy_cd, String matr_cd2, String medi_cd2, String sect_cd2, String qunt2, String issu_dt2, String fac_clsf2){
		this.cmpy_cd = cmpy_cd;
		this.matr_cd2 = matr_cd2;
		this.medi_cd2 = medi_cd2;
		this.sect_cd2 = sect_cd2;
		this.qunt2 = qunt2;
		this.issu_dt2 = issu_dt2;
		this.fac_clsf2 = fac_clsf2;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMatr_cd2(String matr_cd2){
		this.matr_cd2 = matr_cd2;
	}

	public void setMedi_cd2(String medi_cd2){
		this.medi_cd2 = medi_cd2;
	}

	public void setSect_cd2(String sect_cd2){
		this.sect_cd2 = sect_cd2;
	}

	public void setQunt2(String qunt2){
		this.qunt2 = qunt2;
	}

	public void setIssu_dt2(String issu_dt2){
		this.issu_dt2 = issu_dt2;
	}

	public void setFac_clsf2(String fac_clsf2){
		this.fac_clsf2 = fac_clsf2;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMatr_cd2(){
		return this.matr_cd2;
	}

	public String getMedi_cd2(){
		return this.medi_cd2;
	}

	public String getSect_cd2(){
		return this.sect_cd2;
	}

	public String getQunt2(){
		return this.qunt2;
	}

	public String getIssu_dt2(){
		return this.issu_dt2;
	}

	public String getFac_clsf2(){
		return this.fac_clsf2;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_SUBMATROUT_1521_A(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_SUBMATROUT_1521_ADM dm = (MT_SUBMATROUT_1521_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.matr_cd2);
		cstmt.setString(5, dm.medi_cd2);
		cstmt.setString(6, dm.sect_cd2);
		cstmt.setString(7, dm.qunt2);
		cstmt.setString(8, dm.issu_dt2);
		cstmt.setString(9, dm.fac_clsf2);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.submatrout.ds.MT_SUBMATROUT_1521_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("matr_cd2 = [" + getMatr_cd2() + "]");
		System.out.println("medi_cd2 = [" + getMedi_cd2() + "]");
		System.out.println("sect_cd2 = [" + getSect_cd2() + "]");
		System.out.println("qunt2 = [" + getQunt2() + "]");
		System.out.println("issu_dt2 = [" + getIssu_dt2() + "]");
		System.out.println("fac_clsf2 = [" + getFac_clsf2() + "]");
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
String matr_cd2 = req.getParameter("matr_cd2");
if( matr_cd2 == null){
	System.out.println(this.toString+" : matr_cd2 is null" );
}else{
	System.out.println(this.toString+" : matr_cd2 is "+matr_cd2 );
}
String medi_cd2 = req.getParameter("medi_cd2");
if( medi_cd2 == null){
	System.out.println(this.toString+" : medi_cd2 is null" );
}else{
	System.out.println(this.toString+" : medi_cd2 is "+medi_cd2 );
}
String sect_cd2 = req.getParameter("sect_cd2");
if( sect_cd2 == null){
	System.out.println(this.toString+" : sect_cd2 is null" );
}else{
	System.out.println(this.toString+" : sect_cd2 is "+sect_cd2 );
}
String qunt2 = req.getParameter("qunt2");
if( qunt2 == null){
	System.out.println(this.toString+" : qunt2 is null" );
}else{
	System.out.println(this.toString+" : qunt2 is "+qunt2 );
}
String issu_dt2 = req.getParameter("issu_dt2");
if( issu_dt2 == null){
	System.out.println(this.toString+" : issu_dt2 is null" );
}else{
	System.out.println(this.toString+" : issu_dt2 is "+issu_dt2 );
}
String fac_clsf2 = req.getParameter("fac_clsf2");
if( fac_clsf2 == null){
	System.out.println(this.toString+" : fac_clsf2 is null" );
}else{
	System.out.println(this.toString+" : fac_clsf2 is "+fac_clsf2 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String matr_cd2 = Util.checkString(req.getParameter("matr_cd2"));
String medi_cd2 = Util.checkString(req.getParameter("medi_cd2"));
String sect_cd2 = Util.checkString(req.getParameter("sect_cd2"));
String qunt2 = Util.checkString(req.getParameter("qunt2"));
String issu_dt2 = Util.checkString(req.getParameter("issu_dt2"));
String fac_clsf2 = Util.checkString(req.getParameter("fac_clsf2"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String matr_cd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_cd2")));
String medi_cd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd2")));
String sect_cd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd2")));
String qunt2 = Util.Uni2Ksc(Util.checkString(req.getParameter("qunt2")));
String issu_dt2 = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt2")));
String fac_clsf2 = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf2")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMatr_cd2(matr_cd2);
dm.setMedi_cd2(medi_cd2);
dm.setSect_cd2(sect_cd2);
dm.setQunt2(qunt2);
dm.setIssu_dt2(issu_dt2);
dm.setFac_clsf2(fac_clsf2);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Oct 07 12:01:04 KST 2009 */