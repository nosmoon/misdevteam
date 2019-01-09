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


package chosun.ciis.se.sal.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.sal.ds.*;
import chosun.ciis.se.sal.rec.*;

/**
 * 
 */


public class SE_SAL_1220_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String clos_yn;
	public String cmpy_cd;
	public String yymm;
	public String medi_cd;
	public String tms;
	public String selldeptcd;
	public String incmg_pers_ip;
	public String incmg_pers;

	public SE_SAL_1220_ADM(){}
	public SE_SAL_1220_ADM(String clos_yn, String cmpy_cd, String yymm, String medi_cd, String tms, String selldeptcd, String incmg_pers_ip, String incmg_pers){
		this.clos_yn = clos_yn;
		this.cmpy_cd = cmpy_cd;
		this.yymm = yymm;
		this.medi_cd = medi_cd;
		this.tms = tms;
		this.selldeptcd = selldeptcd;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setTms(String tms){
		this.tms = tms;
	}

	public void setSelldeptcd(String selldeptcd){
		this.selldeptcd = selldeptcd;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getTms(){
		return this.tms;
	}

	public String getSelldeptcd(){
		return this.selldeptcd;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_SAL_1220_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_SAL_1220_ADM dm = (SE_SAL_1220_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.clos_yn);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.yymm);
		cstmt.setString(6, dm.medi_cd);
		cstmt.setString(7, dm.tms);
		cstmt.setString(8, dm.selldeptcd);
		cstmt.setString(9, dm.incmg_pers_ip);
		cstmt.setString(10, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.sal.ds.SE_SAL_1220_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("clos_yn = [" + getClos_yn() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("yymm = [" + getYymm() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("tms = [" + getTms() + "]");
		System.out.println("selldeptcd = [" + getSelldeptcd() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String clos_yn = req.getParameter("clos_yn");
if( clos_yn == null){
	System.out.println(this.toString+" : clos_yn is null" );
}else{
	System.out.println(this.toString+" : clos_yn is "+clos_yn );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String tms = req.getParameter("tms");
if( tms == null){
	System.out.println(this.toString+" : tms is null" );
}else{
	System.out.println(this.toString+" : tms is "+tms );
}
String selldeptcd = req.getParameter("selldeptcd");
if( selldeptcd == null){
	System.out.println(this.toString+" : selldeptcd is null" );
}else{
	System.out.println(this.toString+" : selldeptcd is "+selldeptcd );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String clos_yn = Util.checkString(req.getParameter("clos_yn"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String yymm = Util.checkString(req.getParameter("yymm"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String tms = Util.checkString(req.getParameter("tms"));
String selldeptcd = Util.checkString(req.getParameter("selldeptcd"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String clos_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("clos_yn")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String tms = Util.Uni2Ksc(Util.checkString(req.getParameter("tms")));
String selldeptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("selldeptcd")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setClos_yn(clos_yn);
dm.setCmpy_cd(cmpy_cd);
dm.setYymm(yymm);
dm.setMedi_cd(medi_cd);
dm.setTms(tms);
dm.setSelldeptcd(selldeptcd);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 17 09:49:52 KST 2009 */