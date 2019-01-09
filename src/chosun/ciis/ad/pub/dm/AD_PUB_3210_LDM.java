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


package chosun.ciis.ad.pub.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.pub.ds.*;
import chosun.ciis.ad.pub.rec.*;

/**
 * 
 */


public class AD_PUB_3210_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String medi_cd;
	public String frdt;
	public String todt;
	public String edt_yn;
	public String pubc_yn;
	public String advt_yn;
	public String low_uprc;
	public String sect_clsf_cd;
	public String sect_nm_cd;

	public AD_PUB_3210_LDM(){}
	public AD_PUB_3210_LDM(String cmpy_cd, String medi_cd, String frdt, String todt, String edt_yn, String pubc_yn, String advt_yn, String low_uprc, String sect_clsf_cd, String sect_nm_cd){
		this.cmpy_cd = cmpy_cd;
		this.medi_cd = medi_cd;
		this.frdt = frdt;
		this.todt = todt;
		this.edt_yn = edt_yn;
		this.pubc_yn = pubc_yn;
		this.advt_yn = advt_yn;
		this.low_uprc = low_uprc;
		this.sect_clsf_cd = sect_clsf_cd;
		this.sect_nm_cd = sect_nm_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setEdt_yn(String edt_yn){
		this.edt_yn = edt_yn;
	}

	public void setPubc_yn(String pubc_yn){
		this.pubc_yn = pubc_yn;
	}

	public void setAdvt_yn(String advt_yn){
		this.advt_yn = advt_yn;
	}

	public void setLow_uprc(String low_uprc){
		this.low_uprc = low_uprc;
	}

	public void setSect_clsf_cd(String sect_clsf_cd){
		this.sect_clsf_cd = sect_clsf_cd;
	}

	public void setSect_nm_cd(String sect_nm_cd){
		this.sect_nm_cd = sect_nm_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getEdt_yn(){
		return this.edt_yn;
	}

	public String getPubc_yn(){
		return this.pubc_yn;
	}

	public String getAdvt_yn(){
		return this.advt_yn;
	}

	public String getLow_uprc(){
		return this.low_uprc;
	}

	public String getSect_clsf_cd(){
		return this.sect_clsf_cd;
	}

	public String getSect_nm_cd(){
		return this.sect_nm_cd;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_PUB_3210_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_PUB_3210_LDM dm = (AD_PUB_3210_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.medi_cd);
		cstmt.setString(5, dm.frdt);
		cstmt.setString(6, dm.todt);
		cstmt.setString(7, dm.edt_yn);
		cstmt.setString(8, dm.pubc_yn);
		cstmt.setString(9, dm.advt_yn);
		cstmt.setString(10, dm.low_uprc);
		cstmt.setString(11, dm.sect_clsf_cd);
		cstmt.setString(12, dm.sect_nm_cd);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.pub.ds.AD_PUB_3210_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("todt = [" + getTodt() + "]");
		System.out.println("edt_yn = [" + getEdt_yn() + "]");
		System.out.println("pubc_yn = [" + getPubc_yn() + "]");
		System.out.println("advt_yn = [" + getAdvt_yn() + "]");
		System.out.println("low_uprc = [" + getLow_uprc() + "]");
		System.out.println("sect_clsf_cd = [" + getSect_clsf_cd() + "]");
		System.out.println("sect_nm_cd = [" + getSect_nm_cd() + "]");
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
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String frdt = req.getParameter("frdt");
if( frdt == null){
	System.out.println(this.toString+" : frdt is null" );
}else{
	System.out.println(this.toString+" : frdt is "+frdt );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
}
String edt_yn = req.getParameter("edt_yn");
if( edt_yn == null){
	System.out.println(this.toString+" : edt_yn is null" );
}else{
	System.out.println(this.toString+" : edt_yn is "+edt_yn );
}
String pubc_yn = req.getParameter("pubc_yn");
if( pubc_yn == null){
	System.out.println(this.toString+" : pubc_yn is null" );
}else{
	System.out.println(this.toString+" : pubc_yn is "+pubc_yn );
}
String advt_yn = req.getParameter("advt_yn");
if( advt_yn == null){
	System.out.println(this.toString+" : advt_yn is null" );
}else{
	System.out.println(this.toString+" : advt_yn is "+advt_yn );
}
String low_uprc = req.getParameter("low_uprc");
if( low_uprc == null){
	System.out.println(this.toString+" : low_uprc is null" );
}else{
	System.out.println(this.toString+" : low_uprc is "+low_uprc );
}
String sect_clsf_cd = req.getParameter("sect_clsf_cd");
if( sect_clsf_cd == null){
	System.out.println(this.toString+" : sect_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : sect_clsf_cd is "+sect_clsf_cd );
}
String sect_nm_cd = req.getParameter("sect_nm_cd");
if( sect_nm_cd == null){
	System.out.println(this.toString+" : sect_nm_cd is null" );
}else{
	System.out.println(this.toString+" : sect_nm_cd is "+sect_nm_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String edt_yn = Util.checkString(req.getParameter("edt_yn"));
String pubc_yn = Util.checkString(req.getParameter("pubc_yn"));
String advt_yn = Util.checkString(req.getParameter("advt_yn"));
String low_uprc = Util.checkString(req.getParameter("low_uprc"));
String sect_clsf_cd = Util.checkString(req.getParameter("sect_clsf_cd"));
String sect_nm_cd = Util.checkString(req.getParameter("sect_nm_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String edt_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("edt_yn")));
String pubc_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_yn")));
String advt_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_yn")));
String low_uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("low_uprc")));
String sect_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_clsf_cd")));
String sect_nm_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_nm_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMedi_cd(medi_cd);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setEdt_yn(edt_yn);
dm.setPubc_yn(pubc_yn);
dm.setAdvt_yn(advt_yn);
dm.setLow_uprc(low_uprc);
dm.setSect_clsf_cd(sect_clsf_cd);
dm.setSect_nm_cd(sect_nm_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 08 10:05:41 KST 2013 */