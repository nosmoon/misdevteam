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


package chosun.ciis.se.boi.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.boi.ds.*;
import chosun.ciis.se.boi.rec.*;

/**
 * 
 */


public class SE_BOI_1210_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String area_cd;
	public String chg_gb;
	public String sch_gb;
	public String incmg_pers;

	public SE_BOI_1210_LDM(){}
	public SE_BOI_1210_LDM(String cmpy_cd, String area_cd, String chg_gb, String sch_gb, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.area_cd = area_cd;
		this.chg_gb = chg_gb;
		this.sch_gb = sch_gb;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setChg_gb(String chg_gb){
		this.chg_gb = chg_gb;
	}

	public void setSch_gb(String sch_gb){
		this.sch_gb = sch_gb;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getChg_gb(){
		return this.chg_gb;
	}

	public String getSch_gb(){
		return this.sch_gb;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call SP_SE_BOI_1210_L( ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_BOI_1210_LDM dm = (SE_BOI_1210_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.area_cd);
		cstmt.setString(5, dm.chg_gb);
		cstmt.setString(6, dm.sch_gb);
		cstmt.setString(7, dm.incmg_pers);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.boi.ds.SE_BOI_1210_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("area_cd = " + getArea_cd());
        System.out.println("chg_gb = " + getChg_gb());
        System.out.println("sch_gb = " + getSch_gb());
        System.out.println("incmg_pers = " + getIncmg_pers());
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
String area_cd = req.getParameter("area_cd");
if( area_cd == null){
	System.out.println(this.toString+" : area_cd is null" );
}else{
	System.out.println(this.toString+" : area_cd is "+area_cd );
}
String chg_gb = req.getParameter("chg_gb");
if( chg_gb == null){
	System.out.println(this.toString+" : chg_gb is null" );
}else{
	System.out.println(this.toString+" : chg_gb is "+chg_gb );
}
String sch_gb = req.getParameter("sch_gb");
if( sch_gb == null){
	System.out.println(this.toString+" : sch_gb is null" );
}else{
	System.out.println(this.toString+" : sch_gb is "+sch_gb );
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

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String area_cd = Util.checkString(req.getParameter("area_cd"));
String chg_gb = Util.checkString(req.getParameter("chg_gb"));
String sch_gb = Util.checkString(req.getParameter("sch_gb"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String area_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("area_cd")));
String chg_gb = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_gb")));
String sch_gb = Util.Uni2Ksc(Util.checkString(req.getParameter("sch_gb")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setArea_cd(area_cd);
dm.setChg_gb(chg_gb);
dm.setSch_gb(sch_gb);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 02 11:53:40 KST 2009 */