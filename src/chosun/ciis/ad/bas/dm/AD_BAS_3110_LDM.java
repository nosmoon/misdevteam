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


package chosun.ciis.ad.bas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.bas.ds.*;
import chosun.ciis.ad.bas.rec.*;

/**
 * 
 */


public class AD_BAS_3110_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String frdt;
	public String todt;
	public String medi_cd;
	public String spon_yn;
	public String self_cmpy_yn;
	public String plus_yn;

	public AD_BAS_3110_LDM(){}
	public AD_BAS_3110_LDM(String cmpy_cd, String frdt, String todt, String medi_cd, String spon_yn, String self_cmpy_yn, String plus_yn){
		this.cmpy_cd = cmpy_cd;
		this.frdt = frdt;
		this.todt = todt;
		this.medi_cd = medi_cd;
		this.spon_yn = spon_yn;
		this.self_cmpy_yn = self_cmpy_yn;
		this.plus_yn = plus_yn;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSpon_yn(String spon_yn){
		this.spon_yn = spon_yn;
	}

	public void setSelf_cmpy_yn(String self_cmpy_yn){
		this.self_cmpy_yn = self_cmpy_yn;
	}

	public void setPlus_yn(String plus_yn){
		this.plus_yn = plus_yn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSpon_yn(){
		return this.spon_yn;
	}

	public String getSelf_cmpy_yn(){
		return this.self_cmpy_yn;
	}

	public String getPlus_yn(){
		return this.plus_yn;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_BAS_3110_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_BAS_3110_LDM dm = (AD_BAS_3110_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.frdt);
		cstmt.setString(5, dm.todt);
		cstmt.setString(6, dm.medi_cd);
		cstmt.setString(7, dm.spon_yn);
		cstmt.setString(8, dm.self_cmpy_yn);
		cstmt.setString(9, dm.plus_yn);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.bas.ds.AD_BAS_3110_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("todt = [" + getTodt() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("spon_yn = [" + getSpon_yn() + "]");
		System.out.println("self_cmpy_yn = [" + getSelf_cmpy_yn() + "]");
		System.out.println("plus_yn = [" + getPlus_yn() + "]");
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
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String spon_yn = req.getParameter("spon_yn");
if( spon_yn == null){
	System.out.println(this.toString+" : spon_yn is null" );
}else{
	System.out.println(this.toString+" : spon_yn is "+spon_yn );
}
String self_cmpy_yn = req.getParameter("self_cmpy_yn");
if( self_cmpy_yn == null){
	System.out.println(this.toString+" : self_cmpy_yn is null" );
}else{
	System.out.println(this.toString+" : self_cmpy_yn is "+self_cmpy_yn );
}
String plus_yn = req.getParameter("plus_yn");
if( plus_yn == null){
	System.out.println(this.toString+" : plus_yn is null" );
}else{
	System.out.println(this.toString+" : plus_yn is "+plus_yn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String spon_yn = Util.checkString(req.getParameter("spon_yn"));
String self_cmpy_yn = Util.checkString(req.getParameter("self_cmpy_yn"));
String plus_yn = Util.checkString(req.getParameter("plus_yn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String spon_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("spon_yn")));
String self_cmpy_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("self_cmpy_yn")));
String plus_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("plus_yn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setMedi_cd(medi_cd);
dm.setSpon_yn(spon_yn);
dm.setSelf_cmpy_yn(self_cmpy_yn);
dm.setPlus_yn(plus_yn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Feb 06 15:50:44 KST 2013 */