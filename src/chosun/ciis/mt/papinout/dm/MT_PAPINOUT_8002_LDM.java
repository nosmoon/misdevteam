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


public class MT_PAPINOUT_8002_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String issu_dt_fr;
	public String issu_dt_to;
	public String fac_clsf_fr;
	public String fac_clsf_to;
	public String medi_cd;
	public String sect_cd;
	public String prt_clsf;
	public String flag_1;
	public String flag_2;
	public String flag_3;

	public MT_PAPINOUT_8002_LDM(){}
	public MT_PAPINOUT_8002_LDM(String cmpy_cd, String issu_dt_fr, String issu_dt_to, String fac_clsf_fr, String fac_clsf_to, String medi_cd, String sect_cd, String prt_clsf, String flag_1, String flag_2, String flag_3){
		this.cmpy_cd = cmpy_cd;
		this.issu_dt_fr = issu_dt_fr;
		this.issu_dt_to = issu_dt_to;
		this.fac_clsf_fr = fac_clsf_fr;
		this.fac_clsf_to = fac_clsf_to;
		this.medi_cd = medi_cd;
		this.sect_cd = sect_cd;
		this.prt_clsf = prt_clsf;
		this.flag_1 = flag_1;
		this.flag_2 = flag_2;
		this.flag_3 = flag_3;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIssu_dt_fr(String issu_dt_fr){
		this.issu_dt_fr = issu_dt_fr;
	}

	public void setIssu_dt_to(String issu_dt_to){
		this.issu_dt_to = issu_dt_to;
	}

	public void setFac_clsf_fr(String fac_clsf_fr){
		this.fac_clsf_fr = fac_clsf_fr;
	}

	public void setFac_clsf_to(String fac_clsf_to){
		this.fac_clsf_to = fac_clsf_to;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setPrt_clsf(String prt_clsf){
		this.prt_clsf = prt_clsf;
	}

	public void setFlag_1(String flag_1){
		this.flag_1 = flag_1;
	}

	public void setFlag_2(String flag_2){
		this.flag_2 = flag_2;
	}

	public void setFlag_3(String flag_3){
		this.flag_3 = flag_3;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIssu_dt_fr(){
		return this.issu_dt_fr;
	}

	public String getIssu_dt_to(){
		return this.issu_dt_to;
	}

	public String getFac_clsf_fr(){
		return this.fac_clsf_fr;
	}

	public String getFac_clsf_to(){
		return this.fac_clsf_to;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getPrt_clsf(){
		return this.prt_clsf;
	}

	public String getFlag_1(){
		return this.flag_1;
	}

	public String getFlag_2(){
		return this.flag_2;
	}

	public String getFlag_3(){
		return this.flag_3;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PAPINOUT_8002_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PAPINOUT_8002_LDM dm = (MT_PAPINOUT_8002_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.issu_dt_fr);
		cstmt.setString(5, dm.issu_dt_to);
		cstmt.setString(6, dm.fac_clsf_fr);
		cstmt.setString(7, dm.fac_clsf_to);
		cstmt.setString(8, dm.medi_cd);
		cstmt.setString(9, dm.sect_cd);
		cstmt.setString(10, dm.prt_clsf);
		cstmt.setString(11, dm.flag_1);
		cstmt.setString(12, dm.flag_2);
		cstmt.setString(13, dm.flag_3);
		cstmt.registerOutParameter(14, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.papinout.ds.MT_PAPINOUT_8002_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("issu_dt_fr = [" + getIssu_dt_fr() + "]");
		System.out.println("issu_dt_to = [" + getIssu_dt_to() + "]");
		System.out.println("fac_clsf_fr = [" + getFac_clsf_fr() + "]");
		System.out.println("fac_clsf_to = [" + getFac_clsf_to() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("sect_cd = [" + getSect_cd() + "]");
		System.out.println("prt_clsf = [" + getPrt_clsf() + "]");
		System.out.println("flag_1 = [" + getFlag_1() + "]");
		System.out.println("flag_2 = [" + getFlag_2() + "]");
		System.out.println("flag_3 = [" + getFlag_3() + "]");
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
String issu_dt_fr = req.getParameter("issu_dt_fr");
if( issu_dt_fr == null){
	System.out.println(this.toString+" : issu_dt_fr is null" );
}else{
	System.out.println(this.toString+" : issu_dt_fr is "+issu_dt_fr );
}
String issu_dt_to = req.getParameter("issu_dt_to");
if( issu_dt_to == null){
	System.out.println(this.toString+" : issu_dt_to is null" );
}else{
	System.out.println(this.toString+" : issu_dt_to is "+issu_dt_to );
}
String fac_clsf_fr = req.getParameter("fac_clsf_fr");
if( fac_clsf_fr == null){
	System.out.println(this.toString+" : fac_clsf_fr is null" );
}else{
	System.out.println(this.toString+" : fac_clsf_fr is "+fac_clsf_fr );
}
String fac_clsf_to = req.getParameter("fac_clsf_to");
if( fac_clsf_to == null){
	System.out.println(this.toString+" : fac_clsf_to is null" );
}else{
	System.out.println(this.toString+" : fac_clsf_to is "+fac_clsf_to );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String sect_cd = req.getParameter("sect_cd");
if( sect_cd == null){
	System.out.println(this.toString+" : sect_cd is null" );
}else{
	System.out.println(this.toString+" : sect_cd is "+sect_cd );
}
String prt_clsf = req.getParameter("prt_clsf");
if( prt_clsf == null){
	System.out.println(this.toString+" : prt_clsf is null" );
}else{
	System.out.println(this.toString+" : prt_clsf is "+prt_clsf );
}
String flag_1 = req.getParameter("flag_1");
if( flag_1 == null){
	System.out.println(this.toString+" : flag_1 is null" );
}else{
	System.out.println(this.toString+" : flag_1 is "+flag_1 );
}
String flag_2 = req.getParameter("flag_2");
if( flag_2 == null){
	System.out.println(this.toString+" : flag_2 is null" );
}else{
	System.out.println(this.toString+" : flag_2 is "+flag_2 );
}
String flag_3 = req.getParameter("flag_3");
if( flag_3 == null){
	System.out.println(this.toString+" : flag_3 is null" );
}else{
	System.out.println(this.toString+" : flag_3 is "+flag_3 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String issu_dt_fr = Util.checkString(req.getParameter("issu_dt_fr"));
String issu_dt_to = Util.checkString(req.getParameter("issu_dt_to"));
String fac_clsf_fr = Util.checkString(req.getParameter("fac_clsf_fr"));
String fac_clsf_to = Util.checkString(req.getParameter("fac_clsf_to"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String sect_cd = Util.checkString(req.getParameter("sect_cd"));
String prt_clsf = Util.checkString(req.getParameter("prt_clsf"));
String flag_1 = Util.checkString(req.getParameter("flag_1"));
String flag_2 = Util.checkString(req.getParameter("flag_2"));
String flag_3 = Util.checkString(req.getParameter("flag_3"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String issu_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt_fr")));
String issu_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_dt_to")));
String fac_clsf_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf_fr")));
String fac_clsf_to = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf_to")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String sect_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_cd")));
String prt_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("prt_clsf")));
String flag_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("flag_1")));
String flag_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("flag_2")));
String flag_3 = Util.Uni2Ksc(Util.checkString(req.getParameter("flag_3")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIssu_dt_fr(issu_dt_fr);
dm.setIssu_dt_to(issu_dt_to);
dm.setFac_clsf_fr(fac_clsf_fr);
dm.setFac_clsf_to(fac_clsf_to);
dm.setMedi_cd(medi_cd);
dm.setSect_cd(sect_cd);
dm.setPrt_clsf(prt_clsf);
dm.setFlag_1(flag_1);
dm.setFlag_2(flag_2);
dm.setFlag_3(flag_3);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Sep 24 21:00:49 KST 2009 */