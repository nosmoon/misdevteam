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


package chosun.ciis.se.etc.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.etc.ds.*;
import chosun.ciis.se.etc.rec.*;

/**
 * 
 */


public class SE_ETC_1320_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String selldeptcd;
	public String yymm;
	public String clos_yn;
	public String areagb;
	public String area_cd;
	public String incmg_pers;
	public String incmg_pers_ip;

	public SE_ETC_1320_ADM(){}
	public SE_ETC_1320_ADM(String cmpy_cd, String selldeptcd, String yymm, String clos_yn, String areagb, String area_cd, String incmg_pers, String incmg_pers_ip){
		this.cmpy_cd = cmpy_cd;
		this.selldeptcd = selldeptcd;
		this.yymm = yymm;
		this.clos_yn = clos_yn;
		this.areagb = areagb;
		this.area_cd = area_cd;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSelldeptcd(String selldeptcd){
		this.selldeptcd = selldeptcd;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setAreagb(String areagb){
		this.areagb = areagb;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSelldeptcd(){
		return this.selldeptcd;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getAreagb(){
		return this.areagb;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_ETC_1320_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_ETC_1320_ADM dm = (SE_ETC_1320_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.selldeptcd);
		cstmt.setString(5, dm.yymm);
		cstmt.setString(6, dm.clos_yn);
		cstmt.setString(7, dm.areagb);
		cstmt.setString(8, dm.area_cd);
		cstmt.setString(9, dm.incmg_pers);
		cstmt.setString(10, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.etc.ds.SE_ETC_1320_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("selldeptcd = [" + getSelldeptcd() + "]");
		System.out.println("yymm = [" + getYymm() + "]");
		System.out.println("clos_yn = [" + getClos_yn() + "]");
		System.out.println("areagb = [" + getAreagb() + "]");
		System.out.println("area_cd = [" + getArea_cd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
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
String selldeptcd = req.getParameter("selldeptcd");
if( selldeptcd == null){
	System.out.println(this.toString+" : selldeptcd is null" );
}else{
	System.out.println(this.toString+" : selldeptcd is "+selldeptcd );
}
String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
}
String clos_yn = req.getParameter("clos_yn");
if( clos_yn == null){
	System.out.println(this.toString+" : clos_yn is null" );
}else{
	System.out.println(this.toString+" : clos_yn is "+clos_yn );
}
String areagb = req.getParameter("areagb");
if( areagb == null){
	System.out.println(this.toString+" : areagb is null" );
}else{
	System.out.println(this.toString+" : areagb is "+areagb );
}
String area_cd = req.getParameter("area_cd");
if( area_cd == null){
	System.out.println(this.toString+" : area_cd is null" );
}else{
	System.out.println(this.toString+" : area_cd is "+area_cd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String selldeptcd = Util.checkString(req.getParameter("selldeptcd"));
String yymm = Util.checkString(req.getParameter("yymm"));
String clos_yn = Util.checkString(req.getParameter("clos_yn"));
String areagb = Util.checkString(req.getParameter("areagb"));
String area_cd = Util.checkString(req.getParameter("area_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String selldeptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("selldeptcd")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String clos_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("clos_yn")));
String areagb = Util.Uni2Ksc(Util.checkString(req.getParameter("areagb")));
String area_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("area_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSelldeptcd(selldeptcd);
dm.setYymm(yymm);
dm.setClos_yn(clos_yn);
dm.setAreagb(areagb);
dm.setArea_cd(area_cd);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 07 16:31:25 KST 2009 */