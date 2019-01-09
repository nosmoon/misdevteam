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


package chosun.ciis.ad.eis.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jdbc.driver.OracleTypes;
import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_EIS_1310_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String frdt;
	public String todt;
	public String unit;
	public String ad_self;
	public String graph_clsf;

	public AD_EIS_1310_LDM(){}
	public AD_EIS_1310_LDM(String cmpy_cd, String frdt, String todt, String unit, String ad_self, String graph_clsf){
		this.cmpy_cd = cmpy_cd;
		this.frdt = frdt;
		this.todt = todt;
		this.unit = unit;
		this.ad_self = ad_self;
		this.graph_clsf = graph_clsf;
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

	public void setUnit(String unit){
		this.unit = unit;
	}

	public void setAd_self(String ad_self){
		this.ad_self = ad_self;
	}

	public void setGraph_clsf(String graph_clsf){
		this.graph_clsf = graph_clsf;
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

	public String getUnit(){
		return this.unit;
	}

	public String getAd_self(){
		return this.ad_self;
	}

	public String getGraph_clsf(){
		return this.graph_clsf;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_EIS_1310_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_EIS_1310_LDM dm = (AD_EIS_1310_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.frdt);
		cstmt.setString(5, dm.todt);
		cstmt.setString(6, dm.unit);
		cstmt.setString(7, dm.ad_self);
		cstmt.setString(8, dm.graph_clsf);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.eis.ds.AD_EIS_1310_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("todt = [" + getTodt() + "]");
		System.out.println("unit = [" + getUnit() + "]");
		System.out.println("ad_self = [" + getAd_self() + "]");
		System.out.println("graph_clsf = [" + getGraph_clsf() + "]");
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
String unit = req.getParameter("unit");
if( unit == null){
	System.out.println(this.toString+" : unit is null" );
}else{
	System.out.println(this.toString+" : unit is "+unit );
}
String ad_self = req.getParameter("ad_self");
if( ad_self == null){
	System.out.println(this.toString+" : ad_self is null" );
}else{
	System.out.println(this.toString+" : ad_self is "+ad_self );
}
String graph_clsf = req.getParameter("graph_clsf");
if( graph_clsf == null){
	System.out.println(this.toString+" : graph_clsf is null" );
}else{
	System.out.println(this.toString+" : graph_clsf is "+graph_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String unit = Util.checkString(req.getParameter("unit"));
String ad_self = Util.checkString(req.getParameter("ad_self"));
String graph_clsf = Util.checkString(req.getParameter("graph_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String unit = Util.Uni2Ksc(Util.checkString(req.getParameter("unit")));
String ad_self = Util.Uni2Ksc(Util.checkString(req.getParameter("ad_self")));
String graph_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("graph_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setUnit(unit);
dm.setAd_self(ad_self);
dm.setGraph_clsf(graph_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 08 09:56:19 KST 2009 */