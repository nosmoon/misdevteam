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


public class MT_SUBMATROUT_1522_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String ink_clsf3;
	public String medi_cd3;
	public String sect_cd3;
	public String bgn_gage3;
	public String end_gage3;
	public String qunt3;
	public String issu_dt3;
	public String fac_clsf3;

	public MT_SUBMATROUT_1522_ADM(){}
	public MT_SUBMATROUT_1522_ADM(String cmpy_cd, String ink_clsf3, String medi_cd3, String sect_cd3, String bgn_gage3, String end_gage3, String qunt3, String issu_dt3, String fac_clsf3){
		this.cmpy_cd = cmpy_cd;
		this.ink_clsf3 = ink_clsf3;
		this.medi_cd3 = medi_cd3;
		this.sect_cd3 = sect_cd3;
		this.bgn_gage3 = bgn_gage3;
		this.end_gage3 = end_gage3;
		this.qunt3 = qunt3;
		this.issu_dt3 = issu_dt3;
		this.fac_clsf3 = fac_clsf3;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setInk_clsf3(String ink_clsf3){
		this.ink_clsf3 = ink_clsf3;
	}

	public void setMedi_cd3(String medi_cd3){
		this.medi_cd3 = medi_cd3;
	}

	public void setSect_cd3(String sect_cd3){
		this.sect_cd3 = sect_cd3;
	}

	public void setBgn_gage3(String bgn_gage3){
		this.bgn_gage3 = bgn_gage3;
	}

	public void setEnd_gage3(String end_gage3){
		this.end_gage3 = end_gage3;
	}

	public void setQunt3(String qunt3){
		this.qunt3 = qunt3;
	}

	public void setIssu_dt3(String issu_dt3){
		this.issu_dt3 = issu_dt3;
	}

	public void setFac_clsf3(String fac_clsf3){
		this.fac_clsf3 = fac_clsf3;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getInk_clsf3(){
		return this.ink_clsf3;
	}

	public String getMedi_cd3(){
		return this.medi_cd3;
	}

	public String getSect_cd3(){
		return this.sect_cd3;
	}

	public String getBgn_gage3(){
		return this.bgn_gage3;
	}

	public String getEnd_gage3(){
		return this.end_gage3;
	}

	public String getQunt3(){
		return this.qunt3;
	}

	public String getIssu_dt3(){
		return this.issu_dt3;
	}

	public String getFac_clsf3(){
		return this.fac_clsf3;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_SUBMATROUT_1522_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_SUBMATROUT_1522_ADM dm = (MT_SUBMATROUT_1522_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.ink_clsf3);
		cstmt.setString(5, dm.medi_cd3);
		cstmt.setString(6, dm.sect_cd3);
		cstmt.setString(7, dm.bgn_gage3);
		cstmt.setString(8, dm.end_gage3);
		cstmt.setString(9, dm.qunt3);
		cstmt.setString(10, dm.issu_dt3);
		cstmt.setString(11, dm.fac_clsf3);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.submatrout.ds.MT_SUBMATROUT_1522_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("ink_clsf3 = [" + getInk_clsf3() + "]");
		System.out.println("medi_cd3 = [" + getMedi_cd3() + "]");
		System.out.println("sect_cd3 = [" + getSect_cd3() + "]");
		System.out.println("bgn_gage3 = [" + getBgn_gage3() + "]");
		System.out.println("end_gage3 = [" + getEnd_gage3() + "]");
		System.out.println("qunt3 = [" + getQunt3() + "]");
		System.out.println("issu_dt3 = [" + getIssu_dt3() + "]");
		System.out.println("fac_clsf3 = [" + getFac_clsf3() + "]");
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
String ink_clsf3 = req.getParameter("ink_clsf3");
if( ink_clsf3 == null){
	System.out.println(this.toString+" : ink_clsf3 is null" );
}else{
	System.out.println(this.toString+" : ink_clsf3 is "+ink_clsf3 );
}
String medi_cd3 = req.getParameter("medi_cd3");
if( medi_cd3 == null){
	System.out.println(this.toString+" : medi_cd3 is null" );
}else{
	System.out.println(this.toString+" : medi_cd3 is "+medi_cd3 );
}
String sect_cd3 = req.getParameter("sect_cd3");
if( sect_cd3 == null){
	System.out.println(this.toString+" : sect_cd3 is null" );
}else{
	System.out.println(this.toString+" : sect_cd3 is "+sect_cd3 );
}
String bgn_gage3 = req.getParameter("bgn_gage3");
if( bgn_gage3 == null){
	System.out.println(this.toString+" : bgn_gage3 is null" );
}else{
	System.out.println(this.toString+" : bgn_gage3 is "+bgn_gage3 );
}
String end_gage3 = req.getParameter("end_gage3");
if( end_gage3 == null){
	System.out.println(this.toString+" : end_gage3 is null" );
}else{
	System.out.println(this.toString+" : end_gage3 is "+end_gage3 );
}
String qunt3 = req.getParameter("qunt3");
if( qunt3 == null){
	System.out.println(this.toString+" : qunt3 is null" );
}else{
	System.out.println(this.toString+" : qunt3 is "+qunt3 );
}
String issu_dt3 = req.getParameter("issu_dt3");
if( issu_dt3 == null){
	System.out.println(this.toString+" : issu_dt3 is null" );
}else{
	System.out.println(this.toString+" : issu_dt3 is "+issu_dt3 );
}
String fac_clsf3 = req.getParameter("fac_clsf3");
if( fac_clsf3 == null){
	System.out.println(this.toString+" : fac_clsf3 is null" );
}else{
	System.out.println(this.toString+" : fac_clsf3 is "+fac_clsf3 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String ink_clsf3 = Util.checkString(req.getParameter("ink_clsf3"));
String medi_cd3 = Util.checkString(req.getParameter("medi_cd3"));
String sect_cd3 = Util.checkString(req.getParameter("sect_cd3"));
String bgn_gage3 = Util.checkString(req.getParameter("bgn_gage3"));
String end_gage3 = Util.checkString(req.getParameter("end_gage3"));
String qunt3 = Util.checkString(req.getParameter("qunt3"));
String issu_dt3 = Util.checkString(req.getParameter("issu_dt3"));
String fac_clsf3 = Util.checkString(req.getParameter("fac_clsf3"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String ink_clsf3 = Util.Uni2Ksc(Util.checkString(req.getParameter("ink_clsf3")));
String medi_cd3 = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd3")));
String sect_cd3 = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd3")));
String bgn_gage3 = Util.Uni2Ksc(Util.checkString(req.getParameter("bgn_gage3")));
String end_gage3 = Util.Uni2Ksc(Util.checkString(req.getParameter("end_gage3")));
String qunt3 = Util.Uni2Ksc(Util.checkString(req.getParameter("qunt3")));
String issu_dt3 = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt3")));
String fac_clsf3 = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf3")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setInk_clsf3(ink_clsf3);
dm.setMedi_cd3(medi_cd3);
dm.setSect_cd3(sect_cd3);
dm.setBgn_gage3(bgn_gage3);
dm.setEnd_gage3(end_gage3);
dm.setQunt3(qunt3);
dm.setIssu_dt3(issu_dt3);
dm.setFac_clsf3(fac_clsf3);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Oct 07 12:01:04 KST 2009 */