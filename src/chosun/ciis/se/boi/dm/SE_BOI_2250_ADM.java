/***************************************************************************************************
* 파일명 : .java
* 기능 : 지국관리 - 지국세대등록
* 작성일자 : 2009-05-28
* 작성자 : 이민효
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


public class SE_BOI_2250_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String yy;
	public String dong_cd;
	public String bo_cd;
	public String ratio;
	public String incmgpers;
	public String incmg_pers_ip;

	public SE_BOI_2250_ADM(){}
	public SE_BOI_2250_ADM(String cmpy_cd, String mode, String yy, String dong_cd, String bo_cd, String ratio, String incmgpers, String incmg_pers_ip){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.yy = yy;
		this.dong_cd = dong_cd;
		this.bo_cd = bo_cd;
		this.ratio = ratio;
		this.incmgpers = incmgpers;
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setYy(String yy){
		this.yy = yy;
	}

	public void setDong_cd(String dong_cd){
		this.dong_cd = dong_cd;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setRatio(String ratio){
		this.ratio = ratio;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMode(){
		return this.mode;
	}

	public String getYy(){
		return this.yy;
	}

	public String getDong_cd(){
		return this.dong_cd;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getRatio(){
		return this.ratio;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getSQL(){
		 return "{ call SP_SE_BOI_2250_A( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_BOI_2250_ADM dm = (SE_BOI_2250_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.yy);
		cstmt.setString(6, dm.dong_cd);
		cstmt.setString(7, dm.bo_cd);
		cstmt.setString(8, dm.ratio);
		cstmt.setString(9, dm.incmgpers);
		cstmt.setString(10, dm.incmg_pers_ip);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.boi.ds.SE_BOI_2250_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("mode = " + getMode());
        System.out.println("yy = " + getYy());
        System.out.println("dong_cd = " + getDong_cd());
        System.out.println("bo_cd = " + getBo_cd());
        System.out.println("ratio = " + getRatio());
        System.out.println("incmgpers = " + getIncmgpers());
        System.out.println("incmg_pers_ip = " + getIncmg_pers_ip());
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
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String yy = req.getParameter("yy");
if( yy == null){
	System.out.println(this.toString+" : yy is null" );
}else{
	System.out.println(this.toString+" : yy is "+yy );
}
String dong_cd = req.getParameter("dong_cd");
if( dong_cd == null){
	System.out.println(this.toString+" : dong_cd is null" );
}else{
	System.out.println(this.toString+" : dong_cd is "+dong_cd );
}
String bo_cd = req.getParameter("bo_cd");
if( bo_cd == null){
	System.out.println(this.toString+" : bo_cd is null" );
}else{
	System.out.println(this.toString+" : bo_cd is "+bo_cd );
}
String ratio = req.getParameter("ratio");
if( ratio == null){
	System.out.println(this.toString+" : ratio is null" );
}else{
	System.out.println(this.toString+" : ratio is "+ratio );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
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
String mode = Util.checkString(req.getParameter("mode"));
String yy = Util.checkString(req.getParameter("yy"));
String dong_cd = Util.checkString(req.getParameter("dong_cd"));
String bo_cd = Util.checkString(req.getParameter("bo_cd"));
String ratio = Util.checkString(req.getParameter("ratio"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String yy = Util.Uni2Ksc(Util.checkString(req.getParameter("yy")));
String dong_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dong_cd")));
String bo_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cd")));
String ratio = Util.Uni2Ksc(Util.checkString(req.getParameter("ratio")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setYy(yy);
dm.setDong_cd(dong_cd);
dm.setBo_cd(bo_cd);
dm.setRatio(ratio);
dm.setIncmgpers(incmgpers);
dm.setIncmg_pers_ip(incmg_pers_ip);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 29 14:27:07 KST 2009 */