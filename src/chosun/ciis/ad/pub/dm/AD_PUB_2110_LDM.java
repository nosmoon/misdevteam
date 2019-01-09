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


public class AD_PUB_2110_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{ 

	public String cmpy_cd;
	public String medi_clsf;
	public String medi_cd;
	public String frdt;
	public String todt;
	public String dlco_clsf;
	public String advt_clas;
	public String ilbo_total;
	public String grp_exct;

	public AD_PUB_2110_LDM(){}
	public AD_PUB_2110_LDM(String cmpy_cd, String medi_clsf, String medi_cd, String frdt, String todt, String dlco_clsf, String advt_clas, String ilbo_total, String grp_exct){
		this.cmpy_cd = cmpy_cd;
		this.medi_clsf = medi_clsf;
		this.medi_cd = medi_cd;
		this.frdt = frdt;
		this.todt = todt;
		this.dlco_clsf = dlco_clsf;
		this.advt_clas = advt_clas;
		this.ilbo_total = ilbo_total;
		this.grp_exct = grp_exct;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMedi_clsf(String medi_clsf){
		this.medi_clsf = medi_clsf;
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

	public void setDlco_clsf(String dlco_clsf){
		this.dlco_clsf = dlco_clsf;
	}

	public void setAdvt_clas(String advt_clas){
		this.advt_clas = advt_clas;
	}

	public void setIlbo_total(String ilbo_total){
		this.ilbo_total = ilbo_total;
	}

	public void setGrp_exct(String grp_exct){
		this.grp_exct = grp_exct;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMedi_clsf(){
		return this.medi_clsf;
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

	public String getDlco_clsf(){
		return this.dlco_clsf;
	}

	public String getAdvt_clas(){
		return this.advt_clas;
	}

	public String getIlbo_total(){
		return this.ilbo_total;
	}

	public String getGrp_exct(){
		return this.grp_exct;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_PUB_2110_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_PUB_2110_LDM dm = (AD_PUB_2110_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.medi_clsf);
		cstmt.setString(5, dm.medi_cd);
		cstmt.setString(6, dm.frdt);
		cstmt.setString(7, dm.todt);
		cstmt.setString(8, dm.dlco_clsf);
		cstmt.setString(9, dm.advt_clas);
		cstmt.setString(10, dm.ilbo_total);
		cstmt.setString(11, dm.grp_exct);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.pub.ds.AD_PUB_2110_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("medi_clsf = [" + getMedi_clsf() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("todt = [" + getTodt() + "]");
		System.out.println("dlco_clsf = [" + getDlco_clsf() + "]");
		System.out.println("advt_clas = [" + getAdvt_clas() + "]");
		System.out.println("ilbo_total = [" + getIlbo_total() + "]");
		System.out.println("grp_exct = [" + getGrp_exct() + "]");
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
String medi_clsf = req.getParameter("medi_clsf");
if( medi_clsf == null){
	System.out.println(this.toString+" : medi_clsf is null" );
}else{
	System.out.println(this.toString+" : medi_clsf is "+medi_clsf );
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
String dlco_clsf = req.getParameter("dlco_clsf");
if( dlco_clsf == null){
	System.out.println(this.toString+" : dlco_clsf is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf is "+dlco_clsf );
}
String advt_clas = req.getParameter("advt_clas");
if( advt_clas == null){
	System.out.println(this.toString+" : advt_clas is null" );
}else{
	System.out.println(this.toString+" : advt_clas is "+advt_clas );
}
String ilbo_total = req.getParameter("ilbo_total");
if( ilbo_total == null){
	System.out.println(this.toString+" : ilbo_total is null" );
}else{
	System.out.println(this.toString+" : ilbo_total is "+ilbo_total );
}
String grp_exct = req.getParameter("grp_exct");
if( grp_exct == null){
	System.out.println(this.toString+" : grp_exct is null" );
}else{
	System.out.println(this.toString+" : grp_exct is "+grp_exct );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String medi_clsf = Util.checkString(req.getParameter("medi_clsf"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String dlco_clsf = Util.checkString(req.getParameter("dlco_clsf"));
String advt_clas = Util.checkString(req.getParameter("advt_clas"));
String ilbo_total = Util.checkString(req.getParameter("ilbo_total"));
String grp_exct = Util.checkString(req.getParameter("grp_exct"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String medi_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_clsf")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String dlco_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf")));
String advt_clas = Util.Uni2Ksc(Util.checkString(req.getParameter("advt_clas")));
String ilbo_total = Util.Uni2Ksc(Util.checkString(req.getParameter("ilbo_total")));
String grp_exct = Util.Uni2Ksc(Util.checkString(req.getParameter("grp_exct")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMedi_clsf(medi_clsf);
dm.setMedi_cd(medi_cd);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setDlco_clsf(dlco_clsf);
dm.setAdvt_clas(advt_clas);
dm.setIlbo_total(ilbo_total);
dm.setGrp_exct(grp_exct);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Nov 14 18:47:02 KST 2017 */